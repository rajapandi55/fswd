import java.util.*;
import java.io.*;
class circle
{
private double radius;
public circle(double radius)
{
this.radius=radius;
}
public double calculatearea()
{
return Math.PI*radius*radius;
}
public void displayarea()
{
System.out.println("the area of the circle"+radius+calculatearea());
}
public static void main(String args[])
{
circle circle1=new circle(10);
circle1.displayarea();
circle circle2=new circle(20);
circle2.displayarea();
}
}