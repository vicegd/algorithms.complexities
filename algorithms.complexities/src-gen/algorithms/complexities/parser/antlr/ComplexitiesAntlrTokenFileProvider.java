/*
 * generated by Xtext 2.12.0
 */
package algorithms.complexities.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class ComplexitiesAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("algorithms/complexities/parser/antlr/internal/InternalComplexities.tokens");
	}
}
