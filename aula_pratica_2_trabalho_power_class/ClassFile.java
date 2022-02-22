import java.io.File;
import java.io.IOException;

public class ClassFile {

    public static void main(String[] args) {
        File file = new File("file.txt");

        try {
            boolean isCreated = file.createNewFile();
            System.out.println("Created: " + isCreated);
            System.out.println("Is Directory: " + file.isDirectory());
            System.out.println("Is File: " + file.isFile());

            if(file.exists()) {
                System.out.println("Deleted: " + file.delete());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}