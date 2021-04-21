package followers;



public class FollowerMain {

	public FollowerMain() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {


		Page post = new Page();
		
		Profile follower1 = new PageFollower("Petur1");
		Profile follower2 = new PageFollower("Ivan2");
		Profile follower3 = new PageFollower("Georgi3");
		
		post.setPost("Post 1, shouldn't be visible. Followers didn't follow yet");
		
		post.follow(follower1);
		post.follow(follower2);
		post.follow(follower3);
		

		
		post.setPost("Post2, visible!");
		post.setPost("Post3, visible again!");
		
	}

}
