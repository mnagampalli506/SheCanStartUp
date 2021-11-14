import java.util.ArrayList;

public class DataMapping {
	private InnovatorProfile[] innovators = new InnovatorProfile[2];
	private StartupOwnerProfile[] startupOwners = new StartupOwnerProfile[1];

	public DataMapping(InnovatorProfile[] innovators,
			StartupOwnerProfile[] startupOwners) {
		this.innovators = innovators;
		this.startupOwners = startupOwners;
	}

	private boolean haveSimilarMajors(StartupOwnerProfile a,
			InnovatorProfile b) {
		ArrayList<String> listOne = a.getMajors();
		String listTwo = b.getMajors();
		return (listOne.contains(listTwo));

	}

	private boolean haveSimilarLangProficient(StartupOwnerProfile a,
			InnovatorProfile b) {
		ArrayList<String> listOne = a.getLanguagesRequired();
		String listTwo = b.getLanguagesProficient();
		return (listOne.contains(listTwo));

	}

	private boolean haveSimilarLangKnown(StartupOwnerProfile a,
			InnovatorProfile b) {
		ArrayList<String> listOne = a.getLanguagesPreferred();
		String listTwo = b.getLanguagesKnown();
		return (listOne.contains(listTwo));

	}

	private boolean haveSimilarRemoteRequirement(StartupOwnerProfile a,
			InnovatorProfile b) {
		
		String prefA = a.getRemotePreference();
		String prefB = b.getRemotePreference();
		if (a.equals("No preference")) {
			return true;
		} else {
			return (prefA.equals(prefB));
		}

	}

	private boolean meetGPARequirement(StartupOwnerProfile a,
			InnovatorProfile b) {
		
		double prefA = a.getGPA();
		double applicant = b.getGPA();

		return (applicant >= prefA);

	}

	public boolean[] innovatorFoundAConnectionWithStartUpOwners() {
		boolean[] foundPair = new boolean[innovators.length];
		for (int i = 0; i < innovators.length; i++) {
			int count = 0;
			
			for (int j = i + 1; j <= startupOwners.length; j++) {
				
				if (meetGPARequirement(startupOwners[i], innovators[j])) {
					count++;
				}
				if (innovators[i].getHighestLevelOfEducation()
						.equals(innovators[j].getHighestLevelOfEducation())) {
					count++;
				}
				if (innovators[i].getNameOfInstitution()
						.equals(innovators[j].getNameOfInstitution())) {
					count++;
				}
				if (haveSimilarLangProficient(startupOwners[i],
						innovators[j])) {
					count++;
				}
				if (haveSimilarLangKnown(startupOwners[i], innovators[j])) {
					count++;
				}
				if (innovators[i].getMinPay() == innovators[j].getMinPay()) {
					count++;
				}
				if (innovators[i].getMaxPay() == innovators[j].getMaxPay()) {
					count++;
				}
				if (haveSimilarMajors(startupOwners[i], innovators[j])) {
					count++;
				}
				if (haveSimilarRemoteRequirement(startupOwners[i],
						innovators[j])) {
					count++;
				}
				if (count > 2) {
					foundPair[i] = true;
				}
			}

		}
		return foundPair;
	}

}
