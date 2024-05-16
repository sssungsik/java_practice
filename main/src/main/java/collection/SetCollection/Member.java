package main.java.collection.SetCollection;
// 이름, 나이 동일 시 HashSet에 중복 저장하지 않는다
// Member 클래스 선안 시 이름,나이 동일 시 동일한 해시코드가 리턴되도록 hashCode() 재정의.
// equals 메소드가 true 리턴되도록 재정의.
public class Member {
	public String name;
	public int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// hashCode 재정의
	@Override
	public int hashCode() {
		return name.hashCode() + age; /* name 과 age 가 같으면 동일한 hashCode 리턴 */
	}
	
	// equals 재정의
	@Override
	public boolean equals (Object obj) {
		if(obj instanceof Member target) {
			return target.name.equals(name) && (target.age == age);
		} else {
			return false;
		}
	}
}
