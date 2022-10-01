package Serialization;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
                               // try-catch with resources (autoclose resources)
        try (FileInputStream fileInputStream = new FileInputStream("src/serialization/index.txt")) {
            int a;
            while ((a = fileInputStream.read()) != -1) {
                System.out.println((char) a);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


//        FileOutputStream fileOutputStream = new FileOutputStream("src/serialization/index.txt"); // old write file
//        fileOutputStream.write("\n new line here".getBytes());


//        FileReader fileReader = new FileReader("src/serialization/index.txt");
//        char[] ints = new char[1000];
//       System.out.println(ints);
//        fileReader.read(ints);

//        File file = new File("src/serialization/index.txt");
//        PrintWriter printWriter = new PrintWriter(file);
//        printWriter.write("print writer is here");
//        printWriter.flush();

//        BufferedReader bufferedReader = new BufferedReader(fileReader);  // line active 19-20
//        bufferedReader.lines().forEach(System.out::println);              // bufer read all file
    }


}
