package bank;

public abstract class Product {
		private String type;
		private float lihva;
		private int period;
		private float nalichnost;
		
		public Product(String type, int period, float lihva) {
			this.type = type;
			this.period = period;
			this.lihva = lihva;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public float getLihva() {
			return lihva;
		}

		public void setLihva(float lihva) {
			this.lihva = lihva;
		}

		public int getPeriod() {
			return period;
		}

		public void setPeriod(int period) {
			this.period = period;
		}

		public float getNalichnost() {
			return nalichnost;
		}

		public void setNalichnost(float nalichnost) {
			this.nalichnost = nalichnost;
		}
		
		
		
}
