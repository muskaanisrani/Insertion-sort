import java.util.Scanner;
class Main {
  public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);System.out.println("enter the length of the array");
  int n=sc.nextInt();
  int arr[]=new int[n];
  for (int x=0;x<=n-1;x++) {
    System.out.print("enter the numbers of the array");
    arr[x]=sc.nextInt();
  }
  int z=0;
  int b=0;
for (int a=0;a<arr.length;a++) {
  z=arr[a];
  b=a;
  while (b>0 && z<arr[b-1]) {
    arr[b]=arr[b-1];
    b=b-1;
  }
  arr[b]=z;
}
 for (int m=0;m<=n-1;m++) {
    System.out.print(arr[m]+",");
  }
  }
}
