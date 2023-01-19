//********************************************************************
//  Flower.java      Author: Bruno Stevaux              100144894
// 
//  This program will draw a simple flower using JavaFX and a for-
//  loop to add petals into the program instead of individually
//  adding adding them.
//********************************************************************


import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.transform.Rotate;

public class Flower extends Application
{
  //****************************************************************
    // We will first have to create a circle, followed by one for loop
    // that will add one petal each iteration until we complete a full
    // circle.
    //****************************************************************
    
    public void start(Stage primaryStage)
    {
        // Defining our number variables.
        
        int width = 500;
        int height = 400;
        int angle = 0; // 0 angle means it will be facing upwards.
        
        // Center circle of flower
        Circle circle = new Circle();
        
        // Setting the circle to the middle of the screen.
        circle.setCenterX(width/2);     
        circle.setCenterY(height/2);
        
        // Setting the radius ( size ) of our circle.
        circle.setRadius(30);
        
        // The default color is black, so there is no need to
        // set the color here.
        
        // Creating our flower group, which will hold all of our
        // petals and middle circle.
        Group flower = new Group();
        
        for(int i = 0; i <= 6; i++)
        {
            Ellipse petal = new Ellipse();
            
            // Setting the petal to the middle of the screen.
            petal.setCenterX(width/2);
            petal.setCenterY(height/2);
            
            // Setting the size of our petals.
            petal.setRadiusX(15);
            petal.setRadiusY(100);
            
            // Seting the color
            petal.setFill(Color.GOLD);
            
            // Setting the angle
            petal.setRotate(angle);
            
            // Go inside the brackets of the flower group.
            // Group flower = new Group( x.. ) and add our petal to it.
            
            flower.getChildren().add(petal);
            
            // 12 petals, 360 degrees. 30 degrees between each petal. 
            // Since they're long and count as "two" petals, we only
            // need to add 6 of them.
            
            angle += 30;
        }
        
        // Add our circle to the flower, we must do it last so it is
        // overtop of all the petals
        flower.getChildren().add(circle);
        
        // Creating our scene
        Scene scene = new Scene(flower, width, height);
        
        // Creating the stage
        primaryStage.setTitle("Black-eyed Susan");
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
    public static void main(String[] args)
    {
        // Launching the flower
        launch(args);
    }
}
