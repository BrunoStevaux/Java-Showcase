//********************************************************************
// Sphere.java   Author:  Bruno Stevaux                    100144894
//
// Contains all of the methods and constructor needed to make 
// the MulitSphere program run, it has on a constant named
// diameter that is a given number set in the MultiSphere 
// program
//********************************************************************

public class Sphere
{
   // This is the double used to store the double from the 
   // MuliSphere program
   double diameter; 
   
   // Constructor used to set diameter to the double from MuLtiSphere 
   public Sphere(double value)
   {
      diameter = value;
   }
   
   // Method to change the diameter in MuLtiSphere and then return
   // it here to the Shpere class
   
   public void setDiameter(double newValue)
   {
      diameter = newValue;
   }
   
   // getter method that gets Diameter and then will return
   // the value of the double diameter
   
   public double getDiameter()
   {
      return diameter;
   }
   
   // Method used to calculate the volumn from diameter and then returns it
   // so that it can be used later 
   
   public double volume()
   {
      return (4.0/3.0)*Math.PI*(Math.pow(((1.0/2.0)*diameter),3.0));
   }
   
   // Method for calculating the area of the given diameter and will
   // then return it so that it be used later
   
   public double area()
   {
      return 4*Math.PI*Math.pow(((1.0/2.0)*diameter),2.0);
   }
   
   // Method that calls all of the other methods to then place them into
   // a string that will be returned to the MultiSphere program so that it
   // has the correct information to print out
   public String toString()
   {
      return "diameter: "+Double.toString(diameter)+"   volume: "+
         Double.toString(volume())+"   area: "+Double.toString(area());   
   }
   
}