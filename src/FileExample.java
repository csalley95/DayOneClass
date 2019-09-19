import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileExample {
    public static void main (String[] args)throws IOException{
        //part 1 reading into the list
        var fileName = "students.txt";
        String all_names = Files.readString(Paths.get(fileName));//reads the entire content as a string
        String[] name_list = all_names.split("\n");//Creates a string with the name\n for each name
        //part2 - printing the list
        for (String name: name_list){
            System.out.println(name);
        }
    }
}