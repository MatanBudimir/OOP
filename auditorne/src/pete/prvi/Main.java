package pete.prvi;

public class Main {
    public static void main(String[] args) {
        /*
        Object o1 = new Object();
        Object o2 = new Object();
        Object o3 = new Object();
        Object o4 = new Object();
        Object o5 = new Object();

        SimpleArrayList arr = new SimpleArrayList();
        arr.add(o1);
        System.out.println(arr.size());
        arr.add(o2);
        System.out.println(arr.size());
        arr.add(o3);
        System.out.println(arr.size());
        arr.add(o4);
        System.out.println(arr.size());
        arr.add(o5);
        System.out.println(arr.size());

        System.out.println(o1 == arr.get(0));
        System.out.println(o4 == arr.get(3));
        System.out.println(o3 == arr.get(0));
        System.out.println(o1 == arr.get(arr.indexOf(o1)));
        System.out.println(o4 == arr.get(arr.indexOf(o4)));
        System.out.println(o3 == arr.get(arr.indexOf(o1)));*/

        Doodle doodle = new Doodle();
        doodle.read();
        doodle.printTable();
    }
}
