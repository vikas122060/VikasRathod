package generalization;

public class ITEngineer implements Profession
{   //IT Engineer
	
	@Override
	public void rules() {
		System.out.println("highly focused in his work");
	}

	@Override
	public void shift() {
		System.out.println("working as per clients timing");
	}

	@Override
	public void payment() {
		System.out.println("depends on his position");
	}

	@Override
	public void lifestyle() {
		System.out.println("enjoys only on saturday and sunday");
	}

}
