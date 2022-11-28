<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" info=""%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="shortcut icon"  href="../../images/logo.png"/>
<link rel="stylesheet" type="text/css" href="../../common/css/reset.css"/>
<link rel="stylesheet" type="text/css" href="../../common/css/user_wrap_container.css"/>
<link rel="stylesheet" type="text/css" href="../../common/css/user_navi.css"/><%-- 네비바 필요한 사람만 --%>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<script type="text/javascript">

</script>

</head>
<body>
<div class="wrap">

<!-- header -->
<%@ include file="../../common/jsp/user_header.jsp" %>
<!-- header end-->

<!-- container -->
<div class="container">
<%-- 네비바 필요한 경우에 사용할것, 필요없으면 삭제~ --%>
<%-- 휴게소리스트용 --%>
<!--  <div class="wrap-navi">
		<div class="navi">
			<ul class="navibar">
				<li class="navi-item">
					<a class="navi-link" href="#void">전체 휴게소</a>
				</li>
				<li class="navi-item">
					<a class="navi-link" href="#void">고속도로별 휴게소</a>
				</li>
				<li class="blank"></li>
				<li class="navi-item">
					<a class="navi-link" href="#void">도별 휴게소</a>
				</li>
				<li class="navi-item">
					<a class="navi-link" href="#void">ex-FOOD</a>
				</li>
			</ul>
		</div>
	</div> -->

<%-- 마이페이지용 --%>
 <!-- 	<div class="wrap-navi">
		<div class="navi">
			<ul class="navibar">
				<li class="navi-item">
					<a class="navi-link" href="#void">내 정보 수정</a>
					<ul class="sub-navibar">
						<li class="subnavi-item">
							<a class="subnavi-link" href="#void">비밀번호 수정</a>
						</li>
						<li class="subnavi-item">
							<a class="subnavi-link" href="#void">회원탈퇴</a>
						</li>
					</ul>
				</li>
				<li class="navi-item">
					<a class="navi-link" href="#void">내가 쓴 리뷰</a>
				</li>
				<li class="blank"></li>
				<li class="navi-item">
					<a class="navi-link" href="#void">좋아요한 리뷰</a>
				</li>
				<li class="navi-item">
					<a class="navi-link" href="#void">휴게소 즐겨찾기</a>
				</li>
			</ul>
		</div>
	</div> -->

<%-- 타사용자용 --%>
<!-- <div class="wrap-navi">
		<div class="navi">
			<ul class="navibar">
				<li class="navi-item">
					<a class="navi-link" href="#void">리뷰보기</a>
				</li>
				<li class="blank"></li>
				<li class="navi-item">
				</li>
				<li class="navi-item">
				</li>
			</ul>
		</div>
	</div>  -->
<%-- 네비바 끝 --%>
여기서 작업하세요! 다른건 건드리지말기 (네비바는 필요없으면 코드 지워서 사용!)~
네비바 필요없는 사람은 위에 link navi.css도 같이 지워서 사용하기~
</div>
<!-- container end -->

<!-- footer -->
<%@ include file="../../common/jsp/user_footer.jsp" %>
<!-- footer end -->

</div>
</body>
</html>