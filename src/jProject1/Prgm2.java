package jProject1;

public class Prgm2 {

	public static void main(String[] args) {
		// Arrays and String methods
		
          int b[][] = new int[3][2];
          
          //Storing elements
          b[0][0] = 10;
          b[0][1] = 20;
          
          b[1][0] = 30;
          b[1][1] = 40;
          
          b[2][0] = 50;
          b[2][1] = 60;
          
          //Loops printing 
          
       /* for(int i=0;i<=2;i++) {
        	  for(int j=0;j<=1;j++) 
        	  {
        		  System.out.print(b[i][j]+ "  ");
        	  }
        	  System.out.println();
          }
          */
          
          //For each Loop
          
          for(int i[]:b) {
        	  for (int j: i) {
        		  System.out.print(j+ " ");
        	  }
        	  System.out.println();
          }
        	  
	}

}

