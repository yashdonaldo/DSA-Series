// fibonacchi is sum of previous 2 numbers
// 0, 1, 1, 2, 3, 5, 8, 13

public class fibonacchi {

    // fibonacchi by recursion method
    public static void recursion(int a, int b, int count) {
        if (count <= 10) {
            int newfeb = a + b;
            System.out.println(newfeb);
            a = b;
            b = newfeb;
            recursion(a, b, ++count);
        } else {
            return;
        }
    }

    public static void main(String[] args) {
        int prev1 = 0;
        int prev2 = 1;

        System.out.println(prev1);  // 0
        System.out.println(prev2);  // 1
        int newp;
        for (int i =0; i<=18; i++){
          newp = prev1 + prev2;
          System.out.println(newp);
          prev1 = prev2;
          prev2 = newp;
        }
        
        // by recurion
        System.out.println(0);
        System.out.println(1);
        recursion(0, 1, 2);

    }
// by recursion method

}
