package druge;

public class AdvancedWorkingWithStrings {
    public static String text = "";
    public static void main(String[] args) {
        AdvancedWorkingWithStrings.text = concat(args);
        ispisi();
        ispisiIndexe();
        podniz();
    }

    public static String concat(String[] args) {
        return String.join(";", args);
    }

    public static void ispisi() {
        for (String dio : AdvancedWorkingWithStrings.text.split(";"))
            System.out.println(dio);
    }

    public static void ispisiIndexe() {
        int prviIndex = AdvancedWorkingWithStrings.text.indexOf(";");
        int drugiIndex = AdvancedWorkingWithStrings.text.lastIndexOf(";");

        System.out.println(String.format("%d %d", prviIndex, drugiIndex));
    }

    public static void podniz() {
        int prviIndex = AdvancedWorkingWithStrings.text.indexOf(";");
        int drugiIndex = AdvancedWorkingWithStrings.text.lastIndexOf(";");

        System.out.println(AdvancedWorkingWithStrings.text.substring(prviIndex + 1, drugiIndex));
    }
}
