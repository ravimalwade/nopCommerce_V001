package mockquestion;
  //use of this keyword 
public class MockInterviewQuestion {   

	public static void main(String[] args)
	{
		A obj = new A(6);
		obj.show();
		}

}
class A
{ 
	private int x;   //instance & global variable 

    public A(int x)  //local 
{
	this.x=x;             //current instance 
}

public void show()
{
	System.out.println("x is"+ x);
}

}