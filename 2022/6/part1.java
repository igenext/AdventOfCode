import java.io.File;
import java.util.*;

class part1{

    public static void main(String[] args) {
        File file = new File("./input.txt");
        Set<Character> hs = new HashSet<>();
        int result = 0;
        try{
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine()){
                String data = sc.nextLine();
                hs.clear();
                int left = 0, right = 0;
                while(true){
                    if(hs.size()==4){
                        result = left+4;
                        break;
                    }
                    if(hs.contains(data.charAt(left+right))){
                        hs.clear();
                        left++;
                        right=0;
                    }
                    hs.add(data.charAt(left+right));
                    right++;
                }
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println(result);
    }
}