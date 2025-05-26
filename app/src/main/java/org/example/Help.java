package org.example;

import java.util.HashMap;
import java.util.Map;

import javafx.animation.PauseTransition;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.util.Duration;

public class Help {

    @FXML
    private ComboBox<String> issueSelector;

    @FXML
    private Label typingLabel;

    @FXML
    private TextArea outputArea;

    private final Map<String, String> aiResponses = new HashMap<>();

    @FXML
    public void initialize() {
        issueSelector.getItems().addAll("HDMI Not Working", "Wireless Display Not Working", "No Audio", "Touch Panel Not Responding");

        
        aiResponses.put("HDMI", "AI: If HDMI isn’t displaying, verify the source is powered and the correct input is selected. Try reseating the cable and ensure the resolution is supported. Hope this helps😊");
        aiResponses.put("Wireless", "AI: For Miracast, ScreenBeam, or Mac, ensure that both the devices are connected to the same Wifi Network. Restart your casting device. For macOS, use Airplay under Display Settings. Hope this helps😊");
        aiResponses.put("No Audio", "AI: Check if the volume is muted on both the device and display. Ensure the audio output is set to HDMI or external speakers. Hope this helps😊");
        aiResponses.put("Touch Panel Not Responding", "AI: Restart the panel controller. If unresponsive, check for loose network or power connections. Long-press reset may also help. Hope this helps😊");

        issueSelector.setOnAction(event -> {
            String selected = issueSelector.getValue();
            if (selected != null) {
                showTypingAndResponse(selected);
            }
        });
    }

    private void showTypingAndResponse(String issue) {
        typingLabel.setText("AI is typing...");
        outputArea.clear();

        PauseTransition pause = new PauseTransition(Duration.seconds(4));
        pause.setOnFinished(event -> {
            typingLabel.setText("");
            outputArea.setText(aiResponses.getOrDefault(issue, "AI: For Miracast, ScreenBeam, or Mac, ensure that both the devices are connected to the same Wifi Network. Restart your casting device. For macOS, use Airplay under Display Settings. Hope this helps😊"));
        });
        pause.play();
    }
}
