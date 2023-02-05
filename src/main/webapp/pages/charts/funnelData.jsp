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
        url: "/charts/getFunnelData",
        dataType: 'json',
        success: function(data){
            //指定图表与配置的数据
            option = {
                title: {
                    text: 'UserBehavior'
                },
                tooltip: {
                    trigger: 'item',
                    formatter: '{a} <br/>{b} : {c}%'
                },
                toolbox: {
                    feature: {
                        dataView: { readOnly: false },
                        restore: {},
                        saveAsImage: {}
                    }
                },
                legend: {
                    data: ['Buy', 'FavOrCart', 'Visit'],
                },
                series: [
                    {
                        name: 'UserBehavior',
                        type: 'funnel',
                        left: '10%',
                        top: 80,
                        bottom: 40,
                        width: '90%',
                        min: 0,
                        max: 100,
                        minSize: '0%',
                        maxSize: '100%',
                        sort: 'descending',
                        gap: 10,
                        label: {
                            show: true,
                            position: 'inside'
                        },
                        labelLine: {
                            length: 10,
                            lineStyle: {
                                width: 1,
                                type: 'solid'
                            }
                        },
                        itemStyle: {
                            borderColor: '#fff',
                            borderWidth: 1
                        },
                        emphasis: {
                            label: {
                                fontSize: 20
                            }
                        },
                        data: [
                            { value: data.usertotalvisit/10000, name: 'Visit' },
                            { value: data.userfavorcart/10000, name: 'FavOrCart' },
                            { value: data.userbuy/10000, name: 'Buy' },
                        ]
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