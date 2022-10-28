import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
public class CreateFile {
    public static int isDuplicate(File x){
        if(x.exists()){
            return 1;
        }
        else{
            return 0;
        }
    }

    public static int isbadName(String x){
        int m=x.length();
        String temp= "rule" ;
        if(m<4){
            if(x.substring(0,m) != temp.substring(0,m)){
                return 1;
            }
            else{
                return 0;
            }
        }
        else{
            if(x.substring(0,4)!= temp){
                return 1;
            }
            else{
                return 0;
            }
        }
    }

    public static void addanstofile(ArrayList<String> x){
        int p = 0;
        String dfilename="";
        boolean cv = true;
        while(cv) {
            String fname = "rule".concat(String.valueOf(p));
            String fname2 = fname.concat(".txt");
            String p1 = "src/main/java/".concat(fname2);
            File fileName = new File(p1);
            if (fileName.exists()) {
                p += 1;
            } else {
                dfilename = p1;
                cv = false;
            }
        }
        Path fileName = Path.of(
                dfilename);
        try {
            Files.write(fileName, x);
            System.out.println("File Output added");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
