import java.io.IOException;
import java.util.Arrays;

public class Main {
    static String str;
    public static void main(String[] args) throws IOException {

        FlowerStore flowerStore= new FlowerStore();
        Flowers[] flowers1 = flowerStore.sell(3,4,5);

        StringBuilder str1 = new StringBuilder();
        for (int i =0; i<flowers1.length; i++){
            if(i<flowers1.length-1){
                str1.append(flowers1[i].getClass().getName() + ", ");
            }
            else if(i==flowers1.length-1){
                str1.append(flowers1[i].getClass().getName());
            }
        }
        System.out.println(str1.toString());

        System.out.println(flowerStore.getPocket());

        flowerStore.sellSequence(2,1,3);
        System.out.println(flowerStore.getPocket());



        FlowerStore flowerStore2 = new FlowerStore();
        Flowers[] flowers2 = flowerStore2.sellSequence(2,3,5);

        StringBuilder str = new StringBuilder();
        for (int i =0; i<flowers2.length; i++){
            if(i<flowers2.length-1){
                str.append(flowers2[i].getClass().getName() + ", ");
            }
            else if(i==flowers2.length-1){
                str.append(flowers2[i].getClass().getName());
            }
        }
        System.out.println(str.toString());

        /*FlowersSaver flowersSaver= new FlowersSaver();
        flowersSaver.save("E:/flowers1.txt", flowers2);*/

        /*FlowersLoader flowersLoader = new FlowersLoader();
        Flowers[] flowers = flowersLoader.load("E:/flowers.txt");

        StringBuilder str2 = new StringBuilder();
        for (int i =0; i<flowers.length; i++){
            if(i<flowers.length-1){
                str2.append(flowers[i].getClass().getName() + ", ");
            }
            else if(i==flowers.length-1){
                str2.append(flowers[i].getClass().getName());
            }
        }
        System.out.println(str2.toString());*/

    }
}
