package ex;

import java.util.ArrayList;

public abstract class ex9_abstrcat {

		ArrayList<String> subject = null;
		
		public ex9_abstrcat() { 
			 this.subject = new ArrayList<>();
		}
		public abstract void add_subject(String word);
		public abstract void del_subject(String word);
		public abstract void all_subject();
}
