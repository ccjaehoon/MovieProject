<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        #customers {
          font-family: Arial, Helvetica, sans-serif;
          border-collapse: collapse;
          width: 100%;
        }
        
        #customers td, #customers th {
          border: 1px solid #ddd;
          padding: 8px;
        }
        
        #customers tr:nth-child(even){background-color: #ff6565;}
        
        #customers tr:hover {background-color: #fca2a2;}
        
        #customers th {
          padding-top: 12px;
          padding-bottom: 12px;
          text-align: left;
          background-color: #04AA6D;
          color: white;
        }

        tfoot td{
            text-align: center; 
        }
        </style>
</head>
<body>
	<jsp:include page="../top_menu.jsp"></jsp:include>
    <h1>회원목록</h1>
    <hr>
    <form action="f_searchList.do">
    	<select name="searchKey">
    		<option value="id">id</option>
    		<option value="name">name</option>
    	</select>
    	<input type="text" name="searchWord" value="ad">
    	<input type="submit" value="search">
    	
    </form>
    <table id="faq">
        <thead>
            <tr>
                <th>번호</th>

            </tr>
        </thead>
        <tbody>
        	<c:forEach var="vo" items="${vos}">
            <tr>
                <td><a href="f_selectOne.do?faq_num=${vo.faq_faq_num}">${vo.faq_num}</a></td>
                
            </tr>
        	</c:forEach>
            
        </tbody>
        <tfoot>
            <tr>
                <td colspan="7">
                	<c:forEach var="i" begin="1" end="${totalPageCount}">
	                	<c:if test="${param.searchKey == null }">
		                	<a href="f_selectAll.do?cpage=${i}">${i} &nbsp;</a>
                		</c:if>
                		<c:if test="${param.searchKey != null }">
		                	<a href="f_searchList.do?searchKey=${param.searchKey}&searchWord=${param.searchWord}&cpage=${i}">${i} &nbsp;</a>
                		</c:if>
                	</c:forEach>
                </td>
            </tr>
        </tfoot>
    </table>
</body>
</html>