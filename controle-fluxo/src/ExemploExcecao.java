import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExcecao {
    Number valor;

    {
        try {
            valor = NumberFormat.getInstance().parse("a1.75");
            System.out.println(valor);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }


}
