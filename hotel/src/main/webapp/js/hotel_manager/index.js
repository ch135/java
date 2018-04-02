/**
 * @author chenhao
 * @time 2018.3.7
 * 菜单栏图标
 */
feather.replace()

/**
 * @author chenhao
 * @time 2018.3.7
 * 日期函数
 */
;!function () {
    laydate({})
}();

/**
 * @author chenhao
 * @time 2018.3.7
 * 预订信息查询
 */
$("#before-message").click(function () {
    $("main").html("<div class=\"d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center\">\
        <h2 class=\"h2\">预订信息</h2>\
       	<div class=\"btn-toolbar mb-2 mb-md-0\">\
		  <div class=\"btn-group mr-2\">\
            <input class=\"text-center rounded\" type=\"text\" id=\"startdate\" placeholder=\"入住日期\" onClick=\"laydate()\"/>&nbsp;&nbsp;\
            <input class=\"text-center rounded\" type=\"text\" id=\"enddate\" placeholder=\"离开日期\" onClick=\"laydate()\"/>\
          </div>\
          <a class=\"btn btn-outline-primary\" href=\"#\">搜&nbsp;索</a>\
        </div>\
      </div>\
      <div class=\"table-responsive\">\
        <table class=\"table table-striped table-sm text-center\">\
          <thead>\
            <tr>\
              <th>编&nbsp;&nbsp;号</th>\
              <th>房间类型</th>\
              <th>入住日期</th>\
              <th>离开日期</th>\
              <th>房&nbsp;&nbsp;号</th>\
              <th>支付金额<small><strong>（元）</strong></small></th>\
              <th>手机号</th>\
              <th>操&nbsp;&nbsp;作</th>\
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
                    <td>15768616200</td>\
                    <td>\
                        <a href=\"#\" onclick=\"#\">取消订单</a>&nbsp;&nbsp\
                        <a href=\"#\" onclick=\"#\">用户入住</a>\
                    </td>\
                </tr>\
                <tr>\
                    <td>2</td>\
                    <td>情侣双人房</td>\
                    <td>2018-03-06</td>\
                    <td>2018-03-08</td>\
                    <td>304</td>\
                    <td>300.00</td>\
                    <td>15768616200</td>\
                    <td>\
                        <a href=\"#\" onclick=\"#\">用户退房</a>\
                    </td>\
                </tr>\
                <tr>\
                    <td>3</td>\
                    <td>旅游三人房</td>\
                    <td>2018-03-06</td>\
                    <td>2018-03-10</td>\
                    <td>312,313</td>\
                    <td>1600.00</td>\
                    <td>15768616200</td>\
                    <td>\
                        <a href=\"#\" onclick=\"#\">取消订单</a>&nbsp;&nbsp\
                        <a href=\"#\" onclick=\"#\">用户入住</a>\
                    </td>\
                </tr>\
                <tr>\
                    <td>4</td>\
                    <td>旅游三人房</td>\
                    <td>2018-03-06</td>\
                    <td>2018-03-10</td>\
                    <td>314,315</td>\
                    <td>1600.00</td>\
                    <td>15768616200</td>\
                    <td>\
                       <a href=\"#\" onclick=\"#\">取消订单</a>&nbsp;&nbsp\
                        <a href=\"#\" onclick=\"#\">用户入住</a>\
                    </td>\
                </tr>\
                <tr>\
                    <td>5</td>\
                    <td>旅游三人房</td>\
                    <td>2018-03-06</td>\
                    <td>2018-03-10</td>\
                    <td>314,315</td>\
                    <td>1600.00</td>\
                    <td>15768616200</td>\
                    <td>\
                        <a href=\"#\" onclick=\"#\">取消订单</a>&nbsp;&nbsp\
                        <a href=\"#\" onclick=\"#\">用户入住</a>\
                    </td>\
                </tr>\
                <tr>\
                    <td>6</td>\
                    <td>旅游三人房</td>\
                    <td>2018-03-06</td>\
                    <td>2018-03-10</td>\
                    <td>314,315</td>\
                    <td>1600.00</td>\
                    <td>15768616200</td>\
                    <td>\
                        <a href=\"#\" onclick=\"#\">用户退房</a>\
                    </td>\
                </tr>\
                <tr>\
                    <td>7</td>\
                    <td>旅游三人房</td>\
                    <td>2018-03-06</td>\
                    <td>2018-03-10</td>\
                    <td>314,315</td>\
                    <td>1600.00</td>\
                    <td>15768616200</td>\
                    <td>\
                        <a href=\"#\" onclick=\"#\">用户退房</a>\
                    </td>\
                </tr>\
                <tr>\
                    <td>8</td>\
                    <td>旅游三人房</td>\
                    <td>2018-03-06</td>\
                    <td>2018-03-10</td>\
                    <td>314,315</td>\
                    <td>1600.00</td>\
                    <td>15768616200</td>\
                    <td>\
                        <a href=\"#\" onclick=\"#\">用户退房</a>\
                    </td>\
                </tr>\
            </tbody>\
        </table><br />\
        <div class=\"container\">\
            <div class=\"row justify-content-end\">\
                <div class=\"order-md-2 mb-4\">\
                    <ul class=\"pagination\">\
                        <li class=\"page-item\">\
                            <a class=\"page-link\" href=\"#\">Previous</a>\
                        </li>\
                        <li class=\"page-item active\">\
                            <a class=\"page-link\" href=\"#\">1</a>\
                        </li>\
                        <li class=\"page-item\">\
                            <a class=\"page-link\" href=\"#\">2</a>\
                        </li>\
                        <li class=\"page-item\">\
                            <a class=\"page-link\" href=\"#\">3</a>\
                        </li>\
                        <li class=\"page-item\">\
                            <a class=\"page-link\" href=\"#\">Next</a>\
                        </li>\
                    </ul>\
                </div>\
            </div>\
        </div>\
        </div>\
      </div>");
});

/**
 * @author chenhao
 * @time 2018.3.7
 * 房间管理
 */
$("#house-manage").click(function () {
    $("main").html("<div class=\"d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center\">\
		        <h1 class=\"h2\">房间管理</h1>\
		        <div class=\"btn-toolbar mb-2 mb-md-0\">\
		          <div class=\"btn-group mr-2\">\
		              <input class=\"text-center rounded\" type=\"text\" id=\"findDate\"  placeholder=\"入住日期\" onClick=\"laydate()\"/>&nbsp;&nbsp;\
		          </div>\
		          <a class=\"btn btn-outline-primary\" href=\"#\">搜&nbsp;索</a>\
		        </div>\
		      </div>\
		      <div class=\"table-responsive\">\
		        <table class=\"table table-striped table-sm text-center\">\
		          <thead>\
		            <tr>\
		              <th>编&nbsp;&nbsp;号</th>\
		              <th>房&nbsp;&nbsp;号</th>\
		              <th>房间类型</th>\
		              <th>手&nbsp;机&nbsp;号</th>\
		              <th>状&nbsp;&nbsp;态</th>\
		            </tr>\
		          </thead>\
		          <tbody>\
		                <tr>\
		                    <td>1</td>\
		                    <td>201</td>\
		                    <td>实惠单人房</td>\
		                    <td>15768616200</td>\
		                    <td>空&nbsp;&nbsp;房</td>\
		                </tr>\
		                <tr>\
		                    <td>2</td>\
		                    <td>202</td>\
		                    <td>实惠单人房</td>\
		                    <td>15768616200</td>\
		                    <td>已&nbsp;预&nbsp;订</td>\
		                </tr>\
		                <tr>\
		                    <td>3</td>\
		                    <td>203</td>\
		                    <td>实惠单人房</td>\
		                    <td>15768616200</td>\
		                    <td>入&nbsp;住&nbsp;中</td>\
		                </tr>\
		                <tr>\
		                    <td>4</td>\
		                    <td>204</td>\
		                    <td>实惠单人房</td>\
		                    <td>15768616200</td>\
		                    <td>清&nbsp;扫&nbsp;中</td>\
		                </tr>\
		                <tr>\
		                    <td>5</td>\
		                    <td>205</td>\
		                    <td>实惠单人房</td>\
		                    <td>15768616200</td>\
		                    <td>以&nbsp;退&nbsp;房</td>\
		                </tr>\
		                <tr>\
		                    <td>6</td>\
		                    <td>206</td>\
		                    <td>实惠单人房</td>\
		                    <td>15768616200</td>\
		                    <td>以&nbsp;退&nbsp;房</td>\
		                </tr>\
		                <tr>\
		                    <td>7</td>\
		                    <td>207</td>\
		                    <td>实惠单人房</td>\
		                    <td>15768616200</td>\
		                    <td>以&nbsp;退&nbsp;房</td>\
		                </tr>\
		                <tr>\
		                    <td>8</td>\
		                    <td>208</td>\
		                    <td>实惠单人房</td>\
		                    <td>15768616200</td>\
		                    <td>以&nbsp;退&nbsp;房</td>\
		                </tr>\
		                <tr>\
		                    <td>9</td>\
		                    <td>209</td>\
		                    <td>实惠单人房</td>\
		                    <td>15768616200</td>\
		                    <td>以&nbsp;退&nbsp;房</td>\
		                </tr>\
		                <tr>\
		                    <td>10</td>\
		                    <td>210</td>\
		                    <td>实惠单人房</td>\
		                    <td>15768616200</td>\
		                    <td>以&nbsp;退&nbsp;房</td>\
		                </tr>\
		                <tr>\
		                    <td>11</td>\
		                    <td>211</td>\
		                    <td>实惠单人房</td>\
		                    <td>15768616200</td>\
		                    <td>以&nbsp;退&nbsp;房</td>\
		                </tr>\
		                <tr>\
		                    <td>12</td>\
		                    <td>212</td>\
		                    <td>实惠单人房</td>\
		                    <td>15768616200</td>\
		                    <td>以&nbsp;退&nbsp;房</td>\
		                </tr>\
		                <tr>\
		                    <td>13</td>\
		                    <td>213</td>\
		                    <td>实惠单人房</td>\
		                    <td>15768616200</td>\
		                    <td>以&nbsp;退&nbsp;房</td>\
		                </tr>\
		                <tr>\
		                    <td>14</td>\
		                    <td>214</td>\
		                    <td>实惠单人房</td>\
		                    <td>15768616200</td>\
		                    <td>以&nbsp;退&nbsp;房</td>\
		                </tr>\
		                <tr>\
		                    <td>15</td>\
		                    <td>215</td>\
		                    <td>实惠单人房</td>\
		                    <td>15768616200</td>\
		                    <td>以&nbsp;退&nbsp;房</td>\
		                </tr>\
		                <tr>\
		                    <td>16</td>\
		                    <td>301</td>\
		                    <td>情侣双人房</td>\
		                    <td>15768616200</td>\
		                    <td>以&nbsp;退&nbsp;房</td>\
		                </tr>\
		                <tr>\
		                    <td>17</td>\
		                    <td>302</td>\
		                    <td>情侣双人房</td>\
		                    <td>15768616200</td>\
		                    <td>以&nbsp;退&nbsp;房</td>\
		                </tr>\
		                <tr>\
		                    <td>18</td>\
		                    <td>303</td>\
		                    <td>情侣双人房</td>\
		                    <td>15768616200</td>\
		                    <td>以&nbsp;退&nbsp;房</td>\
		                </tr>\
		                <tr>\
		                    <td>19</td>\
		                    <td>304</td>\
		                    <td>情侣双人房</td>\
		                    <td>15768616200</td>\
		                    <td>以&nbsp;退&nbsp;房</td>\
		                </tr>\
		                <tr>\
		                    <td>20</td>\
		                    <td>305</td>\
		                    <td>情侣双人房</td>\
		                    <td>15768616200</td>\
		                    <td>以&nbsp;退&nbsp;房</td>\
		                </tr>\
		                <tr>\
		                    <td>21</td>\
		                    <td>306</td>\
		                    <td>旅游三人房</td>\
		                    <td>15768616200</td>\
		                    <td>入&nbsp;住&nbsp;中</td>\
		                </tr>\
		                <tr>\
		                    <td>22</td>\
		                    <td>307</td>\
		                    <td>旅游三人房</td>\
		                    <td>15768616200</td>\
		                    <td>入&nbsp;住&nbsp;中</td>\
		                </tr>\
		                <tr>\
		                    <td>23</td>\
		                    <td>308</td>\
		                    <td>旅游三人房</td>\
		                    <td>15768616200</td>\
		                    <td>入&nbsp;住&nbsp;中</td>\
		                </tr>\
		                <tr>\
		                    <td>24</td>\
		                    <td>401</td>\
		                    <td>旅游三人房</td>\
		                    <td>15768616200</td>\
		                    <td>入&nbsp;住&nbsp;中</td>\
		                </tr>\
		                <tr>\
		                    <td>25</td>\
		                    <td>402</td>\
		                    <td>旅游三人房</td>\
		                    <td>15768616200</td>\
		                    <td>入&nbsp;住&nbsp;中</td>\
		                </tr>\
		            </tbody>\
		        </table>\
		      </div>");
});

/**
 * @author chenhao
 * @time 2018.3.7
 * 入住登记
 */
$("#regeister").click(function () {
    $("main").html(
        '<div class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center border-bottom">\
                <h1 class="h2">入住登记</h1>\
                <div class="col-md-3 mb-2 mb-md-0">\
                  <div class="btn-group mr-2">\
                      <select class="custom-select d-block w-100" id="house-type">\
                          <option>单人间</option>\
                          <option>双人间</option>\
                          <option>三人间</option>\
                      </select>\
                  </div>&nbsp;&nbsp;\
                  <span>剩余<strong>4</strong>间</span>\
                </div>\
              </div><br />\
              <div class="row">\
                <div class=\"col-12\">\
                    <form>\
                      <h4>\
                          <strong>订单信息</strong>\
                      </h4><br />\
                        <div class="table-responsive">\
                          <table class="table table-sm">\
                              <tbody>\
                                  <tr>\
                                      <td>房型信息：</td>\
                                      <td>实惠单人房&nbsp;&nbsp; 出差力荐</td>\
                                  </tr>\
                                  <tr>\
                                      <td>居住时间：</td>\
                                      <td>\
                                          <div id="checkinout">\
                                            <div id="firstSelect" style="width:100%;">\
                                                <span>""</span>\
                                                <input id="startDate" type="text" value=""style="" readonly>\
                                            </div>\
                                            <div class="Date_lr" style="float:right;">\
                                                <span>""</span>\
                                                <input id="endDate" type="text" value="" style="" readonly>\
                                            </div>\
                                            <span class="span21">共<span class="NumDate">1</span>晚</span>\
                                          </div>\
	                                      <div class="mask_calendar">\
	                                        <div class="calendar"></div>\
	                                        <div class="calendar_tishi">请选择离店日期...</div>\
	                                      </div>\
                                      </td>\
                                  </tr>\
                                  <tr>\
                                    <td>\
                                      <span>房间数量:</span><br />\
                                    </td>\
                                    <td>\
                                      <select class="custom-select d-block w-100" id=\"need-number\">\
	                                    <option>1</option>\
	                                    <option>2</option>\
	                                    <option>3</option>\
                                        <option>4</option>\
                              		  </select>\
                              		  <span id="house-price" hidden="hidden">70元</span>\
                                    </td>\
                                  </tr>\
                                  <tr>\
                                      <td>房费总计：</td>\
                                      <td><strong id="all-money">70.00</strong>元</td>\
                                  </tr>\
                              </tbody>\
                          </table>\
                      </div><br /><br />\
                      <h4>\
                            <strong>入住信息</strong>\
                      </h4><br />\
                      <table class="table table-sm">\
                           <tbody id="person-message">\
                               <tr>\
                                   <td>房间1</td>\
                                   <td>\
                                       <input type="text" class="form-control" id="Name1" placeholder="负责人姓名" required>\
                                   </td>\
                               </tr>\
                               <tr>\
                                   <td>联系电话</td>\
                                   <td>\
                                       <input type="text" class="form-control" id="phone-number" required>\
                                   </td>\
                               </tr>\
                           </tbody>\
                      </table><br /><br />\
                      <button class="btn btn-primary btn-lg btn-block" type="submit">支付&nbsp;<span id="pay-money">70.00</span>元</button>\
                </form>\
                </div>\
            </div>'
    );
    initSelect();
    $(data_init());
});

 /**
  * @author chenhao
  * @time 2018.3.7
  * 房间数目变化，支付价格改变
  */
var initSelect = function () {
    $("#need-number").change(function () {
        var number = $(this).val();
        var price = $("#house-price").text().split("元");
        var day_number = $(".NumDate").text();

        $("#all-money").text(price[0] * number * day_number).append(".00");
        $("#pay-money").text(price[0] * number * day_number).append(".00");

        var text = "";
        var time = 0;
        while (number > time) {
            time += 1;
            text += '<tr>\
		    		<td>房间' + time + '</td>\
		       		<td>\
		       			<input type="text" class="form-control" id="Name' + time + '" placeholder="负责人姓名" required>\
		       		</td>\
		       	   </tr>';
        }
        text += '<tr>\
	   			<td>联系电话</td>\
	   			<td>\
	   				<input type="text" class="form-control" id="phone-number" required>\
	   			</td>\
	   		</tr>';
        $("#person-message").html(text);
    });
}

/**
  * @author chenhao
  * @time 2018.4.2
  * 每月收支
  */
$("#daily-offer").click(function () {
    $("main").html('<div class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center border-bottom">\n' +
        '                <h2 class="h2">每月收入</h2>\n' +
        '                <div class="btn-toolbar mb-2 mb-md-0">\n' +
        '                    <div class="btn-group mr-2">\n' +
        '                        <select class="custom-select d-block w-100" id="house-type">\n' +
        '                            <option>1月</option>\n' +
        '                            <option>2月</option>\n' +
        '                            <option>3月</option>\n' +
        '                            <option>4月</option>\n' +
        '                            <option>5月</option>\n' +
        '                            <option>6月</option>\n' +
        '                            <option>7月</option>\n' +
        '                            <option>8月</option>\n' +
        '                            <option>9月</option>\n' +
        '                            <option>10月</option>\n' +
        '                            <option>11月</option>\n' +
        '                            <option>12月</option>\n' +
        '                        </select>\n' +
        '                    </div>\n' +
        '                </div>\n' +
        '            </div>\n' +
        '            <canvas id="myChart" width="900" height="380"></canvas>'
    );
    print();
})

/**
 * @author chenhao
 * @time 2017.4.2
 * 绘画曲线图
 */
var print=function () {
    var ctx = document.getElementById("myChart");
    var myChart = new Chart(ctx, {
        type: 'line',
        data: {
            labels: ["1号","2号","3号","4号","5号","6号","7号","8号","9号","10号","11号","12号","13号","14号","15号","16号","17号","18号","19号","20号","21号","22号","23号","24号","25号","26号","27号","28号","29号","30号","31号"],
            datasets: [{
                data: [10000, 21345, 18483, 24003, 23489, 24092, 12034,15339, 21345, 18483, 24003, 23489, 24092, 12034,15339, 21345, 18483, 24003, 23489, 24092, 12034,15339, 21345, 18483, 24003, 23489, 24092, 12034,121,13131,1342],
                lineTension: 0,
                backgroundColor: 'transparent',
                borderColor: '#007bff',
                borderWidth: 4,
                pointBackgroundColor: '#007bff'
            }]
        },
        options: {
            scales: {
                yAxes: [{
                    ticks: {
                        beginAtZero: false
                    }
                }]
            },
            legend: {
                display: false
            }
        }
    });
}