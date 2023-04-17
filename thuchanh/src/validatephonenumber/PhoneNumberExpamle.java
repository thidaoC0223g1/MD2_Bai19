package validateclassname;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassNameExpamle {
    public static final String CLASSNAME_REGEX = "^[CAP]+[\\d]{4}+[GHIK]$";

    public ClassNameExpamle() {
    }
    public boolean validate(String regex){
        Pattern pattern = Pattern.compile(CLASSNAME_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();

    }
}
