import java.util.stream.IntStream;

public class Validator {

	public static boolean validateUsingIntStream(String originalString) {
		String tempString = originalString.replaceAll("\\s+", "").toLowerCase();
		return IntStream.range(0, tempString.length() / 2)
				.noneMatch(i -> tempString.charAt(i) != tempString.charAt(tempString.length() - i - 1));
	}
	
	public static boolean validateUsingLoop(String inputStr) {
	    String reverseStr = "";
		for (int i = inputStr.length() - 1; i >= 0; i--) {
			reverseStr = reverseStr + inputStr.charAt(i);
		}

		if (inputStr.equalsIgnoreCase(reverseStr))
			return true;
		return false;
	}
	
}
