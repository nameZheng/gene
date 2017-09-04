<%-- <%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%> --%>
<!DOCTYPE HTML>
<html lang="zh-CN">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<title>Gene Influence</title>
		<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">	
		<script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
		<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
		<script src="https://unpkg.com/vue"></script> <!--  Vue.js -->
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
			#main>#title{
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
			<div id="main" class="row col-sm-12 " style="margin-top:20px;margin-bottom:20px;padding-top:15px;padding-bottom:15px;border:1px solid #d7e3dc;">
				<div id="title" class="row col-sm-12" style="margin-top:20px;margin-bottom:20px;">
					<strong>By Ensemble Gene ID</strong>
				</div>
				<div class="row col-sm-12" style="margin-top:20px;margin-bottom:20px;">
					<span>View orthologs information, by entering the gene Ensemble ID</span>
				</div>
				<div class="row col-sm-12">
					<div class="col-sm-1">
					</div>
					<div class="col-sm-3">
						<div style="margin-top:10px;margin-bottom:30px;">
							<strong>Organism</strong><br>
						</div>
						<div style="margin-top:20px;margin-bottom:6px;">
							<strong>Gene ID</strong><br>
						</div>
					</div>
					<div class="col-sm-4">
						<form id="searchform" action="<%=getServletContext().getContextPath() %>/ortholog.html">
							<select id="kind" name="kind" class="form-control">
								<option value="human" >human</option>
								<option value="mouse">mouse</option>
								<option value="chicken">chicken</option>
								<option value="xenopus">xenopus</option>
								<option value="zebrafish">zebrafish</option>										
							</select>
							<br>
							<input type="text" name="id" class="form-control" placeholder="Please input Ortholog ID">
							<br>
							<input type="submit" id="subm" class="btn btn-block" value="Search"/>
						</form>
					</div>
				</div>
			</div>
		</div>
	</body>
</html>