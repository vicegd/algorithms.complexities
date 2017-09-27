package algorithms.complexities.generator

import algorithms.complexities.complexities.ExecutionTimes
import algorithms.complexities.complexities.Model
import algorithms.complexities.complexities.Sizes
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import static algorithms.complexities.generator.WebGeneratorSolverTimes.*
import static algorithms.complexities.generator.WebGeneratorSolverSizes.*
import static algorithms.complexities.generator.Utils.*

class WebGeneratorEN {
	Resource resource
	IFileSystemAccess2 fsa
	
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
				
				<p class="text-info">Solution</p>
				<div class="alert alert-info">
				<p>If for $ f(n_1)$ it takes $t_1$ and for $f(n_2)$ it takes $t_2 \to t_2 = { f(n_2) \over f(n_1) } \times t_1$</p>
				<p>$ n_1 = «c.size1»; t_1 = «c.time1»; n_n = «c.size2»; t_2 = ? $</p>
				<p>$ n_2 = k \times n_1 \to k = { n_2 \over n_1 } = { «c.size2» \over «c.size1» } = «c.size2/c.size1» $</p>
				«solveTimes(c)»
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
				<div class="well">A program with a «c.complexity» solves a problem of size «c.size1» in «c.time1» «c.time1Unit». How would be the size of the problem to solve with a time of «c.time2» «c.time2Unit»?</div>
				
				<p class="text-info">Solution</p>
				<div class="alert alert-info">
				<p>If for $ f(n_1)$ it takes $t_1$ and for $f(n_2)$ it takes $t_2 \to f(n_2) = { t_2 \over t_1 } \times f(n_1)$</p>
				«c.time2 = matchUnits(c.time2, c.time2Unit, c.time1Unit).intValue»
				«c.time2Unit = c.time1Unit»
				<p>$ t_1 = «c.time1»; n_1 = «c.size1»; t_2 = «c.time2»; n_2 = ? $</p>
				<p>$ t_2 = k \times t_1 \to k = { t_2 \over t_1 } = { «c.time2» \over «c.time1» } = «c.time2/c.time1» $</p>
				«solveSizes(c)»
				</div>
			</div>
		«ENDFOR»
		</div>
	</body>
</html>
	'''

}

