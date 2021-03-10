public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal){
           if(bigCount<0 || smallCount<0 || goal<0) return false;
           int i=0;
           while(i<=bigCount && i*5<=goal){
               i++;
           }
           i--;
           if((goal-i*5)>smallCount) return false;
           return true;
    }
}
