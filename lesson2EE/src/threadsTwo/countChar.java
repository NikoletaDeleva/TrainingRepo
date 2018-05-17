package threadsTwo;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class countChar {
	public static void main(String[] args) {
		String text;
		InputStream is;

		try {
			is = new URL("http://norvig.com/big.txt").openStream();
			text = is.toString();
			byte[] bytes = new byte[new URL("http://norvig.com/big.txt").openConnection().getContentLength()];

			for (int c = 0; c < bytes.length; c++) {
				int x = (byte) is.read();
				if (x == -1)
					break;
				bytes[c] = (byte) x;
			}
			text = new String(bytes, "UTF-8");

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
