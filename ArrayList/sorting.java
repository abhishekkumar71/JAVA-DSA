import java.util.ArrayList;
import java.util.Collections;

public class sorting {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(10);
        list.add(18);
        list.add(7);
        list.add(34);
        list.add(5);
        System.out.println("ArrayList before sorting:" + list);
        Collections.sort(list);
        System.out.println("ArrayList after sorting" + list);
        //DESCENDING ORDER
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Descending order:"+list);
    }
}
