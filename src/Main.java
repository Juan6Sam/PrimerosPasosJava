import java.util.Scanner;

public class Main {
static Scanner lee = new Scanner(System.in);
    static int a,b,c,edad;
    static boolean cedula;
    static double n1,n2,n3
            ,sueldo,horaExtra
            ,sueldoTotal, extra
            ,descuento,valorCompra
            ,totalCompra;
    static String nombre ;

    public static void main(String[] args) {
        funtionDescuento mayor = new funtionDescuento();
        funtionSuma sum = new funtionSuma();
        funcionTabla tabla = new funcionTabla();

        int datos;
        boolean noNumber = false;
    do{
    try {
        do {
            System.out.print("Que dato quiere hacer: " +
                    "\n1.- Descuento." +
                    "\n2.- Funcion Interfaz." +
                    "\n3.- Numero Mayor." +
                    "\n4.- Saber si es positivo o negativo." +
                    "\n5.- Funciones basicas." +
                    "\n6.- Funcion Promedio." +
                    "\n7.- Funcion Sueldo." +
                    "\n8.- Funcion Descuento." +
                    "\n9.- Funcion Tabla de multiplicar" +
                    "\n10.- Salir.");
            datos = lee.nextInt();
            noNumber = true;
            switch (datos) {
                case 1:
                    mayor.main();
                    break;
                case 2:
                    sum.sumaresta();
                    break;
                case 3:
                    funtionMayor();
                    break;
                case 4:
                    funtionPositivo();
                    break;
                case 5:
                    funtionBasic();
                    break;
                case 6:
                    funtionPromedio();
                    break;
                case 7:
                    funtionSueldo();
                    break;
                case 8:
                    funtionDescuento();
                    break;
                case 9:
                    System.out.println("Ingrese el numero de la tabla que necesite: ");
                    a = lee.nextInt();
                    tabla.main(a);
                    break;
                case 10:
                    System.out.println("Gracias por su eleccion c:.");
                    noNumber = true;
                    break;
                default:
                    System.out.println("No eligio un numero correcto");
                    break;
            }
        }while (datos > 8  || datos < 1);
        System.out.println("Quiere volver a reiniciar el programa:\n 1. Si\n 2. No ");
        int reinicio = lee.nextInt();
        if(reinicio == 1){
            noNumber = false;
        }else if ( reinicio == 2){
            noNumber = true;
            System.out.println("Gracias por usar el programa.");
        }else {
            System.out.println("Ingreso un dato incorrecto, Adios!!");
        }

        } catch(Exception e){
            System.out.println("Se tiene un error: " + e);
        System.out.println("Ingresaste un dato no numérico");
        noNumber = false;
        lee.nextLine();
        }
    }while(noNumber == false);
    }

    public static void funtionMayor(){
        System.out.print("Ingrese el primer numero: ");
        n1 = lee.nextDouble();
        System.out.print("Ingrese el segundo numero: ");
        n2 = lee.nextDouble();

         if(n1 >n2){
             System.out.println("El numero 1 es mayor que el numero 2: " + n1);
         }else if(n2>n1){
             System.out.println("El numero 2 es mayor que el numero 1: " + n2);
         }else{
             System.out.println("Los dos numeros son iguales: " +n1);
         }
    }
    public static void funtionPositivo(){
        System.out.print("Ingrese un numero: ");
        a = lee.nextInt();

        System.out.println(setC(a));
    }
    public static void funtionDescuento(){
        extra = 2000;
        System.out.print("Cual es su nombre: ");
        nombre = lee.next();
        System.out.print("Cuantas horas trabajo: ");
        horaExtra = lee.nextDouble();
        sueldo = 0;
        System.out.println("Buenas tardes "+nombre+
                "\nUstede trabajo: "+horaExtra+
                "\nLo que equivale a un sueldo de: "+getSueldoTotal(horaExtra,sueldo));

    }
    public static void funtionSueldo() {
        extra =3000;
        System.out.print("Cuanto es su sueldo: ");
        sueldo = lee.nextDouble();
        System.out.print("Cuantas horas extra trabajo: ");
        horaExtra = lee.nextDouble();

        System.out.println("La hora extra se paga a $"+extra);
        System.out.println("El sueldo final que tuvo fue: " + getSueldoTotal(horaExtra, sueldo));

    }
    public static void funtionBasic(){
        a = 2;
        b = a - 1;
        c = 0;//2 - (a * b);
        b = a + ( 3 + b );
        a = b - 2 - c;

        System.out.println(a);
        System.out.println(sum(b,c,2));
        System.out.println(a < sum(b,c,2));

        edad = 18;
        cedula= true;
        if (edad >= 18 && cedula == true) {
            System.out.println("Puede ingresar");
        }else{
            System.out.println("No puede ingresar");
        }

    }
    public static void funtionPromedio(){
        System.out.print("Ingrese nota 1: ");
        n1 = lee.nextDouble();
        System.out.print("Ingrese nota 2: ");
        n2 = lee.nextDouble();
        System.out.print("Ingrese nota 3: ");
        n3 = lee.nextDouble();
        double promedioFinal = promedio(n1,n2,n3);
        System.out.println("El promedio de sus notas es: "+promedioFinal);

        if (promedioFinal >= 7){
            System.out.println("Paso el semestre");
        }else{
            System.out.println("Reprobo el semestre.");
        }
    }

    public static double promedio(double a,double b,double c){
        return (sum(a,b,c))/3;
    }
    public static double sum(double a, double b, double c){
        return  a+b+c;
    }
    public static  double getSueldoTotal(double hora, double sueldo){

        double extraTotal = hora * extra;
        return sueldoTotal = sueldo + extraTotal;
    }
    public static String setC(int c) {
        String numero;
        if(c >= 0){
            if(c>0){
                numero = "El numero es 0";
            }else {
                numero = "El numero es positivo";
            }
        }else{
            numero = "El numero es negativo";
        }
        return numero + " el numero que puso es "+ c;
    }


}