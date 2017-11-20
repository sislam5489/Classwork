
public class EveryOther {
	public static void main(String [] args)
	{
		String[] arr1 = {"Hello","how","you"};
		String[] arr2 = {", "," are ",  "?"};
		String [] arr3 = everyOther(arr1,arr2);
		printArr(arr3);
	}
	public static String[] everyOther(String[]list1,String[]list2)
	{
		String[] result = new String[list1.length + list2.length];
		int index = 0;
		for(int i = 0;i<list1.length && i<list2.length;i++)
		{
			result[index] = list1[i];
			result[index+1] = list2[i];
			index +=2;
			
		}
		//the rest of this code helps us take the remaining items if one array is longer than the other.
		if(list1.length > list2.length)
		{
			for(int j = list2.length;j<list2.length; j++)
			{
				result[index] = list1[j];
			}
			
		}
		else // Should this be else-if?
		{
			for( int j = list1.length;j<list2.length;j++)
			{
				result[index] = list2[j];
			}
		}
		return result;
	}
	public static void printArr(String[]arr)
	{
		for(int i = 0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
	}
}
