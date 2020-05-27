import java.io.BufferedReader;
import java.io.InputStreamReader;

class Solution
{
    public static void main(String[] args) throws Exception{

        BufferedReader br = new  BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        int count = 0;

        while(t>0)
        {
            count++;

            int n = Integer.parseInt(br.readLine());

            String[] l1 = br.readLine().split(" ");

            int[] arry = new int[n];

            for(int i = 0;i<n;i++)
            {
                arry[i] = Integer.parseInt(l1[i]);
            }

            int peak = 0;

            for(int i = 1;i<n-1;i++)
            {
                if(arry[i]>arry[i-1]&&arry[i]>arry[i+1])
                {
                    peak ++;
                }
            }

            System.out.println("Case #"+count+": "+peak);



            t--;
        }


         
    }
}