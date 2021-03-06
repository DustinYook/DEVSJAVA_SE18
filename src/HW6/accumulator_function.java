// acccumulator_function.java : gp diagraph model (accumulator model)
package HW6;
import java.awt.*;
import simView.*;

public class accumulator_function extends ViewableDigraph
{

	public accumulator_function()
	{
		super("accumulator_function");
    	
		ViewableAtomic g = new user("User", 10); // user로 이름 바꿈
		ViewableAtomic p = new accumulator("Accumulator", 10); // accumulator로 이름 바꿈
    	
		add(g); // g 노드 추가
		add(p); // p 노드 추가
  
		addCoupling(g, "out", p, "in"); // g의 out과 p의 in을 연결
		addCoupling(p, "out", g, "in"); // p의 out과 g의 in을 연결
	}

    
    /**
     * Automatically generated by the SimView program.
     * Do not edit this manually, as such changes will get overwritten.
     */
    public void layoutForSimView()
    {
        preferredSize = new Dimension(988, 646);
        ((ViewableComponent)withName("User")).setPreferredLocation(new Point(241, 207));
        ((ViewableComponent)withName("Accumulator")).setPreferredLocation(new Point(254, 468));
    }
}
