import java.util.Scanner;

public class exp1part1 {
    public static boolean isvowel(char ch){
        ch = Character.toLowerCase(ch); 
        return ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u';

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
        System.out.println("Enter the string: ");
        String str = in.nextLine();  
        int n=str.length();
        int vowel=0,consonant=0,special=0,digits=0;
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            if(ch>='A' && ch<='Z' || ch>='a' && ch<='z'){
                if(isvowel(ch)){
                    vowel++;
                }
                else{
                    consonant++;
                }
            }

            else if(ch>='0' && ch<='9'){
                digits++;
            }
            else{
                special++;
            }
        }
        System.out.println("Vowels: "+vowel+" Consonants: "+consonant+" Digits: "+digits+ " Special: "+special );
    }
}
