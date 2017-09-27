package algorithms.complexities.generator;

import algorithms.complexities.complexities.Sizes;
import algorithms.complexities.generator.Utils;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class WebGeneratorSolverSizes {
  public static CharSequence solveSizes(final Sizes e) {
    StringConcatenation _builder = new StringConcatenation();
    int _time2 = e.getTime2();
    double _doubleValue = Integer.valueOf(e.getTime1()).doubleValue();
    double k = (_time2 / _doubleValue);
    _builder.newLineIfNotEmpty();
    {
      boolean _matches = e.getComplexity().matches("O\\([1-9]+\\)");
      if (_matches) {
        CharSequence _solveSizesConstant = WebGeneratorSolverSizes.solveSizesConstant(e);
        _builder.append(_solveSizesConstant);
        _builder.newLineIfNotEmpty();
      } else {
        boolean _matches_1 = e.getComplexity().matches("O\\(n\\)");
        if (_matches_1) {
          CharSequence _solveSizesLinear = WebGeneratorSolverSizes.solveSizesLinear(e, k);
          _builder.append(_solveSizesLinear);
          _builder.newLineIfNotEmpty();
        } else {
          boolean _matches_2 = e.getComplexity().matches("O\\(n\\^[1-9]+\\)");
          if (_matches_2) {
            double c = Utils.getValueExp(e.getComplexity());
            _builder.newLineIfNotEmpty();
            CharSequence _solveSizesExponential = WebGeneratorSolverSizes.solveSizesExponential(e, k, c);
            _builder.append(_solveSizesExponential);
            _builder.newLineIfNotEmpty();
          } else {
            boolean _matches_3 = e.getComplexity().matches("O\\(logn\\)");
            if (_matches_3) {
              CharSequence _solveSizesLogarithmic = WebGeneratorSolverSizes.solveSizesLogarithmic(e, k);
              _builder.append(_solveSizesLogarithmic);
              _builder.newLineIfNotEmpty();
            } else {
              boolean _matches_4 = e.getComplexity().matches("O\\([1-9]+\\^n\\)");
              if (_matches_4) {
                double c_1 = Utils.getValuePower(e.getComplexity());
                _builder.newLineIfNotEmpty();
                CharSequence _solveSizesPower = WebGeneratorSolverSizes.solveSizesPower(e, k, c_1);
                _builder.append(_solveSizesPower);
                _builder.newLineIfNotEmpty();
              } else {
                CharSequence _noSolveSizes = WebGeneratorSolverSizes.noSolveSizes();
                _builder.append(_noSolveSizes);
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
      }
    }
    return _builder;
  }
  
  public static CharSequence solveSizesConstant(final Sizes e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("<p>$ n_2 = ... $ </p>\t\t");
    _builder.newLine();
    return _builder;
  }
  
  public static CharSequence solveSizesLinear(final Sizes e, final double k) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("<p>$ n_2 = { t_2 \\over t_1 } \\times ");
    int _size1 = e.getSize1();
    _builder.append(_size1);
    _builder.append(" $</p>");
    _builder.newLineIfNotEmpty();
    _builder.append("<p>$ n_2 = k \\times ");
    int _size1_1 = e.getSize1();
    _builder.append(_size1_1);
    _builder.append(" $</p>");
    _builder.newLineIfNotEmpty();
    _builder.append("<p>$ n_2 = ");
    _builder.append(k);
    _builder.append(" \\times ");
    int _size1_2 = e.getSize1();
    _builder.append(_size1_2);
    _builder.append(" $</p>");
    _builder.newLineIfNotEmpty();
    int _size1_3 = e.getSize1();
    double result = (k * _size1_3);
    _builder.newLineIfNotEmpty();
    _builder.append("<p>$ n_2 = ");
    _builder.append(result);
    _builder.append(" $</p>");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public static CharSequence solveSizesExponential(final Sizes e, final double k, final double c) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<p>$ c = ");
    _builder.append(c);
    _builder.append(" $</p>");
    _builder.newLineIfNotEmpty();
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("<p>$ n_2^{c} = { t_2 \\over t_1 } \\times n_1^{c} $</p>");
    _builder.newLine();
    _builder.append("<p>$ n_2^{c} = k \\times n_1^{c} $</p>");
    _builder.newLine();
    _builder.append("<p>$ n_2 = \\sqrt[c]{ k \\times n_1^{c} }$</p>");
    _builder.newLine();
    _builder.append("<p>$ n_2 = \\sqrt[c]{ k } \\times n_1 $</p>");
    _builder.newLine();
    _builder.append("<p>$ n_2 = \\sqrt[");
    _builder.append(c);
    _builder.append("]{ ");
    _builder.append(k);
    _builder.append(" } \\times ");
    int _size1 = e.getSize1();
    _builder.append(_size1);
    _builder.append(" $</p>");
    _builder.newLineIfNotEmpty();
    _builder.append("<p>$ n_2 = ");
    double _root = Utils.root(k, c);
    _builder.append(_root);
    _builder.append(" \\times ");
    int _size1_1 = e.getSize1();
    _builder.append(_size1_1);
    _builder.append(" $</p>");
    _builder.newLineIfNotEmpty();
    double _root_1 = Utils.root(k, c);
    int _size1_2 = e.getSize1();
    double result = (_root_1 * _size1_2);
    _builder.newLineIfNotEmpty();
    _builder.append("<p>$ n_2 = ");
    _builder.append(result);
    _builder.append(" $</p>\t\t");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public static CharSequence solveSizesLogarithmic(final Sizes e, final double k) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("<p>$ \\log n_2 = { t_2 \\over t_1 } \\times \\log n_1 $</p>");
    _builder.newLine();
    _builder.append("<p>$ \\log n_2 = k \\times \\log n_1 $</p>");
    _builder.newLine();
    _builder.append("<p>$ n_2 = 2^{ k \\times \\log n_1 } $</p>");
    _builder.newLine();
    _builder.append("<p>$ n_2 = 2^{ k } \\times 2^{\\log n_1} $</p>");
    _builder.newLine();
    _builder.append("<p>$ n_2 = 2^{ ");
    _builder.append(k);
    _builder.append(" } \\times 2^{\\log ");
    int _size1 = e.getSize1();
    _builder.append(_size1);
    _builder.append("} $</p>");
    _builder.newLineIfNotEmpty();
    _builder.append("<p>$ n_2 = 2^{ ");
    _builder.append(k);
    _builder.append(" } \\times 2^{");
    double _log = Utils.log(e.getSize1());
    _builder.append(_log);
    _builder.append("} $</p>");
    _builder.newLineIfNotEmpty();
    _builder.append("<p>$ n_2 = ");
    double _pow = Math.pow(2, k);
    _builder.append(_pow);
    _builder.append(" \\times ");
    double _pow_1 = Math.pow(2, Utils.log(e.getSize1()));
    _builder.append(_pow_1);
    _builder.append(" $</p>");
    _builder.newLineIfNotEmpty();
    double _pow_2 = Math.pow(2, k);
    double _pow_3 = Math.pow(2, Utils.log(e.getSize1()));
    double result = (_pow_2 * _pow_3);
    _builder.newLineIfNotEmpty();
    _builder.append("<p>$ n_2 = ");
    _builder.append(result);
    _builder.append(" $</p>\t\t");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public static CharSequence solveSizesPower(final Sizes e, final double k, final double c) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<p>$ c = ");
    _builder.append(c);
    _builder.append(" $</p>");
    _builder.newLineIfNotEmpty();
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("<p>$ c^{n_2} = { t_2 \\over t_1 } \\times c^{n_1} $</p>");
    _builder.newLine();
    _builder.append("<p>$ c^{n_2} = k \\times c^{n_1} $</p>");
    _builder.newLine();
    _builder.append("<p>$ n_2 = log_c { (k \\times c^{n_1}) }$</p>");
    _builder.newLine();
    _builder.append("<p>$ n_2 = log_c {k} + log_c {c^{n_1}}$</p>");
    _builder.newLine();
    _builder.append("<p>$ n_2 = log_c {k} + n_1 $</p>");
    _builder.newLine();
    _builder.append("<p>$ n_2 = log_{");
    _builder.append(c);
    _builder.append("} {");
    _builder.append(k);
    _builder.append("} + ");
    int _size1 = e.getSize1();
    _builder.append(_size1);
    _builder.append(" $</p>");
    _builder.newLineIfNotEmpty();
    _builder.append("<p>$ n_2 = ");
    double _log = Utils.log(k, c);
    _builder.append(_log);
    _builder.append(" + ");
    int _size1_1 = e.getSize1();
    _builder.append(_size1_1);
    _builder.append(" $</p>");
    _builder.newLineIfNotEmpty();
    double _log_1 = Utils.log(k, c);
    int _size1_2 = e.getSize1();
    double result = (_log_1 + _size1_2);
    _builder.newLineIfNotEmpty();
    _builder.append("<p>$ n_2 = ");
    _builder.append(result);
    _builder.append(" $</p>\t\t");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public static CharSequence noSolveSizes() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<p class=\"text-danger\">I am not programmed to solve this problem yet </p>");
    _builder.newLine();
    return _builder;
  }
}
