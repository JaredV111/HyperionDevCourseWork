package working;

public class Task11 {
	public static void quickSort(int[] list) {
		quickSort(list, 0, list.length -1);
	}
	
	public static void quickSort(int[] list,int first, int last ) {
		if(last < first) {
			int pivotIndex = partition(list, first, last);
			quickSort(list, first, pivotIndex - 1);
			quickSort(list, pivotIndex + 1, last);
		}
		
	}
	public static int partition(int[] list, int first, int last) {
		int middle = list[(list.length - 1 ) / 2];
		//choose the median element as the pivot 
		int pivot = median(first, middle , last);
		int low = first + 1;//Index for the forwards search
		int high = last;//Index for the backwards search 
	
		while(high > low) {
				//Search forward from left
				while(low <= high && list[low] <= pivot)
						low ++;
				
				//Search backwards from the right
				while(low <= high && list[high] > pivot)
						high --;
				
				//Swap two elements in the list 
				if (high >low ) {
						int temp = list[high];
						list[high] = list[low];
						list[low] = temp;
					
				}
		}
		while (high > first && list[high] >= pivot)
			high --;
		
		//Swap pivot with list[high]
		if (pivot > list [high]) {
				list[first] = list[high];
				list[high] = pivot;
				return high;
			
		}
		else {
				return first;
		}
}

/** A test method */
	public static void main(String[]args) {
		int[]list = {2,3,2,5,6,1,-2,3,15,14};
		quickSort(list);
		for (int i = 0; i < list.length; i ++)
			System.out.println(list[i] + " ");
		System.out.println();
	}
/**Returns the median of three integers */
	public static int median(int first, int middle, int last) {
		return Math.max(Math.min(first, middle),
				Math.min(Math.max(first,middle), last));
	}
	}
