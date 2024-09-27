public class funcionTablasMultiplicar {
    int valor;
    public void main(){
        for (int i = 1; i <= 10; i++) {
            System.out.println("\nTabla del "+ i + "\n");
            for (int j = 1 ; j <= 10; j++) {
                valor = i * j;
                System.out.println(i + " * " + j + " = " + valor);
            }

        }
    }

}
