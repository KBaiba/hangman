package lv.accenture.preboot.hangman;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;

public class WordChooser {

	public String getWord() {
		try {
			Path path = Paths.get("data.txt");
			List<String> lines = Files.readAllLines(path);

			int r = new Random().nextInt(lines.size());
			return lines.get(r);

		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
