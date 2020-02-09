package sample;

import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    public CheckBox isActiveCheck;

    @FXML
    public TextField misc;

    @FXML
    public TextField lNameField;

    @FXML
    public TextField fNameField;

    @FXML
    private ListView<Employee> employeeListView;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        employeeListView.getSelectionModel().selectedItemProperty().addListener((ObservableValue <? extends Worker> ov, Worker oldVal, Worker newVal) -> {
            Employee selectedItem = (Employee)employeeListView.getSelectionModel().getSelectedItem();

            fNameField.setText(selectedItem.getFname());
            lNameField.setText(selectedItem.getLname());
            isActiveCheck.setSelected(selectedItem.isActive());
        });

        ObservableList<Employee> eList = employeeListView.getItems();

        Employee employee1 = new Employee("A", "B");
        Employee employee2 = new Employee("C", "D");

        eList.add(employee1);
        eList.add(employee2);

        for (int i = 0; i < 10; i++) {
            Employee employee = new Employee("generic", i+"");
            employee.hire();
            eList.add(employee);

        }

        Staff staff1 = new Staff();
        staff1.setFname("sP");
        staff1.setLname("gw");

        Faculty faculty1 = new Faculty();
        faculty1.setFname("fP");
        faculty1.setLname("tw");

        eList.add(staff1);
        eList.add(faculty1);


    }
}
