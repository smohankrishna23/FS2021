import java.util.*;
public class Test{
	public static void merge(int[] a,int l,int mid,int h){
		int t=0;
		int[] temp=new int[h-l];
		while(l<mid && mid<h){
			temp[t++]=a[l]<=a[mid] ? a[l++]: a[h++];
		}	
	}
	public static void split(int[] a,int l,int h){
		int mid=(l+h)/2;
		System.out.println(a[mid]);
		if(l<h){
		split(a,l,mid);
		split(a,mid+1,h);
		merge(a,l,mid,h);
		}
	}
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[] a=new int[size];
		int i,j;
		for(i=0;i<size;i++)
			a[i]=sc.nextInt();
		split(a,0,size-1);
		System.out.println(Arrays.toString(a));
	}
}