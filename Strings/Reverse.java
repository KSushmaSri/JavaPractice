public class Reverse {
    public static void main(String[] args) {
        String h="hello";
        int i;
        String rev="";
        for(i=h.length()-1;i>=0;i--){
            System.out.println(h.charAt(i));
            rev=rev+h.charAt(i);
        }
        if(rev.equals(h)){
             System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}
