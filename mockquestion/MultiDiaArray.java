package mockquestion;

public class MultiDiaArray {

	public static void main(String[] args) {
		
		int[][] myMultiDiamArray=new int[2][3];
		myMultiDiamArray[0][0]=2;
		myMultiDiamArray[0][1]=3;
		myMultiDiamArray[0][2]=5;
		myMultiDiamArray[1][0]=6;
		myMultiDiamArray[1][1]=8;
		myMultiDiamArray[1][2]=9;
		//System.out.println(myMultiDiamArray[1][2]);
		
		
		int[][] myMultiDiamArray1= {{2,3,5},{6,8,9}};
     //  System.out.println(myMultiDiamArray1[1][2]);
       
       for(int i=0;i<myMultiDiamArray1.length;i++)
       {
    	   for(int j=0;j<myMultiDiamArray1[i].length;j++)
    	   
    	   System.out.println(myMultiDiamArray1[i][j]);
       }
	}
	}
	
	


