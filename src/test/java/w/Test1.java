package w;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class Test1 {

    @org.junit.jupiter.api.Test
    public void passTest(){

    }

    @org.junit.jupiter.api.Test
    public void failTest(){
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assertions.assertEquals(0,1);
    }

    @org.junit.jupiter.api.Test
    public void randomTest(){
        //System.out.println(java.time.LocalTime.now().getSecond());
        Integer num = java.time.LocalTime.now().getSecond() % 2;
        Assertions.assertEquals(0,num);
    }
}
