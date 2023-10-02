package structural_design_pattern.Facade.email;

public class OrderEmailTemplate extends Template {

	@Override
	public String format(Object obj) {
		return "TEMPLATE";
	}

	
}
