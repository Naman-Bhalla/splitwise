import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        CommandFactory factory;
        Scanner sc = new Scanner();


        while(true) {
            factory.getExecutotForCommand(
                    sc.nextLine()
            ).execute();
        }
    }
}
