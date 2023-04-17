package validatephonenumber;

public class PhoneNumberTest {
    private static final String[] validphonenumber = {"84-0886230947", "84-0346534260"};
    private static final String[] invalidphonenumber = {"a8-2222222222", "84-123454664a"};

    public static void main(String[] args) {
        PhoneNumberExpamle classNameExample = new PhoneNumberExpamle();
        for (var phonenumber : validphonenumber) {
            boolean isvalid = classNameExample.validate(phonenumber);
            System.out.println("classname is "+ phonenumber + " "+ isvalid);
        }
        for (var phonenumber : invalidphonenumber) {
            boolean isvalid = classNameExample.validate(phonenumber);
            System.out.println("classname is "+ phonenumber + " "+ isvalid);
        }

    }
}

