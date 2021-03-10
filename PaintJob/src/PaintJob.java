public class PaintJob {
    public static int getBucketCount(double width, double height,double areaPerBucket, int extraBuckets){
        if(width<=0||height<=0||areaPerBucket<=0||extraBuckets<0) return -1;
        double areaOfTheWall=width*height;
        double areaCovered=areaPerBucket*((double) extraBuckets);
        double areaStillUncovered=areaOfTheWall-areaCovered;
        double bucketsNeeded=Math.ceil(areaStillUncovered/areaPerBucket);
        return (int)bucketsNeeded;
    }

    public static int getBucketCount(double width, double height,double areaPerBucket){
        if(width<=0||height<=0||areaPerBucket<=0) return -1;
        double areaOfTheWall=width*height;
        double bucketsNeeded=Math.ceil(areaOfTheWall/areaPerBucket);
        return (int)bucketsNeeded;
    }

    public static int getBucketCount(double area,double areaPerBucket){
        if(area<=0||areaPerBucket<=0) return -1;
        double bucketsNeeded=Math.ceil(area/areaPerBucket);
        return (int)bucketsNeeded;
    }
}
