package omega.Genesis;

public enum ResponseType
{

    GREETING("Greetings"),
    FAREWELL("Farewell"),
    VALUE("Value"),
    LAUGH("Laugh");

    String string;

    ResponseType(String string)
    {
        this.string = string;
    }

    @Override
    public String toString()
    {
        return string;
    }
}