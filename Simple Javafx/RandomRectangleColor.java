//********************************************************************
// RandomRectangleColor.java   Author:  Bruno Stevaux       100144894
//
//  Will use javafx and a random number generator to make random RGB
//  values and then assign it to a 300x100 rectangle inside of a 
//  scene.
//********************************************************************
import javafx.application.Application; 
import javafx.scene.Group; 
import javafx.scene.Scene; 
import javafx.scene.paint.*; 
import javafx.scene.shape.Rectangle; 
import javafx.stage.Stage;
import java.util.Random;

public class RandomRectangleColor extends Application
{
   public void start(Stage primaryStage)
   {
      
      // Here we are setting up the random number generator
      // so that we can create RBG values.
      
      Random generator = new Random(); 
      int r, g, b, max;
      max = 256; //RBG is out of 255, and randomizer will pick one less
      // than 256, making it 255.
      
      r = generator.nextInt(max);
      g = generator.nextInt(max);
      b = generator.nextInt(max);
      
      // This is going to make the color of the rectangle
      
      Color RGB = Color.rgb(r, g, b);
      
      //This is making the rectangle
      
      Rectangle rectangle = new Rectangle(50,50,300,100);
      rectangle.setFill(RGB);
      
      // This is adding the rectangle to the group and then
      // adding the group into the scene.
      
      Group root = new Group(rectangle);
      Scene scene = new Scene(root, 400, 200);
      
      // This is readying everything to be displayed.
      
      primaryStage.setTitle("Random Rectangle Color"); 
      primaryStage.setScene(scene); 
      primaryStage.show();
      
   }
   
   // This launches the scenes
   
   public static void main(String[] args)
   {
      launch(args);
   }
}
