import java.io.*;
import java.util.*;

class ThreeNPlusOne {
    static BufferedReader input;
   
    static StringTokenizer _stk;

    static int init;
    static int posfinal;
    static int arreglo_valores[];
    //static Vector<Integer> values;

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
        
        /*if(arreglo_valores[n - inicial] != 0 ){
            return arreglo_valores[n- inicial];
        }else{*/
            //System.out.println("antes de cont");
            int cont = 0;
            //int conad2 = 0;
            while (n!=1){
                //contad2++;
                //System.out.println("adentro del while");
                cont++;
                if(n%2 == 0){
                    n = n/2;
                    //n = (n-1) / 3;
                    /*if(n >= inicial && n <= posfinal){
                        if(arreglo_valores[n - inicial] != 0){
                            //System.out.println("Entro, cual fue?: "+(n-inicial)+" y cual es el valor?: "+arreglo_valores[n-inicial]);
                            return cont+arreglo_valores[n- inicial];
                        }
                    }*/
                    
                }else{
                     n = (3*n) + 1;
                    //n = 2 * n;
                    /*if(n >= inicial && n <= posfinal){
                        if(arreglo_valores[n - inicial] != 0){
                            //System.out.println("Entro, cual fue?: "+(n-inicial)+" y cual es el valor?: "+arreglo_valores[n-inicial]);
                            return cont+arreglo_valores[n- inicial];
                        }
                    }*/
                }
                //System.out.println("afuera del if del while");
                

            }
            //System.out.println("afuera del while");
            return cont+1;
        //}

        
    }

    /*static int secuence(int n){
        try{
            int val = values.get(n);
            return val; 
        }catch(Exception e){
            if(n==1){
                return values.get(0);
            }else{
                int val = 0;
                if (n%2 ==0){
                    val = (1+secuence(n/2));    
                    values.add(n,val);
                    return values.get(n);
                }else{
                    val = (1+secuence((3*n)+1));
                    values.add(n,val);
                    return values.get(n);
                }
            }

        }
            
    }*/

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        input = new BufferedReader(new InputStreamReader(System.in));
        
        //Lectura
        while(readln()!=null)
        {
				init = nextInt();
                posfinal = nextInt();
                int heigh = 0;
                int value = 0;
                //arreglo_valores = new int[(posfinal-inicial)+1];
                //values=new Vector<Integer>();
                //values.add(0,0);
                //values.add(1,0);
                for(int i = init ; i <= posfinal ; i++){ 
                    
                        value = secuence(i);
                        //arreglo_valores[i-inicial] = valor; 
                        //values.add(i,value);
                        heigh = higher(heigh,value);
                        //System.out.println("POR CUAL VAMOS??: "+i);
                    


                }
                System.out.println(init + " " + posfinal+ " " + heigh);

				
				
		}
        

        //values.add(49,90);
        //System.out.println("hola");

		
    }
}

