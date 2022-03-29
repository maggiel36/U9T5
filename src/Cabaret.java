import java.util.ArrayList;

public class Cabaret
{
    private String name;
    private ArrayList<Performer> performers;

    public Cabaret(String name)
    {
        performers = new ArrayList<Performer>();
        this.name = name;
    }

    public ArrayList<Performer> getPerformers()
    {
        return performers;
    }

    public String getName()
    {
        return name;
    }

    public boolean addPerformer(Performer performer)
    {
        if (performers.indexOf(performer) == -1)
        {
            performers.add(performer);
            return true;
        }
        return false;
    }

    public boolean removeFerformer(Performer performer)
    {
        if (performers.indexOf(performer) != -1)
        {
            performers.remove(performers.indexOf(performer);
            return true;
        }
        return false;
    }

    public double averagePerformerAge()
    {
        int sum = 0;

        for (Performer performer : performers)
        {
           sum += performer.getAge();
        }

        return sum / (double) performers.size();
    }

    public ArrayList<Performer> performersOverAge(int age)
    {
        ArrayList<Performer> overAge = new ArrayList<Performer>();

        for (Performer performer : performers)
        {
            if (performer.getAge() >= age)
            {
                overAge.add(performer);
            }
        }
        return overAge;
    }

    public void groupRehearsal()
    {
        for (Performer performer : performers)
        {
            System.out.println("REHEARSAL CALL! " + performer.getName());

            if (performer instanceof Comedian)
            {
                
            }

        }
    }

}
