class EvenException extends Exception
{
    public String toString()
    {
        return "Even number";
    }
}

class OddException extends Exception
{
    public String toString()
    {
        return "Odd Number";
    }
}

class Number
{
  public static void checknum(int num) throws EvenException, OddException
  {
    if(num%2==0)
    {
        throw new EvenException();
    }
    else
    {
        throw new OddException();
    }

  }
}
class ExceptionalHandle
{
    public static void main(String[] args) 
    {
       // int num;
        try
        {
            Number.checknum(4);
        }
        catch(EvenException e)
        {
            System.out.println(e);
        }
        catch(OddException e)
        {
            System.out.println(e);
        }  
    }
}
