import java.util.HashMap;
import java.util.Scanner;

public class AnagramCheck {
    public boolean check(String str1,String str2){
        HashMap<Character,Integer> hmap1=new HashMap<>();
        HashMap<Character,Integer> hmap2=new HashMap<>();
        
        for(char ch:str1.trim().toCharArray()){
            if(ch!=' '){
            hmap1.put(ch,hmap1.getOrDefault(ch,0 )+1);
        }}

        for(char ch:str2.trim().toCharArray()){
            if(ch!=' '){
            hmap2.put(ch,hmap2.getOrDefault(ch,0 )+1);
        }}

        if(hmap1.equals(hmap2)){
            return true;
        }
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        AnagramCheck an=new AnagramCheck();
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        sc.close();
        boolean b=an.check(s1,s2);
        System.out.println(b);
    }
    }