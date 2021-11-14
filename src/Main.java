import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {

		StartupOwnerProfile[] owner = new StartupOwnerProfile[1];
		owner[0] = new StartupOwnerProfile(3.0,
				new ArrayList<>(Arrays.asList("BS in Computer Science")),
				new ArrayList<>(
						Arrays.asList("Computer Science", "Data Science")),
				new ArrayList<>(Arrays.asList("Java", "C++", "R", "Python")),
				10000, 40000,
				new ArrayList<>(Arrays.asList("Java", "C++", "R", "Python")),
				"No Preference", "BigThinkAI");

		InnovatorProfile[] innovators = new InnovatorProfile[2];

		innovators[0] = new InnovatorProfile(3.2, ("BS in Computer Science"),
				("Computer Science"), ("Java"), ("Java"), 5000, 10000,
				"University Of Michigan", "Ann-Arbor", "Remote", "George");

		innovators[1] = new InnovatorProfile(3.9, ("BS in Computer Science"),
				("Data Science"), ("R"), ("Java"), 20000, 30000,
				"University Of Berkeley", "San Francisco", "No Preference",
				"Preethi");

		DataMapping maps = new DataMapping(innovators, owner);

		boolean[] foundHire = maps.innovatorFoundAConnectionWithStartUpOwners();
		for (int i = 0; i < foundHire.length; i++) {
			String a = owner[0].getCompanyName();
			if (foundHire[i]) {
				System.out.println(innovators[i].getName()
						+ " found a matching recruiter with " + a);
			} else {
				System.out.println(innovators[i].getName()
						+ " did not find a matching recruiter");
			}
		}
	}

}
