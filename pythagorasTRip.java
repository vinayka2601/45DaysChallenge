public class pythagorasTRip {
    public static void main(String[] args) {
        int a = 21, b = 35, c = 28;
        if (a > b && a > c) {
            int A = (int) Math.pow(a, 2);
            if (A == (int) Math.pow(b, 2) + (int) Math.pow(c, 2)) {
                System.out.println(A + " A_pythagoras triplets");
            }
        } else if (b > a && b > c) {
            int B = (int) Math.pow(b, 2);
            if (B == (int) Math.pow(a, 2) + (int) Math.pow(c, 2)) {
                System.out.println(B + " B_pythagoras triplets");
            }
        } else if (c > a && c > b) {
            int C = (int) Math.pow(c, 2);
            if (C == (int) Math.pow(a, 2) + (int) Math.pow(b, 2)) {
                System.out.println(C + " C_pythagoras triplets");
            }
        } else {
            System.out.println("numbers are not pythagorus trplets");
        }
    }
}
