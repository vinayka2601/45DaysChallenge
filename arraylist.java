import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        int arr[]={1,2,4,6,9,5455,8};
        ArrayList <Integer> ar = new ArrayList<>();
        ar.add(1);
        ar.add(2);
        ar.add(3);
        System.out.println(ar);
        ar.remove(2);
        System.out.println(ar);
        System.out.println(ar.contains(1));
    }
}
 