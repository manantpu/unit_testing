/*@author : Manasi Anantpurkar
 */
import java.io.File;
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

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

    public static int isFileEmpty(File file) {
        if (file.length()==0) {
            System.out.println("File is empty!!");
            return 1;
        }
        else {
            System.out.println("File is not empty");
            return 0;
        }
    }


    public static void fileip() throws IOException{
        ArrayList<String> answer_arr = new ArrayList<String>(100);
        File file = new File("src/main/java/urinals.dat");

        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            String x = scanner.next();
            System.out.println(x);
            int temp = counturinals.count_urinal(x);
            answer_arr.add(String.valueOf(temp));
        }
        CreateFile.addanstofile(answer_arr);
        scanner.close();
    }
}
