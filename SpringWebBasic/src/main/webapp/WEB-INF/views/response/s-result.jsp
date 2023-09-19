<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Result</title>
</head>
<body>
	<h3 class="result-title"></h3>
	<%-- 	<c:choose>
		<c:when test="${result eq 'success'}">
            <h1>로그인에 성공 하셨습니다.</h1>
        </c:when>
		<c:when test="${result eq 'f-id'}"> 
            <h1>틀렸거나 존재하지 않는 아이디 입니다.</h1>
        </c:when>
		<c:when test="${result eq 'f-pw'}"> 
            <h1>틀렸거나 존재하지 않는 비밀번호 입니다.</h1>
        </c:when>

		<c:otherwise>
			<!-- 그 외는 뭐가 있지 모루겠소요-->
		</c:otherwise>
	</c:choose> --%>

	<script type="text/javascript">
	/*
	브라우저가 HTML을 해석하고 css를 해석하고 javascript 코드를 실행해서 화면에 표현하는 과정을 렌더링이라고 합니다.
	지금 우리가 작성하는 파일 형태 -> jsp -> 서버 내에서 클래스로 변환 -> 응답은 HTML
	jsp 파일이 클래스로 변환하는 과정에서 작성한 el 문법은 자바 코드로 변환 -> 값을 표현 -> 응답은 HTML로 표현
	EL 표현식이 서버에서 먼저 평가되고 그 결과를 클라이언트에게 전달하여 브라우저로 표현하기 때문에
	script에서도 EL 표현이 가능합니다.
	javaScript에서 EL 표현식을 작성할 때는 문자열로 '$(달러){}'를 감싸주세요.
	*/
		const result = '${result}';
		// console.log('result:'+result);
		
		const $h1 = document.querySelector('.result-title');
		switch(result){
		case 'f-id':
			$h1.textContent = '아이디가 존재하지 않습니다.';
			break;
		case 'f-pw':
			$h1.textContent = '비밀번호가 존재하지 않습니다.';
			break;
		case 'success':
			$h1.textContent = '로그인 성공';
			break;
		}
		
	</script>

</body>
</html>
