package org.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class GUIApplication extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        MediaState sharedState = new MediaState();
        FXMLLoader controllerLoader = new FXMLLoader(getClass().getResource("/MainWindow.fxml"));
        Parent controllerRoot = controllerLoader.load();
        MainWindow controller = controllerLoader.getController();
        controller.setMediaState(sharedState);
        
        Stage controllerStage = new Stage();
         controllerStage.setTitle("MediaLink Controller");
         controllerStage.setScene(new Scene(controllerRoot, 300, 500));
         controllerStage.setX(100);
         controllerStage.setY(100);
         controllerStage.show();
         
         FXMLLoader projectorLoader = new FXMLLoader(getClass().getResource("/ProjectorWindow.fxml"));
         Parent projectorRoot = projectorLoader.load();
         ProjectorWindowController projectorController = projectorLoader.getController();
         projectorController.setMediaState(sharedState);
         
         Stage projectorStage = new Stage();
         projectorStage.setTitle("Projector Screen");
         projectorStage.setScene(new Scene(projectorRoot, 800, 450)); // 16:9 layout
         projectorStage.setX(420);
         projectorStage.setY(100);
         
         
         projectorStage.show();
}
    public static void main(String[] args){
        launch(args);
    }
}