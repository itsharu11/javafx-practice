import javafx.application.Application;


import javafx.stage.Stage;
import javafx.scene.Scene;
import static javafx.application.Application.launch;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.*;

public class shapedemo extends Application{


    public static void main(String args[]) {
    launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        VBox hb = new VBox();
        // Increases the space between shapes 
        hb.setSpacing(10);
        Line l = new Line(50,70,200,100);
        l.setStroke(Color.RED); // Stroke for line and fill for close objects.
        
        //
        
        Rectangle r = new Rectangle(50,70,50,50);
        r.setFill(Color.BLUE);
        // increasing the arc with same value as height and width will make a circle.
        Rectangle re = new Rectangle(50,70,50,50);
        re.setArcHeight(50);
        re.setArcWidth(50);
        
        //
        
        Circle c = new Circle(50,50,20);
        c.setFill(Color.MAGENTA);
        
        
        //
        Ellipse e = new Ellipse();
        e.setCenterX(100);
        e.setCenterY(100);
        e.setRadiusX(70);
        e.setRadiusY(30);
        e.setFill(Color.CHOCOLATE);
        
        //
        
        Arc a = new Arc();
        a.setCenterX(100);
        a.setCenterY(50);
        a.setRadiusX(70);
        a.setRadiusY(30);
        a.setStartAngle(90);
        a.setLength(270);
        a.setType(ArcType.ROUND);
        
        //
        
        Polygon p = new Polygon();
        p.getPoints().addAll(new Double[]{
        50.0,40.0,
        30.0,70.0,
        50.0,100.0,
        150.0,100.0,
        170.0,70.0,
        150.0,40.0
        }
        );
        p.setFill(Color.AQUA);
    
        
        Scene s = new Scene(hb,500,500);
        hb.getChildren().addAll(l,r,re,c,e,a,p);
        stage.setScene(s);
        stage.show();
        
    }
    
}
