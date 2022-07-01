package home.controllers;

import home.model.StudentsModel;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class DashboardController implements Initializable {

    @FXML
    private TableView<StudentsModel> tbData;
    @FXML
    public TableColumn<StudentsModel, Integer> studentId;

    @FXML
    public TableColumn<StudentsModel, String> firstName;

    @FXML
    public TableColumn<StudentsModel, String> lastName;

    @FXML
    private PieChart pieChart;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        loadChart();
        loadStudents();
    }

    private void loadChart()
    {

        PieChart.Data slice1 = new PieChart.Data("Classes", 213);
        PieChart.Data slice2 = new PieChart.Data("Attendance"  , 67);
        PieChart.Data slice3 = new PieChart.Data("Teachers" , 36);

        pieChart.getData().add(slice1);
        pieChart.getData().add(slice2);
        pieChart.getData().add(slice3);

    }


    private ObservableList<StudentsModel> studentsModels = FXCollections.observableArrayList(
            new StudentsModel(1,"Amos", "Chepchieng"),
            new StudentsModel(2,"Amos", "Mors"),
            new StudentsModel(3,"Amos", "Chepchieng"),
            new StudentsModel(4,"Amos", "Mors")
    );


    private void loadStudents()
    {
        studentId.setCellValueFactory(new PropertyValueFactory<>("StudentId"));
        firstName.setCellValueFactory(new PropertyValueFactory<>("FirstName"));
        lastName.setCellValueFactory(new PropertyValueFactory<>("LastName"));
        tbData.setItems(studentsModels);
    }

}
