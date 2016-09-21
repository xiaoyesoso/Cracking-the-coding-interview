import java.util.*;

public class woStacks {
	public ArrayList<Integer> twoStacksSort(int[] numbers) {
		// write code here
		ArrayList<Integer> result = new ArrayList<Integer>();
		int len = numbers.length;
		int top = 0;
		while (top < len) {
			int tmp = numbers[top++];
			while (!result.isEmpty() && result.get(result.size() - 1) < tmp) {
				numbers[--top] = result.get(result.size() - 1);
				result.remove(result.size() - 1);
			}
			result.add(tmp);
		}
		return result;
	}
}
