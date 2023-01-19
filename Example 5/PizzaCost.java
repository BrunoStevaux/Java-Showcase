//******************************************************************************
// PizzaCost.java               Author: Bruno Stevaux       100144894
//
// This program will display a window with options for pizza toppings, of which
// will add cost to the pizza and display to the user the total cost.
//******************************************************************************

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.scene.text.Font;

public class PizzaCost extends Application 
{
  private Text pizzaText, costText;
  private CheckBox optionL1, optionL2, optionL3, optionR1, optionR2, optionR3;
  double cost = 10;
  
  //****************************************************************************
  // We will need to create each button, and then add them to two different 
  // VBox's. Then add those boxes into a 2x2 grid. Afterwards, when these 
  // buttons are pressed, we need to update the cost of the pizza based on which
  // of the buttons are pressed.
  //****************************************************************************
  
  public void start(Stage primaryStage)
  {
    // Creating the text for "Pizza Cost: $$"
    pizzaText = new Text("Pizza Cost: ");
    pizzaText.setFont(new Font("Helvetica", 18));
    
    // Creating the price of the pizza 
    costText = new Text("" + cost);
    costText.setFont(new Font("Helvetica", 18));
    
    // Creating the top left button
    optionL1 = new CheckBox("Extra Bheese");
    optionL1.setOnAction(this::processCheckBoxAction);
    
    // Creating the middle left button
    optionL2 = new CheckBox("Bebberoni");
    optionL2.setOnAction(this::processCheckBoxAction);
    
    // Creating the bottom left button
    optionL3 = new CheckBox("Bausabe");
    optionL3.setOnAction(this::processCheckBoxAction);
    
    // Creating the top right button
    optionR1 = new CheckBox("Greeb Bebber");
    optionR1.setOnAction(this::processCheckBoxAction);
    
    // Creating the middle right button
    optionR2 = new CheckBox("Bnion");
    optionR2.setOnAction(this::processCheckBoxAction);
    
    // Creating the bottom right button
    optionR3 = new CheckBox("Anbobies");
    optionR3.setOnAction(this::processCheckBoxAction);
    
    // Adding the left hand side buttons to the left VBox
    VBox leftSide = new VBox(optionL1, optionL2, optionL3);
    leftSide.setAlignment(Pos.CENTER_LEFT);
    leftSide.setSpacing(5);
    
    // Adding the right hand side buttons to the right VBox
    VBox rightSide = new VBox(optionR1, optionR2, optionR3);
    rightSide.setAlignment(Pos.CENTER_LEFT);
    rightSide.setSpacing(5);
    
    // Creating a GridPane, aligning everything to the center, and setting the
    // gaps for the grid.
    GridPane root = new GridPane();
    root.setAlignment(Pos.CENTER);
    root.setHgap(50);
    root.setVgap(30);
    root.add(leftSide,0,0); // Adding the left VBox to the top left
    root.add(rightSide,1,0); // Adding the right VBox to the top left
    root.add(pizzaText,0,1); // Adding the pizza cost text
    root.add(costText,1,1); // Adding the price
    root.setStyle("-fx-background-color: cornsilk");    
    
    // Creating the window size
    Scene scene = new Scene(root, 400, 150);
    
    // Setting title and showing the Scene.
    primaryStage.setTitle("Pizza Cost");
    primaryStage.setScene(scene);
    primaryStage.show();
  }
  
  public void processCheckBoxAction(ActionEvent event)
  {
    // base cost of pizza + 6 x 0.25
      
    // Every time a button is pressed, this entire section will be re-run.
    // For every button checked off, we will add 0.50. 
    // For every button NOT checked off, we will subtract 0.50.
      
    // We need this to be reset every time to avoid adding more than one 
    // of each, and to be able to subtract them. Otherwise you get a big mess :)
    // Speaking from experience.. 
      
    cost = 11.5;
    
    // [x] [ ] Checking top left
    // [ ] [ ]
    // [ ] [ ]
    
    if (optionL1.isSelected())     // If it is checked,
    {
      cost = cost + 0.25;          // Add to cost
    }      
    if (optionL1.isSelected() == false) // If it is NOT checked,
    {
      cost = cost - 0.25;               // Subtract from cost
    }
    
    // [ ] [x] Checking top right
    // [ ] [ ]
    // [ ] [ ]
    
    if (optionR1.isSelected())
    {
      cost = cost + 0.25;
    }      
    if (optionR1.isSelected() == false)
    {
      cost = cost - 0.25;
    }
    
    // [ ] [ ] 
    // [x] [ ] Checking middle left
    // [ ] [ ]
    
    if (optionL2.isSelected())
    {
      cost = cost + 0.25;
    }      
    if (optionL2.isSelected() == false)
    {
      cost = cost - 0.25;
    }
    
    // [ ] [ ] 
    // [ ] [x] Checking middle right
    // [ ] [ ]
    
    
    if (optionR2.isSelected())
    {
      cost = cost + 0.25;
    }      
    if (optionR2.isSelected() == false)
    {
      cost = cost - 0.25;
    }
    
    // [ ] [ ] 
    // [ ] [ ]
    // [x] [ ] Checking bottom left
    
    if (optionL3.isSelected())
    {
      cost = cost + 0.25;
    }      
    if (optionL3.isSelected() == false)
    {
      cost = cost - 0.25;
    }
    
    // [ ] [ ] 
    // [ ] [ ] 
    // [ ] [x] Checking bottom right
    
    
    if (optionR3.isSelected())
    {
      cost = cost + 0.25;
    }      
    if (optionR3.isSelected() == false)
    {
      cost = cost - 0.25;
    }
    costText.setText(cost + ""); // Updating the text
  }
  
  public static void main(String[] args)
  {
    launch(args);
  }
}