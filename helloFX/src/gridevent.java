import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.GridPane;
import javafx.scene.control.*;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;

public class gridevent extends Application{

   
    public static void main(String args[]) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
       
       Label l = new Label("hello");
       CheckBox cb1 = new CheckBox("Red");
       CheckBox cb2 = new CheckBox("Blue");
       CheckBox cb3 = new CheckBox("Green");
       RadioButton rb1 = new RadioButton("Male");
       RadioButton rb2 = new RadioButton("Female");
       ToggleGroup tg = new ToggleGroup();
       rb1.setToggleGroup(tg);
       rb2.setToggleGroup(tg);
       Label l1 = new Label("Enter any name");
       TextField tf = new TextField();
       Button b = new Button("click");
       
       Label l2 = new Label("Address");
       TextArea ta = new TextArea();

       ta.setPrefHeight(150.0);
       ta.setPrefWidth(150.0);
      // ta.setScrollLeft(0);
       
       Label l3 = new Label("Country");
       ComboBox cob = new ComboBox();
       cob.getItems().add("India");
       cob.getItems().add("USA");
       cob.getItems().add("UK");
       
       Label l4 = new Label("Select from list");
       ListView lv = new ListView();
       lv.getItems().add("Java ");
       lv.getItems().add("C++");
       lv.getItems().add("PHP");
       lv.getItems().add("JS");
       lv.getItems().add("VB");
       lv.getItems().add("BASH");
       

          
       ScrollPane sb = new ScrollPane();
       //sb.setContent(l,cb1,cb2,cb3,rb1,rb2,l1,tf,b,l2,ta,l3,cob,l4,lv,sb,l5);
       sb.setContent(l);
       
      // sb.set
       Label l5 = new Label("5");
       
       /*
       VBox vb = new VBox();
       
       vb.getChildren().addAll(l,cb1,cb2,cb3,rb1,rb2,l1,tf,b,l2,ta,l3,cob,l4,lv,sb,l5);
       */
       GridPane gp = new GridPane();
       gp.setMinSize(200, 400);
       gp.add(l,0,0);
       gp.add(cb1,0,1);
       gp.add(cb2,1,1);
       gp.add(cb3,2,1);
       
       gp.add(rb1,0,2);
       gp.add(rb2,1,2);
       
       gp.add(l1,0,3);
       gp.add(tf,1,3);
       
       gp.add(b,1,4);
       
       gp.add(l2,0,5);
       gp.add(ta,1,5);
       
       gp.add(l3,0,6);
       gp.add(cob,1,6);
       
       gp.add(l4,0,7);
       gp.add(lv,1,7);
       
     //  gp.add(sb,0,8);
       gp.add(l5,0,9);
       Scene s = new Scene(gp,500,500);
       stage.setScene(s);
       stage.show();
       
    }
}
