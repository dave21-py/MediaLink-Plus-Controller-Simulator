package org.example;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class MediaState {
    private final StringProperty sourceUrl = new SimpleStringProperty();
    private final BooleanProperty playing = new SimpleBooleanProperty(false);
    private final DoubleProperty volume = new SimpleDoubleProperty(0.5); // 50% default


    public StringProperty sourceUrlProperty() {
        return sourceUrl;
    }

    public String getSourceUrl() {
        return sourceUrl.get();
    }

    public void setSourceUrl(String value) {
        sourceUrl.set(value);
    }

    
    public BooleanProperty playingProperty() {
        return playing;
    }

    public boolean isPlaying() {
        return playing.get();
    }

    public void setPlaying(boolean value) {
        playing.set(value); 
    }

    
    public DoubleProperty volumeProperty() {
        return volume; 
    }

    public double getVolume() {
        return volume.get();
    }

    public void setVolume(double value) {
        volume.set(value);
    }
}
