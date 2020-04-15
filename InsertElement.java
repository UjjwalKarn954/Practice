public class InsertElement{
   public static void main(String args[]){
   Scanner scan=new Scanner (Syatem.in);
   int n=scan.nextInt();
   int array[]=new int[n];
   for(int i=0;i<n;i++){
   array[i]=scan.nextInt();
   }
   int addelement=scan.nextInt();
   int index=scan.nextInt();
   for(int i=index;i<n;i++){
   array[i+1]=array[i];
   }
   array[i]=addelement;
   for(int i=0;i<array.length;i++);
   System.out.println("new array is"array[i]);
   }
   
