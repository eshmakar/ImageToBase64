import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.Base64;

public class JpgToBase64 {
    public static void main(String[] args) throws IOException {

        //CONVERT IMAGE TO BASE64
        byte[] fileContent = FileUtils.readFileToByteArray(new File("D:\\3\\Folder.jpg"));
        String encodedString = Base64.getEncoder().encodeToString(fileContent);
        System.out.println(encodedString);

        //CONVERT BASE64 TO IMAGE (JPG)
        byte[] decodedBytes = Base64.getDecoder().decode(encodedString);
        FileUtils.writeByteArrayToFile(new File("D:/3/FolderFolder.jpg"), decodedBytes);
    }
}
