import java.util.*;

public class TreeSetHelperClass {
    TreeSet<Integer> ts = new TreeSet<Integer>();
    int n;

    public void addData(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range : ");
        n = sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print("Enter num " + (i+1) + " ");
            ts.add(sc.nextInt());
        }
    }

    public void displayDataForLoop(){
        System.out.println("For loop iteration");
        for(int num : ts){
            System.out.print(num + " ");
        }
    }

    public void displayDataForEachLoop(){
        System.out.println("\nFor Each loop iteration");
        ts.forEach(System.out::println);
    }

    public void displayDataIterator(){
        System.out.println("\nIterator");
        Iterator itr = ts.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next() + " ");
        }
    }

    public void displayDataLambda(){
        System.out.println("\nLambda");
        ts.forEach((num) -> System.out.print(num + " "));
    }

    public void displayDataEnum(){
        System.out.println("\nEnum");
        Enumeration<Integer> e = Collections.enumeration(ts);
        while (e.hasMoreElements()){
            System.out.print(e.nextElement() + " ");
        }
    }
}
