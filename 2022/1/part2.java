import java.util.*;
import java.io.File;

class part2{
    public static void main(String[] args) {
        File file = new File("./input.txt");
        int sum = 0;
        List<Integer> ls = new ArrayList<>();
        try{
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine()){
                String data = sc.nextLine();
                if(data.length()==0){
                    if(ls.contains(sum)){sum=0;continue;}
                    ls.add(sum);
                    sum=0;
                }
                else sum+=Integer.parseInt(data);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        Collections.sort(ls);
        System.out.println(ls.get(ls.size()-1)+ls.get(ls.size()-2)+ls.get(ls.size()-3));
    }
}