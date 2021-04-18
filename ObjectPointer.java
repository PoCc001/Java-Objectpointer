package objptr;

/**
 * This class can be used to enable calling by reference.
 * 
 * Unfortunately, getting the actual address of the pointer in memory is not possible.
 * 
 * @author Johannes Kloimböck
 *
 * @param <T>
 */
public class ObjectPointer<T> {
	// the "pointer" is actually an array with one element
	private Object ptr [] = new Object [1];
	
	/**
	 * Initializes a pointer to the parameter object.
	 * @param obj is the object that the pointer is supposed to point to
	 */
	public ObjectPointer (T obj) {
		ptr[0] = obj;
	}
	
	/**
	 * Initializes a null-pointer.
	 */
	public ObjectPointer () {
		ptr[0] = null;
	}
	
	/**
	 * Get the object from the ObjectPointer.
	 * @return the object to use it separatly from the ObjectPointer
	 */
	@SuppressWarnings("unchecked")
	public T getObject () {
		return (T)(ptr [0]);
	}
	
	/**
	 * Modify the current object the ObjectPointer is pointing to.
	 * @param newObj is the new object that replaces the old one
	 */
	public void setObject (T newObj) {
		ptr [0] = newObj;
	}
	
	@Override
	public String toString () {
		return getObject().toString();
	}
}
