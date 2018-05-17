package imoti;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Buyer extends Client implements IBuyer {
	private static final String TYPE = "Buyer";
	private List<Inspection> inspections;

	public Buyer(String name, String phone, float money) {
		super(name, phone);
		super.setMoney(money);
		super.setTypeOfCLient(TYPE);

		this.inspections = new ArrayList<Inspection>();
	}

	@Override
	public void registerSerchProperty() {
		// TODO Auto-generated method stub

	}

	@Override
	public void requestInspection(Property property) {
		// TODO Auto-generated method stub

	}

	@Override
	public void buyProperty(Property property) {
		// TODO Auto-generated method stub

	}

	public List<Inspection> getInspections() {
		return Collections.unmodifiableList(this.inspections);
	}


}
