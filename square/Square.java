import java.lang.Math;
public class Square {    
    public static boolean isSquare(int n) {  
        double sqrt = Math.sqrt(n);
        if (sqrt == (int)sqrt){
          return true; 
        }else{
          return false;
        }
        
    }
}