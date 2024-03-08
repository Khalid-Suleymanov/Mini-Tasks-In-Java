import java.util.*;

public class Main {
    public static void main(String[] args) {
        // First task
        //İnteger massivində verilmiş ədədlərin ən böyüyünü tapın. Məs: İnput: [10,23,2,45,7]  Output: 45
        
        int[] numbersArray = { 10, 25, 42, 98, 34, 2, 0, -5 };
        int bigNums = foundBigOne(numbersArray);
        System.out.println("The big number in this array " + bigNums);
        

        //Second task
        //Verlmiş ədədin sadə rəqəmlərinin cəmini tapın. Məs: İnput: 123456  Output: 11
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number: ");
        int number = scanner.nextInt();
        int result = foundSimpleNumSum(number);
        System.out.println(result);
         

        //Third task
        //Verilmiş ədədin neçə mərtəbəli olduğunu təyin edin. Məs: İnput: 23456  Output: 5
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your wanted number: ");
        int number = scanner.nextInt();
        int result = foundNumberFloor(number);
        System.out.println("The number you entered has a " + result +  " floor");
         

        //Fourth task
        //Hər hansı bir ədəd daxil et,Bu ədədin ilk reqemini ədədin sonuna yazdır.
        //Məs: İnput: 1234  Output: 2341"
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your wanted number: ");
        int inpNumber = scanner.nextInt();
        int result = changeNumberPlace(inpNumber);
        System.out.println(result);
         

        // Fifth Task
        // Daxil edilmis ededin polindrome olub olmadigini yoxlayin. Meselen 12321 polindrome dur.
        
          Scanner scanner = new Scanner(System.in);
          System.out.println("Please enter your wanted number:  ");
          int number = scanner.nextInt();

          if(ifIsPolindrome(number)){
              System.out.println("This number is polindrome");
          }else{
              System.out.println("This number is not polindrome");
          }
           

        // Sixth task
        // Verilmiş ədədin rəqəmlərinin unikal(təkrarlanmayan) olub-olmamasını yoxlayın.
        //Məs: İnput: 53213 Output: false(3 ədədi təkrarlanır)"
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your wanted number: ");
        int inputNumber = scanner.nextInt();
        if (isThisNumbersAreUnique(inputNumber)) {
            System.out.println("This number is unique!");
        } else {
            System.out.println("This number isn't unique!");
        }
         

        //Seventh task
        //1-1000 qədər ədədlərin içərisindən elə ədədləri çap et ki həm rəqəmləri cəmi 5-ə bölünsün, həm də özü 5-ə bölünsün.
        
        for(int i = 1; i < 1000; i++){
            if(i % 5 == 0 && ifDividedFiveOrNo(i)){
                System.out.println(i);
            }
        }
        

        //Eighth task
        //1-1000 qədər ədədlərin içərisindən ələ ədədləri çap et ki:
        //rəqəmləri cəmi 3-ə bölünsün və sonuncu rəqəm 3 olmasın.
        
        for(int i = 10; i < 1000; i++){
                if(i % 3 == 0 && theLastNumber(i) != 3){
                    System.out.println(i);
                }
        }
         
    }


    //First task

        public static int foundBigOne(int[] numbersArray){
            int bigNum = 0;
            for(int i = 0; i < numbersArray.length; i++){
                if(numbersArray[i] > bigNum){
                    bigNum=numbersArray[i];
                }
            }
            return bigNum;
        }


    //Second task
        
        public static int foundSimpleNumSum(int stringArray){
            int sum = 0;
            while (stringArray > 0) {
                int digit = stringArray % 10;
                if (isPrime(digit)) {
                    sum += digit;
                }
                stringArray /= 10;
            }
            return sum;
        }
        public static boolean isPrime(int n) {
            if (n <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
         

    //Third task
        
        public static int foundNumberFloor(int number){
            int numsCount = 0;
            if(number == 0){
                numsCount = 1;
            }else{
                while(number != 0){
                    number /= 10;
                    numsCount++;
                }
            }
            return numsCount;
        }
     

    //Fourth task
        
        public static int changeNumberPlace(int number) {
        int firstDigit = number;
        while (firstDigit >= 10) {
            firstDigit /= 10;
        }
        int remainingDigits = number % ((int) Math.pow(10, (int)Math.log10(number)));
        return (remainingDigits * 10) + firstDigit;
        }
         

    //Fifth task
        
        public static boolean ifIsPolindrome(int number){
            int numbers = number;
            int newNumber = 0;
            int digit = 0;
            while(number > 0){
                digit = number % 10;
                newNumber = newNumber * 10 + digit;
                number /= 10;
            }
            return numbers == newNumber;
        }
         

    //Sixth task
        
        public static boolean isThisNumbersAreUnique(int number) {
            boolean[] digits = new boolean[10];
            while (number > 0) {
                int digit = number % 10;
                if (digits[digit]) {
                    return false;
                }
                digits[digit] = true;
                number /= 10;
            }
            return true;
        }
         

    //Seventh task
        
        public static int theNumbersPlural(int number){
            int plural = 0;
            while(number>0){
                plural+=number%10;
                number/=10;
            }
            return plural;
        }
        public static boolean ifDividedFiveOrNo(int number){
            int sum = theNumbersPlural(number);
            return sum % 5 == 0;
        }
         

    //Eighth task
        
        public static int theLastNumber(int number){
            return number % 10;
        }
         
}
