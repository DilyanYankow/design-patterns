package followers;

public interface Followable {
	void follow(Profile profile);
	void unfollow(Profile profile);
	
	void notifyFollowers();
	String getUpdate();
}

