package algorithms.complexities.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import algorithms.complexities.complexities.Model
import algorithms.complexities.complexities.ExecutionTimes
import algorithms.complexities.complexities.Sizes
import algorithms.complexities.complexities.TimeUnits
import java.util.regex.Pattern

class WebGenerator {
	Resource resource
	IFileSystemAccess2 fsa
	var SECONDS_MINUTE = 60
	var SECONDS_HOUR = 60 * SECONDS_MINUTE
	var SECONDS_DAY = 24 * SECONDS_HOUR
	var SECONDS_WEEK = 7 * SECONDS_DAY
	var SECONDS_MONTH = 30 * SECONDS_DAY
	var SECONDS_YEAR = 12 * SECONDS_MONTH
	
	new(Resource resource, IFileSystemAccess2 fsa) {
		this.resource = resource
		this.fsa = fsa
	}

	def generate() {
		//var sb = new StringBuilder();	
		//var sbMessages = new StringBuilder();
		var model = resource.contents.get(0) as Model
		//System.out.println(model.searches.length)
		fsa.generateFile('index.html', model.compile)
	}
	
	def compile(Model m) '''
<!DOCTYPE html>
<html lang="en">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
		<meta http-equiv="X-UA-Compatible" content="IE=edge" />
		<meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Algorithms complexities</title>
		<script type="text/x-mathjax-config">
			MathJax.Hub.Config({
			tex2jax: {
				inlineMath: [['$','$'], ['\\(','\\)']],
				processEscapes: true
				}
			});
		</script>
		<script type="text/javascript" async
		  src="https://cdnjs.cloudflare.com/ajax/libs/mathjax/2.7.2/MathJax.js?config=TeX-MML-AM_CHTML">
		</script>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
	</head>
	<body>
		<div class="jumbotron text-center">
		  <h1>Algorithms complexities</h1>
		</div>
		<h2>Calculating execution times</h2>
		<div class="panel-group">
		«var i = 1»
		
		«FOR c:m.calculations.filter(typeof(ExecutionTimes))»
			<div class="panel panel-success">
				<div class="panel-heading">Problem «i++»</div>
				<div class="panel-body">
				<div class="well">A program with a «c.complexity» time complexity takes «c.time1» «c.time1Unit» for a problem size of «c.size1». How long would it take for a larger size of «c.size2»?</div>
				«c.solveTimes(c.complexity)»
				</div>
			</div>
		«ENDFOR»
		</div>
		
		<h2>Calculating problem sizes</h2>
		<div class="panel-group">
		«FOR c:m.calculations.filter(typeof(Sizes))»
			<div class="panel panel-success">
				<div class="panel-heading">Problem «i++»</div>
				<div class="panel-body">
				<div class="well">A program with a «c.complexity» time complexity takes «c.time1» «c.time1Unit» for a problem size of «c.size1». What problem size would be solved for a larger time of «c.time2» «c.time2Unit»?</div>
				</div>
			</div>
		«ENDFOR»
		</div>
	</body>
</html>
	'''
	
	def solveTimes(ExecutionTimes e, String complexity) '''
		<p class="text-info">Solution</p>
		<div class="alert alert-info">
		<p>If for $ f(n_1)$ it takes $t_1$ and for $f(n_2)$ it takes $t_2 \to t_2 = { f(n_2) \over f(n_1) } \times t_1$</p>
		<p>$ n_2 = «e.size2»; n_1 = «e.size1»; t_1 = «e.time1»; t_2 = ? $</p>
		<p>$ n_2 = k \times n_1 \to k = { n_2 \over n_1 } = { «e.size2» \over «e.size1» } = «e.size2/e.size1» $</p>
		«var k = e.size2/e.size1»
		«IF complexity.matches("O\\([1-9]+\\)")»
			«solveTimesConstant(e)»
		«ELSEIF complexity.matches("O\\(n\\)")»
			«solveTimesLinear(e, k)»
		«ELSEIF complexity.matches("O\\(n\\^[1-9]+\\)")»
			«var c = getValueExp(complexity)»
			«solveTimesExponential(e, k, c)»
		«ELSEIF complexity.matches("O\\(logn\\)")»
			«solveTimesLogarithmic(e, k)»
		«ELSEIF complexity.matches("O\\(nlogn\\)")»
			«solveTimesLinLog(e, k)»
		«ELSEIF complexity.matches("O\\(n\\^[1-9]+log\\^[1-9]+\\sn\\)")»
			«var c1 = getValueLinLogExp1(complexity)»
			«var c2 = getValueLinLogExp2(complexity)»
			«solveTimesLinLogExp(e, k, c1, c2)»
		«ELSEIF complexity.matches("O\\([1-9]+\\^n\\)")»
			«var c = getValuePower(complexity)»
			«solveTimesPower(e, k, c)»
		«ELSEIF complexity.matches("O\\(n!\\)")»
			«solveTimesFactorial(e)»
		«ENDIF»
	'''
	
	def solveTimesConstant(ExecutionTimes e) '''
		</div>
		<p>$ t_2 = { 1 \over 1 } \times «e.time1» $ «e.time1Unit»</p>
		«IF e.time1Unit != e.time2Unit»
		<p>$ t_2 = «matchUnits(e.time1, e.time1Unit, e.time2Unit)» $ «e.time2Unit»</p>		
		«ENDIF»	
	'''	
	
	def solveTimesLinear(ExecutionTimes e, double k) '''
		</div>
		<p>$ t_2 = { n_2 \over n_1 } \times «e.time1» $ «e.time1Unit»</p>
		<p>$ t_2 = k \times «e.time1» $ «e.time1Unit»</p>
		<p>$ t_2 = «k» \times «e.time1» $ «e.time1Unit»</p>
		«var result = k * e.time1»
		<p>$ t_2 = «result» $ «e.time1Unit»</p>
		«IF e.time1Unit != e.time2Unit»
		<p>$ t_2 = «matchUnits(result, e.time1Unit, e.time2Unit)» $ «e.time2Unit»</p>
		«ENDIF»		
	'''
	
	def solveTimesExponential(ExecutionTimes e, double k, double c) '''
		<p>$ c = «c» $</p>
		</div>
		<p>$ t_2 = { n_2^{c} \over n_1^{c} } \times «e.time1» $ «e.time1Unit»</p>
		<p>$ t_2 = { n_2^{«c»} \over n_1^{«c»} } \times «e.time1» $ «e.time1Unit»</p>
		<p>$ t_2 = k^{«c»} \times «e.time1» $ «e.time1Unit»</p>
		<p>$ t_2 = «k»^{«c»} \times «e.time1» $ «e.time1Unit»</p>
		<p>$ t_2 = «Math.pow(k, c)» \times «e.time1» $ «e.time1Unit»</p>
		«var result = Math.pow(k, c) * e.time1»
		<p>$ t_2 = «result» $ «e.time1Unit»</p>
		«IF e.time1Unit != e.time2Unit»
		<p>$ t_2 = «matchUnits(result, e.time1Unit, e.time2Unit)» $ «e.time2Unit»</p>
		«ENDIF»			
	'''

	def solveTimesLogarithmic(ExecutionTimes e, double k) '''
		</div>
		<p>$ t_2 = { \log n_2 \over \log n_1 } \times «e.time1» $ «e.time1Unit»</p>
		<p>$ t_2 = { \log k \times n_1 \over \log n_1 } \times «e.time1» $ «e.time1Unit»</p>
		<p>$ t_2 = { \log k + \log n_1 \over \log n_1 } \times «e.time1» $ «e.time1Unit»</p>	
		<p>$ t_2 = { \log «k» + \log «e.size1» \over \log «e.size1» } \times «e.time1» $ «e.time1Unit»</p>	
		<p>$ t_2 = { «log(k)» + «log(e.size1)» \over «log(e.size1)» } \times «e.time1» $ «e.time1Unit»</p>
		<p>$ t_2 = { «log(k) + log(e.size1)» \over «log(e.size1)» } \times «e.time1» $ «e.time1Unit»</p>	
		<p>$ t_2 = { «(log(k) + log(e.size1)) / log(e.size1)» } \times «e.time1» $ «e.time1Unit»</p>	
		«var result = (log(k) + log(e.size1)) / log(e.size1) * e.time1»
		<p>$ t_2 = «result» $ «e.time1Unit»</p>
		«IF e.time1Unit != e.time2Unit»
		<p>$ t_2 = «matchUnits(result, e.time1Unit, e.time2Unit)» $ «e.time2Unit»</p>
		«ENDIF»	
	'''
	
	def solveTimesLinLog(ExecutionTimes e, double k) '''
		</div>
		<p>$ t_2 = { n_2 \times \log n_2 \over n_1 \times \log n_1 } \times «e.time1» $ «e.time1Unit»</p>
		<p>$ t_2 = k \times { \log k \times n_1 \over \log n_1 } \times «e.time1» $ «e.time1Unit»</p>
		<p>$ t_2 = k \times { \log k + \log n_1 \over \log n_1 } \times «e.time1» $ «e.time1Unit»</p>	
		<p>$ t_2 = «k» \times { \log «k» + \log «e.size1» \over \log «e.size1» } \times «e.time1» $ «e.time1Unit»</p>	
		<p>$ t_2 = «k» \times { «log(k)» + «log(e.size1)» \over «log(e.size1)» } \times «e.time1» $ «e.time1Unit»</p>
		<p>$ t_2 = «k» \times { «log(k) + log(e.size1)» \over «log(e.size1)» } \times «e.time1» $ «e.time1Unit»</p>	
		<p>$ t_2 = «k» \times { «(log(k) + log(e.size1)) / log(e.size1)» } \times «e.time1» $ «e.time1Unit»</p>
		<p>$ t_2 = «k * (log(k) + log(e.size1)) / log(e.size1)» \times «e.time1» $ «e.time1Unit»</p>		
		«var result = k * (log(k) + log(e.size1)) / log(e.size1) * e.time1»
		<p>$ t_2 = «result» $ «e.time1Unit»</p>
		«IF e.time1Unit != e.time2Unit»
		<p>$ t_2 = «matchUnits(result, e.time1Unit, e.time2Unit)» $ «e.time2Unit»</p>
		«ENDIF»	
	'''
	
	def solveTimesLinLogExp(ExecutionTimes e, double k, double c1, double c2) '''
		<p>$ c_1 = «c1»; c_2 = «c2» $</p>
		</div>
		<p>$ t_2 = { n_2^{c_1} \times \log^{c_2} n_2 \over n_1^{c_1} \times \log^{c_2} n_1 } \times «e.time1» $ «e.time1Unit»</p>
		<p>$ t_2 = k^{c_1} { \log^{c_2} K \times n_1 \over \log^{c_2} n_1 } \times «e.time1» $ «e.time1Unit»</p>
		<p>$ t_2 = «k»^{«c1»} { \log^{«c2»} «k» \times «e.size1» \over \log^{«c2»} «e.size1» } \times «e.time1» $ «e.time1Unit»</p>
		<p>$ t_2 = «Math.pow(k,c1)» { \log^{«c2»} «k * e.size1» \over \log^{«c2»} «e.size1» } \times «e.time1» $ «e.time1Unit»</p>
		<p>$ t_2 = «Math.pow(k,c1)» { «log(k * e.size1)»^{«c2»} \over «log(e.size1)»^{«c2»} } \times «e.time1» $ «e.time1Unit»</p>
		<p>$ t_2 = «Math.pow(k,c1)» { «Math.pow(log(k * e.size1), c2)» \over «Math.pow(log(e.size1), c2)» } \times «e.time1» $ «e.time1Unit»</p>
		<p>$ t_2 = «Math.pow(k,c1)» \times { «Math.pow(log(k * e.size1), c2) / Math.pow(log(e.size1), c2)» } \times «e.time1» $ «e.time1Unit»</p>
		<p>$ t_2 = «Math.pow(k,c1) * Math.pow(log(k * e.size1), c2) / Math.pow(log(e.size1), c2)» \times «e.time1» $ «e.time1Unit»</p>
		«var result = Math.pow(k,c1) * Math.pow(log(k * e.size1), c2) / Math.pow(log(e.size1), c2) * e.time1»
		<p>$ t_2 = «result» $ «e.time1Unit»</p>
		«IF e.time1Unit != e.time2Unit»
		<p>$ t_2 = «matchUnits(result, e.time1Unit, e.time2Unit)» $ «e.time2Unit»</p>
		«ENDIF»
	'''
	
	def solveTimesPower(ExecutionTimes e, double k, double c) '''
		<p>$ c = «c» $</p>
		</div>
		<p>$ t_2 = { c^{n_2} \over c^{n_1} } \times «e.time1» $ «e.time1Unit»</p>
		<p>$ t_2 = c^{n_2 - n_1} \times «e.time1» $ «e.time1Unit»</p>
		<p>$ t_2 = c^{k \times n_1 - n_1} \times «e.time1» $ «e.time1Unit»</p>
		<p>$ t_2 = c^{n_1 \times (k - 1)} \times «e.time1» $ «e.time1Unit»</p>
		<p>$ t_2 = «c»^{«e.size1» \times («k» - 1)} \times «e.time1» $ «e.time1Unit»</p>
		<p>$ t_2 = «c»^{«e.size1*k - e.size1*1»} \times «e.time1» $ «e.time1Unit»</p>
		<p>$ t_2 = «Math.pow(c, e.size1*k - e.size1*1)» \times «e.time1» $ «e.time1Unit»</p>
		«var result = Math.pow(c, e.size1*k - e.size1*1) * e.time1»
		<p>$ t_2 = «result» $ «e.time1Unit»</p>
		«IF e.time1Unit != e.time2Unit»
		<p>$ t_2 = «matchUnits(result, e.time1Unit, e.time2Unit)» $ «e.time2Unit»</p>
		«ENDIF»	
	'''

	def solveTimesFactorial(ExecutionTimes e) '''
		</div>
		<p>$ t_2 = { n_2! \over n_1! } \times «e.time1» $ «e.time1Unit»</p>
		<p>$ t_2 = \prod_{i=n_1 + 1}^{n_2} i \times «e.time1» $ «e.time1Unit»</p>
		<p>$ t_2 = \prod_{i=«e.size1 + 1»}^{«e.size2»} i \times «e.time1» $ «e.time1Unit»</p>
		<p>$ t_2 = «factCalculator(e.size1 + 1, e.size2)» \times «e.time1» $ «e.time1Unit»</p>
		«var result = factCalculator(e.size1 + 1, e.size2) * e.time1»
		<p>$ t_2 = «result» $ «e.time1Unit»</p>
		«IF e.time1Unit != e.time2Unit»
		<p>$ t_2 = «matchUnits(result, e.time1Unit, e.time2Unit)» $ «e.time2Unit»</p>
		«ENDIF»	
	'''
	
	def getValueExp(String complexity) {
		// O\\(n\\^[1-9]+\\)
		var pattern = Pattern.compile("\\^(.+)\\)");
		var matcher = pattern.matcher(complexity);
		matcher.find()
		Double.parseDouble(matcher.group(1))
	}
	
	def getValueLinLogExp1(String complexity) {
		// O\\(n\\^[1-9]+log\\^[1-9]+\\sn\\
		var pattern = Pattern.compile("\\^(.+)log");
		var matcher = pattern.matcher(complexity);
		matcher.find()
		Double.parseDouble(matcher.group(1))
	}
	
	def getValueLinLogExp2(String complexity) {
		// O\\(n\\^[1-9]+log\\^[1-9]+\\sn\\
		var pattern = Pattern.compile("log\\^(.+)\\s");
		var matcher = pattern.matcher(complexity);
		matcher.find()
		Double.parseDouble(matcher.group(1))
	}
	
	def getValuePower(String complexity) {
		// O\\([1-9]+\\^n\\)
		var pattern = Pattern.compile("\\((.+)\\^");
		var matcher = pattern.matcher(complexity);
		matcher.find()
		Double.parseDouble(matcher.group(1))
	}

	def matchUnits(double value, TimeUnits input, TimeUnits output) {
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
	
	def log(double x) {
    	Math.log(x) / Math.log(2)
	}
	
	def factCalculator(double a, double b) {
		var result = 1.0
		for (var i = a; i <= b; i++) 
			result *= i		
		result
	}
	/*
	def compile(DsocialModel e)'''
{
  'messagesToSearch': [
	«FOR message:e.searches.filter(typeof(MessageSearch)) SEPARATOR ','»
		«message.compile»
	«ENDFOR»
  ],
  'placesToSearch': [
	«FOR place:e.searches.filter(typeof(PlaceSearch)) SEPARATOR ','»
		«place.compile»
	«ENDFOR»  
  ],
  'usersToSearch': [
  	«FOR user:e.searches.filter(typeof(UserSearch)) SEPARATOR ','»
  		«user.compile»
  	«ENDFOR»
  ],
  'trendsToSearch': [
  	«FOR trend:e.searches.filter(typeof(TrendSearch)) SEPARATOR ','»
  		«trend.compile»
  	«ENDFOR»
  ]
}
	'''
	
	def compile(MessageSearch e) '''
{
	'queries': [
		«FOR q:e.queries SEPARATOR ','»
			{'query': "«filterQuery(q)»"}
		«ENDFOR»
	],
	'startIn': «filterTime(e.execution.startIn, e.execution.startInTimeUnit)»,
	'endsIn': «filterTime(e.execution.endIn, e.execution.endInTimeUnit)»,
	'every': «filterTime(e.execution.every, e.execution.everyTimeUnit)»,
	'location': {
		'latitude': «filterLatitude(e.location)»,
		'longitude': «filterLongitude(e.location)»,
		'radius': «filterRadius(e.location)»
	},
	'resultType': "«filterResultType(e.resultType)»",
	'language': "«filterLanguage(e.language)»",
	'since': "«filterSince(e.since)»",
	'until': "«filterUntil(e.until)»",
	'maxResultsPerCycle': «filterMaxResultsPerCycle(e.maxResultsPerCycle)»
}
	'''
	
	def compile(PlaceSearch e) '''
{
	'queries': [
		«FOR q:e.queries SEPARATOR ','»
			{'query': "«filterQuery(q)»"}
		«ENDFOR»
	],
	'startIn': «filterTime(e.execution.startIn, e.execution.startInTimeUnit)»,
	'stopIn': «filterTime(e.execution.endIn, e.execution.endInTimeUnit)»,
	'every': «filterTime(e.execution.every, e.execution.everyTimeUnit)»,
	'location': {
		'latitude': «filterLatitude(e.location)»,
		'longitude': «filterLongitude(e.location)»,
		'radius': «filterRadius(e.location)»
	},
	'granularity': "«filterGranularity(e.granularity)»",
	'maxResultsPerCycle': «filterMaxResultsPerCycle(e.maxResultsPerCycle)»
}
	'''
	
	def compile(UserSearch e) '''
{
	'queries': [
		«FOR q:e.queries SEPARATOR ','»
			{'query': "«filterQuery(q)»"}
		«ENDFOR»
	],
	'startIn': «filterTime(e.execution.startIn, e.execution.startInTimeUnit)»,
	'stopIn': «filterTime(e.execution.endIn, e.execution.endInTimeUnit)»,
	'every': «filterTime(e.execution.every, e.execution.everyTimeUnit)»,
	'maxResultsPerCycle': «filterMaxResultsPerCycle(e.maxResultsPerCycle)»
}
	'''
	
	def compile(TrendSearch e) '''
{
	'woeid': «e.woeid»,
	'startIn': «filterTime(e.execution.startIn, e.execution.startInTimeUnit)»,
	'stopIn': «filterTime(e.execution.endIn, e.execution.endInTimeUnit)»,
	'every': «filterTime(e.execution.every, e.execution.everyTimeUnit)»
}
	'''
	
	def filterGranularity(PlaceGranularity granularity) {
		if (granularity != null) {
			return granularity.toString.toUpperCase
		}
		else return 'POI'
	}	
	
	def filterLanguage(LanguageCode code) {
		if (code != null) {
			return code.toString.toUpperCase
		}
		else return 'ALL'
	}
	
	def filterLatitude(Location location) {
		if (location != null) {
			return Float.valueOf(location.latitude)
		}
		else return 0.0
	}
	
	def filterLongitude(Location location) {
		if (location != null) {
			return Float.valueOf(location.longitude)
		}
		else return 0.0
	}
	
	def filterMaxResultsPerCycle(Integer maxResultsPerCycle) {
		if (maxResultsPerCycle != 0) {
			return maxResultsPerCycle
		}
		else return 10
	}
	
	def filterRadius(Location location) {
		if (location != null) {
			if (location.radius != null) {
				switch (location.distanceUnit) {
					case DistanceUnit.METERS: //DEFAULT
						Float.valueOf(location.radius)
					case DistanceUnit.KILOMETERS:
						Float.valueOf(location.radius)*1000
					case DistanceUnit.MILLES:
						Float.valueOf(location.radius)*1609.34
				}
			}
			else return 0.0
		}
		else return 0.0
	}
	
	def filterResultType(ResultType type) {
		if (type != null) {
			return type.toString.toUpperCase
		}
		else return 'MIXED'
	}
	
	def filterSince(String date) {
		if (date != null) {
			return date.toString.toUpperCase
		}
		else return "0000-00-00"
	}
		
	def filterTime(int value, TimeUnit timeUnit) {
		switch (timeUnit) {
			case TimeUnit.MILLISECONDS:
				value
			case TimeUnit.SECONDS:
				value*1000
			case TimeUnit.MINUTES:
				value*1000*60
			case TimeUnit.HOURS:
				value*1000*60*60
			case TimeUnit.DAYS:
				value*1000*60*60*24
			case TimeUnit.YEARS:
				value*1000*60*60*365
		}
	}	
	
	def filterQuery(Query text) {		
		val sb = new StringBuilder()
		text.query.forEach[ part | 
			var output = part.replace("\'", "")
			output = output.replace("\"", "")
			output = output.replaceAll("\\s+", " ")
			output = output.trim
			
			if (output.startsWith("EXACTLY ")) {
				sb.append("\\\"" + output.substring(8) + "\\\" ")
			}
			else if (output.contains("OR")) {
				sb.append(output + " ")
			}	
			else if (output.contains(" BUT_NO ")) {
				sb.append(output.replace("BUT_NO ", "-") + " ")
			}	
			else if (output.startsWith("HASHTAG ")) {
				sb.append("#" + output.substring(8) + " ")
			}	
			else if (output.startsWith("FROM_ACCOUNT_IN_LIST ")) {
				sb.append("list:" + output.substring(21) + " ")
			}	
			else if (output.startsWith("FROM_ACCOUNT ")) {
				sb.append("from:" + output.substring(13) + " ")
			}	
			else if (output.startsWith("TO_ACCOUNT ")) {
				sb.append("to:" + output.substring(11) + " ")
			}	
			else if (output.startsWith("MENTIONING_ACCOUNT ")) {
				sb.append("@" + output.substring(19) + " ")
			}	
			else if (output.endsWith("FILTER SAFE")) {
				sb.append(output.substring(0, output.lastIndexOf("FILTER SAFE")) + "filter:safe ")
			}
			else if (output.endsWith("FILTER MEDIA")) {
				sb.append(output.substring(0, output.lastIndexOf("FILTER MEDIA")) + "filter:media ")
			}
			else if (output.endsWith("FILTER LINKS")) {
				sb.append(output.substring(0, output.lastIndexOf("FILTER LINKS")) + "filter:links ")
			}						
			else if (output.contains(" WITH_URL_WITH ")) {
				sb.append(output.replace("WITH_URL_WITH ", "url:") + " ")
			}									
			else if (output.endsWith(" BE_POSITIVE")) {
				sb.append(output.substring(0, output.lastIndexOf("BE_POSITIVE")) + ":) ")
			}
			else if (output.endsWith(" BE_NEGATIVE")) {
				sb.append(output.substring(0, output.lastIndexOf("BE_NEGATIVE")) + ":( ")
			}
			else if (output.endsWith(" ASKING")) {
				sb.append(output.substring(0, output.lastIndexOf("ASKING")) + "? ")
			}
			else 
				sb.append(output + " ") 
		]
		return sb.toString.trim
	}
	
	def filterUntil(String date) {
		if (date != null) {
			return date.toString.toUpperCase
		}
		else return "9999-00-00"
	}
	
*/

}

