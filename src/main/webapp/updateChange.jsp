<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ page isELIgnored="false" %>
        <!DOCTYPE html>
        <html>

        <head>
            <meta charset="UTF-8">
            <title>Home Page</title>
            <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet"
                integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB"
                crossorigin="anonymous">
        </head>

        <body>
            <div class="alert alert-success m-4" role="alert">
                Student information updated successfully!
            </div>
            <h1 class="text-center">Update Changes</h1>
            <p>Student with ID: ${id} got updated</p>
            <hr>
            <p>Before Update name: ${old_st.student_name}</p>
            <p>Before Update Faculty: ${old_st.student_dep}</p>
            <p>Updated Name: ${st.student_name}</p>
            <p>Updated Faculty: ${st.student_dep}</p>

            <p>Complete record shown: </p>
            <p>${st}</p>

            <a href="./main.jsp" class="btn btn-info" role="button">Go back to Panel</a>

            <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js"
                integrity="sha384-FKyoEForCGlyvwx9Hj09JcYn3nv7wiPVlz7YYwJrWVcXK/BmnVDxM+D2scQbITxI"
                crossorigin="anonymous"></script>
        </body>

        </html>