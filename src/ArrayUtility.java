public class ArrayUtility {

    public static void print(int[] array) {
        System.out.println("array");
    }

    public static int sum(int[] array) {
        int sum=0;
        for(int i=0;i<array.length;i++){
            sum+=array[i];
        }
        return sum;
    }

    public static double average(int[] array) {
        double s = sum(array);
        double avg = s/array.length;
        int num = (int)(avg*100);
        return (double)num/100;
    }

    public static int minimum(int[] array) {
        int min=100000;
        for(int i=0;i<array.length;i++){
        if (array[i]<min){
            min=array[i];
        }
        }
        return min;
    }


    public static int maximum(int[] array) {
        int max=-1;
        for(int i=0;i<array.length;i++){
            if (array[i]>max){
                max=array[i];
            }
        }
        return max;
    }

    public static int evenCount(int[] array) {
        int count=0;
        for (int i=0;i<array.length;i++){
            if (array[i]%2==0){
                count++;
            }
        }
        return count;
    }

    public static int[] reverseOne(int[] array) {
        int[] reverse=new int[array.length];
        for (int i=array.length-1;i>=0;i--){
        reverse[array.length-i-1]=array[i];
        }
        return reverse;
    }

    public static void reverseTwo(int[] array) {
        for (int i=0;i<array.length/2;i++){
            int x=array[i];
            array[i]=array[array.length-1-i];
            array[array.length-1-i]=x;
        }

    }

    public static boolean linearSearchInt(int[] array, int num) {
        for (int i=0;i<array.length;i++){
            if (array[i]==num){
                return true;
            }
        }
        return false;
    }

    public static boolean linearSearchString(String[] array, String str) {
        for (int i=0;i<array.length;i++){
            if (array[i].equals(str)){
                return true;
            }
        }
        return false;
    }

    public static void multiplyByTwo(int[] array) {
    for (int i=0;i<array.length;i++){
        array[i]*=2;
    }
    }

    public static void multiplyByN(int[] array, int n) {
        for (int i=0;i<array.length;i++){
            array[i]*=n;
        }
    }

    public static String toString(int[] array) {
        String ans="";
        for (int i=0;i<array.length;i++) {
            ans += array[i]; //concatenate current element to result
            if (i < array.length - 1) {
                ans += ", "; //add comma and space if it isn't the last element
            }
        }
        return ans;
    }

    public static boolean twoSum(int[] array, int num) {
        for (int i=0;i<array.length;i++){
            for (int j=0;j<array.length;j++){
                if (i==j){
                    //skip checking the same element
                    continue;
                }
                if (array[i]+array[j]==num){
                    return true;
                }
            }
        }
        return false;
    }

    public static void shiftRight(int[] array) {
        //store last element in variable called x
        int x=array[array.length-1];
        //start from second last element and move each element 1 position right
        for (int i=array.length-1;i>=1;i--){
            array[i]=array[i-1];

        }
        //assign last element to first position, which is x
        array[0]=x;
    }

    public static void shiftLeft(int[] array) {
        //store in variable x
        int x=array[0];
        //start from second element and move to the left
        for (int i=array.length-1;i>=1;i++){
            array[i]=array[i+1];

        }
        //assign first element to the back
        array[array.length-1]=x;
    }

    public static void shiftRightNTimes(int[] array, int n) {
    for (int i=1;i<=n;i++){
        shiftRight(array);
    }
    }

    public static void shiftLeftNTimes(int[] array, int n) {
        for (int i=1;i<=n;i++){
            shiftLeft(array);
        }
    }


}
