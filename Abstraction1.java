abstract class arithmetic_operation
 {
    abstract void printIn();
}
class add extends arithmetic_operation
 {
   
    void printIn()
    {
        int a = 3;
        int b = 4;
        System.out.println(a + b);
    }
}

class sub extends arithmetic_operation 
{
    void printIn()
    {
        int c = 4;
        int d = 5;
        System.out.println(c - d);
    }
}
class Abstraction1
 {
    public static void main(String args[])
    {
        arithmetic_operation n = new add();
        n.printIn();
        arithmetic_operation y = new sub();
        y.printIn();
    }
}