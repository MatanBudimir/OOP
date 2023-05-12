package hr.fer.oop.drugo;

public class Pred2 {

    public static double[] create(int n) {
        double[] arr = new double[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Math.random();
            System.out.println(arr[i]);
        }
        return arr;
    }
    /*public static void main(String[] args) {

        String s = new String("aaa");

        int[] polje = null;
        polje = new int[5];

        System.out.println(s);
        System.out.println(polje.length);
        System.out.println(polje[3]);

        double[] arr = create(5);

    }
*/
}
