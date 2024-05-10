package stringset;

public interface StringSet {
	/**
	 * Adds a string to the set
	 * @param s The string to add
	 * @return true if string was successfully added (did not exist yet), or false if the set
	 * 			already contained the string s
	 */
	boolean add(String s);

	/**
	 * Checks whether string s is already contained in set
	 */
	boolean contains(String s);

	/**
	 * Return size of set
	 */
	int size();
}
