/*
 * @author chenhao
 * @time 2018/3/6
 * 房间数目变化，支付价格改变
 */
$("#need-number").change(function(){
	var number=$(this).val();
	var price=$("#house-price").text().split("元");
	var day_number=$(".NumDate").text();
	
	$("#all-money").text(price[0]*number*day_number).append(".00");
	$("#pay-money").text(price[0]*number*day_number).append(".00");
	
	var text="";
	var time=0;
	while(number>time) {
		time+=1;
		text+='<tr>\
	    		<td>房间'+time+'</td>\
	       		<td>\
	       			<input type="text" class="form-control" id="Name'+time+ '" placeholder="负责人姓名" required>\
	       		</td>\
	       	   </tr>';
	}
	text+='<tr>\
   			<td>联系电话</td>\
   			<td>\
   				<input type="text" class="form-control" id="phone-number" required>\
   			</td>\
   		</tr>';
    $("#person-message").html(text);
});

/**
 * 
 * @author chenhao
 * @time  2018/4/10
 * 设置不同房间信息
 * 
 */
var setHouse=function(){
	var url=window.location.href;
	var number=url.split("=");
	if(number[1]==2){
		$("#house").attr("src","../img/house2.jpg");
		$("#house").attr("alt","双人间");
		$("#message").html("" +
				"<li>面积20-30㎡ 位于 2-3 层</li>"+
		        "<li>双床（不可以加床）</li>"+
		        "<li>独立卫浴 有窗</li>"+
		        "<li>免费WiFi 高清智能电视 电脑</li>"
		);
		$("#house-price").html("150元<small class=\"text-muted\">/ 晚</small>");
		$("#describe").html("实用双人房&nbsp;&nbsp; 情侣必备");
		$("#all-money").html("150.00");
		$("#pay-money").html("150.00");
	}else if(number[1]==3){
		$("#house").attr("src","../img/house3.jpg");
		$("#house").attr("alt","三人间");
		$("#message").html("" +
				"<li>面积30-40㎡ 位于 3-4 层</li>"+
		        "<li>三床（不可以加床）</li>"+
		        "<li>独立卫浴 有窗</li>"+
		        "<li>免费WiFi 高清智能电视 电脑</li>"
		);
		$("#house-price").html("200元<small class=\"text-muted\">/ 晚</small>");
		$("#describe").html("旅游必备&nbsp;&nbsp; 家庭首选");
		$("#all-money").html("200.00");
		$("#pay-money").html("200.00");
	}
}

/**
 * @author chenhao
 * @time 2018.4.7
 * 日期调用函数
 */
$(data_init());

setHouse();



