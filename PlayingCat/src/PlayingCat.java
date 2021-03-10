public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature){
        if(summer==true && (25<= temperature && temperature<=45)) return true;
        else if(summer==false && (25<= temperature && temperature<=35)) return true;
        return false;
    }
}
