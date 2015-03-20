import java.io.*;
import java.util.*;

class Main {
    static BufferedReader input;
   
    static StringTokenizer _stk;

    static int init;
    static int posfinal;
    static int arreglo_valores[];


    static String readln() throws IOException {
        String l = input.readLine();
        if(l!=null) _stk = new StringTokenizer(l," ");
        return l;
    }
    static String next() { return _stk.nextToken(); }
    static int nextInt() { return Integer.parseInt(next()); }
    
    static int higher(int hig, int value) {
        if (value > hig){
            return value;
        }else{
            return hig;
        }
    }

    static int secuence(int n){
        

            int cont = 0;

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
        Vector<String> salida = new Vector<String>();

        while(readln()!=null)
        {
                init = nextInt();
                posfinal = nextInt();
                int heigh = 0;
                int value = 0;
                for(int i = init ; i <= posfinal ; i++){ 
                    
                        value = secuence(i);
                        heigh = higher(heigh,value);

                    


                }

                salida.add(init + " " + posfinal+ " " + heigh);



                
                
        }

        for(int j = 0 ; j < salida.size() - 1; j ++){
            System.out.println(salida.get(j));
        }
        System.out.print(salida.get(salida.size() -1 ));


        
    }
}

