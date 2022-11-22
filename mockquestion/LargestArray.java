package mockquestion;

public class LargestArray {
public static int getLargest(int[]a,int total) {
	int temp;
	for(int i=0;i<total;i++)
	{
		for(int j=i+1;j<total;j++)
		{
			if(a[i]>a[j])
				
			{
		
		temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
}
}
  //return a[total-1];// for highest no
	return a[0];      // for lowest number in array
}	
	
	
	public static void main(String[] args) {
		int a[]= {100,90,80,60,70,200,50,40,30,20,10};
		int b[]= {100,90,80,60,70,200,50,40,30,20,10};
		System.out.println("Lowest:"+getLargest(a,11));
	//	System.out.println("Lowest:"+getLowest(b,11));

	}}

