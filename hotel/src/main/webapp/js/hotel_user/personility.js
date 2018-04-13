/**
 * 菜单栏鼠标覆盖事件
 * @author chenhao
 * @time 2018/3/5
 */
$("h6").mouseover(function(){
	$(this).parent("div").addClass("text-success");
	$(this).parent("div").parent("li").addClass("bg-light");
	$(this).css("cursor","pointer");
});

/**
 * 菜单栏鼠标离开事件
 * @author chenhao
 * @time 2018/3/5
 */
$("h6").mouseleave(function(){
	$(this).parent("div").removeClass("text-success");
	$(this).parent("div").parent("li").removeClass("bg-light");
	$(this).css("cursor","default");
});

/**
 * 基本信息点击事件
 * @author chenhao
 * @time 2018/3/6
 */
$("#basic-message").click(function(){
	$("#message").html(
		'<h4>\
	  	 	<strong>基本信息</strong>\
	   	</h4><br />\
	   <table class="table table-sm">\
	   	<tbody>\
	   		<tr>\
	   			<td>账&nbsp;号</td>\
	   			<td id="account"></td>\
	   		</tr>\
	   		<tr>\
	   			<td>余&nbsp;额</td>\
	   			<td id="money"></td>\
	   		</tr>\
	   	</tbody>\
	   </table><br /><br />\
	   <button class="btn btn-primary btn-lg btn-block" type="button" data-toggle="modal" data-target="#PassChange">密码修改</button>');
	   
	$("#menu").attr("class","col-md-4 order-md-2 mb-4");
	$("#message").attr("class","col-md-8 order-md-1");
	
	exertInfo();
});

/**
 * @authod chenhao
 * @time 2018/4/10
 * 密码修改
 */
var passwordChange=function(){
	var account=$("#user").html();
	var password=$("#inputPassword").val();
	var affirmpassword=$("#affirmPassword").val();
	
	if(password!=""&&affirmpassword!=""){
		if(password==affirmpassword){
			$.ajax({
				url : '/hotel/user/passchange.do',
				type : 'post',
				data : {
					"password" : password,
					"account" : account
				},
				success : function(result){
					if(result==0){
						alert("密码更改成功！");
						history.go(0);
					}else{
						alert("密码更改失败！");
					}
				},
				error : function(e){
					console.log("密码更改失败");
					console.log(e);
				}
			});
		}else{
			alert("密码出错");
		}
	}else{
		alert("请输入密码");
	}
}

/**
 * @author chenhao
 * @time 2018.4.10
 * 获取用户额外信息
 */
var exertInfo=function(){
	var account = $("#user").html();
	$.ajax({
		url : '/hotel/user/extrainfor.do',
		dataType : 'json',
		type : 'post',
		data : {
			"account" : account
		},
		success : function(result){
			var account = result.userAccount;
			var money = result.money;
			var url=result.picture;
			
			if("undefined" != typeof url){
				$("#head-image").attr("src",url);
			}else{
				$("#head-image").attr("src","/hotel/img/person.png");
				console.log("用户头像不存在");
			}
			$("#account").html(account);
			if(money==0){
				$("#money").html("0.00 元");
			}else{
				$("#money").html(money+"元");
			}
		},
		error : function(e){
			console.log(e);
			console.log("获取用户额外信息失败");
		}
	});
}
exertInfo();

/**
 * @author chenhao
 * @time 2018.4.12
 * <p>用户更改头像</p>
 */
$("#head-image").mouseover(function(){
	$(this).css("cursor","pointer");
})

$("#head-image").mouseleave(function(){
	$(this).css("cursor","default");
})

$("#head-image").click(function(){
	$("#image-upload").click();
});

var getURL=function(node){
	//获取图片路径
	var url=URL.createObjectURL(node.files[0]);
	changeImage(url);
}

var changeImage=function(url){
	$("#head-image").attr("src",url);
	$("form").submit();
}

/**
 * 完成订单点击事件
 * @author chenhao
 * @time 2018/3/5
 */
$("#finish-order").click(function(){
	$("#message").html(
		'<h4>\
			<strong>完成订单</strong>\
		 </h4><br />\
		 <div class="table-responsive">\
			<table class="table table-sm text-center">\
				<thead>\
					<tr>\
						<th>编&nbsp;号</th>\
						<th>房间类型</th>\
						<th>入住日期</th>\
						<th>离开日期</th>\
						<th>房&nbsp;号</th>\
						<th>支付金额<small><strong>（元）</strong></small></th>\
						<th>操&nbsp;作</th>\
					</tr>\
				</thead>\
				<tbody>\
					<tr>\
						<td>1</td>\
						<td>实惠单人房</td>\
						<td>2018-03-06</td>\
						<td>2018-03-07</td>\
						<td>201,202</td>\
						<td>140.00</td>\
						<td>\
							<a href="#" onclick="">取消订单</a>\
						</td>\
					</tr>\
					<tr>\
						<td>2</td>\
						<td>情侣双人房</td>\
						<td>2018-03-06</td>\
						<td>2018-03-08</td>\
						<td>304</td>\
						<td>300.00</td>\
						<td>\
							<a href="#" onclick="">取消订单</a>\
						</td>\
					</tr>\
					<tr>\
						<td>3</td>\
						<td>旅游三人房</td>\
						<td>2018-03-06</td>\
						<td>2018-03-10</td>\
						<td>312,313</td>\
						<td>1600.00</td>\
						<td>\
							<a href="#" onclick="">取消订单</a>\
						</td>\
					</tr>\
					<tr>\
						<td>4</td>\
						<td>旅游三人房</td>\
						<td>2018-03-06</td>\
						<td>2018-03-10</td>\
						<td>314,315</td>\
						<td>1600.00</td>\
						<td>\
							<a href="#" onclick="">取消订单</a>\
						</td>\
					</tr>\
					<tr>\
						<td>5</td>\
						<td>旅游三人房</td>\
						<td>2018-03-06</td>\
						<td>2018-03-10</td>\
						<td>314,315</td>\
						<td>1600.00</td>\
						<td>\
							<a href="#" onclick="">取消订单</a>\
						</td>\
					</tr>\
					<tr>\
						<td>6</td>\
						<td>旅游三人房</td>\
						<td>2018-03-06</td>\
						<td>2018-03-10</td>\
						<td>314,315</td>\
						<td>1600.00</td>\
						<td>\
							<a href="#" onclick="">取消订单</a>\
						</td>\
					</tr>\
					<tr>\
						<td>7</td>\
						<td>旅游三人房</td>\
						<td>2018-03-06</td>\
						<td>2018-03-10</td>\
						<td>314,315</td>\
						<td>1600.00</td>\
						<td>\
							<a href="#" onclick="">取消订单</a>\
						</td>\
					</tr>\
					<tr>\
						<td>8</td>\
						<td>旅游三人房</td>\
						<td>2018-03-06</td>\
						<td>2018-03-10</td>\
						<td>314,315</td>\
						<td>1600.00</td>\
						<td>\
							<a href="#" onclick="">取消订单</a>\
						</td>\
					</tr>\
				</tbody>\
			</table><br />\
			<div class="container">\
				<div class="row justify-content-end">\
					<div class="order-md-2 mb-4">\
						<ul class="pagination">\
							<li class="page-item">\
								<a class="page-link" href="#">Previous</a>\
							</li>\
							<li class="page-item active">\
								<a class="page-link" href="#">1</a>\
							</li>\
							<li class="page-item">\
								<a class="page-link" href="#">2</a>\
							</li>\
							<li class="page-item">\
								<a class="page-link" href="#">3</a>\
							</li>\
							<li class="page-item">\
								<a class="page-link" href="#">Next</a>\
							</li>\
						</ul>\
					</div>\
				</div>\
			</div>\
		</div>');
		
	$("#menu").attr("class","col-md-3 order-md-2 mb-4");
	$("#message").attr("class","col-md-9 order-md-1");
});

/**
 * 历史订单点击事件
 * @author chenhao
 * @time 2018/3/6
 */
$("#history-order").click(function(){
	$("#message").html(
		'<h4>\
			<strong>历史订单</strong>\
		 </h4><br />\
		 <div class="table-responsive">\
			<table class="table table-sm text-center">\
				<thead>\
					<tr>\
						<th>编&nbsp;号</th>\
						<th>房间类型</th>\
						<th>入住日期</th>\
						<th>离开日期</th>\
						<th>房&nbsp;号</th>\
						<th>支付金额<small><strong>（元）</strong></small></th>\
						<th>退回金额<small><strong>（元）</strong></small></th>\
						<th>交易情况</th>\
					</tr>\
				</thead>\
				<tbody>\
					<tr>\
						<td>1</td>\
						<td>实惠单人房</td>\
						<td>2018-03-06</td>\
						<td>2018-03-07</td>\
						<td>314,315</td>\
						<td>140.00</td>\
						<td>0.00</td>\
						<td>成功</td>\
					</tr>\
					<tr>\
						<td>2</td>\
						<td>情侣双人房</td>\
						<td>2018-03-06</td>\
						<td>2018-03-08</td>\
						<td>315</td>\
						<td>300.00</td>\
						<td>300.00</td>\
						<td>用户取消订单</td>\
					</tr>\
					<tr>\
						<td>3</td>\
						<td>旅游三人房</td>\
						<td>2018-03-06</td>\
						<td>2018-03-10</td>\
						<td>314,315</td>\
						<td>1600.00</td>\
						<td>0.00</td>\
						<td>成功</td>\
					</tr>\
					<tr>\
						<td>4</td>\
						<td>旅游三人房</td>\
						<td>2018-03-06</td>\
						<td>2018-03-10</td>\
						<td>314,315</td>\
						<td>1600.00</td>\
						<td>0.00</td>\
						<td>成功</td>\
					</tr>\
					<tr>\
						<td>5</td>\
						<td>旅游三人房</td>\
						<td>2018-03-06</td>\
						<td>2018-03-10</td>\
						<td>314,315</td>\
						<td>1600.00</td>\
						<td>0.00</td>\
						<td>成功</td>\
					</tr>\
					<tr>\
						<td>6</td>\
						<td>旅游三人房</td>\
						<td>2018-03-06</td>\
						<td>2018-03-10</td>\
						<td>314,315</td>\
						<td>1600.00</td>\
						<td>0.00</td>\
						<td>成功</td>\
					</tr>\
					<tr>\
						<td>7</td>\
						<td>旅游三人房</td>\
						<td>2018-03-06</td>\
						<td>2018-03-10</td>\
						<td>314,315</td>\
						<td>1600.00</td>\
						<td>0.00</td>\
						<td>成功</td>\
					</tr>\
					<tr>\
						<td>8</td>\
						<td>旅游三人房</td>\
						<td>2018-03-06</td>\
						<td>2018-03-10</td>\
						<td>314,315</td>\
						<td>1600.00</td>\
						<td>0.00</td>\
						<td>成功</td>\
					</tr>\
				</tbody>\
			</table><br />\
			<div class="container">\
				<div class="row justify-content-end">\
					<div class="order-md-2 mb-4">\
						<ul class="pagination">\
							<li class="page-item">\
								<a class="page-link" href="#">Previous</a>\
							</li>\
							<li class="page-item active">\
								<a class="page-link" href="#">1</a>\
							</li>\
							<li class="page-item">\
								<a class="page-link" href="#">2</a>\
							</li>\
							<li class="page-item">\
								<a class="page-link" href="#">3</a>\
							</li>\
							<li class="page-item">\
								<a class="page-link" href="#">Next</a>\
							</li>\
						</ul>\
					</div>\
				</div>\
			</div>\
		</div>');
	
	$("#menu").attr("class","col-md-2 order-md-2 mb-4");
	$("#message").attr("class","col-md-10 order-md-1");
});
