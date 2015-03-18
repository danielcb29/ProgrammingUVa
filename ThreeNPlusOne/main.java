import java.io.*;
import java.util.*;

class main {
    static BufferedReader input;
   
    static StringTokenizer _stk;

    static int inicial;
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
        
        if(arreglo_valores[n - inicial] != 0 ){
            return arreglo_valores[n- inicial];
        }else{
            int cont = 0;
            //int conad2 = 0;
            while (n!=1){
                //contad2++;
                cont++;
                if(n%2 == 0){
                    n = n/2;
                    if(n >= inicial && n <= posfinal){
                        if(arreglo_valores[n - inicial] != 0){
                            //System.out.println("true");
                            return cont+arreglo_valores[n- inicial];
                        }
                    }
                    
                }else{
                    n = (3*n) + 1;
                    if(n >= inicial && n <= posfinal){
                        if(arreglo_valores[n - inicial] != 0){
                            //System.out.println("true");
                            return cont+arreglo_valores[n- inicial];
                        }
                    }
                }
                

            }
            return cont+1;
        }

        
    }

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        input = new BufferedReader(new InputStreamReader(System.in));
        
        //Lectura
        while(readln()!=null)
        {
                inicial = nextInt();
                posfinal = nextInt();
                int mayor = 0;
                int valor = 0;
                arreglo_valores = new int[(posfinal-inicial)+1];
                
                for(int i = inicial ; i <= posfinal ; i++){ 
                    
                        valor = secuence(i);
                        arreglo_valores[i-inicial] = valor; 
                        mayor = higher(mayor,valor);
                    


                }
                System.out.println(inicial + " " + posfinal+ " " + mayor);

                
                
        }

        
    }
}

