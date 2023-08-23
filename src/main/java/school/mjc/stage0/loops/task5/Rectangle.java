package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height){
        String sym = "8";
        for (int i = 0; i < height; i++) {
            if (i == 0 || i == height - 1) {
                for (int j = 0; j < length; j++) {
                    System.out.print(sym);
                }
            } else {
                System.out.print(sym);
                for (int j = 0; j < length - 2; j++) {
                    System.out.print(" ");
                }
                System.out.print(sym);
            }
            System.out.println();
        }
    }

    /*public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.printRectangleFrom8s(0, 0);
    }*/
}
