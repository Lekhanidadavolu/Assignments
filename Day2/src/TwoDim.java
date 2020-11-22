import java.util.Scanner;
public class TwoDim {
	public static void main(String args[])
	{  
		int row, col;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		row = sc.nextInt();
		System.out.println("Enter the number columns");
		col = sc.nextInt();
		int a[][]=new int[row][col];    
        int b[][]=new int[row][col];    
        int c[][]=new int[row][col];    
        System.out.println("Enter the elements of matrix1");
        
        for ( int i= 0 ; i < row ; i++ )
        { 
         
        for (int j= 0 ; j < col ;j++ )
        a[i][j] = sc.nextInt();
         
        System.out.println();
        }
        System.out.println("Enter the elements of matrix2");
         
        for ( int i= 0 ; i < row ; i++ )
        {
         
        for ( int j= 0 ; j < col ;j++ )
        b[i][j] = sc.nextInt();
         
        System.out.println();
        }
        for(int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("Sum of two matrices is: ");
        for(int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(c[i][j]+"\t");
            }
            System.out.println();
        }
        for(int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                c[i][j] = a[i][j] - b[i][j];
            }
        }

        System.out.println("Sub of two matrices is: ");
        for(int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++)
          {
                System.out.print(c[i][j]+"\t");
            }
            System.out.println();

		}
        for(int i=0;i<row;i++){    
        	for(int j=0;j<col;j++){    
        	c[i][j]=0;      
        	for(int k=0;k<row;k++)      
        	{      
        	c[i][j]+=a[i][k]*b[k][j];      
        	}
        	}
        }
        System.out.println("Mul of two matrices is: ");
        for(int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++)
          {
                System.out.print(c[i][j]+"\t");
            }
            System.out.println();

		}

	}
}
