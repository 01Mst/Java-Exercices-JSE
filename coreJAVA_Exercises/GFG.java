package coreJAVA_Exercises;

	public	class GFG {
		 
		    // Main driver method
		    public static void main(String[] args)
		    {
		        // Custom values for integer
		        // to be summed up
		        int n = 3, m = 6;
		        Static_Ex s1=new Static_Ex();
		 
		        // Calling the static method of above class
		        // and storing sum in integer variable
		      int s= s1.sum(n, m);
		 
		        // Print and display the sum
		        System.out.print("sum is = " + s);
		    }
		}
	