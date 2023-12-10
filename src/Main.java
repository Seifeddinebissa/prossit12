import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args){
        List<Etudiant> liste = new ArrayList<>();
        Etudiant e1 = new Etudiant(1,"seif",22);
        Etudiant e2 = new Etudiant(2,"yassine",22);
        liste.add(e1);
        liste.add(e2);
        StudentManagement sm = new StudentManagement();
        Consumer<Etudiant> con = etudiant -> System.out.println(etudiant.toString());
        sm.displayStudents(liste,con);
    }
}
