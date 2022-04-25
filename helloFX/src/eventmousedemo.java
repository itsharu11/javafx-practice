import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.Button;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.scene.Group;

public class eventmousedemo extends Application {
    
    public static void main(String args[]) {
            launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        
        
        Rectangle r = new Rectangle(50,50,100,100);
        r.setArcHeight(20);
        r.setArcWidth(20);
        r.setFill(Color.BLUE);
        
        
        r.setOnMouseClicked(e->{
            r.setFill(Color.RED);
            stage.setTitle("RED");
        }
        );
        r.setOnMousePressed(e->{
            r.setFill(Color.PINK);
            stage.setTitle("PINK");
        }
        );
        
        r.setOnMouseReleased(e->{
            r.setFill(Color.BLACK);
            stage.setTitle("BLACK");
        }
        );
        
        r.setOnMouseEntered(e->{
            r.setFill(Color.CHOCOLATE);
            stage.setTitle("CHOCOLATE");
        }
        );
        r.setOnMouseExited(e->{
            r.setFill(Color.MAGENTA);
            stage.setTitle("MAGENTA");
        }
        );
        Group g = new Group(r);
        Scene s = new Scene(g,500,500);
        stage.setScene(s);
        stage.show();
    }
    
}
