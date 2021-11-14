public class InnovatorProfile {
	private double GPA;
	private String highestLevelOfEducation;
	private String name;
	private String majors;
	private String languagesKnown;
	private String languagesProficient;
	private double minPay;
	private double maxPay;
	private String nameOfInstitution;
	private String currentCity;
	private String remotePreference;

	public InnovatorProfile(double GPA, String education,
			String majors, String languagesKnown,
			String languagesProficient, double minPay,double maxPay,
			String nameOfInstitution, String currentCity,
			String remotePreference, String name) {
		this.majors = majors;
		this.GPA = GPA;
		highestLevelOfEducation = education;
		this.nameOfInstitution = nameOfInstitution;
		this.languagesKnown = languagesKnown;
		this.minPay = minPay;
		this.maxPay = maxPay;
		this.languagesProficient = languagesProficient;
		this.nameOfInstitution = nameOfInstitution;
		this.currentCity = currentCity;
		this.remotePreference = remotePreference;
		this.name = name;
	}

	public double getGPA() {
		return GPA;
	}

	public double getMinPay() {
		return minPay;
	}

	public String getCurrentCity() {
		return currentCity;
	}
	public String getName() {
		return name;
	}

	public String getRemotePreference() {
		return remotePreference;
	}

	public String getNameOfInstitution() {
		return nameOfInstitution;
	}

	public double getMaxPay() {
		return maxPay;
	}

	public String getLanguagesProficient() {
		return languagesProficient;
	}

	public String getHighestLevelOfEducation() {
		return highestLevelOfEducation;
	}

	public String getMajors() {
		return majors;
	}

	public String getLanguagesKnown() {
		return languagesKnown;
	}

}
