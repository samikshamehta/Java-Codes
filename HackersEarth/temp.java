	import java.util.*;

public class temp {
	/* IMPORTANT: Multiple classes and nested static classes are supported */

	/*
	 * uncomment this if you want to read input.
	//imports for BufferedReader
	import java.io.BufferedReader;
	import java.io.InputStreamReader;

	//import for Scanner and other utility classes*/


	    public static void main(String args[] ) throws Exception {
	       
	        Scanner s = new Scanner(System.in);
	       int t=s.nextInt();
	       for(int j=0;j<t;j++)
	       {
	       int a=s.nextInt();
	       int b=s.nextInt();
	       String r=Integer.toBinaryString(a);
	       String k=Integer.toBinaryString(b);
	       String c[]=new String[]{r};
	       String d[]=new String[]{k};
	       int p[]=new int[c.length];
	       int m[]=new int[d.length];
	       for(int i=0;i<c.length;i++)
	        {
	            p[i]=Integer.parseInt(c[i]);
	        }
	        for(int i=0;i<d.length;i++)
	        {
	            m[i]=Integer.parseInt(d[i]);
	        }
	        int count=0,val=0;
	        if(p.length>=m.length)
	        {
	        	val=p.length-m.length;
	        	
	        }
	        else
	        {
	        	val=m.length-p.length;
	        }
	        for(int i=p.length-1;i>=0;i--)
	        {
	        	if(p[i]!=m[i])
	        	{
	        		count++;
	        	}	
	        }
	        
	        System.out.println(count+val);
	       }
	    }	
	}
