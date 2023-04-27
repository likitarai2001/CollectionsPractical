import java.util.*;

public class HashSetHelperClass {
    HashSet<Integer> set = new HashSet<Integer>();
    int n;

    public void addData(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range : ");
        n = sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print("Enter num " + (i+1) + " ");
            set.add(sc.nextInt());
        }
    }

    public void displayDataForLoop(){
        System.out.println("For loop iteration");
        for(int num : set){
            System.out.print(num + " ");
        }
    }

    public void displayDataForEachLoop(){
        System.out.println("\nFor Each loop iteration");
        set.forEach(System.out::println);
    }

    public void displayDataIterator(){
        System.out.println("\nIterator");
        Iterator itr = set.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next() + " ");
        }
    }

    public void displayDataLambda(){
        System.out.println("\nLambda");
        set.forEach((num) -> System.out.print(num + " "));
    }

    public void displayDataEnum(){
        System.out.println("\nEnum");
        Enumeration<Integer> e = Collections.enumeration(set);
        while (e.hasMoreElements()){
            System.out.print(e.nextElement() + " ");
        }
    }
}
