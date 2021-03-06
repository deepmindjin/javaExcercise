public class Pair<K, V> {

	private K key;
	private V value;

	public Pair(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public V getValue(K key) {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;

	}
}

// public void add(K key, V value){
// ArrayList<V> valueList = new ArrayList<>();
// valueList.add(value);
// keyList.add(key);
// }
//
// public void remove(K key){
// keyList.remove(keyList.indexOf(key));
// }
