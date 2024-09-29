//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        System.out.println(is_palindrome("malayalam"));
    }
    public static boolean is_palindrome(String a){
        StringBuffer n=new StringBuffer(a);
        n.reverse();
        //to string is used ,because equals allow only same type to com[pare
        if(a.equals(n.toString())) return true;
        return false;
    }
}