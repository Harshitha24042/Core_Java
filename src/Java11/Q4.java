package Java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Q4{
	public static void main(String[] args) throws IOException {
		var path = "D:\\Students.TXT";
			String data = Files.readString(Path.of(path));
			List<String> lines = data.lines().filter(l->!l.isBlank()).map(String::strip).toList();
			System.out.println("Names="+lines+"\nCount="+lines.size());
	}
}