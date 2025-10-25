package practice;

public class WordCount{
    public int wordCount(String str){
        int count = 0;
        String[] string = str.split(" ");

        for(int index = 0; index < str.length(); index++){
            if(str.charAt(index) == ' ' && str.charAt(index+1) == ' '){
                count++;
            }
        }

        return string.length-count;
    }
    // public int wordCount(String str){
    //     String string = str.trim().replaceAll(" ", "_");
    //     int count = 0;
    //     System.out.println(string);
    //     // for(int index = 0; index < string.length; index++){
    //     //     if(string[index] != " "){
    //     //         count++;
    //     //     }
    //     // }

    //     return count;
    // }

    public static void main(String[] args){
        WordCount object = new WordCount();

        System.out.print(object.wordCount(" Arjun Navnath Bhalekar    1231 45645 7897 123 "));
    }
};