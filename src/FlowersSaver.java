import java.io.*;
import java.util.ArrayList;
import java.util.List;

abstract class FlowersSaver {
    static void save(String s, Flowers[] flowers){
        String line;
        try (FileWriter fileWriter = new FileWriter(s, false)) {
            for(int i =0; i<flowers.length; i++){
                line = flowers[i].getClass().getName() + ", ";
                fileWriter.write(line);
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
