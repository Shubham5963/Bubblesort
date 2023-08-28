//bubble sort

class buble
{
public static void main(String args[])
{
	int a[ ] = {2,56,23,42,76,50,87,100};
	int temp,i,j,flag=0;
	for(i=0;i<a.length;i++)
	{
		System.out.println(a[i]+" ");
	}
	for(i=0;i<a.length;i++)
	{
		flag=0;
	}
	for(j=0;j<a.length-1;j++)
	{
		if(a[j]>a[j+1])
		{
			temp=a[j];
			a[j]=a[j+1];
			a[j+1]=temp;
			flag=1;
		}
	}

/*if(flag==0)
{
	break;
}*/
System.out.println("Array After Sorting");
for(i=0;i<a.length;i++)
{
	System.out.println(a[i]+" ");
}
}
}

