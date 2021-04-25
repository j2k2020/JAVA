## 자바에서 사용하는 주석과 실행문

<br/>

###### ※ 자바에서 사용하는 주석 방법

| 주석기호 | 설명                                                         |
| -------- | :----------------------------------------------------------- |
| //       | `//` 부터 라인 끝까지 주석으로 처리한다.(행 주석)            |
| /*   */  | `/*`와  `*/`사이에 있는 모든 범위의 행을 주석으로 처리한다. (범위 주석) |

<br/>
§ 추가!
* 주석을 쓸 때 사용하는 단축키
  * // 한줄 주석 처리는 [`Ctrl + /`]이다.
  * /**/ 여러줄 주석 처리는 주석을 하고 싶은 범위를 지정하고 [`Ctrl + Shift + /`], 주석처리 해지 방법은 [`Ctrl + Shift + \`]이다.
  <br>
  
```java
//Test클래스 생성 

public class Test {
	public static void main(String[] args) {
	
		//System.out.println("test1 입니다");
		System.out.println("test2 입니다");	
       /* System.out.println("test3 입니다");
        System.out.println("test4 입니다");
        System.out.println("test5 입니다");*/


   
// 
//	빈 공간에 ctrl+/ 하면 한 줄 주석 표시가 뜸.

		// 여러 줄을 드레그해서 ctrl+/ 하면 한 줄씩 따로 따로 주석으로 처리된다.
//		String java = null;
//		int a =0;
//		int b =0;

		/*String java = null;
		 * int a =0;
		 * int b =0;
		 * 여러 줄 주석은 꼭 한 줄 정도는 드레그해서 ctrl+shift+/ 해주기 */

		/*String java = null;
		int a =0;
		int b =0;*/
     
	}
}
```

* 위의 코드를 출력시키면 출력문은 `test2 입니다` 만 나온다. `test1 입니다`은 한 행 주석처리가 되어 출력되지 않는다.
* `test3 입니다` 부터 `test5 입니다` 까지도 범위 주석으로 처리되어 출력되지 않는다. 

