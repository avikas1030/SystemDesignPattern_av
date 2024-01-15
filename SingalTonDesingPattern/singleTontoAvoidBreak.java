// Mathod   ----->  to avoid create new object using enum class

import java.lang.reflect.Constructor;

public enum singleTontoAvoidBreak {
    
    INSTANCE;
    public static void main(String[] args) throws Exception{
        singleTontoAvoidBreak s1 = singleTontoAvoidBreak.INSTANCE;
        System.out.println(s1.hashCode());

        // now try to create new instence

        Constructor<singleTontoAvoidBreak> constructor = singleTontoAvoidBreak.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        singleTontoAvoidBreak s2 = constructor.newInstance();
        System.out.println(s2.hashCode());
    }
}
