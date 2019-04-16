package miscellaneousExample;

class Test
{
int test_a, test_b;
Test()
{
test_a = test_b;
test_b = test_a;
}
public static void main (String args[])
{
Test test = new Test();
System.out.println(test.test_a+" "+test.test_b);
}
}