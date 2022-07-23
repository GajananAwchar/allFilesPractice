package topPrograms;

public class MatrixConcept {
public static void main(String[] args) {
	int a[][]={{3,5,4},{2,4,3},{3,4,5}};    
	int b[][]={{3,5,4},{2,4,3},{4,2,4}};      
	//creating another matrix to store the sum of two matrices    
	int c[][]=new int[3][3];  //3 rows and 3 columns  
	    
	//adding and printing addition of 2 matrices    
	for(int i=0;i<3;i++){    
	for(int j=0;j<3;j++){    
	c[i][j]=a[i][j]+b[i][j];    //use + for addition  
	System.out.print(c[i][j]+" ");    
	}    
	System.out.println();//new line    
	}    
	for(int k=0;k<3;k++){    
		for(int l=0;l<3;l++){    
		c[k][l]=a[k][l]-b[k][l];    //use - for subtraction  
		System.out.print(c[k][l]+" ");    
		}    
		System.out.println();//new line    
		}    

}
}
