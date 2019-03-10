<!DOCTYPE html>
<html>
<head>
    <script src="../js/jquery-3.2.1.min.js"></script>
    <script src="../js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="../css/bootstrap.min.css" />
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta charset="UTF-8">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">

            <nav class="navbar navbar-default">
                <div class="container">
                    <ul class="nav nav-pills">
                        <li class="active"><a href="/bankgift/giftinfo/list?isRecommend=1">推荐</a></li>
                        <#list bankCategoryList as bankCategory>
                            <li>
                                <a href="/bankgift/giftinfo/list?bankId=${bankCategory.getBankId()}">${bankCategory.getBankName()}</a>
                            </li>
                        </#list>
                    </ul>
                </div>
            </nav>


            <table class="table table-condensed">
                <thead>
                <tr>
                    <th>礼品名称</th>
                    <th>礼品照片</th>
                    <th>银行</th>
                    <th>活动名称</th>
                </tr>
                </thead>
                <tbody>
                <#list giftInfoList as giftInfo>
                    <tr>
                        <td>${giftInfo.getGiftName()}</td>
                        <td><img height="100" width="100"
                                 src="https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=1792778088,388617757&fm=26&gp=0.jpg"
                                 alt=""></td>
                        <td>${giftInfo.getBankName()}</td>
                        <td>${giftInfo.getActivityName()}</td>
                    </tr>
                </#list>
                </tbody>
            </table>
        </div>
    </div>
</div>
</body>
</html>