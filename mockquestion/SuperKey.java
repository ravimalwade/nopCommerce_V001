package mockquestion;

public class SuperKey {

	public static void main(String[] args)
	
	{
		B obj = new B();
		obj.show();

	}

}
class A      //super clss
{
	int i=5;
}


class B extends A    // sub class 
{    int i=4;
	public void show()
	{
		System.out.println(super.i);
	}
}