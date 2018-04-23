package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;
import java.util.Random;
import javafx.scene.paint.Color;

import javafx.scene.control.Button;


public class Main extends Application {

    private Canvas canvas = new Canvas(400, 400);


    @Override
    public void start(Stage primaryStage) throws Exception{
        Button btn = new Button();
        btn.setText("draw Shapes");


        RadioButton rbt1 = new RadioButton("Circles");
        rbt1.setSelected(true);
        RadioButton rbt2 = new RadioButton("Rectangles");

        ToggleGroup radioGroup = new ToggleGroup();
        rbt1.setToggleGroup(radioGroup);
        rbt2.setToggleGroup(radioGroup);


        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
               if (rbt2.isSelected()){
                   drawShapes(true);
               } else {
                  drawShapes(false);
               }
            }
        });



        HBox hroot = new HBox();
        VBox root = new VBox();
        root.getChildren().add(canvas);
        hroot.getChildren().add(btn);
        hroot.getChildren().add(rbt1);
        hroot.getChildren().add(rbt2);



        root.getChildren().add(hroot);



        Scene scene = new Scene(root);
        primaryStage.setTitle("Draw Circles");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void drawShapes(boolean isRact) {
        // radius of the circles
        final int RADIUS = 20;
        Random rand = new Random();
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());

        for (int i =0; i <50;i++) {
            int x = rand.nextInt(400);
            int y = rand.nextInt(400);
            int r = rand.nextInt(255);
            int b = rand.nextInt(255);
            int g = rand.nextInt(255);

            gc.setFill(Color.rgb(r,b, g));
            if (isRact){
                gc.fillRect(x,y,RADIUS,RADIUS);
            } else {
                gc.fillOval(x, y, RADIUS, RADIUS);
            }

        }
    }


    public static void main(String[] args) {
        launch(args);
    }
}
