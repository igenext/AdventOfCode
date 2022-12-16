import java.io.*;
import java.util.*;

class part1{
    public static void main(String[] args) {
        File file =  new File("./input.txt");
        Map<String,Integer> mp = new HashMap<>();
        mp.put("A X",4);
        mp.put("A Y",8);
        mp.put("A Z",3);
        mp.put("B X",1);
        mp.put("B Y",5);
        mp.put("B Z",9);
        mp.put("C X",7);
        mp.put("C Y",2);
        mp.put("C Z",6);
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