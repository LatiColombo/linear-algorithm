import java.util.Scanner;

public class MyAppTwo {
    public static void main(String[] args) {

        // Declaro las variables de las notas de cada
        // examen y la del resultado
        double noteOne;
        double noteTwo;
        double noteThree;
        double noteFour;
        double sum;
        double result;




        //Habilito la inserción de datos por consola
        Scanner keyboard = new Scanner(System.in);

        // Pido que ingresen las notas obtenidas por el alumno
        System.out.println("Ingrese las notas obtenidas por el alumno");
        noteOne = keyboard.nextDouble();
        noteTwo = keyboard.nextDouble();
        noteThree = keyboard.nextDouble();
        noteFour = keyboard.nextDouble();

        // Calculo el resultado
        sum = noteOne + noteTwo + noteThree + noteFour;
        result = sum / 4;

        System.out.print("El resultado es: " + result);


    }
}
