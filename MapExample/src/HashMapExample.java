import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HashMapExample {
    static Map<Integer,String> sampleMap = new HashMap<>();
    public static void main(String args[])
    {
        sampleMap.put(5,"5");
        sampleMap.put(1,"1");
        sampleMap.put(2,"2");
        sampleMap.put(null,"2");
        sampleMap.put(3,null);
       // printUserInput();
        iteratemap();

    }
    private static void printUserInput()
    {
        Scanner in= new Scanner(System.in);
        for(int i=0;i<2;i++) {
            sampleMap.put(in.nextInt(), in.nextLine());
        }
        System.out.println(sampleMap.get(0));
    }
    private static void iteratemap()
    {
        //Set getMapSet = sampleMap.entrySet();
        for(Map.Entry<Integer,String> eachEntry: sampleMap.entrySet())
        {
            System.out.println(eachEntry.hashCode() +","+ eachEntry.getValue());
        }
    }
}
