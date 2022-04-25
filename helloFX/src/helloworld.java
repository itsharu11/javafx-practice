import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import static javafx.application.Application.launch;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.Button;
public class helloworld extends Application{


    public static void main(String args[]) {
       launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Label L = new Label("welcome");
        Button b = new Button("click me");
       
        primaryStage.setTitle("First Demo Program");
      
       // StackPane sp = new StackPane();
        FlowPane sp = new FlowPane();
        sp.getChildren().add(L);
        sp.getChildren().add(b);
       // sp.getChildren().add(0, L);
       // sp.getChildren().add(1, b);
         Scene scene = new Scene(sp,300,300);
         primaryStage.setScene(scene);
        primaryStage.show();
        
        
    }
    
}
