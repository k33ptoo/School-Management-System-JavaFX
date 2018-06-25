package home;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;

import java.net.URL;
import java.util.ResourceBundle;

public class StudentsController  implements Initializable {

    @FXML
    private TableColumn<?, ?> tbId;

    @FXML
    private TableColumn<?, ?> tbFirstName;

    @FXML
    private TableColumn<?, ?> tbLastName;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
