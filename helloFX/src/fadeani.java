import javafx.animation.FadeTransition;
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


public class fadeani extends Application{

    public static void main(String args[]) {
       launch(args);
       
    }
    public void start(Stage stage)
    {
        
        Rectangle r = new Rectangle(350,100,100,100);
        
        r.setFill(Color.BLACK);
        r.setStroke(Color.BLUE);
        
        FadeTransition pt = new FadeTransition();
        
        pt.setDuration(Duration.millis(3000)); // the rate at which the object moves.
        
        pt.setNode(r); // It sets which object is to be animated
    
        pt.setFromValue(10);
        pt.setToValue(0.1);
        
        
        pt.setCycleCount(100); //number of times the object moves around the rectangle object or path
        
        pt.setAutoReverse(false); // it does not loop when it is true. It loops when it is false
        
        pt.play();
        
        Group g = new Group();
        g.getChildren().addAll(r);
        Scene s = new Scene(g,700,700);
        
        stage.setScene(s);
        stage.show();
    }
}
