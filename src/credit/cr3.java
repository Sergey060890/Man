package credit;
public class cr3 {
    public static void main(String[] args)
    {
        int a = 0;
        int b = 28800;
        int n = a + (int) (Math.random() * b);
        System.out.println(n);
        if (n == 0) {
            System.out.println("Рабочий день закончен");
            return;}
        {int hours = n / 3600;
            switch(hours){
                case 0:
                    System.out.println("Осталось менее часа");
                    break;
                case 2:
                case 3:
                case 4:
                    System.out.println("Осталось " + hours + " часа");
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                    System.out.println("Осталось " + hours + " часов");
                    break;
                default:
                    System.out.println("Остался 1 час");}
        }
    }
}
