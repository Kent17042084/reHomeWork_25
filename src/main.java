public class main extends logic {
    public static void main(String[] args) {

        int num1 = getNum();
        int num2 = getNum();
        Arichmetic operation = getOperation();
        int calc = result(num1, num2, operation);
        System.out.println("result is " + calc);
    }
}
