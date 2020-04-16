public class ReverseIntArray{
   public static void main(String rgs[]){
   Scanner scan=new Scanner (System.in);
   int n=scan.nextInt();
   int arr[]=new int[n];
   for(int i=0;i<arr.length;i++){
   arr[i]=scan.nextInt();
   }
   for(int i=arr.length;i<0;i--){
   system.out.println(arr[i]);
   }
   }
}

   
