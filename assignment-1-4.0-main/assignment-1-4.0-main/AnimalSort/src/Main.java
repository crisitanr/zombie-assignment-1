import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) throws IOException {
        List<String> list = new ArrayList<>();
        List<Animal> animals = new ArrayList<>();
        File filename = new File("D:\\java code\\java projects\\Animal.txt");
        Scanner scan = new Scanner(filename.toPath());
        while (scan.hasNextLine()) {
            String[] fields = scan.nextLine().split(",");
            switch (fields[0]){
                case "A" -> animals.add(new Animal(fields[1], fields[2]));
                case "B" -> animals.add(new cat(fields[1], fields[2]));
                case "C" -> animals.add(new dog(fields[1], fields[2]));
            }
        }
        scan.close();
        animals.forEach(System.out::println);


    }

    }

