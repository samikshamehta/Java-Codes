import java.util.Scanner;

public class BasicProgrammingSurveyAnalysis
{
    public static void main(String args[] ) throws Exception 
    {
        Scanner s = new Scanner(System.in);
        String perDaySurvery = null;
        long yesPerWeek[] = new long[7];
        double squareOfDiff = 0;
        double avg = 0;
        for(int i=0;i<7;i++)
        {
            long yesPerDay = 0;
            perDaySurvery  = s.next();
            long inputLength = perDaySurvery.length();
            for(long j=0;j<inputLength;j++)
            {
                if(perDaySurvery.charAt((int) j)== '1')
                {
                    yesPerDay++;
                }
            }
            yesPerWeek[i] = yesPerDay;
            avg+=yesPerWeek[i];
        }
        avg = avg/7;
        for(int i=0; i<7; i++)
        {
            squareOfDiff += (yesPerWeek[i]- avg)*(yesPerWeek[i]- avg);
        }
        avg = squareOfDiff/7;
        
        
        System.out.printf("%.4f",(Math.sqrt(avg)));
    
    }
} 