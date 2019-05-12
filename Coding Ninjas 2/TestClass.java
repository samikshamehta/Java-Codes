
		// TODO Auto-generated method stub
		import java.io.BufferedReader;
		import java.io.IOException;
		import java.io.InputStreamReader;
		import java.util.HashSet;
		import java.util.Set;

		class TestClass {
static{
	
	System.out.println("before");
	
	
	
}
		    public static void main(String[] args) throws IOException {

		        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		        String s;
		        int line = 1;
		        while ((s = in.readLine()) != null && s.length() != 0) {

		            if ( (line != 1) && ((line % 2) == 1) ) {

		                String[] p = s.split(" ");
		                int[] t = new int[p.length];
		                for (int i=0; i<p.length; i++) {
		                    t[i] = Integer.valueOf(p[i]);
		                }

		                int lis = findLIS(t);
		                System.out.println((t.length - lis));

		            }

		            line++;
		        }

		    }

		    public static int search(int[] M, int[] A, int i, int L ) {
		        int j = 0;
		        int k = L-1;
		        while( j <= k ) {
		            int m = ( j + k ) / 2;
		            if( A[M[m]] <= A[i] ) j = m + 1;
		            else k = m - 1;
		        }

		        return k;
		    }

		    public static int findLIS(int[] A) {
		        int n = A.length;
		        int[] M = new int[n];
		        int[] P = new int[n];
		        M[0] = 0;
		        P[0] = -1;
		        int L = 1;

		        for(int i=1; i<n; ++i) {
		            int j = search( M, A, i, L );
		            if( j == -1 ) P[i] = -1;
		            else P[i] = M[j];

		            if( j == L-1 || A[i] < A[M[j+1]] ) {
		                M[j+1] = i;
		                if( j+2 > L ) L = j+2;
		            }
		        }

		        int[] LIS = new int[L];
		        n = L-1;
		        int p = M[n];
		        while( n >= 0 ) {
		            LIS[n] = A[p];
		            p = P[p];
		            n--;
		        }

		        return filter(LIS).size();
		    }
		    
		    public static Set<Integer> filter(int[] a) {
		        
		        Set<Integer> set = new HashSet<Integer>();
		        for (Integer i : a)
		            set.add(i);
		        
		        return set;
		        
		    }
		}

				