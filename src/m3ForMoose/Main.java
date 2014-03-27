package m3ForMoose;

/**
 * 
 * @author https://github.com/onierstrasz
 * 
 * These classes serve as a test case for transforming M3 models to Moose.
 * To generate the M3 model, run createM3FromEclipseProject() from Rascal.
 * See: https://github.com/onierstrasz/rascal-m3-to-mse/blob/master/src/m3/m3util.rsc
 *
 */
public class Main {

	public static void main(String[] args) {
		IFoo foo = new Foo();
		foo.bar();
	}

}
