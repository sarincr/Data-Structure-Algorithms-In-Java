class DataStruct
{
    void DataStruct(int X[])
    {
        int n = X.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (X[j] > X[j+1])
                {
                    int temp = X[j];
                    X[j] = X[j+1];
                    X[j+1] = temp;
                }
    }
 
    
     public static void main(String args[])
    {
        int X[] = {22,65,76,32,66,98,14,33};
        int n = X.length;
        for (int i=0; i<n; ++i)
        {
            System.out.print(X[i] + " ");
            System.out.println();
        }

        DataStruct obj = new DataStruct();
        obj.DataStruct(X);
        System.out.println("The new sorted Xay");
        for (int i=0; i<n; ++i)
        {
            System.out.print(X[i] + " ");
            System.out.println();
        }
    }
}