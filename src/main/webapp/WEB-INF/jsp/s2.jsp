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
			td {
				white-space:nowrap;
				overflow:hidden;
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
			<div id="main" class="row col-sm-12 " style="margin-top:20px;margin-bottom:20px;padding-top:15px;padding-bottom:15px;border:1px solid #d7e3dc;">
				<div class="text-center">
					<strong>Annotation Of Zebrafish</strong>				
				</div>
				<hr>
				<table class="table table-hover text-left" width="100%" style="table-layout:fixed" >
					<tr>
						<th style="text-align:center">Term</th>
						<th style="width:60px;">Count</th>
						<th style="width:150px;text-align:center">%</th>
						<th style="width:170px;">PValue</th>
						<th>Genes</th>
						<!-- <th>List Total</th>
						<th>Pop Hits</th>
						<th>Pop Total</th>
						<th>Fold Enrichment</th>
						<th>Bonferroni</th>
						<th>Benjamini</th>
						<th>Fdr</th> -->
					</tr>
					<c:forEach items="${requestScope.s2}" var="fish" varStatus="vs">  
						<tr>
							<td>${fish.getTerm()}</td>
							<td>${fish.getCount()}</td>
							<td>${fish.getPercent()}</td>
							<td>${fish.getPvalue()}</td>
							<td>${fish.getGenes()}</td>
							<%-- <td>${fish.getListtotal()}</td>
							<td>${fish.getPophits()}</td>
							<td>${fish.getPoptotal()}</td>
							<td>${fish.getFoldenrichment()}</td>
							<td>${fish.getBonferroni()}</td>
							<td>${fish.getBenjamini()}</td>
							<td>${fish.getFdr()}</td> --%>
						</tr>
					</c:forEach>
				</table>
			</div>
		</div>
	</body>
</html>