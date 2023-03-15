import java.util.ArrayList;
import java.util.Scanner;

public class Sorotwanie {
    ArrayList<Integer> tablicaliczbsortowanych = new ArrayList<>();

    /*****
     * nazwa funkcji: szukajMaksymalnej
     * parametry wejściowe: indekspoczatkowy - indeks z tablicy sortowanie od której zaczyna sie szukanie maksymalnej wartości
     * wartość zwracana: indeks elementu o maskymalnej wartości
     * autor: 00000000000
     * @return
     */
    private int szukajMaksymalnej(int indekspoczatkowy)
    {
        int indeks=indekspoczatkowy;
        int maks = tablicaliczbsortowanych.get(indekspoczatkowy);
        for(int i= indekspoczatkowy+1;i<tablicaliczbsortowanych.size();i++){
            if(maks<tablicaliczbsortowanych.get(i)){
                maks = tablicaliczbsortowanych.get(i);
                indeks=i;
            }
        }
        return indeks;
    }
    /*****
     * nazwa funkcji: sortujTablice
     * parametry wejściowe: brak
     * wartość zwracana: brak
     * autor: 00000000000
     * @return
     */
    public void sortujTablice() {

        for(int i =0;i<tablicaliczbsortowanych.size();i++){
            int indeksSzukany = szukajMaksymalnej(i);
            int pomoc = tablicaliczbsortowanych.get(i);
            tablicaliczbsortowanych.set(i,tablicaliczbsortowanych.get(indeksSzukany));
            tablicaliczbsortowanych.set(indeksSzukany,pomoc);
        }


    }
    void wczytajLiczbe()
    {
        System.out.println("Podaj 10 elementów tablicy");
        Scanner scanner  = new Scanner(System.in);
        for (int i=0;i<10;i++)
        {
            int liczba = scanner.nextInt();
            tablicaliczbsortowanych.add(liczba);
        }


    }





}
