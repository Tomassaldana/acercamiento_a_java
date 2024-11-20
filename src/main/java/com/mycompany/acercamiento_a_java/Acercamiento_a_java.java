/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.acercamiento_a_java;

import java.util.Scanner;
public class Acercamiento_a_java {

    public static void main(String[] args) {
        //System.out.println("Hola, ya se imprimir frases");
        //Imprimir_Numero();
        //Imprimir_Numero_Decimal();
        //Imprimir_Suma();
        //Imprimir_Resta();
        //Imprimir_Multiplicacion();
        Imprimir_Division();
        //Numeros1_al_3();
        //Numeros1_al_9();
        //Numeros1_al_10000();
        //Numeros5_al_10();
        //Numeros5_al_15();
        //Numeros5_al_15000();
        //Hola_200();
        //Cuadrados1_al_30();
        //Multiplicacion_20_numeros();
        //Suma100_Cuadrados();
        //Suma100_siguientes();
        //Euro_A_Dolar();
        //Area_Rectangulo();
        //Mayor_Que();
        //Impares();
        //Euclides();
        //Ecuacion_segundo_grado();
    }

 
    public static void Imprimir_Numero() {
        int numero = 17;
        System.out.println(numero);
    }
    public static void Imprimir_Numero_Decimal() {
        double numero_dec = 1.6;
        System.out.println(numero_dec);
    }
    public static void Imprimir_Suma() {
        int numero1 = 1234;
        int numero2 = 532;
        int resultado = numero1 + numero2;
        System.out.println("El resultado de la suma es " + resultado);
    }
    public static void Imprimir_Resta() {
        int numero1 = 1234;
        int numero2 = 532;
        int resultado = numero1 - numero2;
        System.out.println("El resultado de la resta es " + resultado);
    }
    public static void Imprimir_Multiplicacion() {
        int numero1 = 1234;
        int numero2 = 532;
        int resultado = numero1 * numero2;
        System.out.println("El resultado de la multiplicacion es " + resultado);
    }
    public static void Imprimir_Division() {
        int numero1 = 1234;
        int numero2 = 532;
        double resultado = numero1 / (double) numero2;
        System.out.println("El resultado de la division es " + resultado);
    }
    public static void Numeros1_al_3() {
        for (int i = 1; i <=3; i++) {
            System.out.println(i);
        }
    }
    public static void Numeros1_al_9() {
        for (int i = 1; i <=9; i++) {
            System.out.println(i);
        }
    }
    public static void Numeros1_al_10000() {
        for (int i = 1; i <=10000; i++) {
            System.out.println(i);
        }
    }
    public static void Numeros5_al_10() {
        for (int i = 5; i <=10; i++) {
            System.out.println(i);
        }
    }
      public static void Numeros5_al_15() {
        for (int i = 5; i <=15; i++) {
            System.out.println(i);
        }
    }
        public static void Numeros5_al_15000() {
        for (int i = 5; i <=15000; i++) {
            System.out.println(i);
        }
    }
        public static void Hola_200() {
        for (int i = 1; i <=200; i++) {
            System.out.println("Hola");
        }
    }
        public static void Cuadrados1_al_30() {
        for (int i = 1; i <=30; i++) {
            int cuadrado = i * i;
            System.out.println("El cuadrado de " + i + "es" + cuadrado);
        }
    }
        public static void Multiplicacion_20_numeros() {
        long producto = 1;
        for (int i = 1; i <=20; i++) {
            producto *= i;
        }
            System.out.println("El producto de los primeros 20 naturales es" + producto);
    }
        public static void Suma100_Cuadrados() {
        long sumatoria = 0;
        for (int i = 1; i <=100; i++) {
            sumatoria += i * i;
        }
            System.out.println("la suma de los primeros 100 cuadrados es" + sumatoria);
    }
        public static void Suma100_siguientes() {
        Scanner escaner = new Scanner(System.in);
        System.out.println("Ingrese el numero entero a sumar");
        int numeroIngresado = escaner.nextInt();
        int suma = 0;
        for (int i = numeroIngresado + 1; i <= numeroIngresado + 100; i++) {
            suma += i;
        }
        System.out.println("La suma de los 100 numeros siguientes a " + numeroIngresado + " es: " + suma);
    }
        public static void Euro_A_Dolar() {
            Scanner escaner = new Scanner(System.in);
            System.out.println("Ingrese la cantidad de Euros");
            double numeroIngresado = escaner.nextDouble();
            double tipoDeCambio = 1.06;
            double resultado = numeroIngresado * tipoDeCambio;
            System.out.println("Su monto en dolares es: " + resultado);
        }
        public static void Area_Rectangulo() {
            Scanner escaner = new Scanner(System.in);
            System.out.println("Ingrese la altura del rectangulo");
            double altura = escaner.nextDouble();
            System.out.println("Ingrese el ancho del rectangulo");
            double ancho = escaner.nextDouble();
            double area_rectangulo = altura * ancho;
            System.out.println("El area del rectangulo es: " + area_rectangulo);
        }
        public static void Mayor_Que() {
            Scanner escaner = new Scanner(System.in);
            System.out.println("Ingrese primer numero");
            double numero1 = escaner.nextDouble();
            System.out.println("Ingrese el segundo numero");
            double numero2 = escaner.nextDouble();
            if (numero1 > numero2) {
                System.out.println("El numero mayor es: " + numero1 + " y el numero menor es: " + numero2);}
                else{
                    System.out.println("El numero mayor es: " + numero2 + " y el numero menor es: " + numero1);
                }
            }
        public static void Impares() {
            Scanner escaner = new Scanner(System.in);
            System.out.println("Ingrese numero entero");
            int numero = escaner.nextInt();
            System.out.println("Los numeros impares menores que el numero dado son: ");
            for (int i = 1; i <= numero; i += 2){
                System.out.print(i + " ");
            }
        }
        public static void Euclides() {
            Scanner escaner = new Scanner(System.in);
            System.out.println("Ingrese primer numero");
            int numero1 = escaner.nextInt();
            System.out.println("Ingrese segundo numero");
            int numero2 = escaner.nextInt();
            int mcd = calcular_MCD(numero1, numero2);
            System.out.println("El máximo común divisor de " + numero1 + " y " + numero2 + " es: " + mcd);
        }
        public static int calcular_MCD(int a, int b) {
            if (a == 0) {
            return b;
        } else {
                return calcular_MCD(b, a % b);
        }
    }
        public static void Ecuacion_segundo_grado() {
         
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el coeficiente a: ");
        double a = scanner.nextDouble();

        System.out.print("Ingrese el coeficiente b: ");
        double b = scanner.nextDouble();

        System.out.print("Ingrese el coeficiente c: ");
        double c = scanner.nextDouble();


        // Calculamos el discriminante
        double discriminante = b * b - 4 * a * c;

        if (discriminante > 0) {
            // Dos soluciones reales y distintas
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("La ecuación tiene dos soluciones:");

            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (discriminante == 0) {
            // Una sola solución real
            double x = -b / (2 * a);
            System.out.println("La ecuación tiene una solución doble:");
            System.out.println("x = " + x);
        } else {
            // Ninguna solución real
            System.out.println("La ecuacion no tiene soluciones reales.");
        }
    }
        public static int factorial(int n) {
        if (n == 0) {
            return 1; // Caso base: el factorial de 0 es 1
        } else {
            return n * factorial(n - 1); // Caso recursivo
        }
    }
}
       
            
       
    