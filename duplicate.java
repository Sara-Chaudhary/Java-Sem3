// program to print the duplicate numbers in a array.

public class duplicate {
    public static void main(String[] args) {
        int a[] = {5,6,9,5,8,9,11,8};
        System.out.print("The duplicate elements int the array are: ");
        for (int i=0 ;i <= a.length ; i++){
            for(int j=(i+1) ; j<(a.length); j++){
                if(a[i] == a[j]){
                    System.out.print(a[i]+" ");
                    break;
                }
            }
        }
        System.out.println();
    }
}
