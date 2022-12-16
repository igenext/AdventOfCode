import java.util.Scanner;
import java.io.File;

class part1{
    public static void main(String[] args) {
        File file = new File("./input.txt");
        int max = 0,sum=0;
        try{
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine()){
                String data = sc.nextLine();
                if(data.length()==0){
                    max = Math.max(max, sum);
                    sum=0;
                }
                else sum+=Integer.parseInt(data);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println(max);
    }
}