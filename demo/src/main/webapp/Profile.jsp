<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Profile</title>

<style>
    body {
        margin: 0;
        padding: 0;
        font-family: Arial, Helvetica, sans-serif;
        background-color: #f4f6f9;
    }

    .profile-container {
        width: 450px;
        margin: 50px auto;
        background-color: #ffffff;
        padding: 25px 30px;
        border-radius: 8px;
        box-shadow: 0 4px 10px rgba(0,0,0,0.1);
    }

    h2 {
        text-align: center;
        color: #2c3e50;
        margin-bottom: 15px;
    }

    hr {
        border: 1px solid #e0e0e0;
        margin-bottom: 20px;
    }

    .field {
        margin-bottom: 12px;
        color: #34495e;
        font-size: 15px;
    }

    .field span {
        font-weight: bold;
        color: #2c3e50;
    }

    .btn-container {
        text-align: center;
        margin-top: 25px;
    }

    .btn {
        padding: 10px 18px;
        margin: 5px;
        border: none;
        border-radius: 5px;
        font-size: 14px;
        cursor: pointer;
    }

    .update-btn {
        background-color: #3498db;
        color: white;
    }

    .update-btn:hover {
        background-color: #2980b9;
    }

    .logout-btn {
        background-color: #e74c3c;
        color: white;
    }

    .logout-btn:hover {
        background-color: #c0392b;
    }
</style>

</head>
<body>

<div class="profile-container">
    <h2>Student Information</h2>
    <hr>

    <div class="field"><span>Student ID:</span> ${Studid}</div>
    <div class="field"><span>Student Name:</span> ${Studname}</div>
    <div class="field"><span>Student Email:</span> ${Studemail}</div>
    <div class="field"><span>Student Gender:</span> ${Studgender}</div>
    <div class="field"><span>Date of Birth:</span> ${Stud_DOB}</div>
    <div class="field"><span>Course Name:</span> ${course}</div>
    <div class="field"><span>Address:</span> ${StudAdd}</div>

    <div class="btn-container">
        <form action="UpdateProfile.jsp" method="get" style="display:inline;">
            <button class="btn update-btn">Update</button>
        </form>

        <form action="Home.html" method="post" style="display:inline;">
            <button class="btn logout-btn">Logout</button>
        </form>
    </div>
</div>

</body>
</html>
