//*****************************************************************
// Box.java   Author:  Bruno Stevaux                      100144894
// 
// Contains all of the methods and constructors used and needed for 
// the file BoxTest.java, which contains the information for 3 dif-
// ferent sized boxes, and changes different variables for the box-
// es such as height width and depth, and also a boolean for wheth- 
// er the box is full or notwhich will inform you on if you need to
// use a new box or not.
//*****************************************************************


public class Box
{
   
   // These are the integers for our variables in the other program.
   // The boolean represents whether or not the box is full or not.
   
   int height, width, depth;
   boolean full;
   
   
   // This is our constructor, it informs the program which variables we're
   // using, and what they represent.
   
   public Box(int h, int w, int d)
   {
      height = h;
      width = w;
      depth = d; 
      full = false;
   }
   
   // These are our getter methods. They will get the height, width and depth
   // so they can be used by the setter methods. They are returned so thaty they
   // can be used.
   
   public int getHeight()
   {
      return height;
   }
   
   public int getWidth()
   {
      return width;
   }
   
   public int getDepth()
   {
      return depth;
   }
   
   // This is our boolean (True / False) for "full" which represents whether 
   // the box is full or not.
   
   public boolean isFull()
   {
      return full;
   }
   
   // These are our setter methods, using the information from the getter
   // methods they will assign height, width, and depth new values based 
   // off of what the BoxTest.java assigns them to be.
   
   public void setHeight(int h)
   {
      height = h;
   }
   
   public void setWidth(int w)
   {
      width = w;
   }
   
   public void setDepth(int d)
   {
      depth = d;
   }
   
   // This will set the boolean of the box to full when the BoxTest.java 
   // program assigns the box as full or not (not full [or: false] being 
   // the default).
   
   public void setFull(boolean isFull)
   {
      full = isFull;
   }
   //***********************************************************************
   // This will convert the information from the boxes into strings, so they
   // can be returned to the other program in a format it can output to the 
   // console otherwise you get memory locations. 
   //***********************************************************************  
   
   public String toString()
   {
      
      // This builds the message with the variables height, width and depth
      // and turns them into a string.
      
      String message = "Box size: " + height + " H x " + width + " W x " + 
         depth + " D";
      
      // If the box is found to be full (being true), it will add the following
      // string onto the end of the message, with a '\n' at the beginning of the 
      // string so that it is sent on a new line 
      
      if(full==true)
      {
         message += "\nThis box is full";
      }
      
      // If the box is found to be not full (being false(, it will add the follo-
      // ing string onto the end of the message, with a '\n' at the beginning of 
      // the string so that it is sent on a new line.
      
      else
      {
         message += "\nThis box is not full";
      }
      
      return message;
   }
}


