public class Main {
    public static void main(String[] args) {
        ArrayListHelperClass arr = new ArrayListHelperClass();
        arr.addData();
        arr.displayDataForLoop();
        arr.displayDataForEachLoop();
        arr.displayDataIterator();
        arr.displayDataLambda();
        arr.displayDataEnum();
        arr.convertToHashset();

        HashSetHelperClass set = new HashSetHelperClass();
        set.addData();
        set.displayDataForLoop();
        set.displayDataForEachLoop();
        set.displayDataIterator();
        set.displayDataLambda();
        set.displayDataEnum();

        HashMapHelperClass map = new HashMapHelperClass();
        map.addData();
        map.displayDataForEachLoop();
        map.displayKeys();
        map.displayValues();
        map.displayDataIterator();
        map.displayDataLambda();

        TreeSetHelperClass ts = new TreeSetHelperClass();
        ts.addData();
        ts.displayDataForLoop();
        ts.displayDataForEachLoop();
        ts.displayDataIterator();
        ts.displayDataLambda();
        ts.displayDataEnum();

        TreeMapHelperClass tm = new TreeMapHelperClass();
        tm.addData();
        tm.displayDataForEachLoop();
        tm.displayKeys();
        tm.displayValues();
        tm.displayDataIterator();
        tm.displayDataLambda();
    }
}