package sample;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.shape.Line;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.shape.Polygon;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import sample.Figure.Add;
import sample.Figure.Train;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.lang.reflect.Array;
import java.util.ArrayList;

import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

public class Main extends Application {
    public static ArrayList<Rectangle>  rectangles = new ArrayList<>();
    ArrayList<Line> lineFull = new ArrayList<Line>();
    ArrayList<Text> textFull = new ArrayList<>();

    String[] ollTrain = new String[]{
            "2021-02-04 19:40:30", "2021-02-04 19:59:30", "0",
            "2021-02-04 11:40:30", "2021-02-04 13:59:30", "2",
            "2021-02-04 08:00:30", "2021-02-04 18:00:30", "1",
            "2021-02-04 01:40:30", "2021-02-04 09:59:30", "4",
            "2021-02-04 18:40:30", "2021-02-04 24:59:30", "7",
            "2021-02-04 15:40:30", "2021-02-04 18:31:30", "9",
            "2021-02-04 08:40:30", "2021-02-04 11:59:30", "10",
            "2021-02-04 09:59:30", "2021-02-04 15:59:30", "8",

    };

    private Polygon triangle;

    public static void newRect(String start, String finish) {
        rectangles.add(Train.TrainGraf("2021-01-15 " + start, "2021-01-15 " + finish,0));
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Group root = new Group();
//        Controller controller = new Controller();
        Parent root1 = FXMLLoader.load(getClass().getResource("sample.fxml"));




        addFullLine();
        addFullRectangles();

        root.getChildren().addAll(textFull);
        root.getChildren().addAll(lineFull);
        root.getChildren().addAll(rectangles);
        root.getChildren().addAll(Train.getPolygonArrayList());

        root.getChildren().add(root1);
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 1350,720));
        primaryStage.show();
    }

    public void addFullLine(){
        ArrayList<Line> onelixt =  new ArrayList<>();

        lineFull.add(Add.Plus(10, 10, 10, 700));
        lineFull.add(Add.Plus(200, 10, 200, 700));
        lineFull.add(Add.Plus(250, 10, 250, 700));

        lineFull.add(Add.PlusPr(500, 10, 500, 700));
        lineFull.add(Add.PlusPr(750, 10, 750, 700));
        lineFull.add(Add.PlusPr(1000, 10, 1000, 700));
        lineFull.add(Add.Plus(1250, 10, 1250, 700));

        lineFull.add(Add.Plus(10, 10, 1250, 10));
        lineFull.add(Add.Plus(10, 100, 1250, 100));
        lineFull.add(Add.Plus(10, 300, 1250, 300));
        lineFull.add(Add.Plus(10, 400, 1250, 400));
        lineFull.add(Add.Plus(10, 700, 1250, 700));

        lineFull.add(Add.PlusPr(200, 150, 1250, 150));
        lineFull.add(Add.PlusPr(200, 200, 1250, 200));
        lineFull.add(Add.PlusPr(200, 250, 1250, 250));
        lineFull.add(Add.PlusPr(200, 450, 1250, 450));
        lineFull.add(Add.PlusPr(200, 500, 1250, 500));
        lineFull.add(Add.PlusPr(200, 550, 1250, 550));
        lineFull.add(Add.PlusPr(200, 600, 1250, 600));
        lineFull.add(Add.PlusPr(200, 650, 1250, 650));

        textFull.add(Add.textPl("52", 210,130,26));
        textFull.add(Add.textPl("53",210,180,26));
        textFull.add(Add.textPl("54",210,230,26));
        textFull.add(Add.textPl("55",210,280,26));
        textFull.add(Add.textPl("56",210,330,26));
        textFull.add(Add.textPl("57",210,380,26));
    }

    public void addFullRectangles(){
        int j= (ollTrain.length);
        int i = 0;
        while (j > i){
            rectangles.add(Train.TrainGraf(ollTrain[i], ollTrain[i+1],  Integer.parseInt(ollTrain[i+2])));
            i=i+3;
        }

//        rectangles.add(Train.TrainGraf("2021-02-03 19:40:30", "2021-02-03 19:59:30",0));
//        rectangles.add(Train.TrainGraf("2021-02-03 02:40:30", "2021-02-03 09:15:30",1));
//        rectangles.add(Train.TrainGraf("2021-02-03 09:30:30", "2021-02-03 11:59:30",2));
//        rectangles.add(Train.TrainGraf("2021-02-03 12:00:30", "2021-02-03 15:01:30",3));
//        rectangles.add(Train.TrainGraf("2021-02-03 07:40:30", "2021-02-03 22:59:30",7));
//        rectangles.add(Train.TrainGraf("2021-02-03 12:00:30", "2021-02-03 14:59:30",6));
//        rectangles.add(Train.TrainGraf("2021-02-03 14:40:30", "2021-02-03 21:59:30",8));
//        rectangles.add(Train.TrainGraf("2021-02-03 09:40:30", "2021-02-03 21:59:30",9));
    }

    public static void main(String[] args) {
        launch(args);
    }



}
