import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.*;

public class counturinals {
    public static int isinputstring(String s){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='0' && s.charAt(i)!='1'){
                return 0;
            }
        }
        return 1;
    }
    public static int count_urinal(String x){
        int count=0;
        String temp = "0" +x +"0";
        for(int i=1; i< temp.length()-1 ;i++){
            if(temp.charAt(i)=='0' && temp.charAt(i-1)=='0' && temp.charAt(i+1)=='0'){
                count+=1;
                temp = temp.substring(0, i) + '1'
                        + temp.substring(i + 1);
            }
        }
        System.out.println(count);
        CreateFile.addintofile(count);
        return count;
    }
}
