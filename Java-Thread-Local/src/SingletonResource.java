
public class SingletonResource {

	static SingletonResource singletonObject;

	public ThreadLocal<Integer> number_of_time_used = ThreadLocal.withInitial(() -> 0);

	public void setValue() {
		number_of_time_used.set(((Integer) number_of_time_used.get()) + 1);
	}

	public Integer getvalue() {
		return number_of_time_used.get();
	}

	static public SingletonResource getSingletomObject() {
		synchronized (SingletonResource.class) {
			if (singletonObject != null) {
				return singletonObject;
			}
			singletonObject = new SingletonResource();
			return singletonObject;
		}
	}

}
