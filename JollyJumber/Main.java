import java.io.*;
import java.util.*;
import java.lang.Math.*;

public class Main {
    static BufferedReader input;
   
    static StringTokenizer _stk;
    static String readln() throws IOException {
        String l = input.readLine();
        if(l!=null) _stk = new StringTokenizer(l," ");
        return l;
    }
    static String next() { return _stk.nextToken(); }
    static int nextInt() { return Integer.parseInt(next()); }

    static String search(boolean[] seq){
        for(int i = 0;i<seq.length;i++){
            if (!seq[i]){
                return "Not jolly";
            }
        }
        return "Jolly";
    }
    static String solution(int[] array,int n){
        int number = 0;
        boolean[] seq = new boolean[n-1];
        for(int i=1;i<array.length;i++){
            number =  Math.abs(array[i]-array[i-1]);
            if (number>n-1 || number==0){
                return "Not jolly";
            }else{

                seq[number-1] = true;

            }
        }
        return search(seq);

    }
    
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        input = new BufferedReader(new InputStreamReader(System.in));
        
        while(readln()!=null)
        {
				int len = nextInt();
                int[] array = new int[len];
				for(int i=0; i<len; i++){
                    array[i] = nextInt();
                }
                System.out.println(solution(array,len));

		}
		
    }
}

