package VectorOperations.library;


import processing.core.*;

/**
 * This is a template class and can be used to start a new processing Library.
 * Make sure you rename this class as well as the name of the example package 'template'
 * to your own Library naming convention.
 *
 * (the tag example followed by the name of an example included in folder 'examples' will
 * automatically include the example in the javadoc.)
 *
 * @example Hello
 */

public class VectorOperations {

	// myParent is a reference to the parent sketch
	PApplet myParent;

	int myVariable = 0;

	public final static String VERSION = "1.0.0";


	/**
	 * a Constructor, usually called in the setup() method in your sketch to
	 * initialize and start the Library.
	 *
	 * @example Hello
	 * @param theParent
	 */
	public VectorOperations(PApplet theParent) {
		myParent = theParent;
		welcome();
	}


	private void welcome() {
		System.out.println("VectorOperations 1.0.0 by Julia Riede https://jriede.github.io");
	}


	/**
	 * return normal vector.
	 *
	 * @param x
	 *          float[] (x1,x2) coordinate of vector origin
	 * @param y
	 *          float[] (y1,y2) coordinate of vector tip
	 * @return float[]
	 */
	public static double[] normal(double[] x, double[] y) {
		double[] normal = new double[2];
		
		double dx = x[1] - x[0];
	    double dy = y[1] - y[0];
	    
	    double len = Math.sqrt(dx*dx + dy*dy);
	    
	    normal[0] = (-1.0*dy)/len;
	    normal[1] = dx/len;
	    
		return normal;
	}
	
	public String sayHello() {
		return "hello world!";
	}
	
	/**
	 * return the version of the Library.
	 *
	 * @return String
	 */
	public static String version() {
		return VERSION;
	}

	/**
	 *
	 * @param theA
	 *          the width of test
	 * @param theB
	 *          the height of test
	 */
	public void setVariable(int theA, int theB) {
		myVariable = theA + theB;
	}

	/**
	 *
	 * @return int
	 */
	public int getVariable() {
		return myVariable;
	}
}
