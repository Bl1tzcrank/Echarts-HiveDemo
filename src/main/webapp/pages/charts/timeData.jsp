<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <script type="text/javascript" src="/static/lib/jquery/1.9.1/jquery.min.js"></script>
    <script type="text/javascript" src="/static/h-ui/js/echarts.js" charset="UTF-8"></script>
</head>
<body>

<div class="page-container" id="main2" style="width: 90%;height:430px;"></div>

<script type="text/javascript">

    // 基于准备好的dom，初始化echarts实例
    var myChart = echarts.init(document.getElementById('main2'));
    $.ajax({
        type: "GET",
        url: "/charts/getTimeData",
        dataType: 'json',
        success: function(data){
            //指定图表与配置的数据
            option = {
                title: {
                    text: 'Time'
                },
                tooltip: {
                    trigger: 'axis'
                },
                legend: {
                    data: ['UserTotalVisit', 'UserFav','UserAddCart','UserBuy']
                },
                grid: {
                    left: '3%',
                    right: '4%',
                    bottom: '3%',
                    containLabel: true
                },
                toolbox: {
                    feature: {
                        saveAsImage: {}
                    }
                },
                xAxis: {
                    type: 'category',
                    boundaryGap: false,
                    data: data.hour
                },
                yAxis: {
                    type: 'value'
                },
                series: [
                    {
                        name: 'UserTotalVisit',
                        type: 'line',
                        stack: 'Total',
                        data: data.pv
                    },
                    {
                        name: 'UserFav',
                        type: 'line',
                        stack: 'Total',
                        data: data.fav
                    },
                    {
                        name: 'UserAddCart',
                        type: 'line',
                        stack: 'Total',
                        data: data.cart
                    },
                    {
                        name: 'UserBuy',
                        type: 'line',
                        stack: 'Total',
                        data: data.buy
                    }
                ]
            };
            // 使用刚指定的配置项和数据显示图表。
            myChart.setOption(option);
        }
    });
</script>

</body>
</html>