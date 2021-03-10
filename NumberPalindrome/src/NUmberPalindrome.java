public class NUmberPalindrome {
    public static boolean isPalindrome(int number){
        int newValue=0;
        int copy=number;
        while(copy!=0){
            newValue=newValue*10+copy%10;
            copy=copy/10;
        }
        if(newValue==number|| newValue*(-1)==number) return true;
        return false;
    }
}




