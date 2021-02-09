package sample.Figure;

import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Polyline;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.shape.Polygon;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Train {
    public static ArrayList<Polygon> polygonArrayList = new ArrayList<Polygon>();

    public static Rectangle TrainGraf(String dataS, String dataF, int n) {
        Rectangle rectangle = new Rectangle();
        int x = 0, y, X1 = 0, Y;
        //--
        Date dateNow = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("dd.MM.yyyy hh:mm:ss ");
        String st_day = formatForDateNow.format(dateNow);
        //-- Опрделение даты
        int dayNoy = Integer.parseInt(st_day.substring(0, 2));
        int monthNoy = Integer.parseInt(st_day.substring(3, 5));
        int yearNoy = Integer.parseInt(st_day.substring(6, 10));
        int nowInt = yearNoy * 10000 + monthNoy * 100 + dayNoy;
        //-- преобразование даты
        String formData = dataS;
        int startInt = dayRoom(dataS);

        int hour1 = Integer.parseInt(formData.substring(11, 13));
        int minute1 = Integer.parseInt(formData.substring(14, 16));

        String formDataF = dataF;
        int finishInt = dayRoom(dataF);

        int hour2 = Integer.parseInt(formDataF.substring(11, 13));
        int minute2 = Integer.parseInt(formDataF.substring(14, 16));
        //-- Определение координат
        if (nowInt == startInt && nowInt == finishInt) {
            x = pox(hour1, minute1);
            X1 = poX(hour1, hour2, minute2, x);
        } else if (nowInt > startInt && nowInt == finishInt) {
            x = 250;
            X1 = poX(hour1, hour2, minute2, x);
        } else if (nowInt > startInt && nowInt < finishInt) {
            x = 250;
            X1 = 1000;
        } else if (nowInt < startInt) {
            x = 0;
            X1 = 0;
        }
        //--
        y = 100 + 50 * n + 2;
        Y = 46;
        //-- Треуголник левый
        if (x > 275) {
            double xtr1 = x, ytr1 = y;
            Polygon polygon = new Polygon();
            polygon.getPoints().addAll(new Double[]{
                    xtr1 - 1, ytr1+5,
                    xtr1 - 1, ytr1 + 46,
                    xtr1 - 30, ytr1 + 46});
            polygonArrayList.add(polygon);
        }
        //-- Треугольник праввый
        if(X1+x<1225 && X1+x > 250){
            double Xtr = X1 + x, Ytr = y;
            Polygon polygon = new Polygon();
            polygon.getPoints().addAll(new Double[]{
                    Xtr+1, Ytr + 5,
                    Xtr +1, Ytr + 46,
                    Xtr + 30, Ytr + 46});
            polygonArrayList.add(polygon);
        }

        Polyline polyline = new Polyline();
        //Adding coordinates to the hexagon
        polyline.getPoints().addAll(new Double[]{
                200.0, 50.0,
                400.0, 50.0,
                400.0, 50.0,
        });

        rectangle.setX(x);
        rectangle.setY(y);
        rectangle.setWidth(X1);
        rectangle.setHeight(Y);
        rectangle.setStrokeWidth(15);
        rectangle.setFill(Color.rgb(115, 2, 115));

        return rectangle;
    }

    public static int pox(int hour1, int minute1) {
        int xx = 0;
        if (hour1 < 8)
            xx = 250;
        else if (hour1 >= 8 && hour1 <= 20)
            xx = (int) (250 + ((((hour1 - 8) * 60) + minute1) * 1.38));
        return xx;
    }

    public static int poX(int hour1, int hour2, int minute2, int x) {
        int XX = 0;
        if (hour1 <= hour2 && hour2 <= 20)
            XX = (int) (250 + ((((hour2 - 8) * 60) + minute2) * 1.38)) - x;
        else if (hour2 > 20)
            XX = 1250 - x;

        return XX;
    }

    public static int dayRoom(String data) {
        int day = Integer.parseInt(data.substring(8, 10));
        int month = Integer.parseInt(data.substring(5, 7));
        int year = Integer.parseInt(data.substring(0, 4));

        return year * 10000 + month * 100 + day;
    }

    public static ArrayList<Polygon> getPolygonArrayList() {
        return polygonArrayList;
    }
}
