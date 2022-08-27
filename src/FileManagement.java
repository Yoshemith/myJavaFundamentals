import java.io.File;
import java.io.IOException;

public class FileManagement {

    public static void getFolderContents(File folder) throws IOException {
        File[] files = folder.listFiles();
        for (File f: files) {
            if (f.isFile()) {
                System.out.println(f.getName());
            } else {
                System.out.println(f.getCanonicalFile());
                getFolderContents(f);
            }
        }
     }

    public static void main(String[] args) throws IOException {
        String homeFolder = System.getProperty("user.home");
        String separator = File.separator;
        File currentFolder = new File(homeFolder);
        File newFile = new File(currentFolder, separator + "example.txt");
        System.out.println(currentFolder.getCanonicalPath());
        System.out.println(currentFolder.isDirectory());
        System.out.println(newFile.getCanonicalPath());
        System.out.println(newFile.isDirectory());
        System.out.println(newFile.exists());

        //getFolderContents(currentFolder);

        //return boolean values
        //newFile.createNewFile();
        //newFile.delete();
        //newFile.mkdir();

        System.out.println(newFile.delete());


    }

}
