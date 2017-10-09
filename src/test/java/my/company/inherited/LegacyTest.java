package my.company.inherited;

import my.company.Library;
import org.junit.Test;
import static org.junit.Assert.*;

public class LegacyTest {

    private Library classUnderTest = new Library();

    @Test
    public void testFoo() throws InterruptedException {
        Thread.sleep(10_000L);
        assertTrue(classUnderTest.someLibraryMethod());
    }

    @Test
    public void testBar() throws InterruptedException {
        Thread.sleep(10_000L);
        assertTrue(classUnderTest.someLibraryMethod());
    }
}
