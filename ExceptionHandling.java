
public class ExceptionHandling {

	
	public static void main(String[] args) {
		
		//todo:
		//1.) Execute the following program. It will throw Exceptions.
		//Catch the Exceptions using their proper Names till no further
		//exceptions occur.
		//
		//2.) Taking the square root of a negative number won't cause
		//the exception. Write your own Exception for this case and 
		//write a method which throws this exception

		int a = 5;
		int b = 0;
		try{
			int div = a/b;
	    }catch(ArithmeticException e){
	    	e.printStackTrace();
	    	System.err.println("\n");
	    }    
		
		int[] arr = new int[5];
		try{
			arr[5] = 7;
	    }catch( ArrayIndexOutOfBoundsException e){
	    	System.err.println(e.getMessage());
	    	System.err.println("\n");
	    	//e.printStackTrace();
	    	//System.err.println( "Ooops something went wrong ..." );
	    }
		
		String one = "one";
		try{
		int i = Integer.parseInt(one);
	    }catch( NumberFormatException n){
	    	// n.printStackTrace();
	    	System.err.println(n+"\n");
	    }
		
		double c = -7.0;
		try{
		    complexNumber(c);
	    }catch(ComplexNumberException e){
	    	//c.complexNumber();
	    	e.printStackTrace();
	    }
		// System.out.println(d);
	}

	public static double complexNumber(double c) throws ComplexNumberException{
        if(c<0){
		     throw new ComplexNumberException("this is a complex number");
	    }else{
	    	double d = Math.sqrt(c);
	    	return d;
	    }
    }

}
