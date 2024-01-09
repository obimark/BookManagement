import java.util.HashMap;
import java.util.Map;

public class Book {

    static Map<String, String> BooksMap = new HashMap<>();

    String szerzo;
    String cim;
    String kategoria;
    int isbn;
    int db;

    public Book (String szerzo, String cim, String kategoria, int isbn) {
        this.szerzo=szerzo;
        this.cim=cim;
        this.kategoria=kategoria;
        this.isbn=isbn;
        this.db=50;
    }

    public int getDB(){
        return db;
    }
    public void setDB(int darab){
        this.db=darab;
    }


    @Override
    public String toString() {
        return "Szerző: " + szerzo + "\n" +
                "Cím: " + cim + "\n" +
                "Kategória: " + kategoria + "\n" +
                "ISBN: " + isbn + "\n" +
                "Elérhető Darab: " + Integer.toString(db);
    }






}
