package navapol;

import org.junit.Test;

import java.io.IOException;

public class TestResult {
    @Test
    public void testEnter() throws IOException {
        CreateFile a = new CreateFile();
        Result b = new Result();
        b.enter(a);
    }
}
