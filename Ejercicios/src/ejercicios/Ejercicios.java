/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import cl.ejercicio.Ejercicio;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 *
 * @author cvveg
 */
public class Ejercicios {

    /**
     * @param args the command line arguments
     */
    
    public static int factorial(int n) {
        if (n == 1) return 1;
        return n * factorial(n-1);
    }
    public static String palindromo(String str) {
        return "";
    }
    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
        long max = 0;
        long min = Long.MAX_VALUE;
        long[] array = new long[5];
        List<Long> list = new ArrayList<Long>();
        for (int i = 0; i < 5; i++) {
            array[i] = arr.get(i);
        }
        for (int i = 0; i < array.length; i++) {
            long suma=0;
            for (int j = 0; j < array.length; j++) {
                if (i != j) {   
                    suma += array[j];
                }
            }
            list.add(suma);
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
            if (list.get(i) < min) {
                min = list.get(i);
            }
        }
        System.out.println(min + " " + max);
    }
    public static String timeConversion(String s) {
        String AMPM = s.substring(s.length() -2, s.length());
        s = s.replaceAll("AM|PM", "");
        System.out.println(s);
        String[] time = s.split(":", 0);
        int hour = Integer.parseInt(time[0]);
        int minutes = Integer.parseInt(time[1]);
        int seconds = Integer.parseInt(time[2]);
        if (AMPM.equals("AM") && hour == 12 && (minutes >= 0 || minutes <= 59)) {
            hour -= 12;
        } else if ((AMPM.equals("AM") && (hour >= 1 || hour < 12) || (AMPM.equals("PM") && hour == 12 && (minutes >=0 || minutes <= 59)))) {
            hour = hour;
        } else if (AMPM.equals("PM") &&(hour >= 1 || hour <=12)) {
            hour += 12;
        }
        String newDate = String.format("%02d" ,hour) + ":" + String.format("%02d" ,minutes) + ":" + String.format("%02d" ,seconds); 
        return newDate;
    }
    public static List<Integer> breakingRecords(List<Integer> scores) {
    // Write your code here
       long minScore = scores.get(0);
        long maxScore = scores.get(0);
        int minCount = 0, maxCount = 0;
        for (int i = 0; i < scores.size(); i++) {
            if (scores.get(i) < minScore) {
                minScore = scores.get(i);
                minCount += 1;
                System.out.println("min " + minScore);
            } else if (scores.get(i) > maxScore) {
                maxScore = scores.get(i);
                maxCount += 1;
                System.out.println("max " + maxScore);
            }
            
        }
        List<Integer> result = new ArrayList<Integer>();
        result.add(maxCount);
        result.add(minCount);
        return result;
    }
    public static void camelCase(String s) {
        String[] splitString = s.split(";");
        String fString = splitString[0];
        String sString = splitString[1];
        String tString = splitString[2];
        String newString = "";
        if(fString.equals("S")) {
            if (sString.equals("M")) {
                tString = tString.replace("()", "");
                String[] splitedString = tString.split("(?=[A-Z])");
                for (int i = 0; i < splitedString.length; i++) {
                    newString += splitedString[i];
                    if (i < splitString.length - 1) {
                        newString += " ";
                    }
                }
                System.out.println(newString.toLowerCase());
            } else if (sString.equals("C") || sString.equals("V")) {
                String[] splitedString = tString.split("(?=[A-Z])");
                for (int i = 0; i < splitedString.length; i++) {
                    newString += splitedString[i];
                    if (i < splitString.length - 1) {
                        newString += " ";
                    }
                }
                System.out.println(newString.toLowerCase());
            }
        } else if (fString.equals("C")) {
            if (sString.equals("M")) {
                String[] splitedString = tString.split(" ");
                newString += splitedString[0];
                for (int i = 1; i < splitedString.length; i++) {
                    
                    newString += splitedString[i].substring(0,1).toUpperCase();
                    newString += splitedString[i].substring(1);
                }
                newString += "()";
                System.out.println(newString);
            } else if (sString.equals("V")) {
                String[] splitedString = tString.split(" ");
                newString += splitedString[0];
                for (int i = 1; i < splitedString.length; i++) {
                    
                    newString += splitedString[i].substring(0,1).toUpperCase();
                    newString += splitedString[i].substring(1);
                }
                System.out.println(newString);
            }
             else if (sString.equals("C")) {
                String[] splitedString = tString.split(" ");
                
                for (int i = 0; i < splitedString.length; i++) {
                    
                    newString += splitedString[i].substring(0,1).toUpperCase();
                    newString += splitedString[i].substring(1);
                }
                System.out.println(newString);
            }
        }
    }
    public static void main(String[] args) throws IOException{
        // System.out.println(factorial(6));
        /*List<Integer> arr = new ArrayList<>();
        arr.add(256741038);
        arr.add(623958417);
        arr.add(467905213);
        arr.add(714532089);
        arr.add(938071625);
        miniMaxSum(arr);
C;V;can of coke
S;M;sweatTea()
S;V;epsonPrinter
C;M;santa claus
C;C;mirror
        */
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<String>();
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        String line;
        int i = 0;
        while ((line = stdin.readLine()) != null && line.length() != 0) {
            String[] input = line.split(" ");
            list.add(input[0]);
            i++;
        }
        System.err.println(list.size());
        for (int j =0; i< list.size(); j++) {
            System.out.println(list.get(j));
            camelCase(list.get(j));
        }
    }
    
}
