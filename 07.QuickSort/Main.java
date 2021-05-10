// Java program for implementation of QuickSort
class QuickSort
{
	int partition(int x[], int left, int right)
	{
		int pivot = x[right];
		int i = (left-1);  
		for (int j=left; j<right; j++)
		{
      if (x[j] <= pivot)
			{
				i++;
        int temp = x[i];
				x[i] = x[j];
				x[j] = temp;
			}
		}
		int temp = x[i+1];
		x[i+1] = x[right];
		x[right] = temp;

		return i+1;
	}
	void sort(int x[], int left, int right)
	{
		if (left < right)
		{
			int pi = partition(x, left, right);
    	sort(x, left, pi-1);
			sort(x, pi+1, right);
		}
	}
	public static void main(String args[])
	{
		int x[] = {7,6,3,8,5,2,1,4,9,10};
    int n = x.length;
    System.out.println("Array");
		for (int i=0; i<n; ++i)
			System.out.print(x[i]+" ");
		System.out.println();
		
		QuickSort ob = new QuickSort();
		ob.sort(x, 0, n-1);
    System.out.println("Array");
		for (int i=0; i<n; ++i)
			System.out.print(x[i]+" ");
		System.out.println();
	}
}