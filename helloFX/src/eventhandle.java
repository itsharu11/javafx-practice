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

public class eventhandle extends Application{

  
    public static void main(String args[]) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        FlowPane fp = new FlowPane();
        
        
        
        Button b = new Button("Click me");
        
        Label l = new Label("Hello ");
        fp.getChildren().addAll(b,l);
        Scene s = new Scene(fp,100,100);
        stage.setScene(s);
        stage.show();
        /*
        b.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent event)
            {
                System.out.println("button is clicked");
                l.setText("button is clicked");
                b.setText("clicked");
            }
        }
        
        );*/
          b.setOnAction((ActionEvent)->{
           
                System.out.println("button is clicked");
                l.setText("button is clicked");
                b.setText("clicked");
                b.setText("clicked");
            
        }
        
        );
        
        
    }
}
