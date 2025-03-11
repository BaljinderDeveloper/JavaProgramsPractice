import java.io.*;

public class ReadWriteTxtFile {
    public static void main(String[] args) throws IOException {
        ReadWriteTxtFile obj1 = new ReadWriteTxtFile();
        ReadWriteTxtFile obj2 = new ReadWriteTxtFile();

        obj1.readTxt();
        obj2.writeTxt();

    }
    public void readTxt() throws IOException {
        FileReader read = new FileReader("/Users/baljinder/Desktop/hello.txt");

        BufferedReader file = new BufferedReader(read);

        String line = null ;

        while( (line = file.readLine()) != null ){
            System.out.println(line);
        }
        read.close();
    }
    public void writeTxt() throws IOException {
        File file = new File("readwrite.txt");
        FileWriter fw = new FileWriter(file,true);
        PrintWriter pw = new PrintWriter(fw);

        pw.println("Line 1");
        pw.println("Line 2");
        pw.println("Line 3");

        pw.close();
    }
}
