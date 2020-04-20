public class SecondHigestnum{
  public Static void main(String args[]){
    Scanner scan=new Scanner (System.in);
    int n=scan.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=scan.nextInt();
    }
    arr.sort();
    System.out.println(arr[n-1]);
  }
}

