package org.joonzis.Class03;

public class Main {
	public static void main(String[] args) {
		Data dc=new Data();
		Oper oc=new Oper();
		
		String selYear = "2007";
		oc.search(dc.ic, selYear);
		oc.avgHireDate(dc.ic);
	}

}


