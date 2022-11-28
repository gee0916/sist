<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" info=""%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="http://211.63.89.150/jsp_prj/common/css/main_v1_220901.css"/>
<style type="text/css">

</style>
<!-- jQuery google CDN -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<!-- Bootstrap CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<!-- Bootstrap JS -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
<script type="text/javascript">

</script>
<!-- 맵시작 -->
<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=f17857e30d029f485667a3cf426b0a8e"></script>
<script>
var map;
function createMap(){
var mapContainer = document.getElementById('map'), // 지도를 표시할 div  
    mapOption = { 
        center: new kakao.maps.LatLng(37.499321,127.0331129), // 지도의 중심좌표
        level: 4 // 지도의 확대 레벨
    };

map = new kakao.maps.Map(mapContainer, mapOption); // 지도를 생성합니다
}


$(function(){ 
   createMap();
}); //ready

function setMarker( positions ){
   // 마커를 표시할 위치와 title 객체 배열입니다 


   // 마커 이미지의 이미지 주소입니다
   var imageSrc = "https://t1.daumcdn.net/localimg/localimages/07/mapapidoc/markerStar.png"; 
    
   for (var i = 0; i < positions.length; i ++) {
       
       // 마커 이미지의 이미지 크기 입니다
       var imageSize = new kakao.maps.Size(24, 35); 
       
       // 마커 이미지를 생성합니다    
       var markerImage = new kakao.maps.MarkerImage(imageSrc, imageSize); 
       
       // 마커를 생성합니다
       var marker = new kakao.maps.Marker({
           map: map, // 마커를 표시할 지도
           position: positions[i].latlng, // 마커를 표시할 위치
           title : positions[i].title, // 마커의 타이틀, 마커에 마우스를 올리면 타이틀이 표시됩니다
           image : markerImage // 마커 이미지 
       });
   }
}
   
$(function(){
   $("#set_latlng").click(function(){
      $.ajax({
         url:"searchLat.jsp",
         dataType:"json",
         error:function(xhr){
            console.log("에러발생",xhr.status);
         },
         success:function( data ){
            if( data.dataResult ){
               $("#date").html(data.date+"조회된");
               var positions = new Array();
               
               $(data.data).each(function(i,json){
                  positions[i]={
                     title:json["title"],
                     latlng:new kakao.maps.LatLng(json["lat"],json["lng"])
                  }
               });
               setMarker(positions);
            }
         }
         
      });
   })
   
   $("#set_latlng2").click(function(){
      createMap();
   });//click
});
</script>


</head>
<body>
<div id="map" style="width:100%;height:350px;"></div>
<a href="#void" id="set_latlng"><span id="date"></span>센터주변 맛집</a>
<a href="#void" id="set_latlng2">초기화</a>
</body>
</html>