package task1;

public enum SortCriteria {
	NAME("name"), AGE("age"), SALARY("salary");
	
	@SuppressWarnings("unused")
	private String criteria;

	private SortCriteria(String criteria) {
		this.criteria = criteria;
	}
}
