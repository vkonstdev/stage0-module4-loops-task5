package school.mjc.stage0.loops.task5;

public class Square {
    public void printSquareFrom8s(int sideLength){
        String sym = "8";
        for (int i = 0; i < sideLength; i++) {
            if (i == sideLength - 1) {
                System.out.println(sym);
            } else {
                System.out.print(sym);
            }
        }
        for (int i = 0; i < sideLength - 2; i++) {
            System.out.print(sym);
            for (int j = 0; j < sideLength - 2; j++) {
                System.out.print(" ");
            }
            System.out.println(sym);
        }
        for (int i = 0; i < sideLength; i++) {
            System.out.print(sym);
        }
    }

    /*public static void main(String[] args) {
        Square s = new Square();
        s.printSquareFrom8s(2);
    }*/
}
