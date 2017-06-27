
public class BubbleSort implements Sortable {

	public int[] sort(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			int swaps = 0;
			for(int j = 0; j < arr.length; j++) {
				if((j+1) < arr.length) {
					if(arr[j] < arr[j+1]) {
						int tmp = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = tmp;
						swaps++;
					}
				}
			}
			if(swaps == 0) {
				break;
			}
		}
		
		
		
		return arr;
	}
}
