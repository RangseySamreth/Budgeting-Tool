package com.budget.tool.Views;

import com.budget.tool.Controller.Client.ClientController;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ViewFactory {
    // Client Views
    private final StringProperty clientSelectedMenuItem;
    /*private AnchorPane dashboardView;
    private AnchorPane transactionsView;
    private AnchorPane accountsView;*/
    private AnchorPane budgetView;
    private AnchorPane paybillsView;

    public ViewFactory(){
        this.clientSelectedMenuItem = new SimpleStringProperty("");
    }

    public StringProperty getClientSelectedMenuItem() {
        return clientSelectedMenuItem;
    }



    public AnchorPane getBudgetView() {
        if (budgetView == null){
            try {
                budgetView = new FXMLLoader(getClass().getResource("/Fxml/Client/Budget.fxml")).load();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return budgetView;
    }

    public AnchorPane getPaybillsView() {
        if (paybillsView == null){
            try {
                paybillsView = new  FXMLLoader(getClass().getResource("/Fxml/Client/PayBills.fxml")).load();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return paybillsView;
    }

    public void showLoginWindow(){
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Fxml/Login.fxml"));
        createStage(loader);
    }
    public void showClientWindow() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Fxml/Client/Client.fxml"));
        ClientController clientController = new ClientController();
        loader.setController(clientController);
        createStage(loader);
    }

    private static void createStage(FXMLLoader loader) {
        Scene scene = null;
        try {
            scene = new Scene(loader.load());
        }catch (Exception e){
            e.printStackTrace();
        }
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.getIcons().add(new Image(String.valueOf(ViewFactory.class.getResource("/Images/profits.png"))));
        stage.setResizable(false);
        stage.setTitle("Budget Tool");
        stage.show();
    }

    public void closeStage(Stage stage) {
        if (stage != null){
            stage.close();
        }

    }
}
