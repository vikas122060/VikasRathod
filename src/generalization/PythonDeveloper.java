package generalization;

public class PythonDeveloper implements Profession
{  //Python Developer
	@Override
	public void rules() {
		System.out.println("highly skilled and multitasking");
	}

	@Override
	public void shift() {
		System.out.println("working as per organization");
	}

	@Override
	public void payment() {
		System.out.println("paid as per his talent");
	}

	@Override
	public void lifestyle() {
	    System.out.println("simply life but enjoyable with his own way");
	}


}
