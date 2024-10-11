<%@page import="com.anime.dao.UserDao"%>  
<jsp:useBean id="u" class="com.anime.bean.User"></jsp:useBean>  
<jsp:setProperty property="*" name="u"/>  
<%  
UserDao.delete(u);  
response.sendRedirect("viewusers.jsp");  
%>  

