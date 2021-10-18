package credit;
public class cr5 {
    public static void main(String[] args) {
        int a, b, c, d;
        int count = 0;
        for (a = 0; a <= 2; a++) {
            for (b = 0; b <= 5; b++) {
                if (a==2&&(b==4||b==5))
                    continue;
                    for (c = 0; c <= 5; c++) {
                        for (d = 0; d <= 9; d++) {
                            if (a == d && b == c) {
                                count++;
                            }
                        }
                    }
                }
        }
        System.out.println(count + " симметричных комбинаций за сутки");
    }
}

