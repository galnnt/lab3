import static org.junit.Assert.*;
import org.junit.*;
import java.util.List;
import java.util.ArrayList;

public class ListTests {

    @Test
    public void testFilter() {
        StringChecker sc = new StringChecker() {
            public boolean checkString(String s) {
            if (s.contains("s")) {
                return true;
            }
            return false;
    }
        };
        List<String> strl1 = new ArrayList<>();
        strl1.add("s");
        strl1.add("ss");
        strl1.add("sss");
        assertEquals(strl1, ListExamples.filter(strl1, sc));
    }

    @Test
    public void testMerge() {
        List<String> strl1 = new ArrayList<>();
        List<String> strl2 = new ArrayList<>();
        List<String> strl3 = new ArrayList<>();
        strl1.add("a");
        strl1.add("c");
        strl1.add("e");
        strl2.add("b");
        strl2.add("d");
        strl2.add("f");
        strl3.add("a");
        strl3.add("b");
        strl3.add("c");
        strl3.add("d");
        strl3.add("e");
        strl3.add("f");
        assertEquals(strl3, ListExamples.merge(strl1, strl2));
    }
}
