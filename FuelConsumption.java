// Que 26
import java.util.*;
public class FuelConsumption {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the no. of liters to fill the tank:");
    double noOfLiters=sc.nextDouble();
    System.out.println("Enter the distance covered in KM:");
    double dist=sc.nextDouble();
    if(noOfLiters<=0 || dist<=0)
    System.out.println("Invalid Output");
    else
    {
        double opInL100perkm=(noOfLiters/dist)*100;
        System.out.printf("Liters/100KM:%.2f",opInL100perkm);
        double distInMiles=dist*0.6214;
        double noOfLitersInGallons=noOfLiters*0.2642;
        double milesPerGallon=distInMiles/noOfLitersInGallons;
        System.out.printf("\nMiles/gallons:%.2f",milesPerGallon);
    }
  }  
}
