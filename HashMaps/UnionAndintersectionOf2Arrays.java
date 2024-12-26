
/**
 * UnionAndintersection.Of2Arrays
 */
import java.util.*;

public class UnionAndintersectionOf2Arrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter size of array 1: ");
        int size1 = sc.nextInt();
        System.out.println(("enter array 1 elemets: "));
        int arr1[] = new int[size1];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter size of arr2: ");
        int size2 = sc.nextInt();
        System.out.println("Enter array 2 elements: ");
        int arr2[] = new int[size2];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }

        // UNION
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }
        System.out.println("Union of arrays: " + set);
        System.out.println("size of set: " + set.size());

        // INTERSECTION
        set.clear();
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        int count = 0;
        System.out.println("Intersection of arrays: ");
        for (int i = 0; i < arr2.length; i++) {
            if (set.contains(arr2[i])) {
                count++;
                System.out.print(arr2[i] + " ");
                set.remove(arr2[i]);
            }
            System.out.println();
        }
        System.out.println("Count of elements in intersection: " + count);
    }
}