package lab1.ch1;

public class Main {
    public void fizzBuzz() {
        for(int i=1; i <=100; i++){
            if(i%3 == 0){
                System.out.println("Fizz ");
            }
            else if(i%5==0){
                System.out.println("Buzz ");
            }
            else {

                System.out.println(i + " ");
            }
        }
    }
    public static void main(String[] args){
        Main x= new Main();
        x.fizzBuzz();
    }
}
