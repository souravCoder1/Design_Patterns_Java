package behavioral_design_pattern.Strategy.globalsoftwaresupport;

public class LaptopRenderer implements Renderer {
	
	@Override
	public void showImage() {
		System.out.println("Showing an image on laptop...");
	}
}
