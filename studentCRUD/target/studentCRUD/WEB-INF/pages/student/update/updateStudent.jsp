<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<div class="content-wrapper">
  <section class="content">
    <div class="row">
      <div class="col-12">
        <div class="forms-mr">
          <div class="col-sm-6 col-md-6 form-detail">
            <c:url var="updateStudent" value="/updateStudentConfirm"></c:url>
            <form:form class="form-create" action="updateStudentConfirm"
              method="POST" id="form" modelAttribute="student">
              <input type="hidden" name="id"
                value="${student.id }" />
              <div class="card card-primary card-outline">
                <div class="card-body box-profile">
                  <h4 class="text-center forms-header">
                    <b>Student Edition</b>
                  </h4>
                  <c:if test="${errorMsg != null }">
                    <div class="alert alert-danger">
                      <strong>${errorMsg }</strong>
                    </div>
                  </c:if>
                  <div class="form-group">
                    <label for="roll_number">Roll_Number</label> <input
                      class="form-control" type="text"
                      name="roll_number"
                      value="${student.roll_number }" />
                    <form:errors path="roll_number" class="text-danger" />
                  </div>
                  <div class="form-group">
                    <label for="name">Name</label> <input
                      class="form-control" name="name"
                      value="${student.name }">
                    <form:errors path="name" class="text-danger" />
                  </div>
                  <div class="form-group">
                    <label for="major">Major</label> <input
                      class="form-control" name="major"
                      value="${student.major }" />
                    <form:errors path="major" class="text-danger" />
                  </div>
                  <div class="form-group">
                    <label for="year">Year</label> <input
                      class="form-control" name="year"
                      value="${student.year }"
                      class="form-control" />
                    <form:errors path="year" class="text-danger" />
                  </div>
                  <div class="form-group">
                    <label for="email">Email</label> <input
                      class="form-control" name="email"
                      value="${student.email }" />
                    <form:errors path="email" class="text-danger" />
                  </div>
                  <div class="form-group">
                    <label for="dob">Date Of Birth</label>
                    <div class="input-group date datepicker"
                      data-provide="datepicker">
                      <input class="form-control" name="dob"
                        value="${student.dob }"
                        placeholder="Enter Date Of Birth">
                      <div class="input-group-addon">
                        <span class="glyphicon glyphicon-th"></span>
                      </div>
                    </div>
                    <form:errors path="dob" class="text-danger" />
                  </div>
                  <button type="submit" class="btn btn-info">Update</button>
                  <a class="btn btn-secondary" href="${pageContext.request.contextPath}/studentList">Back</a>
                  <button type="reset" class="btn .btn-success">Reset</button>
                </div>
              </div>
            </form:form>
          </div>
        </div>
      </div>
    </div>
  </section>
</div>