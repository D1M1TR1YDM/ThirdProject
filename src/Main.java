import org.w3c.dom.ls.LSOutput;

import javax.imageio.IIOException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("Authorization.txt");
        FileReader fileReader = new FileReader("Authorization.txt");
        Scanner reader = new Scanner(fileReader);

        Scanner scanner = new Scanner(System.in);
        String pw = "";
        boolean checkPassword = false;
        do {
            System.out.println("write your new login");
            String logIn = scanner.nextLine();
            System.out.println("write your  new password");
            String password = scanner.nextLine();
            System.out.println("confirm your password");
            String cPassword = scanner.nextLine();
            if (Objects.equals(password, cPassword)) {
                System.out.println("you have registred");
                fileWriter.write(logIn + "\n");
                fileWriter.write(password);
                fileWriter.close();
                checkPassword = true;

            } else System.out.println("wrong password");
        } while (!checkPassword);

        checkPassword = false;
        do {
            System.out.println("write your login to authorize");
            String logIn = scanner.nextLine();
            System.out.println("your password");
            String password = scanner.nextLine();
            while (reader.hasNextLine()) {
                pw = reader.nextLine();
                System.out.println(pw);
            }
            reader.close();
            if (!Objects.equals(reader.nextLine(), logIn) || !Objects.equals(pw, password)) {
                System.out.println("wrong login or password try again");
            } else {
                System.out.println("you have logged in");
                checkPassword = true;
            }
        } while (!checkPassword);
    }

}
