<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE HTML>
<html lang="zh-CN">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<title>Gene Influence</title>
		<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">	
		<script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
		<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
		<style type="text/css">
			div>div.row.col-sm-12.text-center{
				padding: 4px;
    			background: #D7E3DC;
			}
			div>div.row.col-sm-12.text-center.btn{
				border-top: 2px solid #000;
    			border-bottom: 2px solid #000;
			}
			.btn-default {
			    background-color: rgba(0,0,0,.075);
			}
			.dropdown-menu,table{
				background-color: #d7e3dc;
			}
		</style>
	</head>
	<body>
		<div class="container">
			<div class="row col-sm-12 text-center">
				<a href="#"><img src="<%= request.getContextPath()%>/images/logo.png" alt="logo"></img></a>
			</div>
			<div class="row col-sm-12 text-center btn">
					<button id="home" onclick="window.location.href='<%=getServletContext().getContextPath() %>/';" type="button" class="btn btn-default"><strong>Home</strong></button>
					<%-- <button id="search" onclick="window.location.href='<%=getServletContext().getContextPath() %>/search.html';" type="button" class="btn btn-default"><strong>Search</strong></button> --%>
					
					<div class="btn-group" role="group">
					<button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
						<strong>Search</strong>
						<span class="caret"></span>
					</button>
					<ul class="dropdown-menu">
						<li><a href="<%=getServletContext().getContextPath() %>/searchgene.html"><strong>Gene search</strong></a></li>    <!-- S2 -->
						<li><a href="<%=getServletContext().getContextPath() %>/searchortholog.html"><strong>Ortholog search</strong></a></li>    <!-- S3 -->
					</ul>
					</div>
					
					<div class="btn-group" role="group">
					<button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
						<strong>Annotation</strong>
						<span class="caret"></span>
					</button>
					<ul class="dropdown-menu">
						<li><a href="<%=getServletContext().getContextPath() %>/s2.html"><strong>Annotation Of Zebrafish</strong></a></li>    <!-- S2 -->
						<li><a href="<%=getServletContext().getContextPath() %>/s3.html"><strong>Annotation Of Human</strong></a></li>    <!-- S3 -->
					</ul>
					</div>
					
					<button id="overlapped" onclick="window.location.href='<%=getServletContext().getContextPath() %>/s5.html';" type="button" class="btn btn-default"><strong>Overlapped</strong></button>    <!-- S5 -->
					
					<div class="btn-group" role="group">
					<button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
						<strong>Specific</strong>    <!-- S6 -->
						<span class="caret"></span>
					</button>
					<ul class="dropdown-menu">
						<li><a href="<%=getServletContext().getContextPath() %>/s6/zebrafish.html"><strong>Zebrafish</strong></a></li>
						<li><a href="<%=getServletContext().getContextPath() %>/s6/human.html"><strong>Human</strong></a></li>
						<li><a href="<%=getServletContext().getContextPath() %>/s6/chicken.html"><strong>Chicken</strong></a></li>
						<li><a href="<%=getServletContext().getContextPath() %>/s6/mouse.html"><strong>Mouse</strong></a></li>
						<li><a href="<%=getServletContext().getContextPath() %>/s6/xenopus.html"><strong>Xenopus</strong></a></li>
					</ul>
					</div>
					
					<button id="download" onclick="window.location.href='<%=getServletContext().getContextPath() %>/download.html';" type="button" class="btn btn-default"><strong>Download</strong></button>
					<button id="contact" onclick="window.location.href='<%=getServletContext().getContextPath() %>/contact.html';" type="button" class="btn btn-default"><strong>Contact</strong></button>
			</div>
			<div id="main" class="row col-sm-12" style="margin-top:20px;">
				<div class="text-center">				
					<h4><strong>Result of ${requestScope.ortholog[0]}</strong></h4>
				</div>
				<c:forEach items="${requestScope.List}" var="r" varStatus="vs">
					<div class="row">
						<table border="1" class="table table-hover text-left" width="100%" style="table-layout:fixed" >
							<tr>
								<th>ortholog</th>
								<th>Gene stable ID</th>
								<th>Gene name</th>
								<th>Homology type</th>
								<th>%id. target gene identical to query gene</th>
								<th>Hyrax orthology confidence(0=low,1=high)</th>
							</tr>
							<tr>
								<td>${requestScope.ortholog[0] }</td>
								<td>${r.getA()}</td>
								<td>${r.getB()}</td>
								<td></td>
								<td></td>
								<td></td>
							</tr>
							<tr>
								<td>${requestScope.ortholog[1] }</td>
								<td>${r.getC()}</td>
								<td>${r.getD()}</td>
								<td>${r.getE()}</td>
								<td>${r.getF()}</td>
								<td>${r.getG()}</td>
							</tr>
							<tr>
								<td>${requestScope.ortholog[2]}</td>
								<td>${r.getH()}</td>
								<td>${r.getI()}</td>
								<td>${r.getJ()}</td>
								<td>${r.getK()}</td>
								<td>${r.getL()}</td>
							</tr>
							<tr>
								<td>${requestScope.ortholog[3] }</td>
								<td>${r.getM()}</td>
								<td>${r.getN()}</td>
								<td>${r.getO()}</td>
								<td>${r.getP()}</td>
								<td>${r.getQ()}</td>
							</tr>
							<tr>
								<td>${requestScope.ortholog[4] } </td>
								<td>${r.getR()}</td>
								<td>${r.getS()}</td>
								<td>${r.getT()}</td>
								<td>${r.getU()}</td>
								<td>${r.getV()}</td>
							</tr>
						</table>
					</div>
				</c:forEach> 
			</div>
		</div>
	</body>
	<script>
		function isEmptyObject(e) {  
		    var t;  
		    for (t in e)  
		        return !1;  
		    return !0  
		} 
		var list = ${requestScope.List};
		if(isEmptyObject(list)){
			$("#main").html("<h4><strong>This gene have no orholog in other 4 species by Ensemble Compara</strong></h4>")
			$("#main").addClass("text-center");
		}
	</script>
</html>