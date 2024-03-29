package Java.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class HomeController implements Initializable {

    @FXML
    public Pane paneView;

    public void initialize(URL url, ResourceBundle rb) {
        loadData();
    }

    private void loadData()
    {
        paneView.getChildren().clear();
        NumberAxis xAxis = new NumberAxis(1, 5, 1);
        xAxis.setLabel("");

        NumberAxis yAxis = new NumberAxis(0,40,10);
        yAxis.setLabel("");
        LineChart<Number,Number> statsChart = new LineChart(xAxis, yAxis);
        statsChart.setTitle("");

        XYChart.Series statsSeries = new XYChart.Series();
        statsSeries.setName("rented equipment");
        statsSeries.getData().add(new XYChart.Data<>(0,0));
        statsSeries.getData().add(new XYChart.Data<>(1, 15));
        statsSeries.getData().add(new XYChart.Data<>(2, 23));
        statsSeries.getData().add(new XYChart.Data<>(3, 31));
        statsSeries.getData().add(new XYChart.Data<>(4, 27));
        statsSeries.getData().add(new XYChart.Data<>(5, 39));

        statsChart.getData().add(statsSeries);
        statsChart.setMaxWidth(295);
        statsChart.setMaxHeight(200);

        paneView.getChildren().add(statsChart);
    }

    public void accountOnClick(ActionEvent e) throws Exception {
        Parent accountRoot = FXMLLoader.load(getClass().getResource("../../resources/view/Account.fxml"));
        Scene accountScene = new Scene(accountRoot);

        Stage window = (Stage)((Node)e.getSource()).getScene().getWindow();

        window.setScene(accountScene);
        window.show();
    }

    public void logoutOnClick(ActionEvent e) throws Exception {
        Parent loginRoot = FXMLLoader.load(getClass().getResource("../../resources/view/Login.fxml"));
        Scene loginScene = new Scene(loginRoot);

        Stage window = (Stage)((Node)e.getSource()).getScene().getWindow();

        window.setScene(loginScene);
        window.show();
    }
    // Change scene to rentals
    public void rentalsOnClick(ActionEvent e) throws Exception {
        Parent rentalsRoot = FXMLLoader.load(getClass().getResource("../../resources/view/Rentals.fxml"));
        Scene rentalsScene = new Scene(rentalsRoot);

        Stage window = (Stage)((Node)e.getSource()).getScene().getWindow();

        window.setScene(rentalsScene);
        window.show();
    }
    public void weightsOnClick(ActionEvent e) throws Exception {
        Parent weightsRoot = FXMLLoader.load(getClass().getResource("../../resources/view/Weights.fxml"));
        Scene weightsScene = new Scene(weightsRoot);
        Stage window = (Stage)((Node)e.getSource()).getScene().getWindow();

        window.setScene(weightsScene);
        window.show();
    }

    public void favOnClick(ActionEvent e) throws Exception {
        Parent favRoot = FXMLLoader.load(getClass().getResource("../../resources/view/Favourites.fxml"));
        Scene favScene = new Scene(favRoot);
        Stage window = (Stage)((Node)e.getSource()).getScene().getWindow();

        window.setScene(favScene);
        window.show();
    }

    public void issueOnClick(ActionEvent e) throws Exception {
        Parent issueRoot = FXMLLoader.load(getClass().getResource("../../resources/view/ReportIssue.fxml"));
        Scene issueScene = new Scene(issueRoot);
        Stage window = (Stage)((Node)e.getSource()).getScene().getWindow();

        window.setScene(issueScene);
        window.show();
    }

}
