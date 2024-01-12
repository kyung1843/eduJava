package org.joonzis.ex;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class Ex06_Arrays_stream {
    public static void main(String[] args) {
        int[] arr = {1,4,6,8,9};
        
        double avg1 = Arrays.stream(arr).average().orElse(0);
        System.out.println(avg1);
        
        double avg2 = Arrays.stream(arr).average().getAsDouble();
        System.out.println(avg2);

        int sum = Arrays.stream(arr).sum();
        System.out.println(sum);

        String[] s1 = {"a", "b", "c"};
        String[] s2 = {"com", "b", "d", "p", "c"};
        int cnt1 = 0;
        int cnt2 = 0;
        
        Set<String> set = new HashSet<>(Arrays.asList(s1));
        cnt1 = (int)Arrays.stream(s2).filter(set::contains).count();
        System.out.println(cnt1);

        cnt2 = (int)Arrays.stream(s1).filter(str1 -> Arrays.asList(s2).contains(str1)).count();
        System.out.println(cnt2);

        String[] strlist = {"We", "are", "the", "world!"};
        int[] arr1 = Arrays.stream(strlist).mapToInt(String::length).toArray();
        for (int i : arr1) {
            System.out.println(i);
        }




    }
}
