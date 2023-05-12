package prve.prvi_zad.hr.fer.oop;

public class FindMain {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("No arguments received");
            return;
        }

        int[] brojevi = new int[args.length];
        int i = 0;

        for (String arg : args)
            if (arg.chars().allMatch(Character::isDigit)) {
                brojevi[i] = Integer.parseInt(arg);
                i++;
            }

        int najmanji = 0;
        System.out.println(brojevi[najmanji]);


        for (int j = 1; j < i; j++)
            if (brojevi[najmanji] > brojevi[j])
                najmanji = j;

        System.out.println("The smallest number is " + brojevi[najmanji]);
    }
}
