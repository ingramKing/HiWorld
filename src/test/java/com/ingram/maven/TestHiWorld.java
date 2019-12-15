package com.ingram.maven;

import org.junit.Test;
import static junit.framework.Assert.*;

/**
 * @ProjectName: HiWorld
 * @ClassName: TestHiWorld
 * @Description: TODO
 * @Author: Ingram
 * @Date: 2019-12-15-22.14.48
 * @Version: 1.0
 **/

public class TestHiWorld {
    @Test
    public void testHello(){
        HiWorld hiWorld = new HiWorld();
        String results = hiWorld.sayHello("Paladin");
        assertEquals("Hello Paladin!",results);
    }
}