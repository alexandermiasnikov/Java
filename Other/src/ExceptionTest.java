public class ExceptionTest {
    public static void main(String[] args) {
        calc(5, 0);
    }

    public static int calc(int a, int b) throws ArithmeticException{
        if (b == 0){
            throw new ArithmeticException("ШО ТВОРИШЬ?!");
        }
        return a/b;
    }
}
