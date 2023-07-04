package junit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;

//@Tag("development")
public class AssertTest {
    @Tag("blabla")
    @Test
    @DisplayName("testCaseA inside ClassATest inside packageA")
    public void test() {
        boolean condn = true;
        assertEquals(true, condn);
        assertTrue(condn);
        // assertFalse(condn);
    }
}
