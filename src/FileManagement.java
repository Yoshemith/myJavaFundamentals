import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

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
        String lineSeparator = System.getProperty("line.separator");
        File currentFolder = new File(homeFolder);
        File newFile = new File(currentFolder, separator + "example.txt");
        System.out.println(currentFolder.getCanonicalPath());
        System.out.println(currentFolder.isDirectory());
        System.out.println(newFile.getCanonicalPath());
        System.out.println(newFile.isDirectory());
        System.out.println(newFile.exists());

        //newFile.createNewFile(); This creates an empty file

        //getFolderContents(currentFolder);

        //return boolean values
        //newFile.createNewFile();
        //newFile.delete();
        //newFile.mkdir();
        //System.out.println(newFile.delete());

        //Creating a file

        //FileWriter for small content in files
        //append true if we want to add text, instead of overwrite the file
        try (FileWriter fw = new FileWriter(newFile, true);
             BufferedWriter bw = new BufferedWriter(fw);
        ) {
            bw.write("This is the first line" + lineSeparator);
            bw.write("This is the second line" + lineSeparator);
            for (int i = 0; i < 1000000; i++) {
                bw.write(i + lineSeparator);
            }
        }
        //fw.close(); with try(){} is no longer necessary

        try (
        FileReader fr = new FileReader(newFile);
        BufferedReader br = new BufferedReader(fr);
        ) {
            //System.out.println(br.readLine());
            List<String> myLines = br.lines().filter(line -> line.startsWith("This")).collect(Collectors.toList()); //toList();
            for (String s: myLines) {
                System.out.println(s);
            }
        }

        //The lines of code below is only for FilReader
//            for (int i = 0; i < 100; i++) {
//                System.out.println((char) fr.read());
//            }

        System.out.println("-*-*-*-*-*-*-*-*-*-+-*-*-+-+-");

        //java.nio
        //The code below does the same (FileWriter) as all the code above
        //In this version we don't need to close anything (.close or try , etc)
        Path currentDirectory = Paths.get(homeFolder);
        System.out.println(Files.isDirectory(currentDirectory));
        Path report  = Paths.get(homeFolder + separator + "report.txt");
        Files.writeString(report, "This is report 1" + lineSeparator);
        Files.writeString(report, "Everything is okay" + lineSeparator, StandardOpenOption.APPEND);

        List<String> reportContents = List.of("Matt", "Yoshe", "Susan", "Charles", "Mario");
        Files.write(report, reportContents, StandardOpenOption.APPEND);

        List<String> fileContents = Files.readAllLines(report);
        System.out.println(fileContents);

        Scanner scanner = new Scanner(newFile); //here we read from the 'newFile' file, we can also try with 'report'
        while(scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }

    }

}
