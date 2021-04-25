import java.util.Arrays;
 
class Main
{
private static final float sf = 1.3f;
public static void combSort(int[] x) 
{
  if(x == null || x.length < 2) 
  {
    return;
    }
    int n = x.length;
    int gap = n;
    boolean swapped = false;
    do {
      gap = (int) (gap / sf);
      for (int i = 0; i < n - gap; i++)
       {
         if (x[i] > x[i + gap]) 
         {
           swap(x, i, i + gap);
           swapped = true;
           }
           }
           } 
           while (gap > 1 && swapped);
           }
           private static void swap(int[] x, int i, int j) 
           {
             int temp = x[i];
             x[i] = x[j];
             x[j] = temp;
             }
public static void main(String args[])
{
  int[] x = {55,33,4,96,33,5,74,86,35,74,84};
  combSort(x);
  System.out.println(Arrays.toString(x));
  }
}