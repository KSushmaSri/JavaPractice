public class LetterCount {
    public static void main(String[] args) {
        int count=0;
        String b="banana";
        for(int i=0;i<b.length();i++){
            if(b.charAt(i)=='n'){
                count++;
            }
        }
        System.out.println(count);
    }
}
