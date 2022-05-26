import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        SuperList<Integer> listaEnteros = new SuperList<>();


        listaEnteros.addElement(1);
        listaEnteros.addElement(2);
        listaEnteros.addElement(3);
        listaEnteros.addElement(4);

        System.out.println("lista con todos los elementos");
        listaEnteros.showElements();
        System.out.println("------------------------------");
        System.out.println("------------------------------");

        listaEnteros.removeElement(3);
        System.out.println("lista quitando el elemento de la posicion 3");
        listaEnteros.showElements();

        System.out.println("------------------------------");
        System.out.println("------------------------------");

        System.out.println(listaEnteros.toString());

    }
}
