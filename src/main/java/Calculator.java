public class Calculator {
    public static int Add(int ...a){
        int sum = 0;
        for(int i : a)

            sum += i ;

        return sum;
    }
    public static int Multiply(int ...j){
        int product = 1;

        for (int i : j)

            product = product * i;
        return product;
    }
    public static void main(String[] args){
        System.out.println(Add(-1,-5));
        System.out.println(Multiply(2,4,2));
    }

}
