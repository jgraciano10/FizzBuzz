public class FizzBuzz {
    int numero;

    public FizzBuzz(int numero) {
        this.numero = numero;
    }

    public static FizzBuzz fizzBuzz(int number){
        FizzBuzz getFizzBuzz = new FizzBuzz(number);
        for(int i = 1; i<=number; i++){
            if(i%3==0 && i%5==0){
                if(i%10==0){
                    System.out.println(" FizzBuzz");
                }else{
                    System.out.print(" FizzBuzz");
                }

            }else if(i%3==0){
                if(i%10==0){
                    System.out.println(" Fizz");
                }else{
                    System.out.print(" Fizz");
                }
            }else if(i%5==0) {
                if (i % 10 == 0) {
                    System.out.println(" Buzz");
                } else {
                    System.out.print(" Buzz");
                }
            }else{
                if (i % 10 == 0) {
                    System.out.println(" "+i);
                } else {
                    System.out.print(" "+i);
                }
            }
        }
        return getFizzBuzz;
    }
}
