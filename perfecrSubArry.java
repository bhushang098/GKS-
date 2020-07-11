import java.io.BufferedReader;
import java.io.InputStreamReader;

// Assuming tahy You read problem Carefully So lets Solvet This

class Solution {
    public static void main(String[] args) throws Exception{
        
//Initialize Buffer Reader

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Variable T for Numbero Test Cases

        int t = Integer.parseInt(br.readLine());
        int count = 0;
        //Loop To cover All test Cases
        while(t>0)
        {
            count++;
            
            // Read Input for Ecah Test Caes As Discribed In problem

            int n = Integer.parseInt(br.readLine());// For Array Size

            int[] arry = new int[n];// Array of size N

            String[] line1 = br.readLine().split(" ");
            // Reading elememnnts of Array

            for(int i = 0;i<n;i++)
            {
                arry[i] = Integer.parseInt(line1[i]);
                //Stroting array elememts As Integer
            }
            
            int ans = 0;// Variable to store number of perfect Sub Arrays

            // Noew Iterate through each elemt in array And find if its is perfect sub Array
            // ;logic is Same As per Bubble Sort Lets See

            for(int i = 0;i<n;i++)
            {

                for(int j = i;j<n;j++)
                {
                    //Check if array ranging form i to K is percr sub array or not 
                    if(checkForperfectSubArray(arry,i,j))
                    {
                        // if it is perct sub Array the increment ans by 1

                        ans++;
                    }
                }
            }


            printans(ans,count);

            // Roun Solution


            t--;
        }
    }

    private static void printans(int ans, int count) {

        System.out.println("Case #"+count+": "+ans);

    }

    private static boolean checkForperfectSubArray(int[] arry, int i, int j) {

        int sum = 0;
        // simple condition refract it 
        // now check
        
        for(int k = i;k<=j;k++)
        {
            // loop for counting sum 
            sum += arry[k];

        }

        // now check is sum is perct square
        // Take Helpof Matyh Library

        double sqrt = Math.sqrt(sum);// method returns float value 

        // Now Retuen true or false depending on Square root value

        return ((sqrt -Math.floor(sqrt))==0);// this check if number is perfect Square 
        // siple logic suppose number i.e our ans varable is perfect square then sqrt value will
        //be float like 34.000 if its not then it will be 43.632367 so by flooring and checking with 
        //it we return result 
        //now ltsc print our result
    }
}