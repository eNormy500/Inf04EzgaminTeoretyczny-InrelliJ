public class Main {
    public static void main(String[] args) {
        Sorotwanie s1 = new Sorotwanie();
        s1.wczytajLiczbe();
        System.out.println("wczytana tablica");
        System.out.println(s1.tablicaliczbsortowanych);
        s1.sortujTablice();
        System.out.println("posortowana tablica");
        System.out.println(s1.tablicaliczbsortowanych);
    }
}