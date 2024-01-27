public class singleTon2 {  // Egar way to create object
    private static singleTon2 single2 = new singleTon2();
    private singleTon2(){
        
    }
    public static singleTon2 getsingle2(){
        return single2;
    }
}
