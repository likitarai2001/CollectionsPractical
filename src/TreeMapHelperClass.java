import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapHelperClass {
    TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
    int n;

    public void addData(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range : ");
        n = sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print("Enter num ");
            int num = sc.nextInt();
            System.out.print("Enter String ");
            String str = sc.next();
            tm.put(num, str);
        }
    }

    public void displayDataForEachLoop(){
        System.out.println("\nFor Each loop iteration");
        for(Map.Entry<Integer, String> num : tm.entrySet()){
            System.out.println("Key = " + num.getKey() + ", Value = " + num.getValue());
        }
    }

    public void displayKeys(){
        System.out.println("\nIterate Keys");
        for(Integer key : tm.keySet()){
            System.out.print(key + " ");
        }
    }

    public void displayValues(){
        System.out.println("\nIterate Values");
        for(String val : tm.values()){
            System.out.print(val + " ");
        }
    }

    public void displayDataIterator(){
        System.out.println("\nIterator");
        Iterator<Map.Entry<Integer, String>> itr = tm.entrySet().iterator();
        while (itr.hasNext()){
            Map.Entry<Integer, String> entry = itr.next();
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }
    }

    public void displayDataLambda(){
        System.out.println("\nLambda");
        tm.forEach((k, v) -> System.out.println("Key = " + k + ", Value = " + v));
    }
}
