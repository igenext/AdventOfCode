import java.util.*;
import java.io.File;

class part2{
    public static void main(String[] args) {
        File file = new File("./input.txt");
        int sum = 0;
        try{
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine()){
                Set<Character> hs = new HashSet<>();
                Set<Character> hs1 = new HashSet<>();
                String data1 = sc.nextLine();
                char a = 'a';
                for(char c : sc.nextLine().toCharArray()) hs.add(c);
                for(char e: sc.nextLine().toCharArray()) hs1.add(e);
                for(char b: data1.toCharArray()){
                    if(hs.contains(b)&& hs1.contains(b)){
                        a = b;
                        break;
                    }
                }
                if(a>='a' && a<='z') sum+=(int)(a-'a')+1;
                else sum+=(int)(a-'A')+27;
            }

        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println(sum);
        
    }

}
