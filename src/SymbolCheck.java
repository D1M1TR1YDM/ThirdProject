import java.util.Objects;

public class SymbolCheck {
    public int checkSymbol(String number) {

        if (Objects.equals(number, "+") || Objects.equals(number, "plus") || Objects.equals(number, "1"))
            return 1;
        else if (Objects.equals(number, "-") || Objects.equals(number, "minus") || Objects.equals(number, "2"))
            return 2;
        else if (Objects.equals(number, "/") || Objects.equals(number, "divide") || Objects.equals(number, ":") || Objects.equals(number, "3"))
            return 3;
        else if (Objects.equals(number, "*") || Objects.equals(number, "multiply") || Objects.equals(number, "4"))
            return 4;
        else if (Objects.equals(number, "%") || Objects.equals(number, "5"))
            return 5;
        else return 10;


    }
}
