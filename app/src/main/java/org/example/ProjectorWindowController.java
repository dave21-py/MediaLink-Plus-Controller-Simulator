package org.example;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ProjectorWindowController {

    @FXML
    private ImageView imageView;

    private MediaState mediaState;

    public void setMediaState(MediaState state) {
        this.mediaState = state;

        
        state.sourceUrlProperty().addListener((obs, oldUrl, newUrl) -> {
            loadImage(newUrl);
        });

        
        state.playingProperty().addListener((obs, wasPlaying, isPlaying) -> {
            if (!isPlaying) {
                imageView.setImage(null); 
            }
        });
    }

    private void loadImage(String url) {
        if (url == null || url.isEmpty()){
            imageView.setImage(null);
            return;
        }


        imageView.setImage(new Image(url));
    }
}
