import java.util.*;
class HelloTillStop{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Outputs Hello while user wants to

        String choice;

        System.out.println("For Hello type h, anything else to stop");
        choice = sc.next();
        while("h".equals(choice)){
            System.out.println("Hello");
            choice = sc.next();
        }
    }
}
   

