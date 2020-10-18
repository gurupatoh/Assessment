
// Java program to find missing Number
 
class Main {
    // Function to identify missing number
    static int getMissingNumber(int a[], int n)
    {
        int i, total;
        total = (n + 1) * (n + 2) / 2; 
        // summation formula
        for (i = 0; i < n; i++)
            total -= a[i];
        return total;
    }
 
    /* Run a testCase for the above function  */
    public static void main(String args[])
    {
        int a[] = { 3,5,4,1 };
        int miss = getMissingNumber(a, a.length);
        System.out.println(miss);
    }
}