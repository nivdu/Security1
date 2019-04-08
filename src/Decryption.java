import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Decryption implements encryptDecrypt {


    public void getKeys(String path2Keys) throws IOException {
        File file = new File(path2Keys);
        byte[] fileContent = Files.readAllBytes(file.toPath());
    }

    public void getFile(String path2File) {

    }

    public void write2Path(String path2Write) {

    }

    private String aesTag(String msg, String k1, String k2, String k3){

        return null;
    }

    @Override
    public void Activate(String path2Keys, String path2File, String path2Write) {

    }
}
