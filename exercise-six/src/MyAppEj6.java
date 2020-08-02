import java.util.Scanner;

public class MyAppEj6 {
    public static void main(String[] args) {
        double catetoA;
        double catetoB;
        double hipotenusa;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese la medida de los catetos.");
        catetoA = keyboard.nextDouble();
        catetoB = keyboard.nextDouble();

        hipotenusa = Math.sqrt(Math.pow(catetoA, 2) + (catetoB * catetoB));

        System.out.print("El resultado es: " + hipotenusa);
    }
}
