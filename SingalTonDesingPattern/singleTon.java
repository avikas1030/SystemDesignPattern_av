// Mathod 1  ----->  Lazy way to creat object 
public class singleTon {
    private static singleTon single;  // declear the variable 

    private singleTon(){    

    } 

    public static singleTon getsingle(){
        if(single == null){
            synchronized(singleTon.class){ // multi-thread problem, use synchronised block mathod
            if(single == null){

            single = new singleTon();
        }

        }
        }
        
        
        return single;
    } 
}
