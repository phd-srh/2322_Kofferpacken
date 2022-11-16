import java.util.Scanner;

public class Kofferpacken {
    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);
        String koffer = "";
        String item;

        do {
            System.out.println("Was packst du ein? (gib 'fertig' ein zum Beenden)");
            item = eingabe.next();

            if ( ! item.equals("fertig") ) {
                if (!koffer.isEmpty()) koffer = koffer + ", ";
                koffer = koffer + item;
            }
            System.out.println("Kofferinhalt: " + koffer);
        } while ( ! item.equals("fertig") );
        System.out.println("Koffer fertig gepackt. Ab geht's in den Urlaub");
    }
}
