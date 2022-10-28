/*@author : Manasi Anantpurkar
 */
import org.junit.jupiter.api.Test;
import java.io.File;
import static org.junit.jupiter.api.Assertions.*;

class OpenFileTest {
    @Test
    void isFileExists() {
        System.out.println("Check if the file exists");
        assertEquals(1, OpenFile.isFileExists(new File("src/main/java/abcd.dat")));
    }

    @Test
    void isFileEmpty() {
        System.out.println("Check if the file is empty");
        assertEquals(1, OpenFile.isFileExists(new File("src/main/java/urinals.dat")));
    }
}
