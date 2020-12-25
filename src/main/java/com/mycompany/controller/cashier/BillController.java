package com.mycompany.controller.cashier;


import com.mycompany.App;
import com.mycompany.domain.impl.ApplicationProperties;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;

public class BillController {
    @FXML
    private Button BackButton;

    @FXML
    private void onBackButtonClick() {
        BackButton.setOnAction(actionEvent -> {
            FXMLLoader loader = App.loadFXML(ApplicationProperties.APPLICATION_PROPERTIES.getCashierMenu());
            App.changeScene(actionEvent, loader);
        });
    }
}
