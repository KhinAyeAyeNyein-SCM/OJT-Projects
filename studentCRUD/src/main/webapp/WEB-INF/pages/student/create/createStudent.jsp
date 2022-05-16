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
            <c:url var="createStudent" value="/createStudentConfirm"></c:url>
            <form:form class="form-detail" action="createStudentConfirm"
              method="POST" id="form" modelAttribute="rollBackStudentForm">
              <div class="card card-primary card-outline">
                <div class="card-body box-profile">
                  <h4 class="text-center forms-header">
                    <b>Student Create</b>
                  </h4>
                  <c:if test="${errorMsg != null }">
                    <div class="alert alert-danger">
                      <strong>${errorMsg }</strong>
                    </div>
                  </c:if>
                  <div class="form-group">
                    <label for="roll_number">Roll_Number</label>
                    <form:input path="roll_number"
                      value="${rollBackStudentForm.roll_number }"
                      class="form-control"
                      placeholder="Enter Roll_Number" />
                    <form:errors path="roll_number" class="text-danger" />
                  </div>
                  <div class="form-group">
                    <label for="name">Name</label>
                    <form:input path="name"
                      value="${rollBackStudentForm.name }"
                      class="form-control" placeholder="Enter Name" />
                    <form:errors path="name" class="text-danger" />
                  </div>
                  <div class="form-group">
                    <label for="major">Major</label>
                    <form:input path="major"
                      value="${rollBackStudentForm.major }"
                      class="form-control" placeholder="Enter Major" />
                    <form:errors path="major" class="text-danger" />
                  </div>
                  <div class="form-group">
                    <label for="year">Year</label>
                    <form:input path="year"
                      value="${rollBackStudentForm.year }"
                      class="form-control" placeholder="Enter Year" />
                    <form:errors path="year" class="text-danger" />
                  </div>
                  <div class="form-group">
                    <label for="email">Email</label>
                    <form:input path="email"
                      value="${rollBackStudentForm.email }"
                      class="form-control" placeholder="Enter Email" />
                    <form:errors path="email" class="text-danger" />
                  </div>
                  <div class="form-group">
                    <label for="dob">Date Of Birth</label>
                    <div class="input-group date datepicker"
                      data-provide="datepicker">
                      <form:input value="${rollBackStudentForm.dob }" path="dob"
                        type="text" class="form-control"
                        placeholder="Enter Date Of Birth" />
                      <div class="input-group-addon">
                        <span class="glyphicon glyphicon-th"></span>
                      </div>
                    </div>
                    <form:errors path="dob" cssClass="text-danger" />
                  </div>
                  <button type="submit" class="btn btn-info"
                    name="confirmStudent">Confirm</button>
                  <button type="reset" class="btn btn-secondary"
                    name="clear">Reset</button>
                </div>
              </div>
            </form:form>
          </div>
        </div>
      </div>
    </div>
  </section>
</div>