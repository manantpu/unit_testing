import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.io.File;
class CreateFileTest {

    @Test
    void isDuplicate() {
        System.out.println("Manasi Anantpurkar : duplicate test");
        assertEquals(1, CreateFile.isDuplicate(new File("src/main/java/rule0.txt")));
        assertEquals(0, CreateFile.isDuplicate(new File("src/main/java/rule102.dat")));
    }

    @Test
    void isbadName() {
        System.out.println("Manasi Anantpurkar : Bad Name test");
        assertEquals(1, CreateFile.isbadName("rule0"));
        assertEquals(0, CreateFile.isbadName("manasi"));
    }
}