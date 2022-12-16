import java.io.*;
import java.util.*;

class part2{
    public static void main(String[] args) {
        File file =  new File("./input.txt");
        Map<String,Integer> mp = new HashMap<>();
        mp.put("A X",3);
        mp.put("A Y",4);
        mp.put("A Z",8);
        mp.put("B X",1);
        mp.put("B Y",5);
        mp.put("B Z",9);
        mp.put("C X",2);
        mp.put("C Y",6);
        mp.put("C Z",7);
        int result = 0;
        try{
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine()){
                String data= sc.nextLine();
                result+=mp.get(data);
                
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println(result);
    }
}
