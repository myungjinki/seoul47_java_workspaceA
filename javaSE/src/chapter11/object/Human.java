package chapter11.object;

public class Human implements Cloneable {
	
	int age;
	String name;
	
	int[] score = new int[] { 1, 2, 3 };
	
	Human(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return age + "세의 " + name;
//		return "안녕";
//		return super.toString();
	}
	
//	  Object.equals()
//    public boolean equals(Object obj) {
//        return (this == obj);
//    }
	
//	  String.equals()
//   public boolean equals(Object anObject) {
//       if (this == anObject) {
//           return true;
//       }
//       return (anObject instanceof String aString)
//               && (!COMPACT_STRINGS || this.coder == aString.coder)
//               && StringLatin1.equals(value, aString.value);
//   }
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Human) {
			Human other = (Human) obj;
			return (age == other.age
					&&
					name.equals(other.name));
		} else {
			return true;
		}
	}

	@Override
	protected Object clone() {
		try {
			Human other = (Human) super.clone();
			
			other.score = this.score.clone(); // 스코어도 복사
			
			return other;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
}
