//*******************************************************************
// IncrementDecrement.java    Author: Bruno Stevaux 
//
// This program will display 3 different objects in a window.
// A counter in the middle and two buttons on either side which
// increment or decrement the value on the counter.
//
//*******************************************************************


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class IncrementDecrement extends Application
{
    //***************************************************************
    // We need to make two buttons that can alter the value on our
    // counter, and then a text field in the middle to display the
    // value from our counter representing the number of "clicks"
    //***************************************************************

    private int count; // This is our counter
    private Text countText; //This is our counter that will display as text
    public void start(Stage primaryStage)
    {
        count = 50;
        Text countText = new Text("50"); // This is our textbox

        //***********************************************************
        // Here we are creating a button, called 'inc' which will be
        // for incrementing the value of counter. Upon being clicked
        // it will trigger a set of actions as shown by the '->'
        //***********************************************************

        Button inc = new Button("Increment");
        inc.setOnAction((event)->{ // When this button is clicked, do:
            count++; // Add one to counter
            countText.setText("" + count); // Update the displayed text
        });
        
        Button dec = new Button("Decrement"); 
        dec.setOnAction((event)->{ // When this button is clicked, do:
            count--; // Subtract one from the counter
            countText.setText("" + count); // Update the displayed text
        });
        
        // Add in our two buttons, with inc on left and dec on right
        // with the box containing the counter in the middle 

        FlowPane pane = new FlowPane(inc, countText, dec);
        pane.setAlignment(Pos.CENTER);
        pane.setHgap(20); // Set the gap between objects in our FlowPane
        pane.setStyle("-fx-background-color: blanchedalmond"); //Background
        
        // Size and title of scenes, and the building them
        // so that they can be displayed.

        Scene scene = new Scene(pane, 400, 100);
        
        primaryStage.setTitle("Increment Decrement");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        
    }
    public static void main(String[] args)
    {
        launch(args);
    }
}
