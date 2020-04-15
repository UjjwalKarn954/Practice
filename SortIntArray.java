public class SortIntArray{
 public class Swapelement{
   public void swap(int a,int b){
   int temp=a;
   a=b;
   b=temp;
   }
   }
   public static void main(String args[]){
   Scanner scan=new Scanner (System.in);
   Swapelement obi=new obj();
   int n=scan.nextInt();
   int array[]=new int[n];
   for(int i=0;i<n;i++){
   array[i]=scan.nextInt();
   }
   for(int i=0;i<n;i++){
     for(int j=i+1;j<n;j++){
     if(array[j]<array[i]){
    obj.swap(array[i],array[j]);
    }
    }
    }
    for(int i=0;i<n;i++){
    System.out.println("sorted array is"+array[i]);
    }
    }
    }
     
