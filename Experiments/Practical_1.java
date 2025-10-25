package practical;

public class Practical_1{
    static StringBuffer sf = null;

    public static int findNumber(String str){
        StringBuffer sf = new StringBuffer();
        byte flag = 0;
        for(int i = 0; i < str.length(); i++){
            while(str.charAt(i)=='0' && flag == 0){
                i++;
                flag = 1;
            }
            
            if((str.charAt(i) > 46 && str.charAt(i) < 58) || (str.charAt(0) == '-') && i == 0){
                sf.append(str.charAt(i));
            }
            else{
                break;
            }
        }
        int value = Integer.parseInt(sf.toString());
        return value;
    }

    public static void main(String[] args){
        int n = findNumber("-91283472332");
        System.out.println(n);
    }
};