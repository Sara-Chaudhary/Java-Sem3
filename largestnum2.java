// program to find the largest number from command line argument with first argument being the no. of numbers 
public class largestnum2 {
    public static void main(String[] args) {
        int curr , max = Integer.parseInt(args[1]) , n = Integer.parseInt(args[0]);
        for (int i=2 ; i<=n ; i++){
            curr = Integer.parseInt(args[i]);
            if ( curr > max){
                max = curr;
            }
        }
        System.out.println("The largest no. is : "+max);
    }
}

