import static org.junit.Assert.*;
import org.junit.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileTests {
    @Test
    public void testGetFiles() throws IOException {
        List<File> files = new ArrayList<>();
        File f = new File("/Users/glnt/Documents/GitHub/lab3");
        files.add(f);
        assertEquals(files, FileExample.getFiles(f));
    }
}
