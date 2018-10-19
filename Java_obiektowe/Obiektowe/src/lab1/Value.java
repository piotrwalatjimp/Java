package lab1;

public abstract class Value
{

    public abstract String toString();
    public abstract Value add(Value v);
    public abstract Value sub(Value v);
    public abstract Value mul(Value v);
    public abstract Value div(Value v);
    public abstract Value pow(Value v);
    public abstract Value eq(Value v);
    public abstract Value lte(Value v);
    public abstract Value gte(Value v);
    public abstract boolean neq(Value v);
    //public abstract boolean equals(Object other);
    //public abstract int hashCode(); //dokumentacja Javy - wykład!
    public abstract Value create(String s);
}
