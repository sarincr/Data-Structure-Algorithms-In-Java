class Main
{
	public static void main(String args[])
	{
		int x[] = {7,6,3,8,5,2,1,4,9,10};
		System.out.println("Array ");
    int n = x.length;
		for (int i=0; i<n; ++i)
      System.out.print(x[i] + " ");
		System.out.println();
    for (int index = n/2; index > 0; index /= 2)
		{
			for (int i = index; i < n; i += 1)
			{
				int temp = x[i];
        int j;
				for (j = i; j >= index && x[j - index] > temp; j -= index)
				x[j] = x[j - index];
				x[j] = temp;
			}
		}
		System.out.println("Sorted Array");
		for (int i=0; i<n; ++i)
      System.out.print(x[i] + " ");
		System.out.println();
	}
}
