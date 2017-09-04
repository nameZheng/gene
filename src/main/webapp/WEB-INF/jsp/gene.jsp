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
			.dropdown-menu{
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
						<p class="caret"></p>
					</button>
					<ul class="dropdown-menu">
						<li><a href="<%=getServletContext().getContextPath() %>/searchgene.html"><strong>Gene search</strong></a></li>    <!-- S2 -->
						<li><a href="<%=getServletContext().getContextPath() %>/searchortholog.html"><strong>Ortholog search</strong></a></li>    <!-- S3 -->
					</ul>
					</div>
					
					<div class="btn-group" role="group">
					<button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
						<strong>Annotation</strong>
						<p class="caret"></p>
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
						<p class="caret"></p>
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
			<div id="main" class="row col-sm-12 " style="margin-top:20px;">
				<div class="text-center">				
						<h4><strong>Result of ${requestScope.kind}</strong></h4>
					</div>
				<c:forEach items="${requestScope.list}" var="r" varStatus="vs">
					<div class="row">
						<div class="col-sm-12">
							<table border="1" class="table table-hover text-left" width="100%" style="table-layout:fixed" >
								<tr>
									<td>Ensembl Gene ID:</td>
									<td>${r.getEnsemblgeneid()}</td>
								</tr>
								<tr>
									<td>Gene name:</td>
									<td>${r.getGenename()}</td>
								</tr>
								<tr>
									<td>Transcript stable ID:</td>
									<td>${r.getTranscriptstableid()}</td>
								</tr>
								<tr>
									<td>Protein stable ID:</td>
									<td>${r.getProteinstableid()}</td>
								</tr>
								<tr>
									<td>Transcript name:</td>
									<td>${r.getTranscriptname()}</td>
								</tr>
								<tr>
									<td>Transcript count:</td>
									<td>${r.getTranscriptcount()}</td>
								</tr>
								<tr>
									<td>Transcript type:</td>
									<td>${r.getTranscripttype()}</td>
								</tr>
								<tr>
									<td>Gene description:</td>
									<td>${r.getDescription()}</td>
								</tr>
							</table>
							<hr>
						</div>
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
		var list = ${requestScope.list};
		if(isEmptyObject(list)){
			$("#main").html("<h4><strong>This gene don't have annotation in Ensemble</strong></h4>")
			$("#main").addClass("text-center");
		}
	</script>
</html>