public class FizzBuzz {

  /**
   * loops from 0 to specified number and prints classic fizzBuzz outputs to console
   *
   * @param num Number to loop unitll
   */

public static void fizzBuzz(int num) {
    String res = "";
    for (int i = 0; i < num; i++) {
        if (i % 3 == 0) res += "Fizz";
        if (i % 5 == 0) res += "Buzz";
        if (res == "") res += i;
        System.out.println(res);
        res = "";
    }


}
