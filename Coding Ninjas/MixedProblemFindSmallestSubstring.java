import java.util.Scanner;


public class MixedProblemFindSmallestSubstring 
{
    public static void main(String[] args)
    {
		Scanner s = new Scanner(System.in);
		String large=s.nextLine();
		String small=s.nextLine();
		String result=findMinSubstringContainingString(large,small);
		System.out.println(result);
    }
    static final int no_of_chars = 256;
	public static String findMinSubstringContainingString(String large, String small)
	{
		int len1 = large.length();
        int len2 = small.length();
        if (len1 < len2)
        {
            return "";
        }
        int hash_pat[] = new int[no_of_chars];
        int hash_str[] = new int[no_of_chars];
        for (int i = 0; i < len2; i++)
        {
        	hash_pat[small.charAt(i)]++;
        }
        int start = 0, start_index = -1, min_len = Integer.MAX_VALUE;
        int count = 0; 
        for (int j = 0; j < len1 ; j++)
        {
            hash_str[large.charAt(j)]++;
            if (hash_pat[large.charAt(j)] != 0 &&  hash_str[large.charAt(j)] <= hash_pat[large.charAt(j)] )
            {
                count++;
            }
            if (count == len2)
            {
                while ( hash_str[large.charAt(start)] > hash_pat[large.charAt(start)]|| hash_pat[large.charAt(start)] == 0)
                {
                	if (hash_str[large.charAt(start)] > hash_pat[large.charAt(start)])
                	{
                        hash_str[large.charAt(start)]--;
                	}
                	start++;
                }
                int len_window = j - start + 1;
                if (min_len > len_window)
                {
                    min_len = len_window;
                    start_index = start;
                }
            }
        }
        if (start_index == -1)
        {
           return "";
        }
      return large.substring(start_index, start_index + min_len);
    }
}
