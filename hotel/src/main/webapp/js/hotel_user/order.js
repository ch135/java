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
