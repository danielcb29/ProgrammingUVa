import java.io.*;
import java.util.*;

class Main {
    static BufferedReader input;
   
    static StringTokenizer _stk;

    static long init;
    static long posfinal;


    static String readln() throws IOException {
        String l = input.readLine();
        if(l!=null) _stk = new StringTokenizer(l," ");
        return l;
    }
    static String next() { return _stk.nextToken(); }
    static long nextInt() { return Long.parseLong(next()); }
    
    static long higher(long hig, long value) {
        if (value > hig){
            return value;
        }else{
            return hig;
        }
    }

    static long secuence(long n){
        

            long cont = 0;

            while (n!=1){

                cont++;
                if(n%2 == 0){
                    n = n/2;

                    
                }else{
                     n = (3*n) + 1;

                }                

            }
            return cont+1;

        
    }


    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        input = new BufferedReader(new InputStreamReader(System.in));
        
        //Lectura




        while(readln()!=null)
        {
                init = nextInt();
                posfinal = nextInt();
                long heigh = 0;
                long value = 0;
                long inicial = init;
                long finali = posfinal;
                
                if(finali<inicial){
					long aux = inicial;
					inicial = finali;
					finali = aux;
				}
                
                for(long i = inicial ; i <= finali ; i++){ 
                    
                        value = secuence(i);
                        heigh = higher(heigh,value);  

                }

                System.out.println(init + " " + posfinal+ " " + heigh);                
                
        }
        
    }
}

