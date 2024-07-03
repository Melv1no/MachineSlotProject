package fr.melvinxalexis.machineslotproject;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@SuppressWarnings("ALL")
public class NoSqlConnector {

    private static final String DATABASE_PATH = "database.json";
    private static JSONObject database;

    /**
     * Constructeur : charge la base de données JSON depuis le fichier.
     */
    public NoSqlConnector() {
        loadDatabase();
    }

    /**
     * Charge la base de données depuis le fichier JSON.
     * Si la lecture échoue, initialise une nouvelle base de données vide.
     */
    private void loadDatabase() {
        try (FileReader reader = new FileReader(DATABASE_PATH)) {
            JSONParser parser = new JSONParser();
            database = (JSONObject) parser.parse(reader);
        } catch (IOException | ParseException e) {
            e.printStackTrace();
            database = new JSONObject();
        }
    }

    /**
     * Sauvegarde la base de données actuelle dans le fichier JSON.
     */
    private static void saveDatabase() {
        try (FileWriter writer = new FileWriter(DATABASE_PATH)) {
            writer.write(database.toJSONString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Enregistre un nouvel utilisateur dans la base de données.
     *
     * @param username Le nom d'utilisateur à enregistrer.
     * @param password Le mot de passe de l'utilisateur à enregistrer.
     * @param money    Le montant initial d'argent de l'utilisateur.
     * @return true si l'utilisateur a été enregistré avec succès, false si l'utilisateur existe déjà.
     */
    public boolean registerUser(String username, String password, int money) {
        if (isUserAlreadyExist(username)) {
            return false;
        }

        String hashedPassword = hashPassword(password);

        JSONObject userData = new JSONObject();
        userData.put("username", username);
        userData.put("hashedPassword", hashedPassword);
        userData.put("money", money);
        userData.put("lastLogin", "");

        database.put(username, userData);
        saveDatabase();

        return true;
    }

    /**
     * Vérifie les informations de connexion de l'utilisateur.
     *
     * @param username Le nom d'utilisateur à vérifier.
     * @param password Le mot de passe à vérifier.
     * @return true si le nom d'utilisateur et le mot de passe correspondent, false sinon.
     */
    public boolean verifyLogin(String username, String password) {
        JSONObject userData = (JSONObject) database.get(username);
        if (userData == null) {
            return false;
        }

        String hashedPassword = (String) userData.get("hashedPassword");
        String enteredPasswordHashed = hashPassword(password);

        return hashedPassword.equals(enteredPasswordHashed);
    }

    /**
     * Vérifie si un utilisateur existe déjà dans la base de données.
     *
     * @param username Le nom d'utilisateur à vérifier.
     * @return true si l'utilisateur existe, false sinon.
     */
    public boolean isUserAlreadyExist(String username) {
        return database.containsKey(username);
    }

    /**
     * Récupère le montant d'argent d'un utilisateur.
     *
     * @param username Le nom d'utilisateur pour lequel récupérer l'argent.
     * @return Le montant d'argent de l'utilisateur, ou 0 si l'utilisateur n'existe pas.
     */
    public static int getMoney(String username) {
        JSONObject userData = (JSONObject) database.get(username);
        if (userData == null) {
            return 0;
        }

        Object moneyObj = userData.get("money");
        if (moneyObj instanceof Long) {
            return ((Long) moneyObj).intValue();
        } else if (moneyObj instanceof Integer) {
            return (int) moneyObj;
        } else {
            return 0;
        }
    }

    /**
     * Met à jour le montant d'argent d'un utilisateur.
     *
     * @param username Le nom d'utilisateur dont l'argent doit être mis à jour.
     * @param newMoney Le nouveau montant d'argent.
     */
    public static void updateMoney(String username, int newMoney) {
        JSONObject userData = (JSONObject) database.get(username);
        if (userData != null) {
            userData.put("money", newMoney);
            saveDatabase();
        }
    }

    /**
     * Hash le mot de passe en utilisant l'algorithme MD5.
     *
     * @param password Le mot de passe à hasher.
     * @return Le mot de passe hashé en format hexadécimal, ou le mot de passe en clair en cas d'échec du hash.
     */
    public static String hashPassword(String password) {
        try {
            MessageDigest digest = MessageDigest.getInstance("MD5");
            byte[] hash = digest.digest(password.getBytes());
            StringBuilder hexString = new StringBuilder();

            for (byte b : hash) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return password;
        }
    }
}
