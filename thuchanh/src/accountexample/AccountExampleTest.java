package accountexample;

public class AccountExampleTest {
    private static final String[] validAccount = {"123abc_", "_abc123", "______", "123456", "abcdefgh"};
    private static final String[] invalidAccount = {".@", "12345", "1234_", "abcde"};

    public static void main(String[] args) {
        AccountExample accountExample = new AccountExample();
        for (var account : validAccount) {
           boolean isvalid= accountExample.validate(account);
            System.out.println("account is " +  account + " valid "+isvalid);
        }
        for (var account : invalidAccount) {
            boolean isvalid= accountExample.validate(account);
            System.err.println("account is " +  account + " valid "+isvalid);
        }
    }
}

