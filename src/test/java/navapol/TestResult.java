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
    @Test
    public void testExit() throws IOException {
        App aa = new App();
        aa.enter(new App());
    }
}
