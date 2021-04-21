package followers;

import java.util.ArrayList;
import java.util.List;

public class Page implements Followable {
	
	private List<Profile> profiles;
	private String post;

	public Page() {
		this.profiles = new ArrayList<>();
		}

	@Override
	public void follow(Profile profile) {
		this.profiles.add(profile);
		profile.setPost(this);		
	}

	@Override
	public void unfollow(Profile profile) {
		this.profiles.remove(profile);
		
	}

	@Override
	public void notifyFollowers() {
		for(Profile profile : this.profiles) {
			profile.update();
		}		
	}

	@Override
	public String getUpdate() {
		return this.post;
	}
	
	public void setPost(String post) {
		this.post = post;
		this.notifyFollowers();
	}

}
