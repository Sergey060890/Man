package exam;
public class ex3 {
    public static void main(String args[]) {
        int a, b, c, d, e, f;
        int count = 0;
        for (a = 0; a <= 9; a++) {
            for (b = 0; b <= 9; b++) {
                for (c = 0; c <= 9; c++) {
                    for (d = 0; d <= 9; d++) {
                        for (e = 0; e <= 9; e++) {
                            for (f = 0; f <= 9; f++) {
                                int x = a+b+c+d+e+f;
                                if ((a + b + c) == (d + e + f)&&x>0) {
                                    count++;
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println("Счастливых билетов: " + count);
    }
}
