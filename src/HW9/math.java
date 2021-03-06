package HW9;
import java.awt.*;
import simView.*;

public class math extends ViewableDigraph
{
	public math() { this("math"); }
	public math(String name)
	{
		super(name);

		// coupled model인 math의 port
		addInport("in"); 
		addOutport("out");
		
		ViewableAtomic r = new router("router");
		ViewableAtomic a1 = new add("add");
		ViewableAtomic a2 = new acc("acc");
		ViewableAtomic m = new mult("mult");
		
		add(r);
		add(a1);
		add(a2);
		add(m);
		
		addCoupling(this, "in", r, "in");
		
		addCoupling(r, "out1", a1, "in");
		addCoupling(r, "out2", a2, "in");
		// 새로 추가된 atomic model의 in포트와 router atomic model의 out포트를 연결
		addCoupling(r, "out3", m, "in");
		
		addCoupling(a1, "out", this, "out");
		addCoupling(a2, "out", this, "out");
		// 새로 추가된 atomic model의 out포트와 digraph model의 out포트를 연결
		addCoupling(m, "out", this, "out"); 
	}
   
    /**
     * Automatically generated by the SimView program.
     * Do not edit this manually, as such changes will get overwritten.
     */
    public void layoutForSimView()
    {
        preferredSize = new Dimension(526, 359);
        ((ViewableComponent)withName("mult")).setPreferredLocation(new Point(222, 238));
        ((ViewableComponent)withName("router")).setPreferredLocation(new Point(20, 154));
        ((ViewableComponent)withName("acc")).setPreferredLocation(new Point(226, 151));
        ((ViewableComponent)withName("add")).setPreferredLocation(new Point(222, 51));
    }
}
