import java.util.*;

public class SetOfStacks {
	public static ArrayList<ArrayList<Integer>> setOfStacks(int[][] ope, int size) {
		// write code here
		int len = ope.length;
		ArrayList<ArrayList<Integer>> mySet = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> myStack = new ArrayList<Integer>();
		for (int i = 0; i < len; ++i) {
			if (ope[i][0] == 1) {
				if (myStack.size() == size) {
					mySet.add(new ArrayList<Integer>(myStack));
					myStack.clear();
				}
				myStack.add(ope[i][1]);
			} else {
				if (myStack.size() == 0) {
					myStack = mySet.get(mySet.size() - 1);
					mySet.remove(mySet.size() - 1);
				}
				myStack.remove(myStack.size() - 1);
			}
		}
		if (!myStack.isEmpty()) {
			mySet.add(myStack);
		}
		return mySet;
	}
}
