import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> A = new ArrayList<>();

        A.add("a");
        A.add("b");
        A.add("c");
        A.add("d");
        A.add("e");
        System.out.println(A);

        ArrayList<String> B = new ArrayList<>();

        B.add("A1");
        B.add("B5");
        B.add("A2");
        B.add("B4");
        B.add("A3");
        B.add("B3");
        B.add("A4");
        B.add("B2");
        B.add("A5");
        B.add("B1");

        ArrayList<String> C = new ArrayList<>();
        B.addAll(C);
        A.addAll(C);
        Iterator<String> iterA = A.iterator();
        Iterator<String> iterB = B.iterator();
        while (iterA.hasNext() && iterB.hasNext()) {
        C.add(iterB.next());
        C.add(iterA.next());
        }

        A.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        System.out.println(C);
    }
}