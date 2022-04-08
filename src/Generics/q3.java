package Generics;

class Generics<T>{
	public T[] swap(T[] a, int i, int j) {
        T temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        return a;
	}
	
}
public class q3 {

	public static void main(String[] args) {
		Integer arr[] = {1,2,3,4,5};
		Generics<Integer> obj = new Generics<>();
		Integer[] arr1=obj.swap(arr, 0, 3);
		for(int i : arr1) {
			System.out.println(i);
		}

	}

}
