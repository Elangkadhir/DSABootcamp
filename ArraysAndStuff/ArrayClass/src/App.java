public class App {
    public static void main(String[] args) throws Exception {
        // store a roll no
        int a = 90;
        String name = "adhir";

        // store 5 roll no:
        int b = 21;
        int c = 21;
        int v = 21;
        int bb = 21;
        int n = 21;

        // store 100 roll no;

        // Arrays is the collection of data types
        // dataType[] variableName = new dataType[size]
        int[] arr = new int[10];
        int[] arr2 = { 1, 2, 3, 4, 5 };
        // int[] arr2 = { 1, 2, 3, 4, 5,"Hello" };

        int[] ros; // comile time; declaration of array. ros is getting defined in stact;
        ros = new int[5]; // run time; initialisation : actually here object is being created in heap
        // dynamic memory allocation;

        // array objects are in heap;
        // heap objects are not continuous;
        // dynamic memory allocation
        // hence array objects may not be continuous
        // it depends on jvm

        // new - it is used to create an object
        // [0,0,0,0,0] - integer default will be zero value

        String[] nameq = new String[7];
        System.out.println(nameq[0]); // null;

        String str = null;
        // int num1 = null; - error , cannot be assigned to primitive;

        // default value of reference variable  - null
    }
}
