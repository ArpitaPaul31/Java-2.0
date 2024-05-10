package stringset;

public class StringSetImpl implements StringSet {

	Element root;

	class Element {
		String val;
		Element left, right;
		private Element(String v, Element l, Element r) {
			val = v;
			left = l;
			right = r;
		}
		int size() {
			return 1
					+ (left == null ? 0 : left.size()) // ternary operator cond ? if-true : if-false
					+ (right == null ? 0 : right.size());
		}

		public String toString() {
			return val
				+ (left == null ? "" : ", " + left)
				+ (right == null ? "" : ", " + right);
		}
	}


	@Override
	public boolean add(String s) {
		Element e = new Element(s, null, null);

		Element cursor = root;
		while(cursor != null) {
			int cmp = e.val.compareTo(cursor.val); // returns cmp < 0 if e < cursor
			if(cmp == 0) {
				return false;
			} else if(cmp < 0) {
				if(cursor.left == null) {
					cursor.left = e;
					return true;
				} else {
					cursor = cursor.left;
				}
			} else {
				if(cursor.right == null) {
					cursor.right = e;
					return true;
				} else {
					cursor = cursor.right;
				}
			}
		}

		// reached only if we could not add the element anywhere in the tree
		root = e;
		return true;
	}

	@Override
	public boolean contains(String s) {
		Element cursor = root;
		while(cursor != null) {
			int cmp = s.compareTo(cursor.val);
			if(cmp == 0) {
				return true;
			} else if(cmp < 0) {
				cursor = cursor.left;
			} else {
				cursor = cursor.right;
			}
		}
		// Element not found
		return false;
	}

	@Override
	public int size() {
		if (root == null) {
			return 0;
		} else {
			return root.size();
		}
	}

	@Override
	public String toString() {
		if (root == null) {
			return "{}";
		} else {
			return "{" + root + "}";
		}
	}
}
