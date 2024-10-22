package itheimasort;

public class QKsort {
    public static void main(String[] args) {
        int []arr={6,1,2,7,9,3,4,5,10,8};
        quicksort(arr,0,arr.length-1);
        printarr(arr);
    }
    public static void printarr(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.printf("%d ",arr[i]);
        }
    }
    public static void quicksort(int[]arr,int i,int j){
        int start=i;int end=j;
        //出口条件
        if(start>end) return;
        //记录基准数
        int baseNumber=arr[i];
        while (start!=end){
            //利用end,从后往前找
            while(true){
                if(end<=start||arr[end]<baseNumber){
                    break;
                }
                end--;
            }
            //利用start,从前往后找
            while(true){
                if(end<=start||arr[start]>baseNumber){
                    break;
                }
                start++;
            }
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
        }
        int temp=arr[i];
        arr[i]=arr[start];
        arr[start]=temp;
        //递归
        //左边
        quicksort(arr,i,end-1);
        //右边
        quicksort(arr,end+1,j);
    }
}
