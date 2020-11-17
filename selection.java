package sort;
public class selectionsort 
{
    static void selectsort(int arr[])
    {
    	int n = arr.length,j;
    	for(int i=0;i<n-1;i++)
    	{
    		int min=i;
    		for(j=i+1;j<n;j++)
    		{
    			if(arr[j]<arr[min])
    			{
    			     min = j;	
    			}
    		}
    		int temp = arr[min];
			arr[min]   = arr[i];
    		arr[i] = temp;
    	}
    }
    static void print(int arr[])
    {
    	for(int i=0;i<arr.length;i++)
    	{
    		System.out.print(arr[i] + " ");
    	}
    }
	public static void main(String[] args) 
	{
        int[] arr = {10,2,5,11,20};
        selectsort(arr);
        print(arr);
	}

}
