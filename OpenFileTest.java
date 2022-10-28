import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.*;
import static org.junit.jupiter.api.Assertions.*;

class OpenFileTest {
    @Test
    void isFileExists() {
        assertEquals(1, OpenFile.isFileExists(new File("src/main/java/abcd.dat")));
    }

    @Test
    void isFileEmpty() {
        assertEquals(1, OpenFile.isFileExists(new File("src/main/java/urinals.dat")));
    }
}
