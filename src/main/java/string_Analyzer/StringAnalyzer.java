package string_Analyzer;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringAnalyzer {
	@RequestMapping(path = "/analyze/{var}")
	public String analyzeInput(@PathVariable String var) {
		StringBuilder stringBuilder = new StringBuilder("String ");
		int howManyLowerCase = 0;
		int howManyUpperCase = 0;
		int howManyNumbers = 0;
		int howManySpecialSigns = 0;
		for (int i = 0; i < var.length(); i++) {
			if (Character.isLowerCase(var.charAt(i))) {
				howManyLowerCase++;
			} else if (Character.isUpperCase(var.charAt(i))) {
				howManyUpperCase++;
			} else if (Character.isDigit(var.charAt(i))) {
				howManyNumbers++;
			} else {
				howManySpecialSigns++;
			}
		}

		if (howManyLowerCase > 0) {
			stringBuilder.append("contains ").append(howManyLowerCase).append(" Lowercase letters ");
		}
		if (howManyUpperCase > 0) {
			stringBuilder.append("contains ").append(howManyUpperCase).append(" Uppercase letters ");
		}
		if (howManyNumbers > 0) {
			stringBuilder.append("contains ").append(howManyNumbers).append(" numbers ");
		}
		if (howManySpecialSigns > 0) {
			stringBuilder.append("contains ").append(howManySpecialSigns).append(" special signs ");
		}

		return stringBuilder.toString();
	}
}
