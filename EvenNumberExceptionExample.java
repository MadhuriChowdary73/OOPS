public class EvenNumberExceptionExample {
    public static void CheckNum(int num) throws Exception{
        
        if (num % 2 == 0) {
            throw new Exception("Even number not allowed: " + num);
    }
        

 else { 
    System.out.println("valid OddNumber: " + num); 
 }
}


public static void main(String[] args) {
    System.out.println("Name:G.MadhuriChowdary");

    try {
       
       CheckNum(4);
    } 
    catch (Exception e) {
        System.out.println("ExceptionCaught:"+e.getMessage());

    }
}
}
