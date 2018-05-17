package brokerAgency;

public interface IBuyer {
	public void registerPropertyRequest(Agency agency);
	public boolean requestInspection(Property property);
	public boolean requestPurchase(Property property);
}
