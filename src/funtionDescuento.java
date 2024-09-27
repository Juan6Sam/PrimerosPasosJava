import java.util.Scanner;

public class funtionDescuento {
static Scanner lee = new Scanner(System.in);


    //static double descuento,valorCompra,totalCompra;


public void main() {
    System.out.print("Ingrese el valor de la compra: ");
    Main.valorCompra = lee.nextDouble();
    Main.descuento = 0;
    if (Main.valorCompra>=100000){
        Main.descuento= Main.valorCompra *0.5;
        System.out.println("Tiene un descuento del 50% equivalente a: "+ Main.descuento);
    }else if(Main.valorCompra >= 50000){
        Main.descuento =Main.valorCompra * 0.10;
        System.out.println("Tiene un descuento del 10% equivalente a: "+Main.descuento);
    }
    Main.totalCompra = Main.valorCompra - Main.descuento;
    System.out.println("Usted debe de pagar: "+ Main.totalCompra);
}

}


