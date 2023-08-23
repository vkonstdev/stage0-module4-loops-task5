package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        String sym = "8";
        for (int i = 0; i < sideLength; i++) {
            if (i == sideLength / 2) {
                for (int j = 0; j < sideLength; j++) {
                    System.out.print(sym);
                }
                System.out.println();
            } else {
                for (int j = 0; j < sideLength / 2; j++) {
                    System.out.print(" ");
                }
                System.out.print(sym);
                for (int j = 0; j < sideLength / 2; j++) {
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
    }

    /*public static void main(String[] args) {
        Cross c = new Cross();
        c.printCross(0);
    }*/
}
