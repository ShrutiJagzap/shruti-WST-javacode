public class DutchNationalFlag {
    public static void sortTheNumber(int arr[]){
        int low=0;  //pointer for next position of 0
        int mid=0;  //Current element being cheched
        int high=arr.length-1;  //poonter for next position of 2
        while(mid<=high){
            
            switch (arr[mid]) {
                case 0:
                //swap arr[low] and arr[mid],increment both
                int temp0=arr[low];
                arr[low]=arr[mid];
                arr[mid]=temp0;
                low++;
                mid++; 
                break;

                case 1:
                //just move to next element
                mid++;
                break;

                case 2:
                int temp2=arr[high];
                arr[high]=arr[mid];
                arr[mid]=temp2;
                high--;
                break;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={0,1,2,1,0,2,1,0};
        sortTheNumber(arr);
        System.out.print("Sorted Array:");
        for(int num:arr){
            System.out.print(num+" ");
        }
        
    }
    
}
