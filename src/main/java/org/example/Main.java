package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Long numContratoCliente;
        Integer estratoCliente;
        Double totalCuenta;
        Long totalDeEnergia;
        Integer totalDeAgua;
        Integer totalEnvarias;
        Double totalGas;
        Short totalSaniamiento;
        Double descuentoEstrato1;
        Double descuentoEstrato2;
        Double descuentoEstrato3;
        Double totalDescuento = 0.0;

        System.out.println("Bienvenido a EPM: ");
        System.out.println("****************");

        System.out.print("Ingrese el numero de su contrato: ");
        numContratoCliente = scanner.nextLong();

        System.out.print("Ingrese su numero de estrato: ");
        estratoCliente = scanner.nextInt();

        System.out.print("Ingrese total de Energia: ");
        totalDeEnergia = scanner.nextLong();
        System.out.print("Ingrese total de Agua: ");
        totalDeAgua = scanner.nextInt();
        System.out.print("Ingrese total de Envarias: ");
        totalEnvarias = scanner.nextInt();
        System.out.print("Ingrese total de Gas: ");
        totalGas = scanner.nextDouble();
        System.out.print("Ingrese total de Saniamiento: ");
        totalSaniamiento = scanner.nextShort();

        totalCuenta = (totalDeEnergia+totalEnvarias+totalDeAgua+totalGas+totalSaniamiento+totalDeAgua);
        descuentoEstrato1 = (totalCuenta * 20.0) / 100;
        descuentoEstrato2 = (totalCuenta * 10.0) / 100;
        descuentoEstrato3 = (totalCuenta * 5.0) / 100;

        System.out.println("El total de su cuenta es de: " + totalCuenta);

        if (estratoCliente == 1) {
            totalDescuento = totalCuenta-descuentoEstrato1;
            System.out.println("Su descuento sera de 20%");
        } else if (estratoCliente == 2) {
            totalDescuento = totalCuenta-descuentoEstrato2;
            System.out.println("Su descuento sera de 10%");
        } else if (estratoCliente == 3) {
            totalDescuento = totalCuenta-descuentoEstrato3;
            System.out.println("Su descuento sera de 5%");
        } else {
            System.out.println("No se puede aplicar un descuento a su total de cuenta");
        }


        //Factura cliente
        System.out.println("Cliente con numero de factura: " + numContratoCliente + " el valor total de su cuenta con el descuento aplicado es de: "
                + totalDescuento);


    }
}
