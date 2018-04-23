package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.event.EventHandler;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Button btn = new Button();
        btn.setText("getArea");

        TextField widthField = new TextField("Enter width");
        TextField heightField = new TextField("Enter height");
        Label areaLabel = new Label("Ardddea");

        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                areaLabel.setText(bob(widthField.getText(),heightField.getText()));
            }
        });

        VBox root = new VBox(5.0);
        Scene scene = new Scene(root);
        root.getChildren().add(widthField);
        root.getChildren().add(heightField);
        root.getChildren().add(areaLabel);
        root.getChildren().add(btn);



        primaryStage.setTitle("Areas");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public String bob(String w,String h){

        double wNumber,hNumber,rNumber;
        wNumber = Double.parseDouble(w);
        hNumber = Double.parseDouble(h);
        rNumber = wNumber * hNumber;

        return String.valueOf(rNumber);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
