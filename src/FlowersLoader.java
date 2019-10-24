import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

abstract class FlowersLoader {
    static final String filePlace = "E:/flowers.txt";

    static Flowers[] load(String s) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(s));
        String line;
        int roses = 0;
        int tulips = 0;
        int chamomiles = 0;
        List<String> linesList = new ArrayList<String>();
        String[] lines = new String[3];

        while ((line = reader.readLine()) != null) {
            linesList.add(line);
        }
        String [] linesAsArray = linesList.toArray(new String[linesList.size()]);

        for(int i =0; i<linesAsArray.length; i++){
            if(linesAsArray[i].contains("Roses")){
                roses = Integer.parseInt(linesAsArray[i].toString().replaceAll("\\D+",""));
            }
            else if(linesAsArray[i].contains("Tulips")){
                tulips = Integer.parseInt(linesAsArray[i].toString().replaceAll("\\D+",""));
            }
            else {
                chamomiles = Integer.parseInt(linesAsArray[i].toString().replaceAll("\\D+",""));
            }
        }

        Flowers[] flowers = new Flowers[roses+tulips+chamomiles];
        for(int i=0; i<roses; i++){
            flowers[i]=new FlowersRoses();
        }
        for(int i=roses; i<roses+tulips; i++){
            flowers[i]= new FlowersTulips();
        }
        for(int i=roses+tulips; i<roses+tulips+chamomiles; i++){
            flowers[i]=new FlowersChamomiles();
        }

        return flowers;
    }
}
