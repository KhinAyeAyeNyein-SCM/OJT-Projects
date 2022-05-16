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
            <c:url var="updateStudentConfirm" value="/editStudent"></c:url>
            <form:form class="form-create" action="editStudent"
              method="POST" id="form" modelAttribute="updateStudentForm">
              <input type="hidden" name="id"
                value="${updateStudentForm.id }" />
              <div class="card card-primary card-outline">
                <div class="card-body box-profile">
                  <h4 class="text-center forms-header">
                    <b>Edited Student Confirm</b>
                  </h4>
                  <c:if test="${errorMsg != null }">
                    <div class="alert alert-danger">
                      <strong>${errorMsg }</strong>
                    </div>
                  </c:if>
                  <ul class="list-group list-group-unbordered mb-3">
                    <li class="list-group-item"><b>Roll_Number</b>
                      <a class="float-right">${updateStudentForm.roll_number }
                        <input type="hidden" name="roll_number"
                        value="${updateStudentForm.roll_number }"
                        class="form-control" />
                    </a></li>
                    <li class="list-group-item"><b>Name</b> <a
                      class="float-right">${updateStudentForm.name }
                        <input type="hidden" name="name"
                        value="${updateStudentForm.name }"
                        class="form-control" />
                    </a></li>
                    <li class="list-group-item"><b>Major</b> <a
                      class="float-right">${updateStudentForm.major }
                        <input type="hidden" name="major"
                        value="${updateStudentForm.major }"
                        class="form-control" />
                    </a></li>
                    <li class="list-group-item"><b>Year</b> <a
                      class="float-right">${updateStudentForm.year }
                        <input type="hidden" name="year"
                        value="${updateStudentForm.year }"
                        class="form-control" />
                    </a></li>
                    <li class="list-group-item"><b>Email</b> <a
                      class="float-right">${updateStudentForm.email }
                        <input type="hidden" name="email"
                        value="${updateStudentForm.email }"
                        class="form-control" />
                    </a></li>
                    <li class="list-group-item"><b>Date Of
                        Birth</b> <a class="float-right">${updateStudentForm.dob }
                        <input type="hidden" name="dob"
                        value="${updateStudentForm.dob }"
                        class="form-control" />
                    </a></li>
                  </ul>
                  <button type="submit" class="btn btn-info"
                    name="update">Update</button>
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