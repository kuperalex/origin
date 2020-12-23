package qe;

import discriminant.Discriminant;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("================Решалка квадратный уровнений!!!!===========================");
        System.out.println("=         Решалка решит три любые квадратные уровенения подряд            =");
        System.out.println("=         Общий вид : ax^2+bx+c=0                                         =");
        System.out.println("=         Найдем Дискриминант.                                            =");
        System.out.println("=         Найдем х1 и х2                                                  =");
        System.out.println("=                                                                         =");
        System.out.println("===========================================================================");

        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        Discriminant dec = new Discriminant();

        System.out.println();


        try {
            System.out.print("Введите A:= ");
            dec.setA(Integer.parseInt(rd.readLine()));
        } catch (NumberFormatException e) {
            System.out.println("ОШИБКА!!! введено не число");

        }
        try {
            System.out.print("Введите B:= ");
            dec.setB(Integer.parseInt(rd.readLine()));
        } catch (NumberFormatException e) {
            System.out.println("ОШИБКА!!! введено не число");
        }
        try {
            System.out.print("Введите C:= ");
            dec.setC(Integer.parseInt(rd.readLine()));
        } catch (NumberFormatException e) {
            System.out.println("ОШИБКА!!! введено не число");
        }


        System.out.println();
        if (dec.getDiscriminant() >= 0) {
            System.out.print("Дискриминант положительный и равен:= ");
            System.out.println(dec.getDiscriminant());
            System.out.println("Уравнение имеет два корня: ");
            System.out.print("x1 равен: = ");
            double x1 = (-dec.getB() + Math.sqrt(dec.getDiscriminant())) / (2 * dec.getA());
            System.out.println(x1);
            System.out.print("x2 равен: = ");
            double x2 = (-dec.getB() - Math.sqrt(dec.getDiscriminant())) / (2 * dec.getA());
            System.out.println(x2);
        } else if (dec.getDiscriminant() < 0) {
            System.out.print("Дискриминант отрицательный и равен:= ");
            System.out.println(dec.getDiscriminant());
            System.out.println("Уравнение не имеет действительных решений.");
        }
    }
}



