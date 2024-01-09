import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Buyers {

    String nev;
    static String felhnev;
    static String pw;
    String születesi_datum;
    boolean vettKonyvek;

    public Buyers(String nev, String felhnev, String pw, String születesi_datum) {
        this.nev = nev;
        this.felhnev = felhnev;
        this.pw = pw;
        this.születesi_datum = születesi_datum;
    }

    public String getPW() {
        return pw;
    }

    public String getUsernaem() {
        return felhnev;
    }

    //    párosítás felhasználónevet a jelszóval, inicializáljuk az új hashmappet, mindkettő string
//    mert a pw és felhnev is string
    static Map<String, String> BuyersMap = new HashMap<>();

    public static boolean bejelentkezni() {
        Scanner szken = new Scanner(System.in);
        System.out.println("Adja meg a felhasználó nevét: ");
        String felhInput = szken.nextLine();
        System.out.println("Adja meg a jelszót:");
        String pwInput = szken.next();

        if (BuyersMap.containsKey(felhInput)) {
            String storedPw = BuyersMap.get(felhInput).trim(); // Trim to remove any leading/trailing spaces

            if (pwInput.equals(storedPw)) {
                System.out.println("Sikeres bejelentkezés!");
                return true; // Successful login
            }
        }

        System.out.println("Helytelen felhasználónév vagy jelszó");
        return false; // Unsuccessful login
    }



        // paraméterek: 1.osztály a másik bármi.
        // get kisebb mint 0, maradek az a get minusz 1db, majd a set lesz a maradek
        public static void vasarolni (Book book){
            if (book.getDB() > 0) {
                int maradek = book.getDB() - 1;
                book.setDB(maradek);
                System.out.println("Sikeres vásárlás! " + book.cim);
            } else {
                System.out.println("Sikeretelen vásárlás! A könyv nincs készleten.");
            }
        }


    }



