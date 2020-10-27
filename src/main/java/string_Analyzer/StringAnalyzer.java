package string_Analyzer;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringAnalyzer {
	@RequestMapping(path = "/analyze/{var}")
	public String analyzeInput(@PathVariable String var){
		return "Test";
	}
}
