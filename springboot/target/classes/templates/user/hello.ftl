<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>用户登录</title>
</head>
<script type="text/javascript" src="${request.contextPath}/jquery/jquery-1.4.2.js"></script>
<script type="text/javascript">
    function f(){
        var username = $("#username").val();
        var password = $("#password").val();
        var obj ={
            username:username,
            password:password
        };
        var jsonData = JSON.stringify(obj);
        $.ajax({
            type:'post',
            dataType:'json',
            contentType:'application/json',
            url:'/user/login',
            data:jsonData,
            success:function (data) {
                if(data.msg == 1){
                    $("#span").html("注册成功");
                }else{
                    $("#span").html("注册失败");
                }
            }
        })
    }

</script>
<body>
    <label for="username">用户名：</label>
    <input id="username" type="text"><span id="span" style="color: red"></span><br>
    <label for="password">密码：</label>
    <input id="password" type="password"><br>
    <input value="提交" type="button" onclick="f()"></input>
</body>
</html>