package liu.aopforargs;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:/liu/aopforargs/spring-aopargs.xml"})
public class Test_aop_args {
 
    @Autowired
    CompactDisc cd;
 
    @Autowired
    TrackCounter trackCounter;
 
    @Test
    public void test(){
        cd.playTrack("Sgt. Pepper's Lonely Hearts Club Band");
        cd.playTrack("With a Little Help from My Friends");
        cd.playTrack("Lucy in the Sky with Diamonds");
        cd.playTrack("Sgt. Pepper's Lonely Hearts Club Band");
        cd.playTrack("With a Little Help from My Friends");
        cd.playTrack("Sgt. Pepper's Lonely Hearts Club Band");
 
        System.out.println(trackCounter.getPlayCount("Sgt. Pepper's Lonely Hearts Club Band"));
        System.out.println(trackCounter.getPlayCount("With a Little Help from My Friends"));
        System.out.println(trackCounter.getPlayCount("Lucy in the Sky with Diamonds"));
        System.out.println(trackCounter.getPlayCount("Getting Better"));
    }
}
 
