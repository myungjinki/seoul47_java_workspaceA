package chapter01.data;

public class C011_TextBlock {
	public static void main(String[] args) {
		// 텍스트 블럭
		// """로 여러 줄 문자열을 표현 가능
		// 탈출문자가 불필요
		// \s 단일공백문자 삽입	-> 공백도 인식하게 만
		// \  개행 방자		-> 개행 방지
		
		String human = """
				이름: 김상형     \s
				나이: 39 \
				직업: 프로그래머\s 
				""";
		System.out.println(human);
		
		System.out.println("====================");
		String str = "HTML example \n" +
					"""
				<body>
					<p>문단</p>
				</body>
				""";
		System.out.println(str);
		
		String json = """
				{
					"name": "홍길동",
					"age": 30,
					"city": "Seoul"
				}
				""";
		System.out.println(json);
		
		String sql = """
				SELECT * FROM users
				WHERE age > 20
				ORDER BY name;
				""".stripIndent(); 
		System.out.println(sql);
		// 문자열 안의 모든 라인에 strip를 적용하여 앞 뒤 공백을 제거함
	}
}
