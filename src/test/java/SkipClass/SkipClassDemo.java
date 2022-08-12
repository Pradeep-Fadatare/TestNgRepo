package SkipClass;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipClassDemo {
    boolean data = true;

    @Test(enabled = false)
    public void skiptest1() {
        System.out.println("Test is not complete so skip this test");
    }

    @Test
    public void skiptest2() {
        System.out.println("Test is not complete so skip this test");
        throw new SkipException("Not ready to test");
    }

    @Test
    public void skiptest3() {
        System.out.println("Test is not complete so skip this test");
        if (data == true) {
            System.out.println("test executed ");
        } else {
            System.out.println("test Execution Failed");
            throw new SkipException("test Execution Failed");
        }
    }
}


