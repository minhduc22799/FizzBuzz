public class FizzBuzz {
    public static String fizzBuzz(int number){
        if (number > 0){
            if (number % 3 == 0 && number % 5 ==0){
                return "FizzBuzz";
            }else if (number % 3 == 0){
                return "Fizz";
            }else if (number % 5 ==0){
                return "Buzz";
            }
            else {
                return "so ban dau la :"+number;
            }
        }else {
            return "can nhap so lon hon 0";
        }
    }
}
