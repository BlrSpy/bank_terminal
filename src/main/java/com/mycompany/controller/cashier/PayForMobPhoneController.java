package com.mycompany.controller.cashier;

import java.net.URL;
import java.util.ResourceBundle;

import com.mycompany.App;
import com.mycompany.domain.impl.ApplicationProperties;
import com.mycompany.util.AlertDialog;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class PayForMobPhoneController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField MobilePhoneField;

    @FXML
    private Button NextButton;

    @FXML
    private TextField NameField;

    @FXML
    private TextField SurnameField;

    @FXML
    private Button BackButton;

    @FXML
    void initialize() {}

    @FXML
    private void onBackButtonClick() {
        BackButton.setOnAction(actionEvent -> {
            FXMLLoader loader = App.loadFXML(ApplicationProperties.APPLICATION_PROPERTIES.getCashierMenu());
            App.changeScene(actionEvent, loader);
            System.out.println("12345 ahahahah");
        });
    }

    @FXML
    private void onButtonClick() {
        NextButton.setOnAction(actionEvent -> {
            String mobile_phone = MobilePhoneField.getText().trim();
            String name = NameField.getText().trim();
            String surname = SurnameField.getText().trim();

            if (MobilePhoneField.getText().isEmpty() || NameField.getText().isEmpty() || SurnameField.getText().isEmpty()) {
                AlertDialog.showAlert(Alert.AlertType.ERROR, NextButton.getScene().getWindow(),
                        "Form Error!", "Please fill in all the fields");
                return;
            }
            else {
                FXMLLoader loader = App.loadFXML(ApplicationProperties.APPLICATION_PROPERTIES.getNextStepToPayMobPhone());
                App.changeScene(actionEvent, loader);
            }
            });
        }
}
