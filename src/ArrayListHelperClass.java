import java.util.*;

public class ArrayListHelperClass {
    ArrayList<Integer> arr = new ArrayList<Integer>();
    int n;

    public void addData(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range : ");
        n = sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print("Enter num " + (i+1) + " ");
            arr.add(sc.nextInt());
        }
    }

    public void displayDataForLoop(){
        System.out.println("For loop iteration");
        for(int i=0;i<n;i++){
            System.out.print(arr.get(i) + " ");
        }
    }

    public void displayDataForEachLoop(){
        System.out.println("\nFor Each loop iteration");
        for(int num : arr){
            System.out.print(num + " ");
        }
    }

    public void displayDataIterator(){
        System.out.println("\nIterator");
        Iterator itr = arr.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next() + " ");
        }
    }

    public void displayDataLambda(){
        System.out.println("\nLambda");
        arr.forEach((num) -> System.out.print(num + " "));
    }

    public void displayDataEnum(){
        System.out.println("\nEnum");
        Enumeration<Integer> e = Collections.enumeration(arr);
        while (e.hasMoreElements()){
            System.out.print(e.nextElement() + " ");
        }
    }

    public void convertToHashset(){
        HashSet<Integer> set = new HashSet<Integer>();
        arr.forEach((num) -> set.add(num));
        set.forEach((num) -> System.out.print(num + " "));
    }
}
