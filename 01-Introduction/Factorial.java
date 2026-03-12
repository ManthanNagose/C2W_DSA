class MyClass {
    int num;
    MyClass(int num){
        this.num = num;
    }

    int getFactorial(){
        int count = 1;

        for(int i=1; i<=num/2; i++){
            if(num % i == 0){
                System.out.println(i + " ");
                count ++;
            }
        }

        return count;    
    }
}

public class Factorial{
    public static void main(String [] args){

        MyClass obj = new MyClass(25);
        System.out.print("Factorial of number is : " );
        System.out.println(obj.getFactorial());

    }
}