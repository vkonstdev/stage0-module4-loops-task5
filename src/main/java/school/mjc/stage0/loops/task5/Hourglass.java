package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        String sym = "8";
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height; j++) {
                if (i >= j && i >= (height + 1) - j || (i <= j && i <= (height + 1) - j)) {
                    System.out.print(sym);
                } else {
                    System.out.print(" ");
                }
                if (j % height == 0) {
                    System.out.println("");
                }
            }
        }
    }

    /*public static void main(String[] args) {
        Hourglass h = new Hourglass();
        h.printHourglassOfGivenSize(5);
    }*/
}
