class Solution {
    public static int removeDuplicates(int[] arr){
     int l=0,k=1;
        for(int r=0; r< arr.length;r++){
            if(arr[r]!=arr[l]){
                l++;
                arr[l]=arr[r];
                k++;
            }
        }
        return k;
    }
}
