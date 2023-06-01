package com.tranduonghoan.app;

public class RemoveDuplicateChars {
    public static void main(String[] args) {
        String str = "techmaster";
        String result = removeDuplicates(str);
        System.out.println(result);
    }

    public static String removeDuplicates(String str) {
        boolean[] seen = new boolean[256];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!seen[c]) {
                seen[c] = true;
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
