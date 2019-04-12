import java.util.*;
import java.lang.Math;
class assignment3
{ 
static void zigZagMatrix(int arr[][], int n, int m) { 
	int row = 0, col = 0; 

	boolean row_inc = false; 
	int mn = Math.min(m, n); 
	for (int len = 1; len <= mn; ++len) { 
	for (int i = 0; i < len; ++i) { 
		System.out.print(arr[row][col] + " "); 

		if (i + 1 == len) 
		break; 
	
		if (row_inc) { 
		++row; 
		--col; 
		} else { 
		--row; 
		++col; 
		} 
	} 

	if (len == mn) 
		break; 

	
	if (row_inc) { 
		++row; 
		row_inc = false; 
	} else { 
		++col; 
		row_inc = true; 
	} 
	} 

	if (row == 0) { 
	if (col == m - 1) 
		++row; 
	else
		++col; 
	row_inc = true; 
	} else { 
	if (row == n - 1) 
		++col; 
	else
		++row; 
	row_inc = false; 
	} 

	int MAX = Math.max(m, n) - 1; 
	for (int len, diag = MAX; diag > 0; --diag) { 

	if (diag > mn) 
		len = mn; 
	else
		len = diag; 

	for (int i = 0; i < len; ++i) { 
		System.out.print(arr[row][col] + " "); 

		if (i + 1 == len) 
		break; 

	
		if (row_inc) { 
		++row; 
		--col; 
		} else { 
		++col; 
		--row; 
		} 
	} 
 
	if (row == 0 || col == m - 1) { 
		if (col == m - 1) 
		++row; 
		else
		++col; 

		row_inc = true; 
	} 

	else if (col == 0 || row == n - 1) { 
		if (row == n - 1) 
		++col; 
		else
		++row; 

		row_inc = false; 
	} 
	} 
} 

public static void readarray(int[][] a) { 
	int i,j,n,s;
        for(i=1;i<n;i++){
            System.out.printf("enter row", i+1);
            String[] s=new Scanner(System.in);
            for(j=1;j<n;j++)
            {
                a[i][j]=Integer.parseInt(s[j]);
            }
        }
}
public static void rand(String args[]) 
    { 
       
        int max = 100; 
        int min = 1; 
        int range = max - min + 1; 
  
        // generate random numbers within 1 to 100 
        for (int i = 0; i < 100; i++) { 
            int rand = (int)(Math.random() * range) + min; 
  
            
            System.out.println(rand); 
        } 
    } 
} 
            
        

