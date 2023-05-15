package navapol;

import java.io.IOException;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.Arrays;

public class Result {
    public void enter(CreateFile a) throws IOException {
        String word = a.write();
        System.out.println("Hell Yeah Mother Fucker");
        //Path root = Paths.get("basedir");
        File file = new File("target/text.txt"); //obsolete version
        //Path path = Paths.get("target/text.txt");//class + "s"(utility class) means not new obj but its call some method
        //Path resolvePath = root.resolve(word);
        //Files.writeString(path,word,StandardOpenOption.CREATE,StandardOpenOption.WRITE); //write file in one line
        OutputStream os = null;
        BufferedReader reader = null;
        try {
            os = new FileOutputStream(file);
            //os = new FileOutputStream(path.toFile());
            //os = Files.newOutputStream(file);
            byte[] bytes = word.getBytes(StandardCharsets.UTF_8);
            os.write(bytes);
            os.flush();

            reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null) {
                for (  String w : line.split("\\s+")) {
                    System.out.println("word:" + w + "lenght:" + Arrays.toString(w.getBytes()));
                }
                char[] chars = line.toCharArray();
                System.out.print("[");
                for ( char c : chars ) {
                    System.out.print(c + ", ");
//                    if (c != chars.length - 1) {
//                        System.out.print(",");
//                    }
                }
                System.out.print("]");
            }

        } finally {
            if (os  != null) {
                os.close();
            }
            if (reader != null) {
                reader.close();
            }
        }
    }
}
