package followers;


public class PageFollower implements Profile{

	private String name;
	private Followable post;
	public PageFollower(String name) {
		this.name = name;
	}
	
	@Override
	public void update() {
		if(this.post == null) {
			System.out.println(this.getName() + " has no posts");
			return;
		}
		String latestPost = this.post.getUpdate();
		System.out.println(this.getName() + " received post: " + latestPost);
	}

	private String getName() {
		return name;
	}

	@Override
	public void setPost(Followable post) {

		this.post=post;
	}

	
}
