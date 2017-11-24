<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <%@include file="./common.jsp" %>
    <script language="javascript" type="text/javascript">
        <%--var code = "${code}";--%>
        <%--$(function () {--%>
            <%--console.log(code);--%>
            <%--$.ajax({--%>
                <%--type: "post",--%>
                <%--url: "https://gitee.com/oauth/token?" +--%>
                <%--"grant_type=authorization_code" +--%>
                <%--"&code=" + code +--%>
                <%--"&client_id=e3eff8aa8c3b11a4b44ffd729b78687ad3bfa6b02c0d791cdde1597d6eae5296" +--%>
                <%--"&redirect_uri=http://localhost:8080/hello/redirect" +--%>
                <%--"&client_secret=311f9b81b8b449e52d66746afeca3a3333be15dae5dfb47c2db672bee3044a59",--%>
                <%--data: '',--%>
                <%--dataType: "json",--%>
                <%--beforeSend: function(xhr){--%>
                    <%--xhr.setRequestHeader('X-Test-Header', 'test-value');--%>
                    <%--xhr.setRequestHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.110 Safari/537.36");--%>
                <%--},--%>
                <%--jsonp: "callbackparam",--%>
                <%--jsonpCallback: "success_jsonpCallback",--%>
                <%--success: function (data) {--%>
                    <%--console.log(data);--%>
                <%--},--%>
                <%--error: function (XMLHttpRequest, textStatus, errorThrown) {--%>
                    <%--console.log(textStatus);--%>
                    <%--console.log(errorThrown);--%>
                <%--}--%>
            <%--});--%>
        <%--});--%>
    </script>
</head>
<body>
<h1>${msg}</h1>
<span class="token">${token}</span>

</body>
</html>
