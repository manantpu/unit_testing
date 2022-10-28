import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class OpenFileTest {
    @Test
    void isFileExists() {
        assertEquals(1, OpenFile.isFileExists(new File("src/main/java/abcd.dat")));
    }
}