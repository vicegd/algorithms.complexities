package algorithms.complexities.generator

import algorithms.complexities.complexities.TimeUnits
import java.util.regex.Pattern

class Utils {
	val static SECONDS_MINUTE = 60
	val static SECONDS_HOUR = 60 * SECONDS_MINUTE
	val static SECONDS_DAY = 24 * SECONDS_HOUR
	val static SECONDS_WEEK = 7 * SECONDS_DAY
	val static SECONDS_MONTH = 30 * SECONDS_DAY
	val static SECONDS_YEAR = 12 * SECONDS_MONTH
	
	def static getValueExp(String complexity) {
		// O\\(n\\^[1-9]+\\)
		var pattern = Pattern.compile("\\^(.+)\\)");
		var matcher = pattern.matcher(complexity);
		matcher.find()
		Double.parseDouble(matcher.group(1))
	}
	
	def static getValueLinLogExp1(String complexity) {
		// O\\(n\\^[1-9]+log\\^[1-9]+\\sn\\
		var pattern = Pattern.compile("\\^(.+)log");
		var matcher = pattern.matcher(complexity);
		matcher.find()
		Double.parseDouble(matcher.group(1))
	}
	
	def static getValueLinLogExp2(String complexity) {
		// O\\(n\\^[1-9]+log\\^[1-9]+\\sn\\
		var pattern = Pattern.compile("log\\^(.+)\\s");
		var matcher = pattern.matcher(complexity);
		matcher.find()
		Double.parseDouble(matcher.group(1))
	}
	
	def static getValuePower(String complexity) {
		// O\\([1-9]+\\^n\\)
		var pattern = Pattern.compile("\\((.+)\\^");
		var matcher = pattern.matcher(complexity);
		matcher.find()
		Double.parseDouble(matcher.group(1))
	}

	def static matchUnits(double value, TimeUnits input, TimeUnits output) {
		var seconds = 0.0
	
		switch (input) {
			case TimeUnits.SECONDS:
				seconds = value
			case TimeUnits.MINUTES:
				seconds = value * SECONDS_MINUTE	
			case TimeUnits.HOURS:
				seconds = value * SECONDS_HOUR	
			case TimeUnits.DAYS:
				seconds = value * SECONDS_DAY	
			case TimeUnits.WEEKS:
				seconds = value * SECONDS_WEEK	
			case TimeUnits.MONTHS:
				seconds = value * SECONDS_MONTH	
			case TimeUnits.YEARS:
				seconds = value * SECONDS_YEAR				
		}
		
		switch (output) {
			case TimeUnits.SECONDS:
				seconds
			case TimeUnits.MINUTES:
				seconds / SECONDS_MINUTE	
			case TimeUnits.HOURS:
				seconds / SECONDS_HOUR	
			case TimeUnits.DAYS:
				seconds / SECONDS_DAY	
			case TimeUnits.WEEKS:
				seconds / SECONDS_WEEK	
			case TimeUnits.MONTHS:
				seconds / SECONDS_MONTH	
			case TimeUnits.YEARS:
				seconds / SECONDS_YEAR				
		}
	}
	
	def static log(double x) {
    	Math.log(x) / Math.log(2)
	}
	
	def static log(double x, double base) {
    	Math.log(x) / Math.log(base)
	}
	
	def static factCalculator(double a, double b) {
		var result = 1.0
		for (var i = a; i <= b; i++) 
			result *= i		
		result
	}

	def static double root(double num, double root) {
		if (root == 2.0) Math.sqrt(num)
		else if (root == 3.0) Math.cbrt(num)
		else Math.pow(Math.E, Math.log(num)/root)
	} 

}

