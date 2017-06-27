
public class SortNoSort {
	
	
	public static void main(String args[]) {
		
		int order[] = new int[3];
		
		int n[] = {45,67,89,2,454, 454, 454, 123,45,-1};

	
		for(int j = 0; j < 3; j++) {
			
			int largest = 0x80000000;
			
			for(int i = 0; i < n.length; i++) {
				if(n[i] > largest) {
					if(j !=0) {
						if(n[i] != order[j-1]) {
							if(j == 2) {
								if(n[i] != order[j-2]) {
									largest = n[i];
								}
							} else {
								largest = n[i];
							}
						}					
					} else {
						largest = n[i];
					}
					
				}
			}
			
			order[j] = largest;
		}
		
		for(int i = 0; i < order.length; i++) {
			System.out.println(order[i]);
		}
		
	}

}
