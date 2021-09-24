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
    
    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        int count = 0;
        for(int i =0; i < n; i++) {
            for(int j=0; i<n; j++){
                if (((ar.get(i) + ar.get(j)) % 3) == 0) {
                    count += 1;
                }
            }
        }
        
        return count;
    }
    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        // Write your code here
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i = 0; i < queries.size(); i++) {
        System.out.println(i);
        int count = 0;
        for(int j = 0; j < strings.size(); j++) {
            if (strings.get(i).equals(queries.get(j))) {
                count += 1;
            }
        }
        list.add(count);
    }
        return list;
    }
    public static int lonelyinteger(List<Integer> a) {
    // Write your code here
        int x = 0;
        for (int i=0; i < a.size(); i++) {
            int count = 0;
            for (int j=0;j < a.size(); j++) {
                if (a.get(i) == a.get(j)) {
                    count++;
                }
            }
            if (count == 1) {
                x = a.get(i);
            }
        }
        return x;
    }
    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        List<Integer> list = new ArrayList<Integer>();
        for (int i=0; i < grades.size(); i++) {
            int grade = grades.get(i); 
            if (grade > 38) {
                int j = 0;
                while (j*5 < grade) {
                    j++;
                }
                if ((5*j) - grade < 3 ) {
                    grade = 5*j;
                    list.add(grade);
                }
            } else {
                list.add(grade);
            }
        }
        return list;
    }
    
    public static String[] reverseString(String s) {
        String[] splitedString = s.split("");
        String reversedString = "";
        for (int i = splitedString.length -1; i >= 0; i--) {
            reversedString += splitedString[i];
        }
        return reversedString.split("");
    }
    
    public static int multiplyRut(String[] s) {
        int x = 1;
        int sum = 0;
        for(int i = 0; i < s.length; i++) {
            x++;
            if (x == 8) {
                x = 2;
            }
            sum += Integer.parseInt(s[i]) * x;
            
        }
        return sum;
    }
    public static int modulo11(String s) {
        String rutSplited = s.split("-")[0];
        String[] reversedString = reverseString(rutSplited);
        int sum = multiplyRut(reversedString);
        return (11 - (sum % 11));
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
        } */
        /*ArrayList<String> strings = new ArrayList<String>();
        strings.add("aba");
        strings.add("baba");
        strings.add("aba");
        strings.add("xzxb");
        ArrayList<String> queries = new ArrayList<String>();
        strings.add("aba");
        strings.add("ab");
        strings.add("xzxb");
        matchingStrings(strings, queries);*/
        System.err.println(modulo11("20819526-3"));
    }
    
}
