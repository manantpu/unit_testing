import java.io.File;
import java.util.Scanner;
import java.io.*;

public class OpenFile {

    public static int isFileExists(File file) {
        if (file.isFile()) {
            System.out.println("File exists!!");
            return 1;
        }
        else {
            System.out.println("File doesn't exist or program doesn't have access " +
                    "to the file");
            return 0;
        }
    }
    public static void fileip() throws IOException{
        File file = new File("src/main/java/urinals.dat");

        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            String x = scanner.next();
            System.out.println(x);
            int temp = counturinals.count_urinal(x);
        }
        scanner.close();
    }
}
