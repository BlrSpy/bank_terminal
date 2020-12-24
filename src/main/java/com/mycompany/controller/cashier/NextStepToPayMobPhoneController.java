package com.mycompany.controller.cashier;



import com.mycompany.App;
import com.mycompany.domain.impl.ApplicationProperties;
import com.mycompany.domain.impl.MobilePhoneData;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class NextStepToPayMobPhoneController {

    @FXML
    private TextField PhoneNumberField;

    @FXML
    private TextField NameField;

    @FXML
    private TextField SurnameField;

    @FXML
    private Button PrintBillButton;

    @FXML
    private Button TopUpButton;

    @FXML
    private TextField AmountField;

    @FXML
    private Button BackButton;


    @FXML
    void initialize() {
        PhoneNumberField.setDisable(true);
        PhoneNumberField.setText(MobilePhoneData.getInstance().getMobilePhoneField());

        NameField.setDisable(true);
        NameField.setText(MobilePhoneData.getInstance().getNameField());


        SurnameField.setDisable(true);
        SurnameField.setText(MobilePhoneData.getInstance().getSurnameField());

    }

    @FXML
    private void onBackButtonClick() {
        BackButton.setOnAction(actionEvent -> {
            FXMLLoader loader = App.loadFXML(ApplicationProperties.APPLICATION_PROPERTIES.getPayForMobPhone());
            App.changeScene(actionEvent, loader);
        });
    }

    @FXML
    void onPrintBillButtonClick(ActionEvent event) {

    }

    @FXML
    void onTopUpButtonClick(ActionEvent event) {

    }
}
