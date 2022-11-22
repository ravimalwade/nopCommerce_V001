package mockquestion;

public class SuperKey2 {

	public static void main(String[] args) {
	
		B obj = new B();
		obj.abc();

	}

}
class A  // super class
{
	public void abc()
	{
		System.out.println("A abc");
	}
}
class B extends A //sub class 
{
	public void abc()
	{
		super.abc();
		System.out.println("B abc");
	}
}
