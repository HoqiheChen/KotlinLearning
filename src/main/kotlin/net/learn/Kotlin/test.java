package net.learn.Kotlin;

/**
 * @author GeChen
 * @Description
 * @date 2019/5/9 17:21
 */
public class test {
    public static void main(String[] args){
        String name = getName();
        if(name == null)
            System.out.println("name is invalid");
        else System.out.println(name.length());
    }
    public static String getName(){
        return null;
    }
}
