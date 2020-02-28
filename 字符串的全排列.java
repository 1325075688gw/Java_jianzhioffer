package com.biggw.niuke;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

//题目描述:输入一个字符串,按字典序打印出该字符串中字符的所有排列。例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
public class 字符串的全排列 {

    public static void main(String[] args) {
        字符串的全排列 obj = new 字符串的全排列();
        ArrayList<String> stringArrayList = obj.Permutation("aba");
        System.out.println(stringArrayList);
    }

    public ArrayList<String> Permutation(String str) {
        ArrayList<String> strings = new ArrayList<>();
        if (str==null || str.length()==0){
            return strings;
        }

        HashSet<String> hashSet = new HashSet<>();
        int index = 0;
        func(str.toCharArray(), index, hashSet);
        for (String s : hashSet) {
            strings.add(s);
        }
        Collections.sort(strings);
        return strings;
    }

    public void func(char[] chars, int index, Set hashSet) {
        if (index == chars.length) {
            hashSet.add(new String(chars));
        }
        for (int i = index; i < chars.length; i++) {
            char ch;
            ch = chars[index];
            chars[index] = chars[i];
            chars[i] = ch;
            func(chars, index+1, hashSet);
            ch = chars[index];
            chars[index] = chars[i];
            chars[i] = ch;
        }
    }
}
