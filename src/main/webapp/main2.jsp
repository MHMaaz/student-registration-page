<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page isELIgnored = "false" %>
    <!DOCTYPE html>
    <html>

    <head>
        <meta charset="UTF-8">
        <title>Home Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet"
            integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
    </head>

    <body>
        <h1 class="text-center">Student Registeration</h1>
        <form action="infoContainer" class="m-4">
            <input type="text" name="student_id" placeholder="Student ID Number"><br>
            <input type="text" name="student_name" placeholder="Student First Name"><br>
            <input type="text" name="student_dep" placeholder="Student Department"><br>
            <input type="text" name="student_dob" placeholder="Student Date Of Birth"><br>
            <input type="submit"><br>
            <!-- all this data, once we click submit, will go to form container. which will be handled by the controller! -->
        </form>

        <form action="getStudent">
            <input type="text" name="student_id" placeholder="Student ID Number to fetch"><br>
            <input type="submit" name="submit">
        </form>
        <form action="dropStudent">
            <input type="text" name="student_id" placeholder="Student ID Number to delete"><br>
            <input type="submit" name="submit">
        </form>
        <form action="updateStudentRecord">
            <input type="text" name="student_id" placeholder="Student ID Number to update"><br>
            <input type="submit" name="submit">
        </form>
        <div class="alert alert-success m-4" role="alert">
            Student information saved successfully!
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-FKyoEForCGlyvwx9Hj09JcYn3nv7wiPVlz7YYwJrWVcXK/BmnVDxM+D2scQbITxI"
            crossorigin="anonymous"></script>
    </body>

    </html>