package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;


public class Controller {


    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnAdd;

    @FXML
    private TextField AddNew;

    @FXML
    private TextField AddNew2;

    @FXML
    void initialize() {
        btnAdd.setOnAction(actionEvent -> {
            String start = AddNew.getText().trim();
            String finish = AddNew2.getText().trim();

            Main.newRect(start, finish);


});
    }
}
