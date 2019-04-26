import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {


    static int divisibleSumPairs(int n, int k, int[] ar) {
        int total = 0;
        int result = 1;
        int pairs = 0;
        
        for(int i= 0; i<n;i++){   
            for(int j= 1; j<n;j++){ 
            	if(i<j) {
            		total = ar[i]+ar[j];         
                
            		System.out.println("i: "+ar[i]+" j: "+ar[j]);
            		System.out.println("t:"+total);
                
            		result = total%k;                
            		System.out.println("r:"+result);
                
                	if (result==0 && total!=0){
                		System.out.println(result+" r : t "+total);            	 
                		pairs++;
                		System.out.println("p:"+pairs);
                		total = 0;
                		result = 1;
             		}
                	else {
                		total=0;
                	}
            	}
            }
        }
        return pairs;
    }

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
    	 File file = new File("C:/Users/rshet/myfile.txt");
    	 if (!file.exists()) {
    	     file.createNewFile();
    	  }
    	 FileWriter fw = new FileWriter(file, false);
    	BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(fw);

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = divisibleSumPairs(n, k, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
