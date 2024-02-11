package oops.assignment.classobject2;

public class CubeTest {

	public static void main(String[] args) {
		
		Cube c=new Cube();
		
		c.num=9;
		
				
		c.findCube1();
		System.out.println("cube ="+c.findcube2());
        c.findcube3(9);
       System.out.println("cube = "+ c.findcube4(9));
	}

}
