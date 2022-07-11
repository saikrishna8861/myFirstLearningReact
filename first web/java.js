function fn() {
    document.getElementById("fname").innerHTML = document.getElementById("Username").value;
    document.getElementById("Username").value ="";
    document.getElementById("lname").innerHTML = document.getElementById("Password").value;
    document.getElementById("Password").value ="";
}