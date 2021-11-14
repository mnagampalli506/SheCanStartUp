import java.util.ArrayList;

public class StartupOwnerProfile {
	private double minGPARequired;
	private String companyName;
	private ArrayList<String> highestLevelOfEducation = new ArrayList<String>();
	private ArrayList<String> majorsLookingFor = new ArrayList<String>();
	private ArrayList<String> languagesRequired = new ArrayList<String>();
	private ArrayList<String> languagesPreferred = new ArrayList<String>();
	private String remotePreference;
	private double minPay;
	private double maxPay;

	public StartupOwnerProfile(double GPA, ArrayList<String> education,
			ArrayList<String> majors, ArrayList<String> languagesRequired,
			int minPay, int maxPay, ArrayList<String> languagesPreferred,
			String remotePreference, String companyName) {
		majorsLookingFor = majors;
		minGPARequired = GPA;
		highestLevelOfEducation = education;
		this.languagesRequired = languagesRequired;
		this.languagesPreferred = languagesPreferred;
		this.minPay = minPay;
		this.maxPay = maxPay;
		this.remotePreference = remotePreference;
		this.companyName=companyName;
	}
	

	public double getGPA() {
		return minGPARequired;
	}

	public String getRemotePreference() {
		return remotePreference;
	}
	

	public double getMinPay() {
		return minPay;
	}

	public double getMaxPay() {
		return maxPay;
	}

	public ArrayList<String> getHighestLevelOfEducation() {
		return highestLevelOfEducation;
	}

	public ArrayList<String> getMajors() {
		return majorsLookingFor;
	}

	public ArrayList<String> getLanguagesRequired() {
		return languagesRequired;
	}

	public ArrayList<String> getLanguagesPreferred() {
		return languagesPreferred;
	}


	public String getCompanyName() {
		
		return companyName;
	}


	 

}
