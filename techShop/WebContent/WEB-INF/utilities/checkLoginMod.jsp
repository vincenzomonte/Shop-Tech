<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="javax.servlet.*,model.*" pageEncoding="UTF-8" session="true"%>
<%!	
	String loggatoLog;
	String usernameLog; 
	String tipoLog;  
	UserBean utenteLog;
	String requestURI;
%>
<%
	synchronized(session) {
		session = request.getSession();
		
		loggatoLog=(String)session.getAttribute("moderatore-loggato");
		if(loggatoLog != null && loggatoLog.equals("s") ){
			utenteLog=(ModereatoreBean)session.getAttribute("utente");
			usernameLog=utenteLog.getUsername();
			tipoLog="Moderatore";
			//response.sendRedirect("./WEB-INF/login-result/index-moderatore.jsp");
		}
		else{
			requestURI = request.getRequestURI(); 
			if( !requestURI.equals("/techShop/index.jsp"))
				response.sendRedirect("http://localhost:8082/techShop/index.jsp");
		}
	}	
			
	%>