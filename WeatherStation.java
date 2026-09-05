import java.util.Scanner;

public class WeatherStation {
    public static double convertToCelsius(double fahrenheit){
        double celsius = (fahrenheit - 32) * 5 / 9 ;
        System.out.println("Convert Fahrenheit to calcius : " + celsius);
        return celsius;
    }
    public static void getWeatherAdvisory(double celsius){
        if(celsius < 0){
            System.out.println("Freezing Warning - Ice Alert");
        }else if(celsius <= 15){
            System.out.println("Cold Weather Advisory");
        }else if(celsius <= 30){
            System.out.println("Moderate / Pleasant Weather");
        }else{
            System.out.println("Heat Advisory - Stay Hydrated");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Fahrenheit value: ");
        double fahrenheit = sc.nextDouble();
        double celsius = convertToCelsius(fahrenheit);
        getWeatherAdvisory(celsius);
        
        sc.close();

    }
}
