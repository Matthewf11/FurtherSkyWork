package matthew.area;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter length and breadth");
        int len = scan.nextInt();
        int bre = scan.nextInt();
        Area a = new Area(3,4);
        System.out.println(a.returnArea(len,bre));
    }
}
