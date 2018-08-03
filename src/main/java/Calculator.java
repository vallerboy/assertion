public class Calculator {

    public int add(int a, int b){
        return  a + b;
    }

    public int remove(int a, int b){
        if(b + a  == a){
            return 1;
        }
        return a - b;
    }

    public int multiply(int a, int b){
        return a * b;
    }

    public int sub(int a, int b){
        return a / b;
    }
}
