package org.example.lab5colorchooser;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.util.converter.NumberStringConverter; // Import the NumberStringConverter

public class ColorChooserController {
    // instance variables for interacting with GUI components
    @FXML private Slider redSlider;
    @FXML private Slider greenSlider;
    @FXML private Slider blueSlider;
    @FXML private Slider alphaSlider;
    @FXML private TextField redTextField;
    @FXML private TextField greenTextField;
    @FXML private TextField blueTextField;
    @FXML private TextField alphaTextField;
    @FXML private Rectangle colorRectangle;

    // instance variables for managing
    private int red = 0;
    private int green = 0;
    private int blue = 0;
    private double alpha = 1.0;

    public void initialize() {
        // Bidirectional bindings
        redTextField.textProperty().bindBidirectional(redSlider.valueProperty(), new NumberStringConverter());
        greenTextField.textProperty().bindBidirectional(greenSlider.valueProperty(), new NumberStringConverter());
        blueTextField.textProperty().bindBidirectional(blueSlider.valueProperty(), new NumberStringConverter());
        alphaTextField.textProperty().bindBidirectional(alphaSlider.valueProperty(), new NumberStringConverter());

        // listeners that set Rectangle's fill based on Slider changes
        redSlider.valueProperty().addListener((ov, oldValue, newValue) -> {
            red = newValue.intValue();
            colorRectangle.setFill(Color.rgb(red, green, blue, alpha));
        });
        greenSlider.valueProperty().addListener((ov, oldValue, newValue) -> {
            green = newValue.intValue();
            colorRectangle.setFill(Color.rgb(red, green, blue, alpha));
        });
        blueSlider.valueProperty().addListener((ov, oldValue, newValue) -> {
            blue = newValue.intValue();
            colorRectangle.setFill(Color.rgb(red, green, blue, alpha));
        });
        alphaSlider.valueProperty().addListener((ov, oldValue, newValue) -> {
            alpha = newValue.doubleValue();
            colorRectangle.setFill(Color.rgb(red, green, blue, alpha));
        });
    }
}
