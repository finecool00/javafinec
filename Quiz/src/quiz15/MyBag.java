package quiz15;

public class MyBag implements IBag {

	String[] arr = new String[100];
	
	private int i = 0;
//	private String str = "";
	
	@Override
	public void insert(String item) {
			arr[i] = item;
			i++;
	}

	@Override
	public void print() {
		for(int j = 0; j < i; j++) {
//			str += arr[j] + " ";
			System.out.print(arr[j] + " ");
		}
//		System.out.println(str);
		System.out.println();
	}

	@Override
	public int search(String item) {
		
		for(int j = 0; j < arr.length; j++) {
			if(arr[j].equals(item)) {
				return j;
			}
		}
		return -1;
	}

	@Override
	public boolean delete(String item) {
		
		if(item == null) return false;
		
		for(int n = 0; n < i; n++) {
			//찾은 경우의 조건
			if(arr[n].equals(item)) {
				//뒤의 아이템을 당기고 종료
				for(int j = n; j < i - 1; j++) {
					arr[j] = arr[j+1];
				}
				arr[i-1] = null;
				i--;
				return true;
			} 
		}
		return false;
	}		
}
