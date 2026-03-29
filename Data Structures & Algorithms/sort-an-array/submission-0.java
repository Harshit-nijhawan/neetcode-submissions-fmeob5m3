class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length -1);
        return nums;
    }
    void merge(int[] nums,int start,int mid,int end){
        int arr[] = new int[end - start + 1];
        int k = 0,i=start,j=mid+1;
        while(i <= mid && j <= end){
            if(nums[i] <= nums[j]) arr[k++] = nums[i++];
            else arr[k++]= nums[j++];
        }
        while(i<=mid){
            arr[k++] = nums[i++];
        }
        while(j <= end){
            arr[k++] = nums[j++];
        }
        for(int l = 0;l<arr.length;l++){
            nums[l + start] = arr[l];
        }
    }
    void mergeSort(int arr[],int start,int end){
        if(start < end){
            int mid = start + (end - start)/2;
            mergeSort(arr,start,mid);
            mergeSort(arr,mid+1,end);
            merge(arr,start,mid,end);
        }
    }
}