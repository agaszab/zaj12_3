import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Przychdnia {

    public static void main(String[] args) {

        Queue<Person> kolejka=new LinkedList<>();
        Person per1=new Person ("Jan", "kowalski", 3454323);
        Person per2=new Person  ("Marek", "Nowak", 6454323);
        Person per3=new Person  ("Anna", "Zawada", 43454323);
        Person per4=new Person  ("Jan", "Jakis",3454323);

        kolejka.add(per1);
        kolejka.add(per2);
        kolejka.add(per3);
        kolejka.add(per4);

     //   Iterator<Person> iterator= kolejka.iterator();

        while (!kolejka.isEmpty()) {
            
            Person peek = kolejka.peek();
            System.out.println ("Pacjent "+peek.getImie()+" "+peek.getNazwisko()+" ("+peek.getPesel()+") "+ "proszona do gabinetu");

            Person pool = kolejka.poll();
            System.out.println ("Pacjent "+pool.getImie()+" "+pool.getNazwisko()+" ("+pool.getPesel()+") "+ "obsłużona");
        }

    }
}
