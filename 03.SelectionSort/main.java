class SelectionSort
{
	public static void main(String args[])
	{
		SelectionSort ob = new SelectionSort();
		int x[] = {6,8,3,4,2,9,7,5,10};
		int n = x.length;
        System.out.println("Array ");
        for (int i=0; i<n; ++i)
			System.out.print(x[i]+" ");
		System.out.println();
        for (int i = 0; i < n-1; i++)
		{
            int minimum_id = i;
			for (int j = i+1; j < n; j++)
				if (x[j] < x[minimum_id])
					minimum_id = j;
            int temp = x[minimum_id];
			x[minimum_id] = x[i];
			x[i] = temp;
		}
		System.out.println("Sorted array ");
		for (int i=0; i<n; ++i)
			System.out.print(x[i]+" ");
		System.out.println();
	}
}
