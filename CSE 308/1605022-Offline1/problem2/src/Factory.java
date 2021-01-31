public class Factory
{

    public static Computer getComputer(String choice)
    {

        if(choice.equalsIgnoreCase("Computer A"))
        {
            return new ComputerA();
        }
        else if(choice.equalsIgnoreCase("Computer B"))
        {
            return new ComputerB();
        }

        else if(choice.equalsIgnoreCase("Computer C"))
        {
            return new ComputerC();
        }
        return null;
    }

}