package cursojavabasico;

public class NameFormatException  extends Exception{
    private static final long serialVersionUID = 1L;

    public NameFormatException(String ErrorMessage){ //constructor
        super(ErrorMessage);
    }

}
