// all passed

    static String timeConversion(String s) {
        boolean ampm = (s.endsWith("AM"));
        int hour = Integer.parseInt(s.substring(0, 2));

        // am case
        // 12am -> 00
        if(ampm){

            if(hour == 12){
                return "00" + s.substring(2, 8);
            }
            else
                return (s.substring(0, 8));  
        } 
        // pm case
        // 12 noon time
        else{
            if(hour != 12)
                hour += 12;
            return (hour + s.substring(2, 8));
        }
        



import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

// 4/10 test cases failed :(
public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {

        String[] time = s.split(":");
        
        String hours = time[0];
        String minutes = time[1];
        String seconds = time[2].substring(0,2);
        String dayEve = time[2].substring(2,4);
        if(dayEve.equals("AM")){
            return hours.equals("12")?"00":hours +":"+minutes+":"+seconds;
        }else{
            return hours.equals("12")?hours:(Integer.parseInt(hours))+12+":"+minutes+":"+seconds;
        }
        
         
         

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(); //07:05:45PM
        DateFormat inFormat = new SimpleDateFormat( "hh:mm:ssaa");
        DateFormat outFormat = new SimpleDateFormat( "HH:mm:ss");

        Date date = null;
        try {
            date = inFormat.parse(s); 
        }catch (ParseException e ){
            e.printStackTrace();
        }
        if( date != null ){
            String myDate = outFormat.format(date);
            System.out.println(myDate);
        }
    }
