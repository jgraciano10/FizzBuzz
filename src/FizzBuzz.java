public class FizzBuzz {
    private int numero;

    public FizzBuzz(int numero) {
        this.numero = numero;
    }

    public static FizzBuzz fizzBuzz(int number){
        FizzBuzz getFizzBuzz = new FizzBuzz(number);
        for(int i = 1; i<=number; i++){
            if(i%3==0 && i%5==0){
                if(i%10==0){
                    System.out.println("FizzBuzz\t");
                }else{
                    System.out.print("FizzBuzz    \t");
                }

            }else if(i%3==0){
                if(i%10==0){
                    System.out.println("Fizz\t");
                }else{
                    System.out.print("Fizz        \t");
                }
            }else if(i%5==0) {
                if (i % 10 == 0) {
                    System.out.println("Buzz\t");
                } else {
                    System.out.print("Buzz        \t");
                }
            }else{
                if (i % 10 == 0) {
                    System.out.println(i);
                } else {
                    System.out.print(i+"           \t");
                }
            }
        }
        return getFizzBuzz;
    }
}
