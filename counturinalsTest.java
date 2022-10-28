/*@author : Manasi Anantpurkar
 */
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CountUrinalsTest {
    // This test isinputstring should fail as our input file does not have a single invalid input. The actual return should be 0 in this case.

    @Test
    void isinputstring(){
        System.out.println("Manasi test case for checking if input is string");
        assertEquals(1, counturinals.isinputstring("0011"));
        assertEquals(0, counturinals.isinputstring("Manasi"));
    }

    @Test
    void count_urinal() {
    }
}
