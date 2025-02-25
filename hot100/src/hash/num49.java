package hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class num49 {
    public static void main(String[] args) {
        String[] strs = new String[]{"","b",""};
        List<List<String>> lists = groupAnagrams(strs);
        System.out.println("lists = " + lists);

    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> lists = new ArrayList<>();
        String[] sortList = new String[strs.length];
        boolean[] visit = new boolean[strs.length];
        for (int i = 0; i < strs.length; i++) {
            sortList[i] = sort(strs[i]);
        }

        for (int i = 0; i < sortList.length; i++) {
            if(visit[i])
                continue;
            ArrayList<String> list = new ArrayList<>();
            list.add(strs[i]);
            for (int j = i+1; j < sortList.length; j++) {
                if(sortList[i].equals(sortList[j]) && !visit[j]){
                    list.add(strs[j]);
                    visit[j] = true;
                }
            }
            lists.add(list);
        }
        return lists;

    }

    private static String sort(String s) {
        if(s.length() == 0 )
            return s;
        char[] chars = s.toCharArray();
        //sort(chars,0,chars.length-1);
        Arrays.sort(chars);
        StringBuilder stringBuilder = new StringBuilder();
        for (char aChar : chars) {
            stringBuilder.append(aChar);
        }
        return stringBuilder.toString();
    }





    private static void sort(char[] chars,int i,int j) {
        int left = i;
        int right = j;
        if(left >= right) {
            return;
        }
        char base= chars[left];
        while(left<right){
            while(chars[right] >= base && left<right){
                right--;
            }
            if(left<right){
                chars[left] = chars[right];
                left++;
            }

            while(chars[left] <= base && left<right){
                left++;
            }
            if(left<right){
                chars[right] = chars[left];
                right--;
            }
        }
        chars[left] = base;
        sort(chars,i,left-1);
        sort(chars,left+1,j);
    }
}
