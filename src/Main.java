import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Exercici 5
        FuntionalInterface pi = () -> 3.1415;
        System.out.println(pi.getPiValue());

        // Exercici 6
        // Crea una llista amb nombres i cadenes de text i ordena la llista amb les cadenes de més curta a més llarga.
        List<Object> llistatNombresCadenes = Arrays.asList(1, "u", 2, "Dos", 3, "Tres", 4, "Quatre", 5, "Cinc");
        System.out.println(llistatNombresCadenes);
        Collections.sort(llistatNombresCadenes,
                (p1, p2) -> p1.toString().compareToIgnoreCase(p2.toString()));
        System.out.println(llistatNombresCadenes);

        Comparator<Object> objComparator = Comparator.comparing(Object::toString);
        Collections.sort(llistatNombresCadenes, objComparator);
        System.out.println(llistatNombresCadenes);

        // Exercici 7
        // Amb la llista de l’exercici anterior, ara ordena-la al revés, de cadena més llarga a més curta.
        Comparator<String> objComparator2 = Comparator.comparing(String::length);
        Collections.sort(llistatNombresCadenes,
                (p1, p2) -> p2.toString().length() - p1.toString().length());
        System.out.println(llistatNombresCadenes);

        // Exercici 8
        // Crea una Functional Interface que contingui un mètode anomenat reverse().
        // Aquest mètode ha de rebre i ha de retornar un String. En el main() de la classe principal,
        // injecta a la interfície creada mitjançant una lambda, el cos del mètode, de manera que torni
        // la mateixa cadena que rep com a paràmetre però al revés. Invoca la instància de la interfície
        // passant-li una cadena i comprova si el resultat és correcte.

        Reverser strInv = (String _str) -> {
            StringBuilder strb = new StringBuilder(_str);
            return strb.reverse().toString();
        };

        System.out.println("\nExercici 8 per 'Forat' : " + strInv.reverse("Forat"));
    }
}
