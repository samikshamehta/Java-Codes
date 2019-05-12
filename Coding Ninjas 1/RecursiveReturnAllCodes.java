import java.util.Scanner;


public class RecursiveReturnAllCodes {

	/**
	 * @param args
	 */
		public static void main(String[] args)
		{
		// TODO Auto-generated method stub
			Scanner s= new Scanner(System.in);
			String n=s.nextLine();
			String val="";
			String valRight="";
			String result[]= getCode(n,val,valRight);
			for(int i=0;i<result.length;i++)
			{
				System.out.print(result[i]+" ");
			}
		}
		public static  String[] getCode(String input,String val,String valRight)
		{
			if(input.length()==1)
			{
				String ans[]={getcodes((int)input.charAt(0)-'0')};
				return ans;
			}
			String code=getcodes((int)input.charAt(0)-'0');
			val=val+code;
			String smallAns[]=getCode(input.substring(1),val,valRight);
			String ans[]=new String[(smallAns.length*2)-1];
			if(input.length()>2)
			{
				String codeRight=getcodes(Integer.parseInt(input.substring(0,2)));
				valRight=valRight+codeRight;
				String smallAnsRight[]=getCode(input.substring(2),val,valRight);
				int k=0;
				if(codeRight=="")
				{
					for(int i=0;i<smallAns.length;i++)
					{
						ans[k++]=val+getcodes(Integer.parseInt(smallAns[i]));
					}
				}
				else
				{
					for(int i=0;i<smallAns.length;i++)
					{
						ans[k++]=val+getcodes(Integer.parseInt(smallAns[i]));
					}
					for(int j=0;j<smallAnsRight.length;j++)
					{
						ans[k++]=val+valRight;
					}
				}
			}
			return ans;
	}
			/*if(Leftn.length()==1)
			{
				String an[]={getcodes(Integer.parseInt(Leftn))};
				return an;
			}
			if(Rightn.length()==2)
			{
				String an1[]={getcodes(Integer.parseInt(Rightn))};
				return an1;	
			}
			String codeLeft=getcodes((int)(Leftn.charAt(0)-'0'));
			String smallLeft[]=GetCode(Leftn.substring(1),Rightn);
			String codeRight=getcodes(Integer.parseInt(Rightn.substring(0, 2)));
			String smallRight[]=GetCode(Leftn,Rightn.substring(2));			
			String Leftans[]=new String[smallLeft.length+1];
			String Rightans[]=new String[smallRight.length+1];
			int k=0;
			for(int i=0;i<codeLeft.length();i++)
			{
				for(int j=0;j<smallLeft.length;j++)
				{
					Leftans[k++]=smallLeft[j]+codeLeft;
				}
			}
			for(int i=0;i<codeRight.length();i++)
			{
				for(int j=0;j<smallRight.length;j++)
				{
					Rightans[k++]=smallRight[j]+codeRight;
				}
			}
			String ans[]=new String[Leftans.length+Rightans.length];
			int r=0;
			for(int i=0;i<Leftans.length;i++)
			{
				ans[r++]=Leftans[i];
			}
			for(int i=0;i<Rightans.length;i++)
			{
				ans[r++]=Rightans[i];
			}
			return ans;
		}*/
		private static String getcodes(int n)
		{
			String arr[]={" ","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
			return arr[n];
		}
	}
