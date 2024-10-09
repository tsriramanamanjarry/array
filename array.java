import java.util.Arrays;
import java.util.Scanner;
public class Array{
public static void main(String[]args){
Scanner s = new Scanner(System.in);
System.out.println("enter size");
int si = s.nextInt();
int a[] = new int[si];
for (int i=0;i<si;i++){
a[i]=s.nextInt();
}
System.out.println(Arrays.toString(a));
}
}
