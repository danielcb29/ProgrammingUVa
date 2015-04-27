import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader input;
    static boolean flag = true;
    static StringTokenizer _stk;
    static String readln() throws IOException {
        String l = input.readLine();
        if(l!=null) _stk = new StringTokenizer(l," ");
        return l;
    }
    static String next() { return _stk.nextToken(); }
    static int nextInt() { return Integer.parseInt(next()); }
    

    static String solution(String secuence){
        int a = 0; 
        //boolean flag = true; 
        int size = secuence.length();
        String result = ""; 
        while (size !=0){
            if ((secuence.charAt(a) + "").equals('"'+"")){
                if (flag){   
                    flag = false;
                    result+= "``";
                    
                }else{
                    flag = true;
                    result+= "''";
                }

            }else{
                result+=secuence.charAt(a)+"";
            }
            a++;
            size--;
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        input = new BufferedReader(new InputStreamReader(System.in));
        String line = readln(); 
        while(line !=null)
        {
                System.out.println(solution(line));
                line = readln();
		}
		
    }
}

