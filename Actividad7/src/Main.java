import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        // Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
        Scanner teclado = new Scanner(System.in);
        double number[],number2[],number3[];
        number= new double[21];
        number2= new double[21];
        number3= new double[21];


        // Press Mayús+F10 or click the green arrow button in the gutter to run the code.


        for (int i=1;i<=20;i++){
            System.out.println("Ingres your " + i  + "° number:" );
            number[i]=teclado.nextDouble();

        }
        for (int i=1;i<=20;i++){
            number2[i]= Math.pow(number[i],2);
            number3[i]=Math.pow(number[i],3);
        }

        for (int i=1;i<=20;i++){
            System.out.println("\n your " + i+ "number was " + number[i]+
                    "It's pow 2 is " + number2[i]+
                    "\n It's pow 3 is " + number3[i]);
        }
    }
}