package fr.melvinxalexis.machineslotproject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class MachineSlotProject extends Application {

    public static Player player;
    public static boolean debug = true;

    @Override
    public void start(Stage stage) throws IOException {
        if(!debug)
            showLoginPopup(stage);
    }

    private void showLoginPopup(Stage primaryStage) {
        LoginPopup loginPopup = new LoginPopup();
        loginPopup.show();
    }

    public static void launchMainApplication() {
        try {
            Stage mainStage = new Stage();
            FXMLLoader fxmlLoader = new FXMLLoader(MachineSlotProject.class.getResource("MainForm.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 1920,1080);
            mainStage.setTitle("Machine Slot Project ! Melvin ****** & Alexis *******");
            mainStage.setScene(scene);
            mainStage.setFullScreen(true);
            mainStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        if(args.length !=0 && Objects.equals(args[0], "--debug")){
            debug = true;
            System.out.println("ok");
        }else{
            debug = false;
        }
        launch(args);
    }
}
