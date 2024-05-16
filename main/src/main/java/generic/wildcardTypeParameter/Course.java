package main.java.generic.wildcardTypeParameter;

public class Course {
	// 모든 사람이면 등록 가능
	public static void registerCourse1(Applicant<?> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName() + "  님  Course1 등록");
	}
	
	// 학생만 등록 가능
	public static void registerCourse2(Applicant<? extends Student> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName() + "  님  Course2 등록");		
	}
	
	// 직장,일반인만 등록 가능
	public static void registerCourse3(Applicant<? super Worker>applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName() + "  님  Course3 등록");				
	}
}
