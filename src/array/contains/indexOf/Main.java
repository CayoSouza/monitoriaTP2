package array.contains.indexOf;

public class Main {
	
	static boolean contains(int x, int[] array){
		for(int i : array)
			if(i==x)
				return true;
		
		return false;
	}
	
	static boolean contains(Object x, Object[] array){
		for(Object i : array)
			if(i==x)
				return true;
		
		return false;
	}
	
	static int indexOf(Object x, Object[] array){
		int count = 0;
		for(Object i : array){
			if(i==x)
				return count;
			count++;
		}
			
		return -1;
	}

	public static void main(String[] args) {
		Object[] array = {1,2,3,4,5};
		
		System.out.println(contains(5, array));
//		System.out.println(indexOf(0, array));
	}

}
