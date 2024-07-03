package fr.melvinxalexis.machineslotproject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;


public class MachineSlotProject extends Application {

    public static Player player;
    public static boolean debug = false;

    @Override
    public void start(Stage stage) throws IOException {
        if(debug){
            player = new Player("debug");
            launchMainApplication();
        }else{
            showLoginPopup(stage);
        }
    }

    private void showLoginPopup(Stage primaryStage) {
        LoginPopup loginPopup = new LoginPopup();
        loginPopup.show();
    }

    public static void launchMainApplication() {
        try {
            Stage mainStage = new Stage();
            FXMLLoader fxmlLoader = new FXMLLoader(MachineSlotProject.class.getResource("MainForm.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 1900     ,1080);


            scene.getStylesheets().add(MachineSlotProject.class.getResource("css/styles.css").toExternalForm());

            mainStage.setTitle("Machine Slot Project ! Melvin OLIVET & Alexis MOUREY");

            mainStage.setScene(scene);
            mainStage.setMaximized(true);
            mainStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        if(args.length != 0 && Objects.equals(args[0], "--debug")){
            debug = true;
            System.out.println(args[0]);
        }else{
            debug = false;
        }
        launch(args);
    }
}
