// Mathod 2 -----> Egar way to creat obj

import java.lang.reflect.Constructor;

public class singleTonMain {
    public static void main(String[] args) throws Exception{
        singleTon single_obj1 = singleTon.getsingle();
        
        System.out.println(single_obj1.hashCode());

        singleTon single_obj2 = singleTon.getsingle();
        

        System.out.println(single_obj2.hashCode());

        System.out.println(singleTon2.getsingle2().hashCode());

        System.out.println(singleTon2.getsingle2().hashCode());

        // Mathod to break singleton pattern by Reflation API Mathod
        Constructor<singleTon> constructor = singleTon.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        singleTon obj3 = constructor.newInstance();
        System.out.println(obj3.hashCode());

    }
}
