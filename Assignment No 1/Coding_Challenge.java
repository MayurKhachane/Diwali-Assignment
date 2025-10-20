// You are given an array of strings. Your task is to determine the length of the
// longest string in the array.
public class Coding_Challenge {
    public static void main(String[] args) {
        String[] num = {"Apple", "mango", "Bananan", "Apricots"};
        int maxlength = 0;
        String lenght = "";
        for(String str : num){
            if(str.length() > maxlength){
                maxlength = str.length();
                lenght = str;
            }
        }
        System.out.println(maxlength + "str is" + lenght);
    }
    
}

