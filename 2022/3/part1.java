import java.util.*;
import java.io.File;

class part1{
    public static void main(String[] args) {
        File file = new File("./input.txt");
        int sum = 0;
        try{
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine()){
                String data = sc.nextLine();
                int mid = data.length()/2;
                Set<Character> hs = new HashSet<>();
                for(int i=0;i<mid;i++){
                    hs.add(data.charAt(i));
                }
                for(int k=mid;k<data.length();k++){
                    if(hs.contains(data.charAt(k))){
                        if(data.charAt(k)>='a' && data.charAt(k)<='z') sum+=(int)(data.charAt(k)-'a')+1;
                        else sum+=(int)(data.charAt(k)-'A')+27;
                        break;
                    }
                }

            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println(sum);
        
    }

}