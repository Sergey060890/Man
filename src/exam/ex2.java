package exam;
public class ex2 {
    public static void main(String args[]) {
        int a, b, c, d, e;
        int count = 0;
        for (a = 0; a <= 9; a++) {
            for (b = 0; b <= 9; b++) {
                for (c = 0; c <= 9; c++) {
                    for (d = 0; d <= 9; d++) {
                        for (e = 0; e <= 9; e++) {
                            if (a == 4||b == 4||c == 4||d == 4||e == 4||(a == 1 && b == 3) ||
                                    (b == 1 && c == 3)||(c == 1 && d == 3)||(d == 1 && e == 3)) {
                                count++;
                            }
                        }
                    }
                }
            }
        }
        System.out.println("Придётся исключить " + count + " номеров");
    }
}
