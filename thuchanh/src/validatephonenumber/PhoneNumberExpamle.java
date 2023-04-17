package validatephonenumber;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberExpamle {
    public static final String PHONNUMBER_REGEX = "^\\d{2}-0\\d{9}$";

    public PhoneNumberExpamle() {
    }
    public boolean validate(String regex){
        Pattern pattern = Pattern.compile(PHONNUMBER_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();

    }
}