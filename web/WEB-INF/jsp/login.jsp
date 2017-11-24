<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%--<%! int aaa = 1; %>--%>
<html>
<head>
    <%@include file="./common.jsp" %>
    <script language="javascript" type="text/javascript">
        $(function () {
            var url = '${url}';
            window.location.href = url;
        });
    </script>
    <title>login</title>
</head>
<body>
<h1>${msg}</h1>
<div>url:<span class="url">${url}</span></div>
</body>
</html>