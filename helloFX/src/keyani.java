import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import  javafx.application.Application;
import  javafx.scene.Group;
import  javafx.scene.Scene;
import  javafx.scene.paint.Color;
import  javafx.scene.shape.Circle;


import javafx.stage.Stage;
import javafx.util.Duration;

public class keyani extends Application{

      public static void main(String args[]) {
       launch(args);
    }
      public void start(Stage stage)
      {
          Circle c = new Circle(20,50,20);
          
          c.setFill(Color.RED);
          c.setStroke(Color.BLACK);
          
          Timeline tm = new Timeline();
          
          KeyValue kv = new KeyValue(c.translateXProperty(),200); // translateYProperty is used to specify to move the object horizontal or vertical on the axis
          KeyFrame kf = new KeyFrame(Duration.millis(1000),kv);// rate of movement
          tm.getKeyFrames().addAll(kf);
          tm.setCycleCount(50);
          
          tm.setAutoReverse(false); // loop or not
          
          tm.play();
          
          Group g = new Group();
          g.getChildren().addAll(c);
          Scene s = new Scene(g,240,200);
          stage.setScene(s);
          stage.show();
      }
}
