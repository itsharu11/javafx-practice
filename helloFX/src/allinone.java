import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.control.*;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;

public class allinone extends Application{

   
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
       lv.getItems().add("Java");
       lv.getItems().add("C++");
       lv.getItems().add("PHP");
       lv.getItems().add("JS");
       lv.getItems().add("VB");
       lv.getItems().add("BASH");
       
       ScrollBar sb = new ScrollBar();
       sb.setMin(0);
       sb.setMax(100);
       sb.setValue(25);
       sb.setOrientation(Orientation.HORIZONTAL);
      // sb.set
       Label l5 = new Label("5");
       
       VBox vb = new VBox();
       
       vb.getChildren().addAll(l,cb1,cb2,cb3,rb1,rb2,l1,tf,b,l2,ta,l3,cob,l4,lv,sb,l5);
       
       
       Scene s = new Scene(vb,300,300);
       stage.setScene(s);
       stage.show();
       
    }
}
