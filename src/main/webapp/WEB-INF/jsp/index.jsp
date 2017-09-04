<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
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
			.dropdown-menu,div.col-sm-6.text-left{
				background-color: #d7e3dc;
			}
			p{ text-indent:2em;}
			a:hover{
				text-decoration: none;
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
			<div id="main" class="row col-sm-12 " style="margin-top:20px;margin-bottom:20px;padding-top:15px;padding-bottom:15px;border:1px solid #d7e3dc;">
				
				<div class="col-sm-6 text-left">
					<p><font size="4">Glucose plays a key role as energy source in the majority of mammals, but its importance in fish appears limited that so far seemed to belong to diabetic humans only. Several laboratories worldwide make important efforts in order to better understand this strange phenotype observed in fish. However, the mechanism of carbohydrate/glucose metabolism is astonishingly complex. It’s largely unchartered territory about why basal glycaemia is different between fish and mammals and how carbohydrate metabolism is differentially amongst organisms?
	This is the first systematic genomic insight into carbohydrate/glucose metabolism. After exhaustively analysis, we found most metabolic genes are conserved in vertebrate. It may resolve some of complexities of carbohy-drate/glucose metabolic heterogeneous amongst different vertebrates, and provide reference for the treatment of diabetes and aquaculture industry.
					</font></p>
				</div>
				<div class="col-xs-6">
					<a href="#" class="thumbnail">
				    	<img alt="home picturce" src="<%= request.getContextPath()%>/images/home.jpg">
					</a>
				</div>
			</div>
			<div class="row col-sm-12 text-center" style="padding-top:15px;padding-bottom:15px;margin-bottom:15px;">
				<strong>Linkout:</strong>&nbsp;&nbsp;<a href="http://www.genome.ad.jp/kegg/pathway.html">KEGG pathway database</a> &nbsp;&nbsp;   <a href="http://www.ensembl.org/biomart/martview/f3d11f86a611b159f7e9efebcffc9f6b">Ensemble Biomart</a>
			</div>
		</div>
	</body>
</html>