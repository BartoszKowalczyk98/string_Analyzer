package string_Analyzer;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringAnalyzer {
	@RequestMapping(path = "/analyze/{var}")
	public String analyzeInput(@PathVariable String var) {
		StringBuilder stringBuilder = new StringBuilder("String ");
		int howHowManyLowerCase = 0;
		int howHowManyUpperCase = 0;
		for (int i = 0; i < var.length() ; i++) {
			if (Character.isLowerCase(var.charAt(i))){
				howHowManyLowerCase++;
			}if (Character.isUpperCase(var.charAt(i))){
				howHowManyUpperCase++;
			}
		}

		if (howHowManyLowerCase>0){
			stringBuilder.append("contains ").append(howHowManyLowerCase).append(" Lowercase letters");
		}
		if (howHowManyUpperCase>0){
			stringBuilder.append("contains ").append(howHowManyUpperCase).append(" Uppercase letters");
		}

		return stringBuilder.toString();
	}
}
