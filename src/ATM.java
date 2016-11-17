import java.util.Scanner;

/**
 * Created by ryankielty on 11/16/16.
 */
public class ATM {

    public static Scanner scanner = new Scanner(System.in);
    public static Account customer = new Account();

    public static void main(String[] args) throws Exception{
        System.out.println("Welcome City Bank member");

        customer.chooseName();
        customer.chooseService();
        customer.chooseBalance();

    }
}
