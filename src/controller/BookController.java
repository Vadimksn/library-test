package controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by Vadim on 04.03.2017.
 */
public class BookController implements Initializable {
    @FXML
    private TextField tfBookName, tfBookEdition, tfBookAuthor;
    @FXML
    private DatePicker dpYearOfPublication;
    @FXML
    private Button btnOk, btnCancel;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    private void setButtonOkListener(){
        btnOk.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

            }
        });
    }
}
