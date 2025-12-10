package com.example.praktikummodul7;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainApp extends Application {

    private TextField txtNama, txtNim, txtSks;
    private TableView<Student> table;
    private ObservableList<Student> studentList;

    private StudentRepository repository;
    private Payment paymentStrategy;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        repository = new StudentRepository();
        paymentStrategy = new RegularPaymentLogic();
        studentList = FXCollections.observableArrayList();

        Label lblNama = new Label("Nama Mahasiswa:");
        txtNama = new TextField();

        Label lblNim = new Label("NIM:");
        txtNim = new TextField();

        Label lblSks = new Label("Jumlah SKS:");
        txtSks = new TextField();

        Button btnAdd = new Button("Create");
        Button btnUpdate = new Button("Update");
        Button btnDelete = new Button("Delete");
        Button btnClear = new Button("Clear");

        HBox buttonBox = new HBox(10, btnAdd, btnUpdate, btnDelete, btnClear);

        table = new TableView<>();

        TableColumn<Student, String> colNama = new TableColumn<>("Nama");
        colNama.setCellValueFactory(new PropertyValueFactory<>("name"));

        TableColumn<Student, Long> colNim = new TableColumn<>("NIM");
        colNim.setCellValueFactory(new PropertyValueFactory<>("id"));

        TableColumn<Student, Integer> colSks = new TableColumn<>("SKS");
        colSks.setCellValueFactory(new PropertyValueFactory<>("totalSKS"));

        TableColumn<Student, Double> colUkt = new TableColumn<>("Total UKT");
        colUkt.setCellValueFactory(new PropertyValueFactory<>("totalUKT"));

        table.getColumns().addAll(colNama, colNim, colSks, colUkt);
        table.setItems(studentList);

        table.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            if (newSelection != null) {
                txtNama.setText(newSelection.getName());
                txtNim.setText(String.valueOf(newSelection.getId()));
                txtSks.setText(String.valueOf(newSelection.getTotalSKS()));
                txtNim.setDisable(true);
            }
        });

        btnAdd.setOnAction(e -> {
            try {
                String nama = txtNama.getText();
                long nim = Long.parseLong(txtNim.getText());
                int sks = Integer.parseInt(txtSks.getText());

                Student s = new RegularStudent(nama, nim, sks, paymentStrategy);

                repository.addStudent(s);
                refreshTable();
                clearForm();
            } catch (NumberFormatException ex) {
                showAlert("Error", "NIM dan SKS harus angka!");
            }
        });

        btnUpdate.setOnAction(e -> {
            Student selected = table.getSelectionModel().getSelectedItem();
            if (selected != null) {
                try {
                    String nama = txtNama.getText();
                    long nim = Long.parseLong(txtNim.getText());
                    int sks = Integer.parseInt(txtSks.getText());

                    Student updatedStudent = new RegularStudent(nama, nim, sks, paymentStrategy);

                    repository.updateStudent(nim, updatedStudent);
                    refreshTable();
                    clearForm();
                } catch (Exception ex) {
                    showAlert("Error", "Gagal Update Data");
                }
            } else {
                showAlert("Warning", "Pilih data di tabel!");
            }
        });

        btnDelete.setOnAction(e -> {
            Student selected = table.getSelectionModel().getSelectedItem();
            if (selected != null) {
                repository.deleteStudent(selected.getId());
                refreshTable();
                clearForm();
            } else {
                showAlert("Warning", "Pilih data yang mau dihapus!");
            }
        });

        btnClear.setOnAction(e -> clearForm());

        VBox root = new VBox(10);
        root.setPadding(new Insets(15));

        GridPane formGrid = new GridPane();
        formGrid.setHgap(10);
        formGrid.setVgap(10);
        formGrid.addRow(0, lblNama, txtNama);
        formGrid.addRow(1, lblNim, txtNim);
        formGrid.addRow(2, lblSks, txtSks);

        root.getChildren().addAll(new Label("SISTEM PERHITUNGAN UKT"), formGrid, buttonBox, table);

        Scene scene = new Scene(root, 600, 500);
        primaryStage.setTitle("PRAKTIKUM 7");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void refreshTable() {
        studentList.clear();
        studentList.addAll(repository.getAllStudents());
    }

    private void clearForm() {
        txtNama.clear();
        txtNim.clear();
        txtSks.clear();
        txtNim.setDisable(false);
        table.getSelectionModel().clearSelection();
    }

    private void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setContentText(content);
        alert.showAndWait();
    }
}
