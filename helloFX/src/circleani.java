import  javafx.application.Application;
import  javafx.scene.Group;
import  javafx.scene.Scene;
import  javafx.scene.paint.Color;
import  javafx.scene.shape.Circle;
import  javafx.scene.shape.Rectangle;
import  javafx.animation.PathTransition;
import  javafx.animation.PathTransition.OrientationType;
import javafx.scene.shape.Polygon;

import javafx.stage.Stage;
import javafx.util.Duration;


public class circleani extends Application{

    public static void main(String args[]) {
       launch(args);
       
    }
    public void start(Stage stage)
    {
        Circle c = new Circle(50,50,20);
        
        c.setFill(Color.TRANSPARENT);
        c.setStroke(Color.BLACK);
        
        PathTransition pt = new PathTransition();
        
        pt.setDuration(Duration.millis(1000)); // the rate at which the object moves.
        
        pt.setNode(c); // It sets which object is to be animated
        
        //Rectangle r = new Rectangle(350,100,100,100);
        Polygon r = new Polygon();
        r.getPoints().addAll(new Double[]{
        50.0,40.0,
        30.0,70.0,
        50.0,100.0,
        150.0,100.0,
        170.0,70.0,
        150.0,40.0
        }
        );
        r.setFill(Color.WHITE);
        r.setStroke(Color.BLUE);
        
        
        pt.setPath(r); // sets the path on which the object will move
        
        pt.setOrientation(OrientationType.ORTHOGONAL_TO_TANGENT);
        
        pt.setCycleCount(20); //number of times the object moves around the rectangle object or path
        
        pt.setAutoReverse(true); // it does not loop when it is true. It loops when it is false
        
        pt.play();
        
        Group g = new Group();
        g.getChildren().addAll(r,c);
        Scene s = new Scene(g,700,700);
        
        stage.setScene(s);
        stage.show();
    }
}
