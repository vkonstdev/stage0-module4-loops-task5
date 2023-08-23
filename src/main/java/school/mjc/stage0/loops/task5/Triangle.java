package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength) {
        String sym = "8";
        for (int i = 0; i < cathetusLength; i++) {
            int j;
            for (j = 0; j < i + 1; j++) {
                System.out.print(sym);
            }
            for (int k = j; k < cathetusLength; k++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    /*public static void main(String[] args) {
        Triangle t = new Triangle();
        t.printTriangle(3);
    }*/
}
