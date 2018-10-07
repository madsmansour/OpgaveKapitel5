public class Ex6_8 {


    //                     output                input
    public static double celciusToFahrenheit(double celsius) {
        double fahrenheit = 0;


        fahrenheit = (9.0 / 5) * celsius + 32;
        // double celsius = (5.0 / 9) * (fahrenheit –32);
        return fahrenheit;
    }

    public static void main(String[] args) {
        double x = celciusToFahrenheit(10);
        System.out.println(x);

        x = celciusToFahrenheit(100);
        System.out.println(x);

        double s = fahrenheitToCelsius(5);
        System.out.println(s);
    }
    public static double fahrenheitToCelsius(double fahrenheit){
        double celsius = 0;
        celsius = (25/2) + fahrenheit + 35;
        return celsius;



    }
    

}
