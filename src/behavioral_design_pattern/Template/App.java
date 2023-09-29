package behavioral_design_pattern.Template;

public class App {

	public static void main(String[] args) {
		
		int[] nums = {1, 5, 3, -2, 10, 12, 8, 6, 5};
		
		Algorithm sorting = new BubbleSort(nums);
		sorting.sort();
		
	}
}
