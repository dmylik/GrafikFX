package sample.Figure;

import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;


public class Add {
    public static Rectangle Plus(int x, int y, int Width, int Height, Color color){
        Rectangle rectangle = new Rectangle();

        rectangle.setX(x);
        rectangle.setY(y);
        rectangle.setWidth(Width);
        rectangle.setHeight(Height);
        rectangle.setStrokeWidth(15);

        return rectangle;
    }
    public static Line Plus(int x, int y, int X, int Y) {
        Line line = new Line();
        line.setStartX(x*1.0f);
        line.setStartY(y*1.0f);
        line.setEndX(X*1.0f);
        line.setEndY(Y*1.0f);
        line.setStrokeWidth(5);
        line.setStroke(Color.BLACK);

        return line;
    }

    public static Line PlusPr(int x, int y, int X, int Y) {
        Line line = new Line();
        line.setStartX(x*1.0f);
        line.setStartY(y*1.0f);
        line.setEndX(X*1.0f);
        line.setEndY(Y*1.0f);
        line.setStrokeWidth(2);
        line.setStroke(Color.rgb(7,26,116));
//        line.getStrokeDashArray().addAll(25.0, 20.0, 5.0, 20.0);

        return line;
    }

    public static Text textPl(String txt, int x, int y, int size){
        Text text = new Text();
        text.setText(txt);
        text.setX(x);
        text.setY(y);
        text.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, size));

        return  text;
    }
}
