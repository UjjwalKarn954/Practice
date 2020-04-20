public class ReverseString{
  public static void main(String args[]){
  Scanner scan=new Scanner(System.in);
  String str="java is awesome programming language";
  String ans="";
  int i=str.length()-1;
  while(i>=0){
    while(i>=0 && str.charAt(i)==' '){
    i--;
    }
    int j=i;
    while(i>=0 && str.charAt(i)!==' '){
    i--;
    }
    if(i<0) break;
    if(str.isEmpty()){
     ans=ans.concat(str.substring(i+1,j+1);
     }
     else{
     ans=ans.concat(" "+str.substring(i+1,j+1));
     }
    } 
     
  System.out.println(ans);   
     
    
    
