package validateclassname;

public class ClassNameTest {
    private static final String[] validClassName = {"C0223G", "A3456I"};
    private static final String[] invalidClassName = {"H0223G", "O3456I"};

    public static void main(String[] args) {
        ClassNameExpamle classNameExample = new ClassNameExpamle();
        for (var classname : validClassName) {
            boolean isvalid = classNameExample.validate(classname);
            System.out.println("classname is "+ classname + "is "+ isvalid);
        }
        for (var classname : invalidClassName) {
            boolean isvalid = classNameExample.validate(classname);
            System.out.println("classname is "+ classname + "is "+ isvalid);
        }

    }
}
