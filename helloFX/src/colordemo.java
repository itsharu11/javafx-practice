import javafx.application.Application;
/*
FONT AND COLOR 
*/

import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import static javafx.application.Application.launch;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.FontWeight;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.io.FileInputStream;

public class colordemo extends Application {

    public static void main(String args[]) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
       FlowPane sp = new FlowPane();
       Rectangle r = new Rectangle(100,200);
       Label l = new Label("Today is Saturday and its evening");
       l.setFont(Font.font("MONOTYPE CORSIVA", FontWeight.NORMAL, 35));
       FileInputStream fis = new FileInputStream("E:\\study\\java_class\\helloFX\\src\\a.png");
       Image img = new Image(fis);
      
       ImageView imgview = new ImageView(img);
       imgview.setFitHeight(100);
       imgview.setFitWidth(100);
       
       
       /* with color object
       double red = Math.random();
       double green = Math.random();
       double blue = Math.random();
       Color c = new Color(0.5,red,green,blue);
       r.setFill(c);
*/          // With type cast
       int green = (int)(Math.random()*255);
       int blue = (int)(Math.random()*255);
       int red = (int)(Math.random()*255);
       r.setFill(Color.rgb(red, green, blue));
       sp.getChildren().add(r);
       sp.getChildren().add(l);
       sp.getChildren().add(imgview);
       //sp.getChildren().addAll(r,l,imgview); add all nodes in one line. 
       Scene s = new Scene(sp,300,300);
       stage.setScene(s);
       stage.show();
    }
}
