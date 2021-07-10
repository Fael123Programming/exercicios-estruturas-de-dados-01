package _recursivity;
import java.util.Date;
public class Time {
    private static long timeWhenStarted,timeJustPassed;
    private static int hours,mins,secs,ms;
    private static boolean canUseFinishCounting=false,canUseGetTime=false;
    
    private Time(){}//It can't have an instance.
    
    public static void startCounting(){
        Date date=new Date();
        Time.timeWhenStarted=date.getTime();
        Time.canUseFinishCounting=true;
    }
    
    public static void finishCounting(){
        if(!Time.canUseFinishCounting) return;//It needs that you have already called startCounting().
        Date date=new Date();
        Time.timeJustPassed=date.getTime()-Time.timeWhenStarted;
        Time.hours=(int) Time.timeJustPassed/3600000;//One hour has 3,600,00 ms.
        Time.mins=(int) Time.timeJustPassed%3600000/60000;//One minute has 60,000 ms.
        Time.secs=(int) Time.timeJustPassed%3600000%60000/1000;//One second has 1,000 ms.
        Time.ms=(int) Time.timeJustPassed%3600000%60000%1000;//Ms is itself.
        Time.canUseFinishCounting=false;
        Time.canUseGetTime=true;
    }
    
    public static String getTime(){
        if(!Time.canUseGetTime) return null;//It needs that you have already called both methods above.
        Time.canUseGetTime=false;
        return String.format("%d:%d:%d:%d",Time.hours,Time.mins,Time.secs,Time.ms);
    }
}
