import entities.Triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Triangle triangle1 = new Triangle();
        Triangle triangle2 = new Triangle();
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira os lados dos triangulos 1 e 2:");

        System.out.println("Lado A - T1:");
        triangle1.setA(sc.nextDouble());
        System.out.println("Lado A - T2:");
        triangle2.setA(sc.nextDouble());

        System.out.println("Lado B 1:");
        triangle1.setB(sc.nextDouble());
        System.out.println("Lado B - T2:");
        triangle2.setB(sc.nextDouble());

        System.out.println("Lado C - T1:");
        triangle1.setC(sc.nextDouble());
        System.out.println("Lado C - T2:");
        triangle2.setC(sc.nextDouble());

        System.out.println(triangle1.getA());
        System.out.println(triangle1.getB());
        System.out.println(triangle1.getC());

        double areaT1 = triangle1.calculaArea();
        double areaT2 = triangle2.calculaArea();
        System.out.printf("AREA T1: %.2f\n", areaT1);
        System.out.printf("AREA T2: %.2f\n", areaT2);

        if (areaT1>areaT2){
            System.out.println("Area t1 é maior");
        }
        else if ( areaT2 > areaT1){
            System.out.println("Area t2 é maior");
        }
        else{
            System.out.println("Areas iguais");

        }
    }
}
