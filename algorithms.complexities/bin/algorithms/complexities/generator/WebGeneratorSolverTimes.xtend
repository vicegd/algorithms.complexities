package algorithms.complexities.generator

import algorithms.complexities.complexities.ExecutionTimes
import static algorithms.complexities.generator.Utils.*

class WebGeneratorSolverTimes {
	def static solveTimes(ExecutionTimes e) '''
		«var k = e.size2/e.size1.doubleValue»
		«IF e.complexity.matches("O\\([1-9]+\\)")»
			«solveTimesConstant(e)»
		«ELSEIF e.complexity.matches("O\\(n\\)")»
			«solveTimesLinear(e, k)»
		«ELSEIF e.complexity.matches("O\\(n\\^[1-9]+\\)")»
			«var c = getValueExp(e.complexity)»
			«solveTimesExponential(e, k, c)»
		«ELSEIF e.complexity.matches("O\\(logn\\)")»
			«solveTimesLogarithmic(e, k)»
		«ELSEIF e.complexity.matches("O\\(nlogn\\)")»
			«solveTimesLinLog(e, k)»
		«ELSEIF e.complexity.matches("O\\(n\\^[1-9]+log\\^[1-9]+\\sn\\)")»
			«var c1 = getValueLinLogExp1(e.complexity)»
			«var c2 = getValueLinLogExp2(e.complexity)»
			«solveTimesLinLogExp(e, k, c1, c2)»
		«ELSEIF e.complexity.matches("O\\([1-9]+\\^n\\)")»
			«var c = getValuePower(e.complexity)»
			«solveTimesPower(e, k, c)»
		«ELSEIF e.complexity.matches("O\\(n!\\)")»
			«solveTimesFactorial(e)»
		«ELSE»
			«noSolveTimes()»
		«ENDIF»
	'''
	
	def static solveTimesConstant(ExecutionTimes e) '''
		</div>
		<p>$ t_2 = { 1 \over 1 } \times «e.time1» $ «e.time1Unit»</p>
		«IF e.time1Unit != e.time2Unit»
		<p>$ t_2 = «matchUnits(e.time1, e.time1Unit, e.time2Unit)» $ «e.time2Unit»</p>		
		«ENDIF»	
	'''	
	
	def static solveTimesLinear(ExecutionTimes e, double k) '''
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
	
	def static solveTimesExponential(ExecutionTimes e, double k, double c) '''
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

	def static solveTimesLogarithmic(ExecutionTimes e, double k) '''
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
	
	def static solveTimesLinLog(ExecutionTimes e, double k) '''
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
	
	def static solveTimesLinLogExp(ExecutionTimes e, double k, double c1, double c2) '''
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
	
	def static solveTimesPower(ExecutionTimes e, double k, double c) '''
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

	def static solveTimesFactorial(ExecutionTimes e) '''
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

	def static noSolveTimes() '''
		<p class="text-danger">I am not programmed to solve this problem yet </p>
	'''
}

