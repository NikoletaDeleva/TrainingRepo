package musicalInstruments;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

class Shop {
	private static final double INITIAL_INDEX = 0.0;
	private static final String MSG_TOTAL_SUM_SOLD_INSTRUMENTS = "Total sum of sold instruments: ";
	private static final String MSG_INSTRUMENTS_BY_SALE = "List of sold instruments by sale: ";
	private static final int MIN_LEN_NAME = 2;
	private static final String MSG_CATALOG_AVAILABLE_INSTRUMENTS = "Catalog available instruments: ";
	private static final String MSG_CATALOG_BY_PRICE_DESC = "Catalog instruments by price, desc: ";
	private static final String MSG_CATALOG_BY_PRICE_ASC = "Catalog instruments by price, ascending order: ";
	private static final String MSG_CATALOG_BY_NAME = "Catalog instruments by name: ";
	private static final String MSG_CATALOG_BY_KIND = "Catalog abount instruments by kind: ";
	private static final String INVALID_PARAMETERS_MSG = "Invalid parameters";
	private static final String MSG_NOT_AVAILABLE_INSTRUMENT = "Not available right now";
	private static final String MSG_INVALID_NAME_INSTURMENT = "No such an instrument";
	private static final String INVALID_NAME = "Invalid name";
	private static final int INITIAL_AMOUNT_INSTURMENT = Demo.random(100, 500);
	private static final int INITIAL_COUNT_INSTRUMENTS = 10;
	private static final String[] STRUNNI_INSTRUMENTI = { "cigulka", "viola", "kontrabas", "arfa", "kitara",
			"gydulka" };
	private static final String[] UDARNI_INSTRUMENTI = { "brabani", "tarambuka", "typan", "arfa", "daire" };
	private static final String[] DUHOVI_INSTRUMENTI = { "trompet", "trombon", "tuba", "fleita", "klarinet" };
	private static final String[] KLAVISHNI_INSTRUMENTI = { "organ", "piano", "akordeon" };
	private static final String[] ELEKTRONNI_INSTRUMENTI = { "sintezator", "bas-kitara", "el.cigulka" };
	private float cash;
	private Provider provider;
	private Map<String, Instrument> instruments = new TreeMap<>();
	private Map<InstrumentType, Integer> soldInstrumentsType = new HashMap<>();
	private Map<String, Double> instrumentsAndTotalAmount = new HashMap<>();
	
	Shop() throws InstrumentException {
		fillCatalog();
	}

	void sellInstrument(String name, int count) throws ShopException, InterruptedException {
		if (isValid(name) && count > 0) {
			while (this.instruments.get(name).getQuantity() <= count) {
				System.out.println("We don't have right now " + name + " in the count.");
				System.out.println("Instrument order in process");
				this.provider.makeOrder(name, count);
				synchronized (this) {
					this.notifyAll();
					this.wait();
				}
			}

			Instrument instrument = this.instruments.get(name);

			if (this.instruments.containsKey(name)) {
				if ((count <= instrument.getQuantity())) {
					instrument.decreaseQuantity(count);

					increaseSoldInsrumentsRepo(instrument, count);
					increaseInstruments(instrument,count);
					this.cash += instrument.getPrice() * count;
					System.out.println("Client bought " + count + " of " + name);
				} else {
					System.out.println(MSG_NOT_AVAILABLE_INSTRUMENT);
				}
			} else {
				System.out.println(MSG_INVALID_NAME_INSTURMENT);
			}

		} else {
			throw new ShopException(INVALID_PARAMETERS_MSG);
		}

	}

	private void increaseInstruments(Instrument instrument, int count) {
		String instrumentName = instrument.getName();
		if (!this.instrumentsAndTotalAmount.containsKey(instrumentName)) {
			this.instrumentsAndTotalAmount.put(instrumentName, 0.0);
		}
		double currentPrice = instrument.getPrice() * count;
		this.instrumentsAndTotalAmount.put(instrumentName, this.instrumentsAndTotalAmount.get(instrumentName) + currentPrice);
	}

	private void increaseSoldInsrumentsRepo(Instrument instrument, int count) {
		InstrumentType type = instrument.getType();
		
		if (!this.soldInstrumentsType.containsKey(type)) {
			this.soldInstrumentsType.put(type, 0);
		}
		this.soldInstrumentsType.put(type, this.soldInstrumentsType.get(type) + count);
	}

	void acceptInstrument(String name, int count) {
		if (isValid(name)) {
			if (count > 0) {
				this.instruments.get(name).increaseQuantity(count);
			}
		} else {
			System.out.println(INVALID_NAME);
		}
	}

	void printCalalogByChoice(CatalogType type, boolean isAscending) {
		switch (type) {
		case BY_KIND:
			showInstrumentsByKind();
			break;
		case BY_NAME:
			showInstrumentsByName();
			break;
		case BY_PRICE:
			showsInstrumentsByPrice(isAscending);
			break;
		case AVAILABLE:
			System.out.println(MSG_CATALOG_AVAILABLE_INSTRUMENTS);
			this.instruments
			.values()
			.stream()
			.filter(s -> s.getQuantity() != 0)
			.forEach(s -> System.out.println(" -" + s));
			break;
		}
	}

	private void showsInstrumentsByPrice(boolean isAscending) {
		if (isAscending) {
			System.out.println(MSG_CATALOG_BY_PRICE_ASC);
			this.instruments
			.values()
			.stream()
			.sorted((i1, i2) -> Float.compare(i1.getPrice(), i2.getPrice()))
			.forEach(s -> System.out.println(" -" + s));
		} else {
			System.out.println(MSG_CATALOG_BY_PRICE_DESC);
			this.instruments
			.values()
			.stream()
			.sorted((i1, i2) -> Float.compare(i2.getPrice(), i1.getPrice()))
			.forEach(s -> System.out.println(" -" + s));
		}

	}

	private void showInstrumentsByName() {
		System.out.println(MSG_CATALOG_BY_NAME);
		this.instruments.values().forEach(i -> System.out.println(" -" + i));

	}

	private void showInstrumentsByKind() {
		System.out.println(MSG_CATALOG_BY_KIND);
		SortedSet<Instrument> result = new TreeSet<>((i1, i2) -> {
			if (i1.getType().compareTo(i2.getType()) == 0) {
				return i1.getQuantity() - i2.getQuantity();
			}
			return i1.getType().compareTo(i2.getType());
		});

		result.addAll(this.instruments.values());
		result.forEach(i -> System.out.println(" -" + i));
	}

	private void fillCatalog() throws InstrumentException {
		generateStrunniInstrumenti();
		generateUdarniInstrumenti();
		generateDuhovniInstrumenti();
		generateKlavishniInstrumenti();
		generateElektronniInstrumenti();
	}

	private void generateStrunniInstrumenti() throws InstrumentException {
		for (int count = 0; count < STRUNNI_INSTRUMENTI.length; count++) {
			instruments.put(STRUNNI_INSTRUMENTI[count], new Instrument(STRUNNI_INSTRUMENTI[count],
					INITIAL_COUNT_INSTRUMENTS, Demo.random(100, 500), InstrumentType.STRUNEN));
		}
	}

	private void generateUdarniInstrumenti() throws InstrumentException {
		for (int kind = 0; kind < UDARNI_INSTRUMENTI.length; kind++) {
			instruments.put(UDARNI_INSTRUMENTI[kind], new Instrument(UDARNI_INSTRUMENTI[kind],
					INITIAL_COUNT_INSTRUMENTS, Demo.random(100, 500), InstrumentType.UDAREN));
		}
	}

	private void generateDuhovniInstrumenti() throws InstrumentException {
		for (int kind = 0; kind < DUHOVI_INSTRUMENTI.length; kind++) {
			instruments.put(DUHOVI_INSTRUMENTI[kind], new Instrument(DUHOVI_INSTRUMENTI[kind],
					INITIAL_COUNT_INSTRUMENTS, Demo.random(100, 500), InstrumentType.DUHOV));
		}
	}

	private void generateKlavishniInstrumenti() throws InstrumentException {
		for (int kind = 0; kind < KLAVISHNI_INSTRUMENTI.length; kind++) {
			instruments.put(KLAVISHNI_INSTRUMENTI[kind], new Instrument(KLAVISHNI_INSTRUMENTI[kind],
					INITIAL_COUNT_INSTRUMENTS, Demo.random(100, 500), InstrumentType.KLAVISHEN));
		}
	}

	private void generateElektronniInstrumenti() throws InstrumentException {
		for (int kind = 0; kind < ELEKTRONNI_INSTRUMENTI.length; kind++) {
			instruments.put(ELEKTRONNI_INSTRUMENTI[kind], new Instrument(ELEKTRONNI_INSTRUMENTI[kind],
					INITIAL_COUNT_INSTRUMENTS, Demo.random(100, 500), InstrumentType.ELEKTRONEN));
		}
	}


	public void showListOfSoldInstrumentsBySale() {
		System.out.println(MSG_INSTRUMENTS_BY_SALE);
		this.soldInstrumentsType
		.entrySet()
		.stream()
		.sorted((i1,i2) -> Integer.compare(i2.getValue(), i1.getValue()))
		.forEach(i -> System.out.println(" -" + i.getKey()));
	}

	public void generateTotalSumOfSoldInstruments() {
		
		double result = this.instrumentsAndTotalAmount
		.values()
		.stream()
//		.mapToInt(v -> v.doubleValue()).sum();
		.reduce(INITIAL_INDEX, (x, y) -> x + y);
		System.out.println(MSG_TOTAL_SUM_SOLD_INSTRUMENTS + result + "BGN");
	}

	public void getBestSellingInstrument() {
		InstrumentType result = this.soldInstrumentsType
				.entrySet()
				.stream()
				.sorted((i1,i2) -> Integer.compare(i2.getValue(), i1.getValue())).map(k -> k.getKey()).findFirst().get();
		System.out.println("Most selling instrument type: " + result);

	}

	public void biggestIncomeFromInstrument() {
		double sum = this.instrumentsAndTotalAmount
				.values()
				.stream()
				.sorted((i1,i2) -> Double.compare(i2, i1))
				.findFirst().get();
		String name = this.instrumentsAndTotalAmount
				.entrySet()
				.stream()
				.sorted((i1,i2) -> Double.compare(i2.getValue(), i1.getValue())).map(k -> k.getKey()).findFirst().get();
		
		System.out.println(String.format("Biggest income is: %.2fBGN of instrument: %s", sum,name ));
	}
	
	private boolean isValid(String name) {
		return name != null && name.length() > MIN_LEN_NAME;
	}

	public void setProvider(Provider provider) {
		this.provider = provider;
	}


}
