package com.lesson1.lesson13.append;

public class Append {
    public static void main(String args[]) {
        String s;
        int a = 3;
        int b = 56;
        int c = 59;
        int d = -53;
        int e = 168;
        StringBuilder sb = new StringBuilder(40);

        s = sb.append(a).append("+").append(b).append("=").append(c).append("\n").append(a).append("-").append(b).append("=").append(d).append("\n").append(a).append("*").append(b).append("=").append(e).toString();
        sb.deleteCharAt(4);
        sb.insert(4, "равно");
        sb.replace(16,17,"равно");
        sb.replace(28,29, "равно");
        System.out.println(sb);
    }
}