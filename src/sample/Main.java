package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.text.*;
import javafx.stage.Stage;
//import javafx.scene.control.*;
import javafx.scene.layout.*;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        //Creating flags
        ImageView vietnam = new ImageView("file:flags/1599px-Flag_of_Vietnam.png");
        ImageView japan = new ImageView("file:flags/1280px-Flag_of_Japan.svg.png");
        ImageView america = new ImageView("file:flags/71Pg8e+GW3L._SX425_.jpg");
        ImageView australia = new ImageView("file:flags/Flag-Australia.jpg");

        //Formatting flags
        vietnam.setFitWidth(400);
        vietnam.setPreserveRatio(true);
        vietnam.setSmooth(true);
        japan.setFitWidth(400);
        japan.setPreserveRatio(true);
        japan.setSmooth(true);
        america.setFitWidth(400);
        america.setPreserveRatio(true);
        america.setSmooth(true);
        australia.setFitWidth(400);
        australia.setFitHeight(275);
        //australia.setPreserveRatio(true);
        australia.setSmooth(true);



//        //Displaying country name
//        String country = "Vietnam";
//        Text countryName = new Text(10, 10, country);
//        countryName.setFont(Font.font("Times New Roman", FontWeight.BOLD,
//                FontPosture.ITALIC, 30));
//        countryName.setStroke(Color.RED); countryName.setStrokeWidth(1);
//        countryName.setFill(Color.GRAY);

        //Displaying instructions
        Text instruction = new Text();
        instruction.setText("Click on an flag to display its country name");
        instruction.setFont(Font.font("BigNoodleTitling", FontWeight.BOLD, 40));
        instruction.setFill(Color.RED);
        instruction.setStroke(Color.PURPLE);
        instruction.setStrokeWidth(0.5);
        instruction.setTextAlignment(TextAlignment.CENTER);

        //Creating panes
        GridPane pane = new GridPane();
        pane.add(vietnam, 0, 0);
        pane.add(japan, 1, 0);
        pane.add(america, 0, 1);
        pane.add(australia, 1, 1);
        pane.setAlignment(Pos.CENTER);

        //pane.resize(700,700);
        //pane.setPadding(new Insets(5));

        //pane.add(countryName, 0,2);
        //pane.add(box,1,3);

        VBox box = new VBox();
        box.getChildren().addAll(pane, instruction);
        box.setAlignment(Pos.CENTER);
        //box.setPadding(new Insets(1));
        box.setSpacing(5);


        //Action Handler
        vietnam.addEventHandler(MouseEvent.MOUSE_PRESSED, event -> {
            vietnam.setFitWidth(390);
            vietnam.setSmooth(true);
            event.consume();
        });
        vietnam.addEventHandler(MouseEvent.MOUSE_RELEASED, event -> {
            vietnam.setFitWidth(400);
            vietnam.setSmooth(true);
            instruction.setText("Vietnam <3");
            event.consume();
        });
        japan.addEventHandler(MouseEvent.MOUSE_PRESSED, event -> {
            japan.setFitWidth(390);
            japan.setSmooth(true);
            event.consume();
        });
        japan.addEventHandler(MouseEvent.MOUSE_RELEASED, event -> {
            japan.setFitWidth(400);
            japan.setSmooth(true);
            instruction.setText("Japan");
            event.consume();
        });
        america.addEventHandler(MouseEvent.MOUSE_PRESSED, event -> {
            america.setFitWidth(390);
            america.setSmooth(true);
            event.consume();
        });
        america.addEventHandler(MouseEvent.MOUSE_RELEASED, event -> {
            america.setFitWidth(400);
            america.setSmooth(true);
            instruction.setText("America");
            event.consume();
        });
        australia.addEventHandler(MouseEvent.MOUSE_PRESSED, event -> {
            australia.setFitWidth(390);
            australia.setFitHeight(265);
            australia.setSmooth(true);
            event.consume();
        });
        australia.addEventHandler(MouseEvent.MOUSE_RELEASED, event -> {
            australia.setFitWidth(400);
            australia.setFitHeight(275);
            australia.setSmooth(true);
            instruction.setText("Australia");
            event.consume();
        });
        instruction.addEventHandler(MouseEvent.MOUSE_PRESSED, event -> {
            //instruction.setText("Click on an image to display its country name");
            instruction.setFont(Font.font("BigNoodleTitling", FontWeight.BOLD, 37));
            event.consume();
        });
        instruction.addEventHandler(MouseEvent.MOUSE_RELEASED, event -> {
            instruction.setText("Click on a flag to display its country name");
            instruction.setFont(Font.font("BigNoodleTitling", FontWeight.BOLD, 40));
            event.consume();
        });


        //Creating scene and stage
        Scene scene = new Scene(box);
        primaryStage.setTitle("Country flags");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}

