package ca.bc.gov.nrs.vdyp.io.parse;

import java.util.Map;

public class VolumeNetDecayWasteParser extends SimpleCoefficientParser1<String> {

	public static final String CONTROL_KEY = "VOLUME_NET_DECAY_WASTE";

	public VolumeNetDecayWasteParser(Map<String, Object> control) {
		super(String.class, 0);
		this.speciesKey();
		this.coefficients(6, 9);
	}
}
