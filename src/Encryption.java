import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Encryption implements encryptDecrypt {
    Byte[] M;

    public void getKeys(String path2Keys) {

    }

    public void getFile(String path2File) {

    }

    public void write2Path(String path2Write) {

    }

    public static void Main(String args[]) throws IOException {
        String path2Keys = "C:\\Users\\nivdu\\Desktop\\אבטחה\\עבודה 1\\חלק ב\\AES3_test_files";
        File file = new File(path2Keys);
        byte[] fileContent = Files.readAllBytes(file.toPath());
        String s;
        //split the args
        //if -e call encrypt class
        //if -d call decrypt class
    }

    @Override
    public void Activate(String path2Keys, String path2File, String path2Write) {

    }
}
