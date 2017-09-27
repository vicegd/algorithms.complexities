package algorithms.complexities.generator

import algorithms.complexities.complexities.Sizes
import static algorithms.complexities.generator.Utils.*

class WebGeneratorSolverSizes {
	def static solveSizes(Sizes e) '''
		«var k = e.time2/e.time1.doubleValue»
		«IF e.complexity.matches("O\\([1-9]+\\)")»
			«solveSizesConstant(e)»
		«ELSEIF e.complexity.matches("O\\(n\\)")»
			«solveSizesLinear(e, k)»
		«ELSEIF e.complexity.matches("O\\(n\\^[1-9]+\\)")»
			«var c = getValueExp(e.complexity)»
			«solveSizesExponential(e, k, c)»
		«ELSEIF e.complexity.matches("O\\(logn\\)")»
			«solveSizesLogarithmic(e, k)»
		«ELSEIF e.complexity.matches("O\\([1-9]+\\^n\\)")»
			«var c = getValuePower(e.complexity)»
			«solveSizesPower(e, k, c)»
		«ELSE»
			«noSolveSizes()»
		«ENDIF»
	'''
	
	def static solveSizesConstant(Sizes e) '''
		</div>
		<p>$ n_2 = ... $ </p>		
	'''	
	
	def static solveSizesLinear(Sizes e, double k) '''
		</div>
		<p>$ n_2 = { t_2 \over t_1 } \times «e.size1» $</p>
		<p>$ n_2 = k \times «e.size1» $</p>
		<p>$ n_2 = «k» \times «e.size1» $</p>
		«var result = k * e.size1»
		<p>$ n_2 = «result» $</p>
	'''

	def static solveSizesExponential(Sizes e, double k, double c) '''
		<p>$ c = «c» $</p>
		</div>
		<p>$ n_2^{c} = { t_2 \over t_1 } \times n_1^{c} $</p>
		<p>$ n_2^{c} = k \times n_1^{c} $</p>
		<p>$ n_2 = \sqrt[c]{ k \times n_1^{c} }$</p>
		<p>$ n_2 = \sqrt[c]{ k } \times n_1 $</p>
		<p>$ n_2 = \sqrt[«c»]{ «k» } \times «e.size1» $</p>
		<p>$ n_2 = «root(k, c)» \times «e.size1» $</p>
		«var result = root(k, c) * e.size1»
		<p>$ n_2 = «result» $</p>		
	'''

	def static solveSizesLogarithmic(Sizes e, double k) '''
		</div>
		<p>$ \log n_2 = { t_2 \over t_1 } \times \log n_1 $</p>
		<p>$ \log n_2 = k \times \log n_1 $</p>
		<p>$ n_2 = 2^{ k \times \log n_1 } $</p>
		<p>$ n_2 = 2^{ k } \times 2^{\log n_1} $</p>
		<p>$ n_2 = 2^{ «k» } \times 2^{\log «e.size1»} $</p>
		<p>$ n_2 = 2^{ «k» } \times 2^{«log(e.size1)»} $</p>
		<p>$ n_2 = «Math.pow(2, k)» \times «Math.pow(2,log(e.size1))» $</p>
		«var result = Math.pow(2, k) * Math.pow(2,log(e.size1))»
		<p>$ n_2 = «result» $</p>		
	'''

	def static solveSizesPower(Sizes e, double k, double c) '''
		<p>$ c = «c» $</p>
		</div>
		<p>$ c^{n_2} = { t_2 \over t_1 } \times c^{n_1} $</p>
		<p>$ c^{n_2} = k \times c^{n_1} $</p>
		<p>$ n_2 = log_c { (k \times c^{n_1}) }$</p>
		<p>$ n_2 = log_c {k} + log_c {c^{n_1}}$</p>
		<p>$ n_2 = log_c {k} + n_1 $</p>
		<p>$ n_2 = log_{«c»} {«k»} + «e.size1» $</p>
		<p>$ n_2 = «log(k, c)» + «e.size1» $</p>
		«var result = log(k, c) + e.size1»
		<p>$ n_2 = «result» $</p>		
	'''
	
	def static noSolveSizes() '''
		<p class="text-danger">I am not programmed to solve this problem yet </p>
	'''

}

