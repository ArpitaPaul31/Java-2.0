package set;


import org.junit.jupiter.api.Test;

class SetTest {
	@Test
	void testGenericSetOfStrings() {

//		Set<String> impl = new SetImpl<String>();
//
//		String str = "In Ulm und um Ulm und um Ulm herum";
//
//		for (String c : str.split(" ")) {
//			impl.add(c);
//		}
//
//		System.out.println(impl);
//
//		// Expected: In Ulm und um herum
//		assertEquals(5, impl.size());
//
//		// Elemente testen
//		assertTrue(impl.contains("In"));
//		assertTrue(impl.contains("Ulm"));
//		assertFalse(impl.contains(""));
//		assertFalse(impl.contains("Kevin"));
//		assertTrue(impl.contains("herum"));
//
//		for(String s : impl) {
//			System.out.println(s);
//		}
	}

	@Test
	void testGenericSetOfSweets() {

//        Sweet cb = new Sweet("Chocolate Bar", 7);
//        Sweet lp = new Sweet("Lollipop", 3);
//        Sweet gb = new Sweet("Gummy Bears", 5);
//        Sweet mm = new Sweet("Marshmallow", 4);
//        Sweet cc = new Sweet("Cotton Candy", 4);
//        Sweet tf = new Sweet("Toffee", 6);
//
//		// assert correct natural order
//		assertTrue(cb.compareTo(lp) > 0);
//		assertTrue(lp.compareTo(gb) < 0);
//		assertTrue(gb.compareTo(mm) > 0);
//		assertTrue(mm.compareTo(cc) < 0);
//		assertTrue(cc.compareTo(tf) < 0);
//
//		// some add order
//		Set<Sweet> sweets = new SetImpl<Sweet>();
//		sweets.add(cb);
//        sweets.add(lp);
//        sweets.add(gb);
//        sweets.add(mm);
//        sweets.add(cc);
//        sweets.add(tf);
//
//		List<Sweet> dummy = new ArrayList<>();
//		for(Sweet s : sweets) {
//			dummy.add(s);
//		}
//
//		assertEquals(6, dummy.size());
//		System.out.println(sweets);
	}
}