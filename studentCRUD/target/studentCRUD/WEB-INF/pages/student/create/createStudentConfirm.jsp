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
            <c:url var="createStudentConfirm" value="/insertStudent"></c:url>
            <form:form class="form-create" action="insertStudent"
              method="POST" id="form" modelAttribute="studentForm">
              <input type="hidden" name="id" value="${studentForm.id }">
              <div class="card card-primary card-outline">
                <div class="card-body box-profile">
                  <h4 class="text-center forms-header">
                    <b>Created Student Confirm</b>
                  </h4>
                  <c:if test="${errorMsg != null }">
                    <div class="alert alert-danger">
                      <strong>${errorMsg }</strong>
                    </div>
                  </c:if>
                  <ul class="list-group list-group-unbordered mb-3">
                    <li class="list-group-item"><b>Roll_Number</b>
                      <a class="float-right">${studentForm.roll_number }
                        <form:input path="roll_number" type="hidden"
                          name="roll_number"
                          value="${studentForm.roll_number }"
                          class="form-control" />
                    </a></li>
                    <li class="list-group-item"><b>Name</b> <a
                      class="float-right">${studentForm.name } <form:input
                          path="name" type="hidden" name="name"
                          value="${studentForm.name }"
                          class="form-control" /></a></li>
                    <li class="list-group-item"><b>Major</b> <a
                      class="float-right">${studentForm.major } <form:input
                          path="major" type="hidden" name="major"
                          value="${studentForm.major }"
                          class="form-control" />
                    </a></li>
                    <li class="list-group-item"><b>Year</b> <a
                      class="float-right">${studentForm.year } <form:input
                          path="year" type="hidden" name="year"
                          value="${studentForm.year }"
                          class="form-control" /></a></li>
                    <li class="list-group-item"><b>Email</b> <a
                      class="float-right">${studentForm.email } <form:input
                          path="email" type="hidden" name="email"
                          value="${studentForm.email }"
                          class="form-control" />
                    </a></li>
                    <li class="list-group-item"><b>Date Of
                        Birth</b> <a class="float-right">${studentForm.dob }
                        <form:input path="dob" type="hidden" name="dob"
                          value="${studentForm.dob }"
                          class="form-control" />
                    </a></li>
                  </ul>
                  <button type="submit" class="btn btn-info"
                    name="addStudent">Add</button>
                  <button type="submit" class="btn btn-secondary"
                    name="cancel">Cancel</button>
                </div>
              </div>
            </form:form>
          </div>
        </div>
      </div>
    </div>
  </section>
</div>