package Classwork;

public class CycleSdig {
    public static void main(String[] args) {
        String s = "aabaa";
        String T = "aaaab";
        System.out.println();
    }
    public static int find(String s, String t) {
        String result = t + t;
        int index = result.indexOf(s);
        return (index != -1) ? index : -1;
    }
}
