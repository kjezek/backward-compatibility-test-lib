package accessModifierClazzNestedClazzAccessDecrease;

import testing_lib.accessModifierClazzNestedClazzAccessDecrease.AccessModifierClazzNestedClazzAccessDecrease;

public class Main extends AccessModifierClazzNestedClazzAccessDecrease {

	public static void main(String[] args) {
		AccessModifierClazzNestedClazzAccessDecrease constr = new Main();
		
		constr.new ClazzPublicToProtected();  
		constr.new ClazzPublicToNon();
		constr.new ClazzPublicToPrivate();
	}
	
}
