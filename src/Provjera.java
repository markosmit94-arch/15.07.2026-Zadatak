import java.util.Comparator;

class Provjera implements Comparator<Polaznik> {
    public int compare(Polaznik o1, Polaznik o2) {
        return o1.getPrezime().compareTo(o2.getPrezime());
    }
}
