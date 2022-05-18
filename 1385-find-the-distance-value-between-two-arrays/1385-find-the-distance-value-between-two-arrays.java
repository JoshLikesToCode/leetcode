class Solution {
public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
int count=0;
Arrays.sort(arr2);
for(int i=0 ;i<arr1.length ;i++){
int low = 0 ,high = arr2.length -1 ,mid=0;
while(low<=high){
mid =( low+high)/2;
int x = arr1[i] ;

      if(arr2[mid]<x-d)
        low= mid+1;
      else if(arr2[mid]>x+d){
        high = mid-1;
      
      }
      else
        break;
         
       
    }
    
    if(low>high)
        count++;
  }
 return count;
  
}
}