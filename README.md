# M3ForMooseTestCase

Foobar Java examples for testing M3 to Moose model transformation.

Generate the M3 model using createM3FromEclipseProject() from Rascal.
See: <https://github.com/onierstrasz/rascal-m3-to-mse/blob/master/src/m3/m3util.rsc>

Generate the Moose model using the M3ForMoose package.
See: <http://smalltalkhub.com/#!/~onierstrasz/M3ForMoose>

The M3 model is instantiated and opened in Moose by running:

	M3Model foobarM3 transformToMoose ; install.
	MoosePanel open.
