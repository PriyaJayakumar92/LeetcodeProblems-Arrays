import java.util.*;


class MyArrayLis <T> {
	Object[] myArray;
	int actsize=0;
	
	MyArrayLis(int size)
	{
		myArray = new Object[size];
	}
	
	void print()
	{
		for(int i=0;i<actsize;i++)
		{
			System.out.println(myArray[i]);
		}
		//System.out.println(Arrays.toString(myArray));
		
	}
	
	void add(String s)
	{
		if(actsize>=(myArray.length/2))
		{
			myArray = Arrays.copyOf(myArray, myArray.length*2);
		}
		myArray[actsize++] = s;
	}
	
	void remove(int index)
	{
		int tmp=index;
			while(index<actsize & index>=0)
			{
				myArray[tmp++] = myArray[++index];
			}
			actsize--;
	}
	
	void size()
	{
		System.out.println("Size: "+actsize);
	}
	
	void capacity()
	{
		System.out.println("Capacity: "+myArray.length);
	}
	
	Object get(int index)
	{
		if(index>actsize & index<0)
			return false;
		else
			return myArray[index];
	}
	
	void set(int index, Object o)
	{
		if(index>actsize & index<0)
			return;
		
		myArray[index] = o;
	}
}
public class MyArrayList{
	
	public static void main(String[] args) {
		MyArrayLis<String> a = new MyArrayLis<String>(10);
		a.add("Java");
		a.add("C");
		a.add("C++");
		System.out.println("ArrayList elements after performing add operation:");
		a.print();
		
		a.remove(1);
		System.out.println("ArrayList elements after performing remove operation:");
		a.print();
		
		a.size();
		a.capacity();
		
		System.out.println(a.get(1));
		a.set(0,"python");
		System.out.println("ArrayList elements after performing set operation:");
		a.print();
	
	}
}





