package chapter1;

public class BottleSong {
    public static void main(String[] args) {
        int bottlesNum = 10;
        String word = "bottles";

        while (bottlesNum > 0) {
            if (bottlesNum == 1) {
                word = "bottle";
            }

            System.out.println(bottlesNum + " green " + word + ", hanging on the wall");
            System.out.println(bottlesNum + " green " + word + ", hanging on the wall");
            System.out.println("And if one green bottle should accidentally fall,");
            bottlesNum = bottlesNum - 1;


        }
    }
}
