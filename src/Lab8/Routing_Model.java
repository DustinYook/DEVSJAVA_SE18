package Lab8;
import java.awt.*;
import simView.*;

public class Routing_Model extends ViewableDigraph
{

	public Routing_Model()
	{
		super("Routing Model"); // �̸� �ٲ�
    	
		ViewableAtomic s = new sender("sender", 0); //
		ViewableAtomic ro = new router("router", 0); //
		 
		add(s); //
		add(ro); //
		
		for(int i = 1; i <= 5; i++)
		{
			ViewableAtomic re = new receiver("receiver #" + i, 0);
			add(re);
			addCoupling(ro, "out" + i, re, "in");
		}
		
		addCoupling(s, "out", ro, "in");
		addCoupling(ro, "out", s, "in");
	}

    
    /**
     * Automatically generated by the SimView program.
     * Do not edit this manually, as such changes will get overwritten.
     */
    public void layoutForSimView()
    {
        preferredSize = new Dimension(988, 646);
        ((ViewableComponent)withName("receiver #3")).setPreferredLocation(new Point(472, 223));
        ((ViewableComponent)withName("receiver #4")).setPreferredLocation(new Point(473, 296));
        ((ViewableComponent)withName("receiver #2")).setPreferredLocation(new Point(472, 148));
        ((ViewableComponent)withName("sender")).setPreferredLocation(new Point(123, 172));
        ((ViewableComponent)withName("receiver #1")).setPreferredLocation(new Point(472, 78));
        ((ViewableComponent)withName("router")).setPreferredLocation(new Point(264, 169));
        ((ViewableComponent)withName("receiver #5")).setPreferredLocation(new Point(472, 365));
    }
}
