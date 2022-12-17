import java.io.File;
import java.util.Scanner;

public class part1 {
    
    public static void main(String[] args) {
        File file = new File("./input.txt");
        int result = 0;
        try{
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine()){
                String[] data = sc.nextLine().split(",");
                int val[] = new int[4];
                for(int j=0,i=0;j<4 && i<2;i++,j+=2){
                    String[] str = data[i].split("-");
                    val[j] = Integer.parseInt(str[0]);
                    val[j+1] = Integer.parseInt(str[1]);
                }
                if((val[2]<=val[0] && val[3]>=val[1]) || (val[2]>=val[0] && val[3]<=val[1])) result+=1;
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println(result);
    }

}
