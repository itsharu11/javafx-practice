import java.io.File;
import javafx.scene.Scene;
import javafx.application.Application;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.media.*;
import javafx.stage.Stage;

public class av extends Application{
    MediaPlayer mp;
    public static void main(String args[]) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        
        //File af = new File("")
        
        //String ss = "File E:/study/java_class/helloFX/src/aeg.mp3";
        
     //   File audioFile = new File("E:/study/java_class/helloFX/src/aeg.mp3");
        Media m = new Media("");
        
        mp = new MediaPlayer(m);
        
        mp.setAutoPlay(true);
        
        MediaView mv = new MediaView(mp);
        
        HBox hb = new HBox();
        
        Scene s = new Scene(hb,300,300);
        stage.setScene(s);
        
        stage.show();
        
        
        
        
        
    }
    
}
