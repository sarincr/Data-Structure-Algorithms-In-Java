class App 
{
    public static void main(String args[])
	{
        int x[] = { 6,8,3,4,2,9,7,5,10,1 };
        int n = 10;
        for (int i = 0; i < n; ++i)
        {
            System.out.print(x[i] + " ");
        }
        for (int i = 1; i < n; ++i) 
        {
			int k = x[i];
			int j = i - 1;
			while (j >= 0 && x[j] > k) 
            {
				x[j + 1] = x[j];
				j = j - 1;
			}
            x[j + 1] = k;
        }
        System.out.println(); 
        for (int i = 0; i < n; ++i)
        {   
            System.out.print(x[i] + " ");
        }
    }
}