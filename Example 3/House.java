//********************************************************************
// House.java   Author:  Bruno Stevaux                      100144894
//
//  Makes my childhood house, using different shapes and backgrounds
//  found in javafx, by making shapes and grouping them together and
//  then adding them to the scene and displaying them.
//********************************************************************

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;

public class House extends Application
{
   //--------------------------------------------------------------------
   //  Creates and displays two Text objects in a JavaFX window.
   //--------------------------------------------------------------------
   public void start(Stage primaryStage)
   {
      
      //--------------------------------------------------------------------
      //  Creates the front of the house
      //--------------------------------------------------------------------
      Rectangle wall = new Rectangle(150, 150, 175, 150);
      wall.setFill(Color.SEAGREEN);
      wall.setStroke(Color.BLACK);
      
      //--------------------------------------------------------------------
      //  Creates the windows
      //--------------------------------------------------------------------
      
      Rectangle window1 = new Rectangle(175, 175, 40, 40);
      window1.setFill(Color.SIENNA);
      window1.setStroke(Color.BLACK);
      
      Rectangle window2 = new Rectangle(260, 175, 40, 40);
      window2.setFill(Color.SIENNA);
      window2.setStroke(Color.BLACK);
      
      Rectangle pane1 = new Rectangle(179, 179, 15, 15);
      pane1.setFill(Color.SILVER);
      
      Rectangle pane2 = new Rectangle(179, 196, 15, 15);
      pane2.setFill(Color.SILVER);
      
      Rectangle pane3 = new Rectangle(196, 179, 15, 15);
      pane3.setFill(Color.SILVER);
      
      Rectangle pane4 = new Rectangle(196, 196, 15, 15);
      pane4.setFill(Color.SILVER);
      
      Rectangle pane5 = new Rectangle(264, 179, 15, 15);
      pane5.setFill(Color.SILVER);
      
      Rectangle pane6 = new Rectangle(264, 196, 15, 15);
      pane6.setFill(Color.SILVER);
      
      Rectangle pane7 = new Rectangle(281, 179, 15, 15);
      pane7.setFill(Color.SILVER);
      
      Rectangle pane8 = new Rectangle(281, 196, 15, 15);
      pane8.setFill(Color.SILVER);
      Group windows = new Group(window1, window2,pane1,pane2,pane3,pane4,pane5,pane6,pane7,pane8);
      
      //--------------------------------------------------------------------
      //  Creates the roof
      //--------------------------------------------------------------------                         
      Polygon triangle = new Polygon();
      triangle.getPoints().addAll(135.0, 150.0,
                                  340.0, 150.0,
                                  237.5, 50.0);
      triangle.setFill(Color.GREY);
      triangle.setStroke(Color.BLACK);
      //--------------------------------------------------------------------
      //  Creates the door
      //--------------------------------------------------------------------  
      Rectangle door = new Rectangle(218, 224, 39, 76);
      door.setFill(Color.DIMGREY);
      door.setStroke(Color.BLACK);
      
      Circle handle = new Circle(227, 257, 3);
      handle.setFill(Color.DARKGREY);
      handle.setStroke(Color.BLACK);
      //--------------------------------------------------------------------
      //  Groups the door, handle, windows,and wall
      //--------------------------------------------------------------------
      
      Group home = new Group(wall,windows,door,triangle,handle);
      
      //--------------------------------------------------------------------
      //  Creates the ground and backround
      //--------------------------------------------------------------------
      
      Rectangle ground = new Rectangle(0, 225, 500, 125);
      ground.setFill(Color.SPRINGGREEN);
      
      Group root = new Group(ground,home);
      Scene scene = new Scene(root, 500, 350, Color.LIGHTBLUE);
      
      //--------------------------------------------------------------------
      //  Sets the title of the JavaFX program
      //--------------------------------------------------------------------
      
      primaryStage.setTitle("House");
      primaryStage.setScene(scene);
      primaryStage.show();
   }
   //--------------------------------------------------------------------
   //  Launches the JavaFX application. 
   //--------------------------------------------------------------------
   public static void main(String[] args)
   {
      launch(args);
   }
}