public class Person {

private String imie;
    private  String nazwisko;
    private  long pesel;

    public Person(String imie, String nazwisko, long pesel) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
    }

    public Person(){};

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public long getPesel() {
        return pesel;
    }

    public void setPesel(long pesel) {
        this.pesel = pesel;
    }
}
