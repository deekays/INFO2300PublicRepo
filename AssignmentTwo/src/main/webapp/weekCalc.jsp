<%--
  Created by IntelliJ IDEA.
  User: sdrap
  Date: 2/2/2023
  Time: 11:11 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Week Calculator</title>
</head>
<body>
    <jsp:useBean id="myBean" class="com.example.assignmenttwo.MyWeek"/>
    <jsp:setProperty name="myBean" property="name" value="Stephen"/>
    <div style="text-align: center">
        <br>
        <h2><jsp:getProperty name="myBean" property="description"/></h2>
        <br>
        There are, of course, <jsp:getProperty name="myBean" property="numberDays"/> days in the week.
        <br>
        <jsp:getProperty name="myBean" property="name"/> works on <jsp:getProperty name="myBean" property="workingDaysFormatted"/>,
        leaving <jsp:getProperty name="myBean" property="numberNotWorkingDays"/> days to enjoy other things in their life.
        <br>
        That means <jsp:getProperty name="myBean" property="name"/> is working
        <jsp:getProperty name="myBean" property="percentageWorking"/>% of the time.
        <br>
        <jsp:getProperty name="myBean" property="output"/>
    </div>
</body>
</html>
