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

public class Solution {

    // Complete the birthday function below.
    static int birthday(List<Integer> s, int d, int m) {
    	int n = s.size();
        int result = 0;
        int total = 0;

        for(int i= 0; i<n;i++){
        	//System.out.println("I: "+s.get(i));      
             for(int j= 0; j<m;j++){ 
            	 if(i+j<n)
                 total += s.get(i+j);
                  //System.out.println("j-loop: "+j);
                  //System.out.println("incrementingTotal: "+total);
                if (j==m-1){
                    if(total==d){
                        result++;
                        //System.out.println("total matched: "+total);
                        //System.out.println("clearing total: "+total);
                        total=0;
                    }
                    else{
                    total=0;
                    //System.out.println("clearing total: "+total);
                    }
                }
                
             }
               
        }
        //System.out.println(result);
        return result;
    }

    public static void main(String[] args) throws IOException {
    	 File file = new File("C:/Users/rshet/myfile.txt");
    	 if (!file.exists()) {
    	     file.createNewFile();
    	  }
    	 FileWriter fw = new FileWriter(file, false);
    	BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(fw);

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> s = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        String[] dm = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int d = Integer.parseInt(dm[0]);

        int m = Integer.parseInt(dm[1]);

        int result = birthday(s, d, m);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
