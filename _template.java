import java.io.*;
import java.util.*;

public class _template {
    static BufferedReader input;
   
    static StringTokenizer _stk;
    static String readln() throws IOException {
        String l = input.readLine();
        if(l!=null) _stk = new StringTokenizer(l," ");
        return l;
    }
    static String next() { return _stk.nextToken(); }
    static int nextInt() { return Integer.parseInt(next()); }
    
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        input = new BufferedReader(new InputStreamReader(System.in));
        
        //Ejemplo
        while(readln()!=null)
        {
				System.out.println("leo");
				
				for(int i=0; i<4; i++)	System.out.println(next());
		}
		
    }
}

