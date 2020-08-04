<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8"/>
	<title>Kakao 지도 시작하기</title>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
</head>
<body>
	<div id="map" style="width:100%;height:900px;"></div>
	<div id="clickLatlng"></div>
	<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=cccf9b2604aa3dac955eab92c8d6208d"></script>
	<script>
		var mapContainer = document.getElementById('map'), // 지도를 표시할 div 
		    mapOption = { 
		        center: new kakao.maps.LatLng(37.517439599999996,127.04159089999999), // 지도의 중심좌표
		        level: 5 // 지도의 확대 레벨
		    };

		var map = new kakao.maps.Map(mapContainer, mapOption); // 지도를 생성합니다

		$.ajax({
	    	type: "GET",
	    	dataType: "json",
	        url: "/bike",
	        success: function(data) {
	          	var positions = [];
	          	var imageSrc = "https://t1.daumcdn.net/localimg/localimages/07/mapapidoc/markerStar.png"; 

	          	for(var i = 0;i<data.length;i++) {
	          		var makers = 
	          		{
	          			title: data[i].stationId,
	          			latlng: new kakao.maps.LatLng(data[i].stationLatitude, data[i].stationLongitude)
	          		};
	          		positions.push(makers);	          		
	          	}

	          	for (var i = 0; i < positions.length; i ++) {    
				    // 마커 이미지의 이미지 크기 입니다
				    var imageSize = new kakao.maps.Size(24, 35); 
				    
				    // 마커 이미지를 생성합니다    
				    var markerImage = new kakao.maps.MarkerImage(imageSrc, imageSize); 
				    
				    // 마커를 생성합니다
				    let marker = new kakao.maps.Marker({
				        map: map, // 마커를 표시할 지도
				        position: positions[i].latlng, // 마커를 표시할 위치
				        title : positions[i].title, // 마커의 타이틀, 마커에 마우스를 올리면 타이틀이 표시됩니다
				        image : markerImage, // 마커 이미지 
				        clickable: true
				    });

				    kakao.maps.event.addListener(marker, 'click', function(mouseEvent) {
				    	var title = marker.getTitle();
						for(var i = 0; i<data.length;i++) {
							if(data[i].stationId == title) {
								$("#stationId").val(data[i].stationId);
								$("#rackTotCnt").val(data[i].rackTotCnt);
								$("#stationName").val(data[i].stationName);
								$("#parkingBikeTotCnt").val(data[i].parkingBikeTotCnt);
								$("#shared").val(data[i].shared);
								$('#createModal').modal();
								break;
							}
						}						
					});	
				}	
	        },
	        error: function() {
	            alert("error");
	          }
	    	});
	</script>
	<!-- Show the bicycle information (Modal View) --> 
	<div class="modal fade" id="createModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
      <div class="modal-content">
        <div class="modal-header">
          <h3 class="modal-title" id="myModalLabel">실시간 자전거 대여 정보</h3>
        </div>
        <div class="modal-body">
          <div class="modal-body1">
            <div class="table type_03 detail">
              <table>
                <tbody>
                <tr>
                <th>
                  <span class="imp">대여소 ID</span>
                </th>
                <td>                	
	                <div class="input type_01 m">
	                  <input type="text" value="" id="stationId" disabled="disabled">
	                </div>
                </td>
                </tr>
            	<tr>
                <th>
                  <span class="imp">거치대 개수</span>
                </th>
                <td>                	
	                <div class="input type_01 m">
	                  <input type="text" value="" id="rackTotCnt" disabled="disabled">
	                </div>
                </td>
                </tr>
                  <tr>
                    <th>
                      <span class="imp">대여소 이름</span>
                    </th>
                    <td>
                    	<div class="input type_01 l">
	                  	<input type="text" value="" id="stationName" disabled="disabled">
	               	 	</div>
                    </td>
                    </tr>
                  <tr>
                    <th>
                      <span class="imp">자전거 주차 총 건수</span>
                    </th>                           
                    <td>
                      <div class="input type_01 m">
	                  <input type="text" value="" id="parkingBikeTotCnt" disabled="disabled">
	                </div>
                    </td>
                  </tr>
                  <tr>
                    <th>
                      <span class="imp">거치율</span>
                    </th>
                    <td>
                      <div class="input type_01 m">
	                  <input type="text" value="" id="shared" disabled="disabled">
	                  </div>
                    </td>
                </tr>
              </tbody>
            </table>
          </div>
        </div>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
      </div>              
    </div>
  </div>
</div>
</body>
</html>