package twelve;

import com.google.common.base.Charsets;
import com.google.common.io.Files;
import org.apache.commons.io.FileUtils;

import java.io.*;

public class FileBasedExamples {

    public static void main(String[] args) {
       // FileUtils.read
    }

    private static void copyFileWithoutLibraries(File sourceFile,
                                                 File destinationFile) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(sourceFile);
            os = new FileOutputStream(destinationFile);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } finally {
            is.close();
            os.close();
        }
    }

    private static void copyFileUsingGuava
            (File sourceFile, File destinationFile) throws IOException {

        Files.copy(sourceFile,destinationFile);
    }

    private static void copyFileUsingApacheCommonsIO
            (File sourceFile, File destinationFile) throws IOException {

        FileUtils.copyFile(sourceFile,destinationFile);
    }

    // read file

    private static String readFileToStringWithoutLibraries() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("text.txt"));
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append("\n");
                line = br.readLine();
            }
            return sb.toString();
        } finally {
            br.close();
        }
    }

    private static String readFileToStringUsingApacheCommonsIO() throws IOException {
        File file = new File("test.txt");

        String output = FileUtils.readFileToString(file,"UTF-8");
        return  output;
    }

    private static String readFileToStringUsingGuava() throws IOException {
        File file = new File("test.txt");
        return Files.toString(file, Charsets.UTF_8);
    }
}
