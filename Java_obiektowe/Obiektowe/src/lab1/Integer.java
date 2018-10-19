package lab1;


public class IntegerValue extends Value{
	int i;
	
	IntegerValue (int x)
	{
		i=x;
	}
	
	public String toString()
	{
		return String.valueOf(i);
	}
	
    public Value add(IntegerValue v)
    {
    	return (new IntegerValue(i+v.i));
    }
    
    public Value sub(IntegerValue v)
    {
    	return (new IntegerValue(i-v.i));
    }
    
    public Value mul(IntegerValue v)
    {
    	return (new IntegerValue(i*v.i));
    }
    
    public Value div(IntegerValue v)
    {
    	if(v.i!=0){
    		return (new IntegerValue(i/v.i));
    	}
    	else
    		throw (new IllegalArgumentException("Dear God..."));
    }
    
    public Value pow(IntegerValue v)
    {
    	return (new IntegerValue((int)Math.pow(i, v.i)));
    }
    
    public boolean  eq(IntegerValue v)
    {
    	return v.i==i;
    }
    
    public boolean lte(IntegerValue v)
    {
    	return v.i>=i;
    }
    
    public boolean gte(IntegerValue v)
    {
    	return v.i<=i;
    }
    
    public boolean neq(IntegerValue v)
    {
    	return v.i!=i;
    }
    
    public boolean equals(Object other)
    {
    	
    }
    
    public int hashCode()
    {
    	
    }
    
    public Value create(String s)
    {
    	int tmp=Integer.parseInt(s);
    	return (new	IntegerValue(tmp));
    }

}
