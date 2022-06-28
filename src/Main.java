public class Main {
    public static void main(String[] args) {
        int i;
        for (i = 1; i <= 30; i++) {
            System.out.println("  ");
            if (i % 3 == 0)
                System.out.println("ping");
            else if (i % 5 == 0)
                System.out.println("pong");
            if ((i % 3 == 0)&& (i % 5 == 0)){
                System.out.println("ping pong");
            }
        }

        int a = 0;
        int b = 1;
        int c ;
        System.out.print(a+ " ");
        for(int t = 3; t <= 11; t++){
            c=a+b;
            System.out.print(b+" ");
            a=b;
            b=c;
        }
        System.out.println();
    }}

