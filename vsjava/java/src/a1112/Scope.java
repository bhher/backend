package a1112;

public class Scope {
    public static void main(String[] args) {
        int v1 = 15;
        int v2 = 0;
        if(v1>10){
             v2 = v1 - 10;
        }
        int v3 = v1 + v2 + 5;
    }
}
