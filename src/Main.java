import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter The First Num:");
        int x=in.nextInt();
        System.out.println("Enter The Second Num:");
        int y=in.nextInt();
        int sum=y+x;
        int sub=x-y;
        System.out.println("The Sum Of Two Num is :"+sum);
        System.out.println("The Sub Of Two Num is :"+sub);

    }
}