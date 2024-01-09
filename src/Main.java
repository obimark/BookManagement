import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    private static void menu() {
        System.out.println("1) bejelentkezés " + "\n" + "2) Regisztráció");
    }


    public static void main(String[] args) {

        Scanner szken = new Scanner(System.in);

        ArrayList<Book> booksList = new ArrayList<>();

        Book konyv1 = new Book("Jókai Mór", "Az aranyember", "ifjúsági regény", 4531432);
        Book konyv2 = new Book("Arsén Lupin", "Rablás", "Bűnügyi", 9983274);

        booksList.add(konyv1);
        booksList.add(konyv2);


        Buyers vasarlo1 = new Buyers("Eni", "eni", "1", "1999.01.01");
        Buyers vasarlo2 = new Buyers("Mark", "mark", "2", "1888.01.01");

//      összepárosítás - mindig a MAIN-be kerül elvileg ha másik osztályban van a hasmap
        Buyers.BuyersMap.put(vasarlo1.felhnev, vasarlo1.pw);
        Buyers.BuyersMap.put(vasarlo2.felhnev, vasarlo2.pw);

        Book.BooksMap.put(konyv1.szerzo, konyv1.cim);
        Book.BooksMap.put(konyv2.szerzo, konyv2.cim);


        int valaszt;
        System.out.println("Üdvözöljük a könyvtárban!" + "\n" + "Miben segíthetünk?");
        while (true) {
            menu();
            valaszt = szken.nextInt();
            if (valaszt == 1 || valaszt == 2) {
                break;
            } else {
                System.out.println("Érvénytelen választás");
            }
        }

        while (true) {
            String siker = String.valueOf(Buyers.bejelentkezni());
            if (siker.equals("Sikeres bejelentkezés")) {
                System.out.println("Elérhető könyvek: " + "\n");
                for (int i = 0; i < booksList.size(); i++) {
                    int bookNumber = i + 1;
                    System.out.println("Book " + bookNumber + ":\n" + booksList.get(i) + "\n");
                }
            } else {
                break;
            }
            System.out.println("1) Szeretnék vásárolni" + "\n" + "2)Szeretnék kölcsönözni");
            if (valaszt == 1 || valaszt == 2) {
                break;
            } else {
                System.out.println("Érvénytelen választás");
            }
        }
        switch (valaszt) {
            case 1:

                valaszt = szken.nextInt();




            case 2:

        }


    }


    }

