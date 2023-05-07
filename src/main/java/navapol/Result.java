package navapol;

import java.io.IOException;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Result {
    public void enter(CreateFile a) throws IOException {
        String word = a.write();
        File file = new File("/Users/khodcoolmac/Desktop/mvn-proj","text.txt");
        OutputStream os = null;
        try {
            os = new FileOutputStream(file);
            byte[] bytes = word.getBytes(StandardCharsets.UTF_8);
            os.write(bytes);
        } finally {
            if (os != null) {
                os.close();
            }
        }
    }
}
