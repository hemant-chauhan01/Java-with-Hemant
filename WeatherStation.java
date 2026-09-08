import java.util.Scanner;

public class WeatherStation {
    public static double convertToCelsius(double fahrenheit){
        double celsius = (fahrenheit - 32) * 5 / 9 ;
        System.out.println("Temperature in Celsius: : " + celsius);
        return celsius;
    }
    public static void getWeatherAdvisory(double celsius){
        if(celsius < 0){
            System.out.println("Advisory: Freezing Warning - Ice Alert");
        }else if(celsius <= 15){
            System.out.println("Advisory: Cold Weather Advisory");
        }else if(celsius <= 30){
            System.out.println("Advisory: Moderate / Pleasant Weather");
        }else{
            System.out.println("Advisory: Heat Advisory - Stay Hydrated");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();
        double celsius = convertToCelsius(fahrenheit);
        getWeatherAdvisory(celsius);
        
        sc.close();

    }
}
