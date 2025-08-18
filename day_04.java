import java.util.Arrays;

public class day_04 {
    private static int nextGap(int gap){
        if(gap<=1){
            return 0;
        }
        return (gap/2)+(gap%2);
    }
    public static void merge(int arr1[],int arr2[],int m,int n){
        int gap=m+n;
        for(gap=nextGap(gap);gap>0;gap=nextGap(gap)){
            for(int i=0;i+gap<m;i++){
                if(arr1[i]>arr1[i+gap]){
                    int temp=arr1[i];
                    arr1[i]=arr1[i+gap];
                    arr1[i+gap]=temp;
                }
            }
            int j;
            for(int i=Math.max(0,m-gap);i<m && (j=i+gap-m)<n;i++){
                if(arr1[i]>arr2[j]){
                    int temp=arr1[i];
                    arr1[i]=arr2[j];
                    arr2[j]=temp;
                }
            }
            for(int i=0;i+gap<n;i++){
                if(arr2[i]>arr2[i+gap]){
                    int temp=arr2[i];
                    arr2[i]=arr2[i+gap];
                    arr2[i+gap]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr1[]={1,3,5,7};
        int arr2[]={2,4,6,8};
        merge(arr1, arr2, arr1.length, arr2.length);
        System.out.println("arr1="+Arrays.toString(arr1));
        System.out.println("arr1="+Arrays.toString(arr2));
        
    }
    
}
