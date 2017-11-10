import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
   This is the main application class for the
   Dwarf Planets JavaFX application.
 */

public class DwarfPlanets extends Application
{
   public void start(Stage stage) throws Exception
   {
     
      Parent parent = FXMLLoader.load(
      getClass().getResource("DwarfPlanets.fxml"));

      // Build the scene graph.
      Scene scene = new Scene(parent);

      
      stage.setTitle("Dwarf Planets");
      stage.setScene(scene);
      stage.show();
   }

   public static void main(String[] args)
   {
      // Launch the application.
      launch(args);
   }
}