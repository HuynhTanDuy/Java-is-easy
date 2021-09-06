package primitive;

import static java.lang.System.out;

public class PrimitiveDataTypes {
    //Primitive fields is initialized by default value: False
    private boolean isValidAnswer;

    //Primitive fields can be static, store actual value
    private static String SLOGAN = "STATIC STRING";

    public void methodOne() {
        int variable_a;
        out.println(variable_a); // => error because variable_a is not initialized.
    }

    public void methodTwo() {
        //Local variables store pointers to value, and must be declared before usage
        String local_variable = "a string";
    }
}
