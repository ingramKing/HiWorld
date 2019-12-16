package com.ingram.maven;

/**
 * @ProjectName: HiWorld
 * @ClassName: AddNum
 * @Description: TODO
 * @Author: Ingram
 * @Date: 2019-12-16-09.56.49
 * @Version: 1.0
 **/

public class AddNum {
    public static void main(String[] args) {
        Integer x = 97982;
        Integer y = 6872436;
        System.out.println(x+" + "+y+" = "+sumNum(x,y));
    }

    public static Integer sumNum(Integer x,Integer y){
        return x+y;
    }
}
