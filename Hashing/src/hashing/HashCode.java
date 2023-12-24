package hashing;

import java.util.Scanner;

class Hash{
	int arr[];
	boolean flag[];
	int size;
	
	public Hash(int size)
	{
		arr=new int [size];
		flag=new boolean[size];
		this.size=size;
	}
	public int hash(int x)
	{
		return x%size;
	}
	public void insert(int key)
	{
		int i=0;
		int location=hash(key);
		do
		{
			if(!flag[location])
			{
				arr[location]=key;
				flag[location]=true;
				return;
			}
			else
			{
				i++;
				location=(hash(key)+i)%size;
			}
			
		}while(i<size);
		System.out.println(" Hash Table Is Full !!! ");
	}
	public void display()
	{
		for(int i=0;i<arr.length;i++)
		{
			if(flag[i])
				System.out.println(i+")"+arr[i]);
			else
				System.out.println(i+")-----");
		}
	
	}
public int search(int key)
{
	int location=hash(key);
	int i=0;
	do
	{
		if(arr[location]==key)
			return location;
		else
		{
			i++;
			location=(hash(key)+i)%size;
		}
		
	}while(i<size && flag[location]);
	return -1;
}
}

public class HashCode {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int size = sc.nextInt();
		
		Hash a1=new Hash(size);
		
		while(size>0) {
			System.out.println("Enter value to insert into array: ");
			int data = sc.nextInt();
			a1.insert(data);
			size--;
		}
		
		System.out.println("   "+a1.search(99));
		a1.display();

	}

}
