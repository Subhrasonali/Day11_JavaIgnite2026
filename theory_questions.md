# Day11_JavaIgnite2026

1)What is the difference between:

Checked Exception

Unchecked Exception

Give one Java example for each.


ans-
checked exceptions are verified at compiletime by the Java compiler, while unchecked exceptions are checked only at runtime.
checked exp-import java.io.*;

class Test {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("abc.txt");
    }
}

unchecked-class Test {
    public static void main(String[] args) {
        int a = 10 / 0;
    }
}
2)Explain difference between:

throw

throws

Where do we use each one?

ans-
throw is used to explicitly clear or raise a specific exception, while throws is used in a method signature to declare that an exception might occur.
use of throw-use throw inside a method when a user input and you want to intentionally halt execution and pass an error up.
throws-when your method contains code that could cause a checked exception, but you do not want to handle it with a try-catch block inside that specific method. It warns the next developer calling your method that they must handle it.

3)Why do we need it instead of built-in exceptions?


Built-in exceptions handle common errors like:
ArithmeticException
NullPointerException
ArrayIndexOutOfBoundsException
But sometimes applications have specific business rules that built-in exceptions cannot describe clearly. In such cases, we create custom exceptions.

Give a real-life example where custom exception is useful.

Suppose a bank account must maintain a minimum balance of ₹1000.
Java
if(balance < 1000) {
    throw new MinimumBalanceException("Balance below minimum limit");
}
Here, MinimumBalanceException clearly tells the exact problem. Using a built-in exception like ArithmeticException would not be meaningful.
