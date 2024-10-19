//import java.io;
import java.util.Scanner;
public class Task1{
    // temprature convertor program
    public static void main(String args[]){
        int choice;
        double value, result;
        Scanner sc = new Scanner (System.in);

        System.out.println("---TEMPRATURE CONVERTER---");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Celsius to Kelvin");
        System.out.println("4. Kelvin to Celsius");
        System.out.print("Enter the choice: ");
        choice=sc.nextInt();
        if(choice >= 1 && choice <=4){   
            System.out.print("Enter the value of Temprature: ");  
        }
        switch(choice){
            case 1:
            value=sc.nextDouble();
            result=(value*9/5)+32;
            System.out.print("Converted Temprature is: "+result+" °F");
            break;
            case 2:
            value=sc.nextDouble();
            result=(value-32)*5/9;
            System.out.print("Converted Temprature is: "+result+" °C");
            break;
            case 3:
            value=sc.nextDouble();
            result=((value)+273.15);
            System.out.print("Converted Temrature is: "+result+" K");
            break;
            case 4:
            value=sc.nextDouble();
            result=((value)-273.15);
            System.out.print("Converted Temprature is: "+result+" °C");
            break;
            default:
            System.out.print("Invalid choice");
        }
        
        
    }
}