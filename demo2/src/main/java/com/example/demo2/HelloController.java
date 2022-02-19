package com.example.demo2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView image;

    @FXML
    void initialize() {
        image.setOnMouseClicked(event -> {image.setVisible(false); });
    }

}