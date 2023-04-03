package com.Laliev.javacore.mod1;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;

public class second {
    public static void main(String[] args) {
        String seq1 = "[({})]" , seq2 = "[{(})";
        checkSeq(seq1);
        checkSeq(seq2);
    }

    public static void checkSeq(String s){
        Map<Character, Character> map = new HashMap<Character, Character>();
        map.put('[',']');
        map.put('{','}');
        map.put('(',')');
        ArrayDeque<Character> deq = new ArrayDeque<Character>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '[' || s.charAt(i) == '{' || s.charAt(i) == '(')
                deq.push(s.charAt(i));
            else{
                try{
                    char key = deq.pop();
                    if (s.charAt(i) != map.get(key)){
                        System.out.println(s+" - Неправильная последовательность");
                        return;
                    }
                }
                catch (Exception e){
                    System.out.println(s+" - Неправильная последовательность");
                    return;
                }
            }
        }
        if(deq.isEmpty())
            System.out.println(s+" - Правильная последовательность");
        else System.out.println(s+" - Неправильная последовательность");
    }
}
