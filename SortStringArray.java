public class SortStringArray{
   public static void main(String args[]){
   Scanner scan=new Scanner(System.in):
   int n=scan.nextInt();
   scan.nextLine();
   String str[]=new String[n];
   For(int i=0;i<n;i++){
   str[i]=scan.nextLine();
   {
   for(int i=0;i<n;i++){
     for(int j=i+1;j<n;j++){
     if(str[i].compareTo(str[j])>0){
     String temp=str[i];
     str[i]=str[j];
     str[j]=temp;
     }}}
     System.out.println("sorted string array is"+Array.toString(str));
     }
     }
