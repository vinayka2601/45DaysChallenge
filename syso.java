import java.util.HashMap;

public class syso {
    public static void main(String[] args) {
    HashMap<String,Integer>hm=new HashMap<>();
    //put -O(1)
    hm.put("india",100);
    hm.put("us",50);
System.out.println(hm);
//Get-O(1)
int population=hm.get("india");
System.out.println(population);
//containsKey-O(1)
System.out.println(hm.containsKey("india"));

//remove-O(1)
 System.out.println(hm.remove("us"));
 System.out.println(hm);
//size
System.out.println(hm.size());
//is empty
System.out.println(hm.isEmpty());
hm.clear();
System.out.println(hm.isEmpty());
    }
}
