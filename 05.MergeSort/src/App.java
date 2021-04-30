public class App
{
void merge(int x[], int left, int point, int right)
{
	int l = point - left + 1;
	int r = right - point;
	int larray[] = new int [l];
	int rarray[] = new int [r];
	for (int i=0; i<l; ++i)
	{
		larray[i] = x[left + i];
	}
	for (int j=0; j<r; ++j)
	{
		rarray[j] = x[point + 1+ j];
	}
	int i = 0, j = 0;
	int k = left;
	while (i<l&&j<r)
	{
		if (larray[i] <= rarray[j])
		{
			x[k] = larray[i];
			i++;
		}
		else
		{
			x[k] = rarray[j];
			j++;

		}
		k++;
	}
	while (i<l)
	{
		x[k] = larray[i];
		i++;
		k++;
	}
	while (j<r)
	{
		x[k] = rarray[j];
		j++;
		k++;
	}
}
void sort(int x[], int left, int right)
{
	if (left<right)
	{
		int point = (left+right)/2;
		sort(x, left, point);
		sort(x , point+1, right);
		merge(x, left, point, right);
	}
}
public static void main(String args[])
{
	int x[] = {6,8,3,4,2,9,7,5,10,1 };
	System.out.println("xay");
	for(int i =0; i<x.length;i++)
	{
		System.out.print(x[i]+",");
	}
	App ob = new App();
	ob.sort(x, 0, x.length-1);
	System.out.println(); 
	System.out.println("Sorted xay");
	for(int i =0; i<x.length;i++)
	{
		System.out.print(x[i]+",");
	}
}
}