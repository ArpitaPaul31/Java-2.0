package task;

import stringset.StringSet;
import stringset.StringSetImpl;

public class Main {
    public static void main(String[] args) {

        // Playground
        StringSet set = new StringSetImpl();

        // The given StringSet works, but it can only store strings..
        set.add("word");
        System.out.println(set.contains("word"));
        System.out.println(set.size());

        // And it would be cool if we could just iterate over the set easily
//        for(String s : set) {
//
//        }
    }
}
