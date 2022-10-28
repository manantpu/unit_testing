import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class counturinalsTest {
    // This test isinputstring should fail as our input file does not have a single invalid input. The actual return should be 0 in this case.

    @Test
    void isinputstring(){
        assertEquals(1, counturinals.isinputstring("0011"));
        assertEquals(1, counturinals.isinputstring("Manasi"));
    }

    @Test
    void count_urinal() {
    }
}