class FactorialUsingRecursion
{  
	static int factorial(int n)
	{    
  		if (n == 0)    
    			return 1;    
  		else    
    			return(n * factorial(n-1));    
	}   
 
 	public static void main(String args[])
	{  
  		int result=1;  
  		int number=4;//It is the number to calculate factorial    
  		result = factorial(number);   
  		System.out.println("Factorial of "+number+" is: "+result);    
 	}  
}  
//Explanation
//4* fact(3)
//4*(3* fact(2))
//4*3*(2*fact(1))
//4*3*2*(1*fact(0))
//4*3*2*1*1