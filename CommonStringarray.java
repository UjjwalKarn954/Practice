public class CommonStringarray{
   public static void main(Strin args[]){
   Scanner scan=new Scanner(System.in);
   int n=scan.nextInt();
   scan.nextLine();
   String str[]=new String[n];
   For(int i=0;i<n;i++){
   str[i]=scan.nextLine();
   }
   String str1[]=new String[n];
   For(int i=0;i<n;i++){
   str1[i]=scan.nextLine();
   }
   for(int i=0;i<str.length;i++){
   for(int j=0;j<str1.length;j++){
   if(str[i].equals(str1[j])){
   System.out.println(str[j]);
   }
   }
   }
   }
   
