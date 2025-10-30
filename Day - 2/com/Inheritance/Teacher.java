package com.Inheritance;

public class Teacher {
		String name;
		
		public void markAttendance() {
			System.out.println(name+" has marked the attendance.");
		}
		
		public void teach() {
			System.out.println(name+" is Teaching the subject.");
		}
		
		public static void main(String[] args) {
		
		System.out.println("=============================================");
		//Creating Objects for each child class
		PhysicsTeacher phyTeacher = new PhysicsTeacher();
		phyTeacher.name = "Steven";
		phyTeacher.markAttendance();
		phyTeacher.teach();
		phyTeacher.doLawsExp();
		
		System.out.println("=============================================");
		
		ChemistryTeacher cheTeacher = new ChemistryTeacher();
		cheTeacher.name = "Nicolas";
		cheTeacher.markAttendance();
		cheTeacher.teach();
		cheTeacher.doChemicalExp();
		
		System.out.println("=============================================");
		
		BiologyTeacher bioTeacher = new BiologyTeacher();
		bioTeacher.name = "Anny";
		bioTeacher.markAttendance();
		bioTeacher.teach();
		bioTeacher.doDisectionExp();
	}
}
