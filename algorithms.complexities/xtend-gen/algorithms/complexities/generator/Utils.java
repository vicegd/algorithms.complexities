package algorithms.complexities.generator;

import algorithms.complexities.complexities.TimeUnits;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SuppressWarnings("all")
public class Utils {
  private final static int SECONDS_MINUTE = 60;
  
  private final static int SECONDS_HOUR = (60 * Utils.SECONDS_MINUTE);
  
  private final static int SECONDS_DAY = (24 * Utils.SECONDS_HOUR);
  
  private final static int SECONDS_WEEK = (7 * Utils.SECONDS_DAY);
  
  private final static int SECONDS_MONTH = (30 * Utils.SECONDS_DAY);
  
  private final static int SECONDS_YEAR = (12 * Utils.SECONDS_MONTH);
  
  public static double getValueExp(final String complexity) {
    double _xblockexpression = (double) 0;
    {
      Pattern pattern = Pattern.compile("\\^(.+)\\)");
      Matcher matcher = pattern.matcher(complexity);
      matcher.find();
      _xblockexpression = Double.parseDouble(matcher.group(1));
    }
    return _xblockexpression;
  }
  
  public static double getValueLinLogExp1(final String complexity) {
    double _xblockexpression = (double) 0;
    {
      Pattern pattern = Pattern.compile("\\^(.+)log");
      Matcher matcher = pattern.matcher(complexity);
      matcher.find();
      _xblockexpression = Double.parseDouble(matcher.group(1));
    }
    return _xblockexpression;
  }
  
  public static double getValueLinLogExp2(final String complexity) {
    double _xblockexpression = (double) 0;
    {
      Pattern pattern = Pattern.compile("log\\^(.+)\\s");
      Matcher matcher = pattern.matcher(complexity);
      matcher.find();
      _xblockexpression = Double.parseDouble(matcher.group(1));
    }
    return _xblockexpression;
  }
  
  public static double getValuePower(final String complexity) {
    double _xblockexpression = (double) 0;
    {
      Pattern pattern = Pattern.compile("\\((.+)\\^");
      Matcher matcher = pattern.matcher(complexity);
      matcher.find();
      _xblockexpression = Double.parseDouble(matcher.group(1));
    }
    return _xblockexpression;
  }
  
  public static double matchUnits(final double value, final TimeUnits input, final TimeUnits output) {
    double _xblockexpression = (double) 0;
    {
      double seconds = 0.0;
      if (input != null) {
        switch (input) {
          case SECONDS:
            seconds = value;
            break;
          case MINUTES:
            seconds = (value * Utils.SECONDS_MINUTE);
            break;
          case HOURS:
            seconds = (value * Utils.SECONDS_HOUR);
            break;
          case DAYS:
            seconds = (value * Utils.SECONDS_DAY);
            break;
          case WEEKS:
            seconds = (value * Utils.SECONDS_WEEK);
            break;
          case MONTHS:
            seconds = (value * Utils.SECONDS_MONTH);
            break;
          case YEARS:
            seconds = (value * Utils.SECONDS_YEAR);
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
            _switchResult_1 = (seconds / Utils.SECONDS_MINUTE);
            break;
          case HOURS:
            _switchResult_1 = (seconds / Utils.SECONDS_HOUR);
            break;
          case DAYS:
            _switchResult_1 = (seconds / Utils.SECONDS_DAY);
            break;
          case WEEKS:
            _switchResult_1 = (seconds / Utils.SECONDS_WEEK);
            break;
          case MONTHS:
            _switchResult_1 = (seconds / Utils.SECONDS_MONTH);
            break;
          case YEARS:
            _switchResult_1 = (seconds / Utils.SECONDS_YEAR);
            break;
          default:
            break;
        }
      }
      _xblockexpression = _switchResult_1;
    }
    return _xblockexpression;
  }
  
  public static double log(final double x) {
    double _log = Math.log(x);
    double _log_1 = Math.log(2);
    return (_log / _log_1);
  }
  
  public static double log(final double x, final double base) {
    double _log = Math.log(x);
    double _log_1 = Math.log(base);
    return (_log / _log_1);
  }
  
  public static double factCalculator(final double a, final double b) {
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
  
  public static double root(final double num, final double root) {
    double _xifexpression = (double) 0;
    if ((root == 2.0)) {
      _xifexpression = Math.sqrt(num);
    } else {
      double _xifexpression_1 = (double) 0;
      if ((root == 3.0)) {
        _xifexpression_1 = Math.cbrt(num);
      } else {
        double _log = Math.log(num);
        double _divide = (_log / root);
        _xifexpression_1 = Math.pow(Math.E, _divide);
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
}
