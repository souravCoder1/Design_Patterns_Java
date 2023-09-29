package behavioral_design_pattern.Strategy.globalsoftwaresupport;

public class ImageManager {

	// abstraction - we know nothing about the low level implementations
	private Renderer renderer;
	
	public void setRenderer(Renderer renderer) {
		this.renderer = renderer;
	}
	
	public void show() {
		this.renderer.showImage();
	}
}
