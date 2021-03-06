package Lab3;
import java.awt.*;
import simView.*;

public class gproc extends ViewableDigraph // Atomic끼리 연결해주는 역할 (coupling)
{

	public gproc()
	{
		super("gproc"); // caption을 나타내는 역할
		
		ViewableAtomic g = new genr("genr", 30); // 초기 sigma는 30
		ViewableAtomic p = new proc("proc", 40); // 초기 sigma는 40
		
		add(g); // 그래프에 표시 (노드생성)
		add(p); // 그래프에 표시 (노드생성)
		
		// 두 atomic model의 포트를 연결 -> coupling 생성
		addCoupling(g, "out", p, "in"); 
		addCoupling(p, "out", g, "in");
	}

    
    /**
     * Automatically generated by the SimView program.
     * Do not edit this manually, as such changes will get overwritten.
     */
    public void layoutForSimView()
    {
        preferredSize = new Dimension(768, 448);
        ((ViewableComponent)withName("genr")).setPreferredLocation(new Point(313, 79));
        ((ViewableComponent)withName("proc")).setPreferredLocation(new Point(321, 251));
    }
}
