//********************************************************************
//  MultiSphere.java       Author: Lewis/Loftus
//
//  Solution to Programming Project 4.3
//********************************************************************

public class MultiSphere
{
    //-----------------------------------------------------------------
    //  Creates and exercises some Sphere objects.
    //-----------------------------------------------------------------
    public static void main(String[] args)
    {
        Sphere s1 = new Sphere(4.75);
        Sphere s2 = new Sphere(20.0);
        Sphere s3 = new Sphere(11.946);
        
        System.out.println("Sphere 1's diameter: " + s1.getDiameter());
        System.out.println("Volume: " + s1.volume());
        System.out.println("Area: " + s1.area());
        
        System.out.println();
        System.out.println("Sphere 1: " + s1);
        System.out.println("Sphere 2: " + s2);
        System.out.println("Sphere 3: " + s3);
        
        s2.setDiameter(18.4);
        System.out.println();
        System.out.println("Sphere 2: " + s2);
    }
}
