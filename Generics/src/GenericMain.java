import java.util.List;

public class GenericMain {

	public static void main(String[] args) {
		Pair<String, Integer> a = new Pair<>("오늘", 929);
		Pair<String, Integer> b = new Pair<>("오늘", 928);

		boolean result = compare(a, b);

		if (result) {
			System.out.println("두 개의 값이 같습니다.");
		} else {
			System.out.println("두 개의 값이 다릅니다.");
		}
	}
	
	// ?는 와일드카드라고 한다 extends는 이걸 상속한것만 사용하게 한다
	public void printNumbers(List<? extends Number> list){
		for(Number data : list){
			System.out.println(data);
		}
	}

	public static <K, V> boolean compare(Pair<K, V> a, Pair<K, V> b) {
		boolean same = false;
		K akey, bkey;
		V avalue, bvalue;
		// 두 개의 페어값을 받아서 같은 값인지 비교하는 로직을 작성하세요
		akey = a.getKey();
		bkey = b.getKey();
		avalue = a.getValue(akey);
		bvalue = b.getValue(bkey);

		if (akey.equals(bkey)) {
			if (avalue.equals(bvalue)) {
				same = true;
			}
		}

		return same;
	}

}

// public static <E> void print(E[] elements){
// for(E e: elements){
// System.out.println("내용="+e);
// }
// }

// 원래 함수안에 배열이 있고 그 안에 정해진 것밖에 못오는데
// 아무거나 넣을 수 있도록 만든게 Generic이고
// class이름<T> 로 만든다
// T라고 예시된 generic에는 T(ype), K(eyValue), E(lement), V(alue), N(umberType)인 5가지의
// 글자만 사용하는게 약속이다
//
// Main{
// CustomArrayList list = new CustromArrayList();
//
// String data = "안녕";
// list.add(data);
//
// CustomArrayLisr<Integer> list2 = new CustomArrayList<>();
// Integer data3 = 1;
// list2.add(data3);
// }
//
//
// class CustomArrayList<T>{
//
// int index = 0;
// T datas = new T[100];
//
// public void add(T data){
// datas[index] = data;
// index++;
// }
//
// public T get(T index){
// return datas[index];
// }
//
// }