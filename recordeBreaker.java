
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Solution {
    public static void main(String[] args) throws Exception{
        


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

     

        int t = Integer.parseInt(br.readLine());
        int count = 0;
       
        while(t>0)
        {
            count++;
            
    

            int n = Integer.parseInt(br.readLine());

            int[] arry = new int[n];

            String[] line1 = br.readLine().split(" ");
            

            for(int i = 0;i<n;i++)
            {
                arry[i] = Integer.parseInt(line1[i]);
                
            }
            
            int ans = 0;

            for(int days = 0;days<n;days++)
            {

                    if(condition2(arry,days,n))
                    {
                        if(condition1(arry,days,n))
                        {
                            ans++;
                        }
                    }


            }
       

        


            printans(ans,count);

          


            t--;
        }
    }

 


    private static boolean condition2(int[] arry, int days, int n) {

        if(days==n-1){

            return true;
        }

        if(arry[days]>arry[days+1])
        {
            return true;
        }else{
            return false;
        }

    }

    private static boolean condition1(int[] arry, int days, int n) {

        for(int i = 0;i<days;i++)
        {
            if(arry[i]>=arry[days])
            {
                return false;
            }
        }
        return true;
    }

    private static void printans(int ans, int count) {

        System.out.println("Case #"+count+": "+ans);

    }


}






       
// 1 2 3 4 5 6
// 0 4 3 9 8 10