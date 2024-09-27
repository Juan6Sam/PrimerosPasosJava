import java.lang.reflect.Array;
import java.util.Scanner;

public class funcionFor {
    Scanner lee = new Scanner(System.in);
    String[] myArray;
    int k;

    public void main(){
        System.out.print("Cuantos datos desea ingresar: ");
        k = lee.nextInt();
        myArray = new String[k];

        for (int i = 0; i < k; i++) {
            myArray[i] = "Numero de dato: " + (i + 1);
            System.out.println(myArray[i]);
        }

    }

}