//*******************************************************************
// TextFieldRadius.java    Author: Bruno Stevaux
//
// This program is going to draw a circle and a text box inside of  
// it, the box inside can be altered by clicking and typing in a 
// value into it which will change the radius of the circle 
// surrounding it.
//*******************************************************************

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.scene.shape.*;

public class TextFieldRadius extends Application
{
    //***************************************************************
    // First we are going to make our text field, and then our 
    // circle. Then update the circle radius according to the 
    // numbers inputed into the box.
    //***************************************************************

    private TextField inputBox;
    private Circle bCircle;
    private int width = 400;
    private int height = 400;
    
    public void start(Stage primaryStage)
    {
        // Our input box so we can get an input from user
        inputBox = new TextField();

        // Making our circle in the middle of the screen, with a
        // default radius of 100.
        bCircle = new Circle(width/2, height/2, 100);
        bCircle.setFill(null); // Empty circle so we can see the boc inside
        bCircle.setStroke(Color.BLUE); // Color of the circle is blue
        bCircle.setStrokeWidth(3); // Thickness of the blue is 3
        
        // Setting the sizes of the box
        inputBox.setMinWidth(50);
        inputBox.setMaxWidth(50);
        inputBox.setOnAction((event)-> 
        { // When this is updated, i.e., numbers are inputed, do this. 
            // check what the user inputed
            int radius = Integer.parseInt(inputBox.getText());
            bCircle.setRadius(radius); //set the radius of the circle to
            // what the user inputed into the box.
        });

        // Setting up Stack Pane for the input box and circle
        StackPane pane = new StackPane(bCircle, inputBox);
        // background color will be white, with 400x400 size.
        Scene scene = new Scene(pane, width, height, Color.WHITE); 
        primaryStage.setTitle("TextFieldRadius");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    // Launching the whole thing 
    public static void main(String[] args) 
    {
        launch(args);
    }
}