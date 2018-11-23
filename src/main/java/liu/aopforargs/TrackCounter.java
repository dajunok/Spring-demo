package liu.aopforargs;

import java.util.HashMap;
import java.util.Map;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 切面类的任务：记录每个磁道被播放的次数
 * Created by Administrator on 2017/12/1.
 */
@Component("trackCounter")
@Aspect
public class TrackCounter {
 
    private Map<String, Integer> trackCounts = new HashMap<String, Integer>();
 
    @Pointcut("execution(* liu.aopforargs.BlankDisc.playTrack(String)) && args(track)")
    public void trackPlayed(String track) {
    }
 
    //在播放前，为该磁道计数
    @Before("trackPlayed(track)")
    public void countTrack(String track) {
        int currentCount = getPlayCount(track);
        trackCounts.put(track, currentCount + 1);
    }
 
    public int getPlayCount(String track) {
        return trackCounts.containsKey(track) ? trackCounts.get(track) : 0;
    }
}
