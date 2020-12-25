package com.mycompany.controller.cashier;



import com.mycompany.App;
import com.mycompany.dao.AbstractDAO;
import com.mycompany.dao.impl.Mobile_OperationsDAO;
import com.mycompany.dao.impl.OperationDAO;
import com.mycompany.domain.impl.ApplicationProperties;
import com.mycompany.domain.impl.MobilePhoneData;
import com.mycompany.factory.impl.MobileOperationFactory;
import com.mycompany.util.AlertDialog;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.sql.SQLException;

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
        TopUpButton.setOnAction(actionEvent -> {
            try {
                AbstractDAO abstractDAO = new Mobile_OperationsDAO();

                if (AmountField.getText().isEmpty()) {
                    AlertDialog.showAlert(Alert.AlertType.ERROR, AmountField.getScene().getWindow(),
                            "Form Error!", "Please enter the amount name");
                    return;
                }

                abstractDAO.create(MobileOperationFactory.MOBILE_OPERATION_FACTORY.create(PhoneNumberField.getText().trim(),
                        NameField.getText().trim(), SurnameField.getText().trim(), AmountField.getText().trim()));

            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        });

    }
}
