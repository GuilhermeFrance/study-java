import java.util.*;

public class Aula003_2Scanners {
    public static void main(String[] args) {

        String s1, s2, s3;

        Scanner sc = new Scanner(System.in);
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();
        sc.close();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
