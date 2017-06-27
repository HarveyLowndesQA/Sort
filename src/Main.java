
public class Main {

	public static void main(String[] args) {
		
		int[] arr = {5, 4, 3, 2, 19, 102, 33, 9, 10, 1029, 6, 77, 8};
		
		BubbleSort bSort = new BubbleSort();
		if(bSort instanceof Sortable)
			bSort.sort(arr);
		
		System.out.println("Max: " + arr[0]);
		System.out.println("Min: " + arr[arr.length-1]);
	}

}
