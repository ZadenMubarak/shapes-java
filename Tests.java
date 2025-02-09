import org.junit.*;
import java.io.*;

public class Tests {

    @Test
    public void testSquare() {
        // Capture console output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        // Call method that prints to console
        Shapes.square(5);


        // Restore original System.out
        System.setOut(originalOut);

        // Expected output with newlines
        String expectedOutput = "*****\n"
                              + "*****\n"
                              + "*****\n"
                              + "*****\n"
                              + "*****\n"; // Ensure newline at the end

        // Compare output
        Assert.assertEquals(expectedOutput, outContent.toString());
    }
}
