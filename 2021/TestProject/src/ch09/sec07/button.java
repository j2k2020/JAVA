package ch09.sec07;

//Button이벤트 처리에서 익명 구현 객체 사용

public class button {
	// 필드
	OnClickListener listener;

	// setter 메소드로 구현 객체를 받아 필드에 대입
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}

	// 버튼 이벤트가 발행했을 때 호출되는 메소드
	void touch() {
		listener.onClick();
	}

	// 중첩 인터페이스 - 버튼에서만 사용 할 것임
	interface OnClickListener {
		void onClick();
	}

}
