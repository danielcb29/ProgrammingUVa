import java.io.*;
import java.util.*;

public class ThreeNPlusOne {
    static BufferedReader input;
   
    static StringTokenizer _stk;
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
            if(n%2 == 0){
                n = n/2;
            }else{
                n = (3*n) + 1;
            }
            cont++;

        }
        return cont+1;
    }

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        input = new BufferedReader(new InputStreamReader(System.in));
        
        //Lectura
        while(readln()!=null)
        {
				int inicial = nextInt();
                int posfinal = nextInt();
                int mayor = 0;
                int valor = 0;
                int arreglo_valores[] = new int[(posfinal-inicial)+1];
                for(int i = inicial ; i <= posfinal ; i++){ 
                    if (arreglo_valores[i-inicial] != 0){
                        mayor = higher(mayor,arreglo_valores[i-inicial]);


                    }else{
                        valor = secuence(i);
                        arreglo_valores[i-inicial ] = valor; 
                        mayor = higher(mayor,valor);
                    }


                }
                System.out.println(inicial + " " + posfinal+ " " + mayor);

				
				
		}

		
    }
}

