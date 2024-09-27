import java.sql.SQLOutput;

public class funtionSuma implements SumasyRestas{

    public double sum(double a, double b){
        System.out.println("Esta es la suma");
        return a+b;
    }
    public double rest(double a, double b){
        System.out.println("Este es la resta");
        return  a-b;
    }

    @Override
    public double sumaresta() {
        System.out.println(sum(b,a));
        System.out.println(rest(b,a));
        System.out.println("Esta es la suma de las varibales: "+v);
        System.out.println("Se implementa la interfaz");
        return b-a;
    }
}
