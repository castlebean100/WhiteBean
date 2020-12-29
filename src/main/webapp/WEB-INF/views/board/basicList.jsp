<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>

<title>Basic board page</title>
<c:import url="../template/bootstrap.jsp"></c:import>
<c:import url="../template/header.jsp"></c:import>
</head>


<body>

<c:import url="../template/sidebar.jsp"></c:import>

    <!-- Bootstrap core JavaScript-->
    <script src="<%=request.getContextPath()%>/resources/vendor/jquery/jquery.min.js"></script>
    <script src="<%=request.getContextPath()%>/resources/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

    <!-- Core plugin JavaScript-->
    <script src="<%=request.getContextPath()%>/resources/vendor/jquery-easing/jquery.easing.min.js"></script>

    <!-- Custom scripts for all pages-->
    <script src="<%=request.getContextPath()%>/resources/js/sb-admin-2.min.js"></script>

    <!-- Page level plugins -->
    <script src="<%=request.getContextPath()%>/resources/vendor/chart.js/Chart.min.js"></script>

    <!-- Page level custom scripts -->
    <script src="<%=request.getContextPath()%>/resources/js/demo/chart-area-demo.js"></script>
    <script src="<%=request.getContextPath()%>/resources/js/demo/chart-pie-demo.js"></script>

<c:import url="../template/footer.jsp"></c:import>

</body>
</html>