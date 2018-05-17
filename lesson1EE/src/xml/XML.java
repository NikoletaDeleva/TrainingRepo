package xml;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

public class XML {
	public static void main(String[] args) {
		List<Sudjuck> sudjuci = new ArrayList<Sudjuck>();
		try {
			File inputFile = new File("src" + File.separator + "xml" + File.separator + "sudjuci.xml");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(inputFile);
			doc.getDocumentElement().normalize();
			System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
			NodeList nList = doc.getElementsByTagName("sudjuk");
			System.out.println("----------------------------");

			for (int temp = 0; temp < nList.getLength(); temp++) {
				Node nNode = nList.item(temp);
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode;
					String proizvoditel = eElement.getAttribute("proizvoditel");
					String sustavki = eElement.getElementsByTagName("sustavki").item(0).getTextContent();
					String debelina = eElement.getElementsByTagName("debelina").item(0).getTextContent();
					sudjuci.add(new Sudjuck(proizvoditel, sustavki, debelina));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		for (Sudjuck sudjuck : sudjuci) {
			System.out.println(sudjuck.getProizvoditel() + " " + sudjuck.getSustavki() + " " + sudjuck.getDebelina());
		}
	}
}
