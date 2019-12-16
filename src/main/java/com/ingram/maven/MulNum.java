package com.ingram.maven;

/**
 * @ProjectName: HiWorld
 * @ClassName: MulNum
 * @Description: TODO
 * @Author: Ingram
 * @Date: 2019-12-16-12.28.51
 * @Version: 1.0
 **/

public class MulNum {
    public static void main(String[] args) {
        Integer x = 97982;
        Integer y = 6872436;
        System.out.println(x+" + "+y+" = "+mulNum(x,y));
    }

    public static Integer mulNum(Integer x,Integer y){
        return x*y;
    }

}
