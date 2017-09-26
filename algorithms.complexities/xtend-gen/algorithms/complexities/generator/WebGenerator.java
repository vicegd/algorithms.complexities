package algorithms.complexities.generator;

import algorithms.complexities.complexities.ExecutionTimes;
import algorithms.complexities.complexities.Model;
import algorithms.complexities.complexities.Sizes;
import algorithms.complexities.complexities.TimeUnits;
import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess2;

@SuppressWarnings("all")
public class WebGenerator {
  private Resource resource;
  
  private IFileSystemAccess2 fsa;
  
  private int SECONDS_MINUTE = 60;
  
  private int SECONDS_HOUR = (60 * this.SECONDS_MINUTE);
  
  private int SECONDS_DAY = (24 * this.SECONDS_HOUR);
  
  private int SECONDS_WEEK = (7 * this.SECONDS_DAY);
  
  private int SECONDS_MONTH = (30 * this.SECONDS_DAY);
  
  private int SECONDS_YEAR = (12 * this.SECONDS_MONTH);
  
  public WebGenerator(final Resource resource, final IFileSystemAccess2 fsa) {
    this.resource = resource;
    this.fsa = fsa;
  }
  
  public void generate() {
    EObject _get = this.resource.getContents().get(0);
    Model model = ((Model) _get);
    this.fsa.generateFile("index.html", this.compile(model));
  }
  
  public CharSequence compile(final Model m) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<!DOCTYPE html>");
    _builder.newLine();
    _builder.append("<html lang=\"en\">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<head>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<title>Algorithms complexities</title>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<script type=\"text/x-mathjax-config\">");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("MathJax.Hub.Config({");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("tex2jax: {");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("inlineMath: [[\'$\',\'$\'], [\'\\\\(\',\'\\\\)\']],");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("processEscapes: true");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("});");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</script>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<script type=\"text/javascript\" async");
    _builder.newLine();
    _builder.append("\t\t  ");
    _builder.append("src=\"https://cdnjs.cloudflare.com/ajax/libs/mathjax/2.7.2/MathJax.js?config=TeX-MML-AM_CHTML\">");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</script>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\" integrity=\"sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u\" crossorigin=\"anonymous\">");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css\" integrity=\"sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp\" crossorigin=\"anonymous\">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</head>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<body>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<div class=\"jumbotron text-center\">");
    _builder.newLine();
    _builder.append("\t\t  ");
    _builder.append("<h1>Algorithms complexities</h1>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<h2>Calculating execution times</h2>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<div class=\"panel-group\">");
    _builder.newLine();
    _builder.append("\t\t");
    int i = 1;
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    {
      Iterable<ExecutionTimes> _filter = Iterables.<ExecutionTimes>filter(m.getCalculations(), ExecutionTimes.class);
      for(final ExecutionTimes c : _filter) {
        _builder.append("\t\t");
        _builder.append("<div class=\"panel panel-success\">");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("<div class=\"panel-heading\">Problem ");
        int _plusPlus = i++;
        _builder.append(_plusPlus, "\t\t\t");
        _builder.append("</div>");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("<div class=\"panel-body\">");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("<div class=\"well\">A program with a ");
        String _complexity = c.getComplexity();
        _builder.append(_complexity, "\t\t\t");
        _builder.append(" time complexity takes ");
        int _time1 = c.getTime1();
        _builder.append(_time1, "\t\t\t");
        _builder.append(" ");
        TimeUnits _time1Unit = c.getTime1Unit();
        _builder.append(_time1Unit, "\t\t\t");
        _builder.append(" for a problem size of ");
        int _size1 = c.getSize1();
        _builder.append(_size1, "\t\t\t");
        _builder.append(". How long would it take for a larger size of ");
        int _size2 = c.getSize2();
        _builder.append(_size2, "\t\t\t");
        _builder.append("?</div>");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("\t");
        CharSequence _solveTimes = this.solveTimes(c, c.getComplexity());
        _builder.append(_solveTimes, "\t\t\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("</div>");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("</div>");
        _builder.newLine();
      }
    }
    _builder.append("\t\t");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<h2>Calculating problem sizes</h2>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<div class=\"panel-group\">");
    _builder.newLine();
    {
      Iterable<Sizes> _filter_1 = Iterables.<Sizes>filter(m.getCalculations(), Sizes.class);
      for(final Sizes c_1 : _filter_1) {
        _builder.append("\t\t");
        _builder.append("<div class=\"panel panel-success\">");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("<div class=\"panel-heading\">Problem ");
        int _plusPlus_1 = i++;
        _builder.append(_plusPlus_1, "\t\t\t");
        _builder.append("</div>");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("<div class=\"panel-body\">");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("<div class=\"well\">A program with a ");
        String _complexity_1 = c_1.getComplexity();
        _builder.append(_complexity_1, "\t\t\t");
        _builder.append(" time complexity takes ");
        int _time1_1 = c_1.getTime1();
        _builder.append(_time1_1, "\t\t\t");
        _builder.append(" ");
        TimeUnits _time1Unit_1 = c_1.getTime1Unit();
        _builder.append(_time1Unit_1, "\t\t\t");
        _builder.append(" for a problem size of ");
        int _size1_1 = c_1.getSize1();
        _builder.append(_size1_1, "\t\t\t");
        _builder.append(". What problem size would be solved for a larger time of ");
        int _time2 = c_1.getTime2();
        _builder.append(_time2, "\t\t\t");
        _builder.append(" ");
        TimeUnits _time2Unit = c_1.getTime2Unit();
        _builder.append(_time2Unit, "\t\t\t");
        _builder.append("?</div>");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("</div>");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("</div>");
        _builder.newLine();
      }
    }
    _builder.append("\t\t");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</body>");
    _builder.newLine();
    _builder.append("</html>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence solveTimes(final ExecutionTimes e, final String complexity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<p class=\"text-info\">Solution</p>");
    _builder.newLine();
    _builder.append("<div class=\"alert alert-info\">");
    _builder.newLine();
    _builder.append("<p>If for $ f(n_1)$ it takes $t_1$ and for $f(n_2)$ it takes $t_2 \\to t_2 = { f(n_2) \\over f(n_1) } \\times t_1$</p>");
    _builder.newLine();
    _builder.append("<p>$ n_2 = ");
    int _size2 = e.getSize2();
    _builder.append(_size2);
    _builder.append("; n_1 = ");
    int _size1 = e.getSize1();
    _builder.append(_size1);
    _builder.append("; t_1 = ");
    int _time1 = e.getTime1();
    _builder.append(_time1);
    _builder.append("; t_2 = ? $</p>");
    _builder.newLineIfNotEmpty();
    _builder.append("<p>$ n_2 = k \\times n_1 \\to k = { n_2 \\over n_1 } = { ");
    int _size2_1 = e.getSize2();
    _builder.append(_size2_1);
    _builder.append(" \\over ");
    int _size1_1 = e.getSize1();
    _builder.append(_size1_1);
    _builder.append(" } = ");
    int _size2_2 = e.getSize2();
    int _size1_2 = e.getSize1();
    int _divide = (_size2_2 / _size1_2);
    _builder.append(_divide);
    _builder.append(" $</p>");
    _builder.newLineIfNotEmpty();
    int _size2_3 = e.getSize2();
    int _size1_3 = e.getSize1();
    int k = (_size2_3 / _size1_3);
    _builder.newLineIfNotEmpty();
    {
      boolean _matches = complexity.matches("O\\([1-9]+\\)");
      if (_matches) {
        CharSequence _solveTimesConstant = this.solveTimesConstant(e);
        _builder.append(_solveTimesConstant);
        _builder.newLineIfNotEmpty();
      } else {
        boolean _matches_1 = complexity.matches("O\\(n\\)");
        if (_matches_1) {
          CharSequence _solveTimesLinear = this.solveTimesLinear(e, k);
          _builder.append(_solveTimesLinear);
          _builder.newLineIfNotEmpty();
        } else {
          boolean _matches_2 = complexity.matches("O\\(n\\^[1-9]+\\)");
          if (_matches_2) {
            double c = this.getValueExp(complexity);
            _builder.newLineIfNotEmpty();
            CharSequence _solveTimesExponential = this.solveTimesExponential(e, k, c);
            _builder.append(_solveTimesExponential);
            _builder.newLineIfNotEmpty();
          } else {
            boolean _matches_3 = complexity.matches("O\\(logn\\)");
            if (_matches_3) {
              CharSequence _solveTimesLogarithmic = this.solveTimesLogarithmic(e, k);
              _builder.append(_solveTimesLogarithmic);
              _builder.newLineIfNotEmpty();
            } else {
              boolean _matches_4 = complexity.matches("O\\(nlogn\\)");
              if (_matches_4) {
                CharSequence _solveTimesLinLog = this.solveTimesLinLog(e, k);
                _builder.append(_solveTimesLinLog);
                _builder.newLineIfNotEmpty();
              } else {
                boolean _matches_5 = complexity.matches("O\\(n\\^[1-9]+log\\^[1-9]+\\sn\\)");
                if (_matches_5) {
                  double c1 = this.getValueLinLogExp1(complexity);
                  _builder.newLineIfNotEmpty();
                  double c2 = this.getValueLinLogExp2(complexity);
                  _builder.newLineIfNotEmpty();
                  CharSequence _solveTimesLinLogExp = this.solveTimesLinLogExp(e, k, c1, c2);
                  _builder.append(_solveTimesLinLogExp);
                  _builder.newLineIfNotEmpty();
                } else {
                  boolean _matches_6 = complexity.matches("O\\([1-9]+\\^n\\)");
                  if (_matches_6) {
                    double c_1 = this.getValuePower(complexity);
                    _builder.newLineIfNotEmpty();
                    CharSequence _solveTimesPower = this.solveTimesPower(e, k, c_1);
                    _builder.append(_solveTimesPower);
                    _builder.newLineIfNotEmpty();
                  } else {
                    boolean _matches_7 = complexity.matches("O\\(n!\\)");
                    if (_matches_7) {
                      CharSequence _solveTimesFactorial = this.solveTimesFactorial(e);
                      _builder.append(_solveTimesFactorial);
                      _builder.newLineIfNotEmpty();
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    return _builder;
  }
  
  public CharSequence solveTimesConstant(final ExecutionTimes e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("<p>$ t_2 = { 1 \\over 1 } \\times ");
    int _time1 = e.getTime1();
    _builder.append(_time1);
    _builder.append(" $ ");
    TimeUnits _time1Unit = e.getTime1Unit();
    _builder.append(_time1Unit);
    _builder.append("</p>");
    _builder.newLineIfNotEmpty();
    {
      TimeUnits _time1Unit_1 = e.getTime1Unit();
      TimeUnits _time2Unit = e.getTime2Unit();
      boolean _notEquals = (!Objects.equal(_time1Unit_1, _time2Unit));
      if (_notEquals) {
        _builder.append("<p>$ t_2 = ");
        double _matchUnits = this.matchUnits(e.getTime1(), e.getTime1Unit(), e.getTime2Unit());
        _builder.append(_matchUnits);
        _builder.append(" $ ");
        TimeUnits _time2Unit_1 = e.getTime2Unit();
        _builder.append(_time2Unit_1);
        _builder.append("</p>\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence solveTimesLinear(final ExecutionTimes e, final double k) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("<p>$ t_2 = { n_2 \\over n_1 } \\times ");
    int _time1 = e.getTime1();
    _builder.append(_time1);
    _builder.append(" $ ");
    TimeUnits _time1Unit = e.getTime1Unit();
    _builder.append(_time1Unit);
    _builder.append("</p>");
    _builder.newLineIfNotEmpty();
    _builder.append("<p>$ t_2 = k \\times ");
    int _time1_1 = e.getTime1();
    _builder.append(_time1_1);
    _builder.append(" $ ");
    TimeUnits _time1Unit_1 = e.getTime1Unit();
    _builder.append(_time1Unit_1);
    _builder.append("</p>");
    _builder.newLineIfNotEmpty();
    _builder.append("<p>$ t_2 = ");
    _builder.append(k);
    _builder.append(" \\times ");
    int _time1_2 = e.getTime1();
    _builder.append(_time1_2);
    _builder.append(" $ ");
    TimeUnits _time1Unit_2 = e.getTime1Unit();
    _builder.append(_time1Unit_2);
    _builder.append("</p>");
    _builder.newLineIfNotEmpty();
    int _time1_3 = e.getTime1();
    double result = (k * _time1_3);
    _builder.newLineIfNotEmpty();
    _builder.append("<p>$ t_2 = ");
    _builder.append(result);
    _builder.append(" $ ");
    TimeUnits _time1Unit_3 = e.getTime1Unit();
    _builder.append(_time1Unit_3);
    _builder.append("</p>");
    _builder.newLineIfNotEmpty();
    {
      TimeUnits _time1Unit_4 = e.getTime1Unit();
      TimeUnits _time2Unit = e.getTime2Unit();
      boolean _notEquals = (!Objects.equal(_time1Unit_4, _time2Unit));
      if (_notEquals) {
        _builder.append("<p>$ t_2 = ");
        double _matchUnits = this.matchUnits(result, e.getTime1Unit(), e.getTime2Unit());
        _builder.append(_matchUnits);
        _builder.append(" $ ");
        TimeUnits _time2Unit_1 = e.getTime2Unit();
        _builder.append(_time2Unit_1);
        _builder.append("</p>");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence solveTimesExponential(final ExecutionTimes e, final double k, final double c) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<p>$ c = ");
    _builder.append(c);
    _builder.append(" $</p>");
    _builder.newLineIfNotEmpty();
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("<p>$ t_2 = { n_2^{c} \\over n_1^{c} } \\times ");
    int _time1 = e.getTime1();
    _builder.append(_time1);
    _builder.append(" $ ");
    TimeUnits _time1Unit = e.getTime1Unit();
    _builder.append(_time1Unit);
    _builder.append("</p>");
    _builder.newLineIfNotEmpty();
    _builder.append("<p>$ t_2 = { n_2^{");
    _builder.append(c);
    _builder.append("} \\over n_1^{");
    _builder.append(c);
    _builder.append("} } \\times ");
    int _time1_1 = e.getTime1();
    _builder.append(_time1_1);
    _builder.append(" $ ");
    TimeUnits _time1Unit_1 = e.getTime1Unit();
    _builder.append(_time1Unit_1);
    _builder.append("</p>");
    _builder.newLineIfNotEmpty();
    _builder.append("<p>$ t_2 = k^{");
    _builder.append(c);
    _builder.append("} \\times ");
    int _time1_2 = e.getTime1();
    _builder.append(_time1_2);
    _builder.append(" $ ");
    TimeUnits _time1Unit_2 = e.getTime1Unit();
    _builder.append(_time1Unit_2);
    _builder.append("</p>");
    _builder.newLineIfNotEmpty();
    _builder.append("<p>$ t_2 = ");
    _builder.append(k);
    _builder.append("^{");
    _builder.append(c);
    _builder.append("} \\times ");
    int _time1_3 = e.getTime1();
    _builder.append(_time1_3);
    _builder.append(" $ ");
    TimeUnits _time1Unit_3 = e.getTime1Unit();
    _builder.append(_time1Unit_3);
    _builder.append("</p>");
    _builder.newLineIfNotEmpty();
    _builder.append("<p>$ t_2 = ");
    double _pow = Math.pow(k, c);
    _builder.append(_pow);
    _builder.append(" \\times ");
    int _time1_4 = e.getTime1();
    _builder.append(_time1_4);
    _builder.append(" $ ");
    TimeUnits _time1Unit_4 = e.getTime1Unit();
    _builder.append(_time1Unit_4);
    _builder.append("</p>");
    _builder.newLineIfNotEmpty();
    double _pow_1 = Math.pow(k, c);
    int _time1_5 = e.getTime1();
    double result = (_pow_1 * _time1_5);
    _builder.newLineIfNotEmpty();
    _builder.append("<p>$ t_2 = ");
    _builder.append(result);
    _builder.append(" $ ");
    TimeUnits _time1Unit_5 = e.getTime1Unit();
    _builder.append(_time1Unit_5);
    _builder.append("</p>");
    _builder.newLineIfNotEmpty();
    {
      TimeUnits _time1Unit_6 = e.getTime1Unit();
      TimeUnits _time2Unit = e.getTime2Unit();
      boolean _notEquals = (!Objects.equal(_time1Unit_6, _time2Unit));
      if (_notEquals) {
        _builder.append("<p>$ t_2 = ");
        double _matchUnits = this.matchUnits(result, e.getTime1Unit(), e.getTime2Unit());
        _builder.append(_matchUnits);
        _builder.append(" $ ");
        TimeUnits _time2Unit_1 = e.getTime2Unit();
        _builder.append(_time2Unit_1);
        _builder.append("</p>");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence solveTimesLogarithmic(final ExecutionTimes e, final double k) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("<p>$ t_2 = { \\log n_2 \\over \\log n_1 } \\times ");
    int _time1 = e.getTime1();
    _builder.append(_time1);
    _builder.append(" $ ");
    TimeUnits _time1Unit = e.getTime1Unit();
    _builder.append(_time1Unit);
    _builder.append("</p>");
    _builder.newLineIfNotEmpty();
    _builder.append("<p>$ t_2 = { \\log k \\times n_1 \\over \\log n_1 } \\times ");
    int _time1_1 = e.getTime1();
    _builder.append(_time1_1);
    _builder.append(" $ ");
    TimeUnits _time1Unit_1 = e.getTime1Unit();
    _builder.append(_time1Unit_1);
    _builder.append("</p>");
    _builder.newLineIfNotEmpty();
    _builder.append("<p>$ t_2 = { \\log k + \\log n_1 \\over \\log n_1 } \\times ");
    int _time1_2 = e.getTime1();
    _builder.append(_time1_2);
    _builder.append(" $ ");
    TimeUnits _time1Unit_2 = e.getTime1Unit();
    _builder.append(_time1Unit_2);
    _builder.append("</p>\t");
    _builder.newLineIfNotEmpty();
    _builder.append("<p>$ t_2 = { \\log ");
    _builder.append(k);
    _builder.append(" + \\log ");
    int _size1 = e.getSize1();
    _builder.append(_size1);
    _builder.append(" \\over \\log ");
    int _size1_1 = e.getSize1();
    _builder.append(_size1_1);
    _builder.append(" } \\times ");
    int _time1_3 = e.getTime1();
    _builder.append(_time1_3);
    _builder.append(" $ ");
    TimeUnits _time1Unit_3 = e.getTime1Unit();
    _builder.append(_time1Unit_3);
    _builder.append("</p>\t");
    _builder.newLineIfNotEmpty();
    _builder.append("<p>$ t_2 = { ");
    double _log = this.log(k);
    _builder.append(_log);
    _builder.append(" + ");
    double _log_1 = this.log(e.getSize1());
    _builder.append(_log_1);
    _builder.append(" \\over ");
    double _log_2 = this.log(e.getSize1());
    _builder.append(_log_2);
    _builder.append(" } \\times ");
    int _time1_4 = e.getTime1();
    _builder.append(_time1_4);
    _builder.append(" $ ");
    TimeUnits _time1Unit_4 = e.getTime1Unit();
    _builder.append(_time1Unit_4);
    _builder.append("</p>");
    _builder.newLineIfNotEmpty();
    _builder.append("<p>$ t_2 = { ");
    double _log_3 = this.log(k);
    double _log_4 = this.log(e.getSize1());
    double _plus = (_log_3 + _log_4);
    _builder.append(_plus);
    _builder.append(" \\over ");
    double _log_5 = this.log(e.getSize1());
    _builder.append(_log_5);
    _builder.append(" } \\times ");
    int _time1_5 = e.getTime1();
    _builder.append(_time1_5);
    _builder.append(" $ ");
    TimeUnits _time1Unit_5 = e.getTime1Unit();
    _builder.append(_time1Unit_5);
    _builder.append("</p>\t");
    _builder.newLineIfNotEmpty();
    _builder.append("<p>$ t_2 = { ");
    double _log_6 = this.log(k);
    double _log_7 = this.log(e.getSize1());
    double _plus_1 = (_log_6 + _log_7);
    double _log_8 = this.log(e.getSize1());
    double _divide = (_plus_1 / _log_8);
    _builder.append(_divide);
    _builder.append(" } \\times ");
    int _time1_6 = e.getTime1();
    _builder.append(_time1_6);
    _builder.append(" $ ");
    TimeUnits _time1Unit_6 = e.getTime1Unit();
    _builder.append(_time1Unit_6);
    _builder.append("</p>\t");
    _builder.newLineIfNotEmpty();
    double _log_9 = this.log(k);
    double _log_10 = this.log(e.getSize1());
    double _plus_2 = (_log_9 + _log_10);
    double _log_11 = this.log(e.getSize1());
    double _divide_1 = (_plus_2 / _log_11);
    int _time1_7 = e.getTime1();
    double result = (_divide_1 * _time1_7);
    _builder.newLineIfNotEmpty();
    _builder.append("<p>$ t_2 = ");
    _builder.append(result);
    _builder.append(" $ ");
    TimeUnits _time1Unit_7 = e.getTime1Unit();
    _builder.append(_time1Unit_7);
    _builder.append("</p>");
    _builder.newLineIfNotEmpty();
    {
      TimeUnits _time1Unit_8 = e.getTime1Unit();
      TimeUnits _time2Unit = e.getTime2Unit();
      boolean _notEquals = (!Objects.equal(_time1Unit_8, _time2Unit));
      if (_notEquals) {
        _builder.append("<p>$ t_2 = ");
        double _matchUnits = this.matchUnits(result, e.getTime1Unit(), e.getTime2Unit());
        _builder.append(_matchUnits);
        _builder.append(" $ ");
        TimeUnits _time2Unit_1 = e.getTime2Unit();
        _builder.append(_time2Unit_1);
        _builder.append("</p>");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence solveTimesLinLog(final ExecutionTimes e, final double k) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("<p>$ t_2 = { n_2 \\times \\log n_2 \\over n_1 \\times \\log n_1 } \\times ");
    int _time1 = e.getTime1();
    _builder.append(_time1);
    _builder.append(" $ ");
    TimeUnits _time1Unit = e.getTime1Unit();
    _builder.append(_time1Unit);
    _builder.append("</p>");
    _builder.newLineIfNotEmpty();
    _builder.append("<p>$ t_2 = k \\times { \\log k \\times n_1 \\over \\log n_1 } \\times ");
    int _time1_1 = e.getTime1();
    _builder.append(_time1_1);
    _builder.append(" $ ");
    TimeUnits _time1Unit_1 = e.getTime1Unit();
    _builder.append(_time1Unit_1);
    _builder.append("</p>");
    _builder.newLineIfNotEmpty();
    _builder.append("<p>$ t_2 = k \\times { \\log k + \\log n_1 \\over \\log n_1 } \\times ");
    int _time1_2 = e.getTime1();
    _builder.append(_time1_2);
    _builder.append(" $ ");
    TimeUnits _time1Unit_2 = e.getTime1Unit();
    _builder.append(_time1Unit_2);
    _builder.append("</p>\t");
    _builder.newLineIfNotEmpty();
    _builder.append("<p>$ t_2 = ");
    _builder.append(k);
    _builder.append(" \\times { \\log ");
    _builder.append(k);
    _builder.append(" + \\log ");
    int _size1 = e.getSize1();
    _builder.append(_size1);
    _builder.append(" \\over \\log ");
    int _size1_1 = e.getSize1();
    _builder.append(_size1_1);
    _builder.append(" } \\times ");
    int _time1_3 = e.getTime1();
    _builder.append(_time1_3);
    _builder.append(" $ ");
    TimeUnits _time1Unit_3 = e.getTime1Unit();
    _builder.append(_time1Unit_3);
    _builder.append("</p>\t");
    _builder.newLineIfNotEmpty();
    _builder.append("<p>$ t_2 = ");
    _builder.append(k);
    _builder.append(" \\times { ");
    double _log = this.log(k);
    _builder.append(_log);
    _builder.append(" + ");
    double _log_1 = this.log(e.getSize1());
    _builder.append(_log_1);
    _builder.append(" \\over ");
    double _log_2 = this.log(e.getSize1());
    _builder.append(_log_2);
    _builder.append(" } \\times ");
    int _time1_4 = e.getTime1();
    _builder.append(_time1_4);
    _builder.append(" $ ");
    TimeUnits _time1Unit_4 = e.getTime1Unit();
    _builder.append(_time1Unit_4);
    _builder.append("</p>");
    _builder.newLineIfNotEmpty();
    _builder.append("<p>$ t_2 = ");
    _builder.append(k);
    _builder.append(" \\times { ");
    double _log_3 = this.log(k);
    double _log_4 = this.log(e.getSize1());
    double _plus = (_log_3 + _log_4);
    _builder.append(_plus);
    _builder.append(" \\over ");
    double _log_5 = this.log(e.getSize1());
    _builder.append(_log_5);
    _builder.append(" } \\times ");
    int _time1_5 = e.getTime1();
    _builder.append(_time1_5);
    _builder.append(" $ ");
    TimeUnits _time1Unit_5 = e.getTime1Unit();
    _builder.append(_time1Unit_5);
    _builder.append("</p>\t");
    _builder.newLineIfNotEmpty();
    _builder.append("<p>$ t_2 = ");
    _builder.append(k);
    _builder.append(" \\times { ");
    double _log_6 = this.log(k);
    double _log_7 = this.log(e.getSize1());
    double _plus_1 = (_log_6 + _log_7);
    double _log_8 = this.log(e.getSize1());
    double _divide = (_plus_1 / _log_8);
    _builder.append(_divide);
    _builder.append(" } \\times ");
    int _time1_6 = e.getTime1();
    _builder.append(_time1_6);
    _builder.append(" $ ");
    TimeUnits _time1Unit_6 = e.getTime1Unit();
    _builder.append(_time1Unit_6);
    _builder.append("</p>");
    _builder.newLineIfNotEmpty();
    _builder.append("<p>$ t_2 = ");
    double _log_9 = this.log(k);
    double _log_10 = this.log(e.getSize1());
    double _plus_2 = (_log_9 + _log_10);
    double _multiply = (k * _plus_2);
    double _log_11 = this.log(e.getSize1());
    double _divide_1 = (_multiply / _log_11);
    _builder.append(_divide_1);
    _builder.append(" \\times ");
    int _time1_7 = e.getTime1();
    _builder.append(_time1_7);
    _builder.append(" $ ");
    TimeUnits _time1Unit_7 = e.getTime1Unit();
    _builder.append(_time1Unit_7);
    _builder.append("</p>\t\t");
    _builder.newLineIfNotEmpty();
    double _log_12 = this.log(k);
    double _log_13 = this.log(e.getSize1());
    double _plus_3 = (_log_12 + _log_13);
    double _multiply_1 = (k * _plus_3);
    double _log_14 = this.log(e.getSize1());
    double _divide_2 = (_multiply_1 / _log_14);
    int _time1_8 = e.getTime1();
    double result = (_divide_2 * _time1_8);
    _builder.newLineIfNotEmpty();
    _builder.append("<p>$ t_2 = ");
    _builder.append(result);
    _builder.append(" $ ");
    TimeUnits _time1Unit_8 = e.getTime1Unit();
    _builder.append(_time1Unit_8);
    _builder.append("</p>");
    _builder.newLineIfNotEmpty();
    {
      TimeUnits _time1Unit_9 = e.getTime1Unit();
      TimeUnits _time2Unit = e.getTime2Unit();
      boolean _notEquals = (!Objects.equal(_time1Unit_9, _time2Unit));
      if (_notEquals) {
        _builder.append("<p>$ t_2 = ");
        double _matchUnits = this.matchUnits(result, e.getTime1Unit(), e.getTime2Unit());
        _builder.append(_matchUnits);
        _builder.append(" $ ");
        TimeUnits _time2Unit_1 = e.getTime2Unit();
        _builder.append(_time2Unit_1);
        _builder.append("</p>");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence solveTimesLinLogExp(final ExecutionTimes e, final double k, final double c1, final double c2) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<p>$ c_1 = ");
    _builder.append(c1);
    _builder.append("; c_2 = ");
    _builder.append(c2);
    _builder.append(" $</p>");
    _builder.newLineIfNotEmpty();
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("<p>$ t_2 = { n_2^{c_1} \\times \\log^{c_2} n_2 \\over n_1^{c_1} \\times \\log^{c_2} n_1 } \\times ");
    int _time1 = e.getTime1();
    _builder.append(_time1);
    _builder.append(" $ ");
    TimeUnits _time1Unit = e.getTime1Unit();
    _builder.append(_time1Unit);
    _builder.append("</p>");
    _builder.newLineIfNotEmpty();
    _builder.append("<p>$ t_2 = k^{c_1} { \\log^{c_2} K \\times n_1 \\over \\log^{c_2} n_1 } \\times ");
    int _time1_1 = e.getTime1();
    _builder.append(_time1_1);
    _builder.append(" $ ");
    TimeUnits _time1Unit_1 = e.getTime1Unit();
    _builder.append(_time1Unit_1);
    _builder.append("</p>");
    _builder.newLineIfNotEmpty();
    _builder.append("<p>$ t_2 = ");
    _builder.append(k);
    _builder.append("^{");
    _builder.append(c1);
    _builder.append("} { \\log^{");
    _builder.append(c2);
    _builder.append("} ");
    _builder.append(k);
    _builder.append(" \\times ");
    int _size1 = e.getSize1();
    _builder.append(_size1);
    _builder.append(" \\over \\log^{");
    _builder.append(c2);
    _builder.append("} ");
    int _size1_1 = e.getSize1();
    _builder.append(_size1_1);
    _builder.append(" } \\times ");
    int _time1_2 = e.getTime1();
    _builder.append(_time1_2);
    _builder.append(" $ ");
    TimeUnits _time1Unit_2 = e.getTime1Unit();
    _builder.append(_time1Unit_2);
    _builder.append("</p>");
    _builder.newLineIfNotEmpty();
    _builder.append("<p>$ t_2 = ");
    double _pow = Math.pow(k, c1);
    _builder.append(_pow);
    _builder.append(" { \\log^{");
    _builder.append(c2);
    _builder.append("} ");
    int _size1_2 = e.getSize1();
    double _multiply = (k * _size1_2);
    _builder.append(_multiply);
    _builder.append(" \\over \\log^{");
    _builder.append(c2);
    _builder.append("} ");
    int _size1_3 = e.getSize1();
    _builder.append(_size1_3);
    _builder.append(" } \\times ");
    int _time1_3 = e.getTime1();
    _builder.append(_time1_3);
    _builder.append(" $ ");
    TimeUnits _time1Unit_3 = e.getTime1Unit();
    _builder.append(_time1Unit_3);
    _builder.append("</p>");
    _builder.newLineIfNotEmpty();
    _builder.append("<p>$ t_2 = ");
    double _pow_1 = Math.pow(k, c1);
    _builder.append(_pow_1);
    _builder.append(" { ");
    int _size1_4 = e.getSize1();
    double _multiply_1 = (k * _size1_4);
    double _log = this.log(_multiply_1);
    _builder.append(_log);
    _builder.append("^{");
    _builder.append(c2);
    _builder.append("} \\over ");
    double _log_1 = this.log(e.getSize1());
    _builder.append(_log_1);
    _builder.append("^{");
    _builder.append(c2);
    _builder.append("} } \\times ");
    int _time1_4 = e.getTime1();
    _builder.append(_time1_4);
    _builder.append(" $ ");
    TimeUnits _time1Unit_4 = e.getTime1Unit();
    _builder.append(_time1Unit_4);
    _builder.append("</p>");
    _builder.newLineIfNotEmpty();
    _builder.append("<p>$ t_2 = ");
    double _pow_2 = Math.pow(k, c1);
    _builder.append(_pow_2);
    _builder.append(" { ");
    int _size1_5 = e.getSize1();
    double _multiply_2 = (k * _size1_5);
    double _pow_3 = Math.pow(this.log(_multiply_2), c2);
    _builder.append(_pow_3);
    _builder.append(" \\over ");
    double _pow_4 = Math.pow(this.log(e.getSize1()), c2);
    _builder.append(_pow_4);
    _builder.append(" } \\times ");
    int _time1_5 = e.getTime1();
    _builder.append(_time1_5);
    _builder.append(" $ ");
    TimeUnits _time1Unit_5 = e.getTime1Unit();
    _builder.append(_time1Unit_5);
    _builder.append("</p>");
    _builder.newLineIfNotEmpty();
    _builder.append("<p>$ t_2 = ");
    double _pow_5 = Math.pow(k, c1);
    _builder.append(_pow_5);
    _builder.append(" \\times { ");
    int _size1_6 = e.getSize1();
    double _multiply_3 = (k * _size1_6);
    double _pow_6 = Math.pow(this.log(_multiply_3), c2);
    double _pow_7 = Math.pow(this.log(e.getSize1()), c2);
    double _divide = (_pow_6 / _pow_7);
    _builder.append(_divide);
    _builder.append(" } \\times ");
    int _time1_6 = e.getTime1();
    _builder.append(_time1_6);
    _builder.append(" $ ");
    TimeUnits _time1Unit_6 = e.getTime1Unit();
    _builder.append(_time1Unit_6);
    _builder.append("</p>");
    _builder.newLineIfNotEmpty();
    _builder.append("<p>$ t_2 = ");
    double _pow_8 = Math.pow(k, c1);
    int _size1_7 = e.getSize1();
    double _multiply_4 = (k * _size1_7);
    double _pow_9 = Math.pow(this.log(_multiply_4), c2);
    double _multiply_5 = (_pow_8 * _pow_9);
    double _pow_10 = Math.pow(this.log(e.getSize1()), c2);
    double _divide_1 = (_multiply_5 / _pow_10);
    _builder.append(_divide_1);
    _builder.append(" \\times ");
    int _time1_7 = e.getTime1();
    _builder.append(_time1_7);
    _builder.append(" $ ");
    TimeUnits _time1Unit_7 = e.getTime1Unit();
    _builder.append(_time1Unit_7);
    _builder.append("</p>");
    _builder.newLineIfNotEmpty();
    double _pow_11 = Math.pow(k, c1);
    int _size1_8 = e.getSize1();
    double _multiply_6 = (k * _size1_8);
    double _pow_12 = Math.pow(this.log(_multiply_6), c2);
    double _multiply_7 = (_pow_11 * _pow_12);
    double _pow_13 = Math.pow(this.log(e.getSize1()), c2);
    double _divide_2 = (_multiply_7 / _pow_13);
    int _time1_8 = e.getTime1();
    double result = (_divide_2 * _time1_8);
    _builder.newLineIfNotEmpty();
    _builder.append("<p>$ t_2 = ");
    _builder.append(result);
    _builder.append(" $ ");
    TimeUnits _time1Unit_8 = e.getTime1Unit();
    _builder.append(_time1Unit_8);
    _builder.append("</p>");
    _builder.newLineIfNotEmpty();
    {
      TimeUnits _time1Unit_9 = e.getTime1Unit();
      TimeUnits _time2Unit = e.getTime2Unit();
      boolean _notEquals = (!Objects.equal(_time1Unit_9, _time2Unit));
      if (_notEquals) {
        _builder.append("<p>$ t_2 = ");
        double _matchUnits = this.matchUnits(result, e.getTime1Unit(), e.getTime2Unit());
        _builder.append(_matchUnits);
        _builder.append(" $ ");
        TimeUnits _time2Unit_1 = e.getTime2Unit();
        _builder.append(_time2Unit_1);
        _builder.append("</p>");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence solveTimesPower(final ExecutionTimes e, final double k, final double c) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<p>$ c = ");
    _builder.append(c);
    _builder.append(" $</p>");
    _builder.newLineIfNotEmpty();
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("<p>$ t_2 = { c^{n_2} \\over c^{n_1} } \\times ");
    int _time1 = e.getTime1();
    _builder.append(_time1);
    _builder.append(" $ ");
    TimeUnits _time1Unit = e.getTime1Unit();
    _builder.append(_time1Unit);
    _builder.append("</p>");
    _builder.newLineIfNotEmpty();
    _builder.append("<p>$ t_2 = c^{n_2 - n_1} \\times ");
    int _time1_1 = e.getTime1();
    _builder.append(_time1_1);
    _builder.append(" $ ");
    TimeUnits _time1Unit_1 = e.getTime1Unit();
    _builder.append(_time1Unit_1);
    _builder.append("</p>");
    _builder.newLineIfNotEmpty();
    _builder.append("<p>$ t_2 = c^{k \\times n_1 - n_1} \\times ");
    int _time1_2 = e.getTime1();
    _builder.append(_time1_2);
    _builder.append(" $ ");
    TimeUnits _time1Unit_2 = e.getTime1Unit();
    _builder.append(_time1Unit_2);
    _builder.append("</p>");
    _builder.newLineIfNotEmpty();
    _builder.append("<p>$ t_2 = c^{n_1 \\times (k - 1)} \\times ");
    int _time1_3 = e.getTime1();
    _builder.append(_time1_3);
    _builder.append(" $ ");
    TimeUnits _time1Unit_3 = e.getTime1Unit();
    _builder.append(_time1Unit_3);
    _builder.append("</p>");
    _builder.newLineIfNotEmpty();
    _builder.append("<p>$ t_2 = ");
    _builder.append(c);
    _builder.append("^{");
    int _size1 = e.getSize1();
    _builder.append(_size1);
    _builder.append(" \\times (");
    _builder.append(k);
    _builder.append(" - 1)} \\times ");
    int _time1_4 = e.getTime1();
    _builder.append(_time1_4);
    _builder.append(" $ ");
    TimeUnits _time1Unit_4 = e.getTime1Unit();
    _builder.append(_time1Unit_4);
    _builder.append("</p>");
    _builder.newLineIfNotEmpty();
    _builder.append("<p>$ t_2 = ");
    _builder.append(c);
    _builder.append("^{");
    int _size1_1 = e.getSize1();
    double _multiply = (_size1_1 * k);
    int _size1_2 = e.getSize1();
    int _multiply_1 = (_size1_2 * 1);
    double _minus = (_multiply - _multiply_1);
    _builder.append(_minus);
    _builder.append("} \\times ");
    int _time1_5 = e.getTime1();
    _builder.append(_time1_5);
    _builder.append(" $ ");
    TimeUnits _time1Unit_5 = e.getTime1Unit();
    _builder.append(_time1Unit_5);
    _builder.append("</p>");
    _builder.newLineIfNotEmpty();
    _builder.append("<p>$ t_2 = ");
    int _size1_3 = e.getSize1();
    double _multiply_2 = (_size1_3 * k);
    int _size1_4 = e.getSize1();
    int _multiply_3 = (_size1_4 * 1);
    double _minus_1 = (_multiply_2 - _multiply_3);
    double _pow = Math.pow(c, _minus_1);
    _builder.append(_pow);
    _builder.append(" \\times ");
    int _time1_6 = e.getTime1();
    _builder.append(_time1_6);
    _builder.append(" $ ");
    TimeUnits _time1Unit_6 = e.getTime1Unit();
    _builder.append(_time1Unit_6);
    _builder.append("</p>");
    _builder.newLineIfNotEmpty();
    int _size1_5 = e.getSize1();
    double _multiply_4 = (_size1_5 * k);
    int _size1_6 = e.getSize1();
    int _multiply_5 = (_size1_6 * 1);
    double _minus_2 = (_multiply_4 - _multiply_5);
    double _pow_1 = Math.pow(c, _minus_2);
    int _time1_7 = e.getTime1();
    double result = (_pow_1 * _time1_7);
    _builder.newLineIfNotEmpty();
    _builder.append("<p>$ t_2 = ");
    _builder.append(result);
    _builder.append(" $ ");
    TimeUnits _time1Unit_7 = e.getTime1Unit();
    _builder.append(_time1Unit_7);
    _builder.append("</p>");
    _builder.newLineIfNotEmpty();
    {
      TimeUnits _time1Unit_8 = e.getTime1Unit();
      TimeUnits _time2Unit = e.getTime2Unit();
      boolean _notEquals = (!Objects.equal(_time1Unit_8, _time2Unit));
      if (_notEquals) {
        _builder.append("<p>$ t_2 = ");
        double _matchUnits = this.matchUnits(result, e.getTime1Unit(), e.getTime2Unit());
        _builder.append(_matchUnits);
        _builder.append(" $ ");
        TimeUnits _time2Unit_1 = e.getTime2Unit();
        _builder.append(_time2Unit_1);
        _builder.append("</p>");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence solveTimesFactorial(final ExecutionTimes e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("<p>$ t_2 = { n_2! \\over n_1! } \\times ");
    int _time1 = e.getTime1();
    _builder.append(_time1);
    _builder.append(" $ ");
    TimeUnits _time1Unit = e.getTime1Unit();
    _builder.append(_time1Unit);
    _builder.append("</p>");
    _builder.newLineIfNotEmpty();
    _builder.append("<p>$ t_2 = \\prod_{i=n_1 + 1}^{n_2} i \\times ");
    int _time1_1 = e.getTime1();
    _builder.append(_time1_1);
    _builder.append(" $ ");
    TimeUnits _time1Unit_1 = e.getTime1Unit();
    _builder.append(_time1Unit_1);
    _builder.append("</p>");
    _builder.newLineIfNotEmpty();
    _builder.append("<p>$ t_2 = \\prod_{i=");
    int _size1 = e.getSize1();
    int _plus = (_size1 + 1);
    _builder.append(_plus);
    _builder.append("}^{");
    int _size2 = e.getSize2();
    _builder.append(_size2);
    _builder.append("} i \\times ");
    int _time1_2 = e.getTime1();
    _builder.append(_time1_2);
    _builder.append(" $ ");
    TimeUnits _time1Unit_2 = e.getTime1Unit();
    _builder.append(_time1Unit_2);
    _builder.append("</p>");
    _builder.newLineIfNotEmpty();
    _builder.append("<p>$ t_2 = ");
    int _size1_1 = e.getSize1();
    int _plus_1 = (_size1_1 + 1);
    double _factCalculator = this.factCalculator(_plus_1, e.getSize2());
    _builder.append(_factCalculator);
    _builder.append(" \\times ");
    int _time1_3 = e.getTime1();
    _builder.append(_time1_3);
    _builder.append(" $ ");
    TimeUnits _time1Unit_3 = e.getTime1Unit();
    _builder.append(_time1Unit_3);
    _builder.append("</p>");
    _builder.newLineIfNotEmpty();
    int _size1_2 = e.getSize1();
    int _plus_2 = (_size1_2 + 1);
    double _factCalculator_1 = this.factCalculator(_plus_2, e.getSize2());
    int _time1_4 = e.getTime1();
    double result = (_factCalculator_1 * _time1_4);
    _builder.newLineIfNotEmpty();
    _builder.append("<p>$ t_2 = ");
    _builder.append(result);
    _builder.append(" $ ");
    TimeUnits _time1Unit_4 = e.getTime1Unit();
    _builder.append(_time1Unit_4);
    _builder.append("</p>");
    _builder.newLineIfNotEmpty();
    {
      TimeUnits _time1Unit_5 = e.getTime1Unit();
      TimeUnits _time2Unit = e.getTime2Unit();
      boolean _notEquals = (!Objects.equal(_time1Unit_5, _time2Unit));
      if (_notEquals) {
        _builder.append("<p>$ t_2 = ");
        double _matchUnits = this.matchUnits(result, e.getTime1Unit(), e.getTime2Unit());
        _builder.append(_matchUnits);
        _builder.append(" $ ");
        TimeUnits _time2Unit_1 = e.getTime2Unit();
        _builder.append(_time2Unit_1);
        _builder.append("</p>");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public double getValueExp(final String complexity) {
    double _xblockexpression = (double) 0;
    {
      Pattern pattern = Pattern.compile("\\^(.+)\\)");
      Matcher matcher = pattern.matcher(complexity);
      matcher.find();
      _xblockexpression = Double.parseDouble(matcher.group(1));
    }
    return _xblockexpression;
  }
  
  public double getValueLinLogExp1(final String complexity) {
    double _xblockexpression = (double) 0;
    {
      Pattern pattern = Pattern.compile("\\^(.+)log");
      Matcher matcher = pattern.matcher(complexity);
      matcher.find();
      _xblockexpression = Double.parseDouble(matcher.group(1));
    }
    return _xblockexpression;
  }
  
  public double getValueLinLogExp2(final String complexity) {
    double _xblockexpression = (double) 0;
    {
      Pattern pattern = Pattern.compile("log\\^(.+)\\s");
      Matcher matcher = pattern.matcher(complexity);
      matcher.find();
      _xblockexpression = Double.parseDouble(matcher.group(1));
    }
    return _xblockexpression;
  }
  
  public double getValuePower(final String complexity) {
    double _xblockexpression = (double) 0;
    {
      Pattern pattern = Pattern.compile("\\((.+)\\^");
      Matcher matcher = pattern.matcher(complexity);
      matcher.find();
      _xblockexpression = Double.parseDouble(matcher.group(1));
    }
    return _xblockexpression;
  }
  
  public double matchUnits(final double value, final TimeUnits input, final TimeUnits output) {
    double _xblockexpression = (double) 0;
    {
      double seconds = 0.0;
      if (input != null) {
        switch (input) {
          case SECONDS:
            seconds = value;
            break;
          case MINUTES:
            seconds = (value * this.SECONDS_MINUTE);
            break;
          case HOURS:
            seconds = (value * this.SECONDS_HOUR);
            break;
          case DAYS:
            seconds = (value * this.SECONDS_DAY);
            break;
          case WEEKS:
            seconds = (value * this.SECONDS_WEEK);
            break;
          case MONTHS:
            seconds = (value * this.SECONDS_MONTH);
            break;
          case YEARS:
            seconds = (value * this.SECONDS_YEAR);
            break;
          default:
            break;
        }
      }
      double _switchResult_1 = (double) 0;
      if (output != null) {
        switch (output) {
          case SECONDS:
            _switchResult_1 = seconds;
            break;
          case MINUTES:
            _switchResult_1 = (seconds / this.SECONDS_MINUTE);
            break;
          case HOURS:
            _switchResult_1 = (seconds / this.SECONDS_HOUR);
            break;
          case DAYS:
            _switchResult_1 = (seconds / this.SECONDS_DAY);
            break;
          case WEEKS:
            _switchResult_1 = (seconds / this.SECONDS_WEEK);
            break;
          case MONTHS:
            _switchResult_1 = (seconds / this.SECONDS_MONTH);
            break;
          case YEARS:
            _switchResult_1 = (seconds / this.SECONDS_YEAR);
            break;
          default:
            break;
        }
      }
      _xblockexpression = _switchResult_1;
    }
    return _xblockexpression;
  }
  
  public double log(final double x) {
    double _log = Math.log(x);
    double _log_1 = Math.log(2);
    return (_log / _log_1);
  }
  
  public double factCalculator(final double a, final double b) {
    double _xblockexpression = (double) 0;
    {
      double result = 1.0;
      for (double i = a; (i <= b); i++) {
        double _result = result;
        result = (_result * i);
      }
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
}
