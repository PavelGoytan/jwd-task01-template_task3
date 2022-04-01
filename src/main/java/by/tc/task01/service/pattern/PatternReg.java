package by.tc.task01.service.pattern;

import java.util.regex.Pattern;

public class PatternReg {
    public static Pattern pattern = Pattern.compile("[a-zA-Z]+\\s+:(\\s+[A-Z]+((_[A-Z]+)+)?=[\\w-]+(\\.\\d+)?[,;\\s]?)+");
    public static Pattern pattern2 = Pattern.compile("[A-Z]+((_[A-Z]+)+)?=[\\w-]+(\\.\\d+)?");
}
