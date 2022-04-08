package Java11;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class q5 {
    public static void main(String[] args) throws IOException {
        mainInputMenu();
    }

    private static void mainInputMenu() throws IOException {
        int count = 1;
        var path = "C:\\Users\\novel\\OneDrive\\Desktop\\Price.TXT";
        System.out.println("Select your option (1: Insert New Price, 2: View Purchase Total, 3: Exit)");
        Scanner option = new Scanner(System.in);
        int opt = option.nextInt();
        if (opt == 1) {
            System.out.print("Insert item "+count+" price: ");
            Scanner p = new Scanner(System.in);
            int price = p.nextInt();
            Files.writeString(Path.of(path), price + "\n", StandardOpenOption.APPEND);
            System.out.println("Price has been saved to the file");
            while (scan().equals("Yes")) {
                count++;
                System.out.print("Insert item " + count + " price: ");
                Scanner p2 = new Scanner(System.in);
                int price2 = p2.nextInt();
                Files.writeString(Path.of(path), price2 + "\n", StandardOpenOption.APPEND);
                System.out.println("Price has been saved to the file");
            }
            while (true){
                mainInputMenu();
                break;
            }
        }
        else if (opt == 2){
            File file = new File(path);
            Scanner s = new Scanner(file);
            int sum = 0;
            while (s.hasNext())
                sum = sum + s.nextInt();
            Files.writeString(Path.of("C:\\Users\\novel\\OneDrive\\Desktop\\Total.TXT"), sum+"\n", StandardOpenOption.APPEND);
            String s1 = Files.readString(Path.of("C:\\Users\\novel\\OneDrive\\Desktop\\Total.TXT"));
            System.out.println(s1.replaceAll(s1,sum+""));
            mainInputMenu();
        }
        else if (opt == 3)
            System.exit(0);

    }
    public static String scan () {
        System.out.println("Do you want to enter price for more items? (Yes/No)");
        Scanner YorN = new Scanner(System.in);
        return YorN.nextLine();
    }
}