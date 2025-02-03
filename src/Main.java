import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args){

        // Exercici 5
        FuntionalInterface pi = () -> 3.1415;
        System.out.println(pi.getPiValue());

        // Exercici 6
        // Crea una llista amb nombres i cadenes de text i ordena la llista amb les cadenes de més curta a més llarga.
        List<Object> llistatNombresCadenes =  Arrays.asList(1,"u",2,"Dos",3,"Tres",4,"Quatre",5,"Cinc");
        System.out.println(llistatNombresCadenes);
        Collections.sort(llistatNombresCadenes,
                (p1,p2) -> p1.toString().compareToIgnoreCase(p2.toString()));
        System.out.println(llistatNombresCadenes);

        // Exercici 7
        // Amb la llista de l’exercici anterior, ara ordena-la al revés, de cadena més llarga a més curta.
        /*
        Collections.sort(llistatNombresCadenes,
                (p1,p2) -> String.valueOf(p1).length()<String.valueOf(p2).length() ;
        System.out.println(llistatNombresCadenes);
        */

    }
}
