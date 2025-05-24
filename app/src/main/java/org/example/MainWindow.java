package org.example;

import java.io.IOException;

import javafx.animation.PauseTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.util.Duration;


public class MainWindow {

    @FXML
    private Button btnOn;

    @FXML
    private Button btnOff;

    @FXML
    private Button volUp;

    @FXML
    private Button volDown;

    @FXML
    private Button btnHdmi;

    @FXML
    private Button btnWireless;

    @FXML
    private Label statusDisplay;

    @FXML
    private void onOnClicked(ActionEvent event){
        if (!systemOn){
            btnOn.setStyle("-fx-background-color: red; -fx-text-fill: black;");
            systemOn = true;

            btnHdmi.setDisable(false);
            btnWireless.setDisable(false);
            volDown.setDisable(false);
            volUp.setDisable(false);

            statusDisplay.setText("System ON");

            


        }
    }

    @FXML
    private void onOffClicked(ActionEvent event){
        btnOn.setStyle("");
        systemOn = false;

        btnHdmi.setDisable(true);
        btnWireless.setDisable(true);
        volDown.setDisable(true);
        volUp.setDisable(true);

        statusDisplay.setText("System OFF");

        


    }

    @FXML
    private void onVolUpClicked(){
        volUp.setStyle("-fx-background-color: red; -fx-text-fill: black;");
        System.out.println("Volume Increased!");
        PauseTransition pause = new PauseTransition(Duration.millis(100));
        pause.setOnFinished(e -> volUp.setStyle(""));
        pause.play();
        statusDisplay.setText("Volume Increased");
    }

    @FXML
    private void onVolDownClicked(){
        volDown.setStyle("-fx-background-color: red; -fx-text-fill: black;");
        System.out.println("Volume Decreased!");
        PauseTransition pause = new PauseTransition(Duration.millis(100));
        pause.setOnFinished(e -> volDown.setStyle(""));
        pause.play();
         statusDisplay.setText("Volume Decreased");
    }

    @FXML
    private void onHdmiClicked(){
        if(!currentMode.equals("HDMI")){
            currentMode = "HDMI";
            btnHdmi.setStyle("-fx-background-color: red; -fx-text-fill: black;");
            btnWireless.setStyle("");
            System.out.println("HDMI MODE");
            statusDisplay.setText("HDMI Mode");
    }
}

    @FXML
    private void onWirelessClicked(){
        if(!currentMode.equals("WIRELESS")){
            currentMode = "WIRELESS";
            btnWireless.setStyle("-fx-background-color: red; -fx-text-fill: black;");
            btnHdmi.setStyle("");
            System.out.println("WIRELESS MODE");
            statusDisplay.setText("WIRELESS");
    }
}

    private void showMessage(String text){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Controller FEEDBACK");
        alert.setHeaderText(null);
        alert.setContentText(text);
        alert.showAndWait();

    }

    private boolean systemOn = false;

    private String currentMode = "";



    @FXML
    private void initialize() {
        btnHdmi.setDisable(true);
        btnWireless.setDisable(true);
        volDown.setDisable(true);
        volUp.setDisable(true);
    }


    @FXML
    private void openHelp() {
    try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Help.fxml"));
        Parent helpRoot = loader.load();
        Stage stage = new Stage();
        stage.setTitle("AI Assistant");
        stage.setScene(new Scene(helpRoot));
        stage.show();
    } catch (IOException e) {
        e.printStackTrace();
    }
}
}
        
