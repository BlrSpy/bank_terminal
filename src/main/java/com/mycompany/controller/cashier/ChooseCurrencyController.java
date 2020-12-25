package com.mycompany.controller.cashier;

import com.mycompany.App;
import com.mycompany.domain.impl.ApplicationProperties;
import com.mycompany.util.AlertDialog;
import com.mycompany.util.InputDataStorage;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class ChooseCurrencyController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private RadioButton usdRadioButton2;

    @FXML
    private ToggleGroup Currency;

    @FXML
    private RadioButton eurRadioButton2;

    @FXML
    private ToggleGroup currencyToExchange;

    @FXML
    private RadioButton bynRadioButton2;

    @FXML
    private RadioButton rubRadioButton2;

    @FXML
    private RadioButton usdRadioButton;

    @FXML
    private ToggleGroup currencyToBeExchanged;

    @FXML
    private RadioButton eurRadioButton;

    @FXML
    private ToggleGroup Currency1;

    @FXML
    private RadioButton rubRadioButton;

    @FXML
    private RadioButton bynRadioButton;

    @FXML
    private ToggleGroup Currency2;

    @FXML
    private RadioButton buyRadioButton1;

    @FXML
    private ToggleGroup operation;

    @FXML
    private RadioButton sellRadioButton1;


    @FXML
    private TextField inputField;

    @FXML
    private Button submitButton;

    @FXML
    private Button backButton;

    @FXML
    void initialize() {

    }

    @FXML
    private void onBackButtonClick() {
        backButton.setOnAction(actionEvent -> {
            FXMLLoader loader = App.loadFXML(ApplicationProperties.APPLICATION_PROPERTIES.getCashierMenu());
            App.changeScene(actionEvent, loader);
        });
    }

    @FXML
    private void onSubmitButtonClick() {
        submitButton.setOnAction(actionEvent -> {
            if (inputField.getText().isEmpty()) {
                AlertDialog.showAlert(Alert.AlertType.ERROR, inputField.getScene().getWindow(),
                        "Form Error!", "Please enter new limit");
                return;
            }

            RadioButton selectedCurrencyFrom = (RadioButton) currencyToBeExchanged.getSelectedToggle();
            String currencyValueFrom = selectedCurrencyFrom.getText();

            RadioButton selectedCurrencyTo = (RadioButton) currencyToExchange.getSelectedToggle();
            String currencyValueTo = selectedCurrencyTo.getText();

            if (currencyValueFrom.equals(currencyValueTo)) {
                AlertDialog.showAlert(Alert.AlertType.ERROR, inputField.getScene().getWindow(),
                        "Form Error!", "Currencies cannot be equal");
                return;
            }

            RadioButton selectedOperation = (RadioButton) operation.getSelectedToggle();
            String operationValue = selectedOperation.getText();

            InputDataStorage.INPUT_DATA_STORAGE.setCurrencyValueFrom(currencyValueFrom);
            InputDataStorage.INPUT_DATA_STORAGE.setCurrencyValueTo(currencyValueTo);
            InputDataStorage.INPUT_DATA_STORAGE.setSum(inputField.getText().trim());
            InputDataStorage.INPUT_DATA_STORAGE.setBuyOrSellOperation(operationValue);

            makeExchange(currencyValueFrom, currencyValueTo, inputField.getText().trim());

            FXMLLoader loader = App.loadFXML(ApplicationProperties.APPLICATION_PROPERTIES.getInputClientData());
            App.changeScene(actionEvent, loader);
        });
    }

    private void makeExchange(String currencyValueFrom, String currencyValueTo, String sum) throws UnsupportedOperationException {
//        ExchangeVolume.EXCHANGE_VOLUME.
        throw new UnsupportedOperationException();
    }
}
