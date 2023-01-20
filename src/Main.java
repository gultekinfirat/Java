import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int physics, chemical, turkish, history, music;
        Scanner input  = new Scanner(System.in);
        System.out.println("Entry physics note");
        physics = input.nextInt();

        System.out.println("Entry chemical note");
        chemical = input.nextInt();

        System.out.println("Entry turkish note");
        turkish = input.nextInt();

        System.out.println("Entry history note");
        history = input.nextInt();

        System.out.println("Entry music note");
        music = input.nextInt();

        int total = (physics + chemical + turkish + history + music );
        double average = total / 5.0;

        boolean result = average >= 60.0;
        String result2 = result ? "Successfull":"Unsuccessfull";

        System.out.println("Note average: " + average + " : " + result2);
    }
}