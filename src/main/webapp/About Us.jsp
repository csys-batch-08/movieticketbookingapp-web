<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>


<style>
.about-section{
    background: url(pic.jpg) no-repeat left;
    background-size: 55%;
  
    overflow: hidden;
    height: 90%;
    padding: 20px 0;
    
}
 
.inner-container{
    margin-left:900px;
    width: 55%;
    float: right;
    background-color: #fdfdfd;
    padding: 40px;
    box-shadow: rgba(14, 30, 37, 0.12) 0px 2px 4px 0px, rgba(14, 30, 37, 0.32) 0px 2px 16px 0px;
 
}
.inner-container h1{
    margin-bottom: 10px;
    font-size: 30px;
    font-weight: 900;
}
 
.text{
    font-size: 13px;
    color: #545454;
    line-height: 30px;
    text-align: justify;
    margin-bottom: 10px;
    
}

h1{
    
    color: #F85370;
}
 
.skills{
    display: flex;
    justify-content: space-between;
    font-weight: 700;
    font-size: 13px;
}
 
@media screen and (max-width:1200px){
    .inner-container{
        padding: 80px;
    }
}
 
@media screen and (max-width:1000px){
    .about-section{
        background-size: 100%;
        padding: 100px 40px;
    }
    .inner-container{
        width: 100%;
    }
}
 
@media screen and (max-width:600px){
    .about-section{
        padding: 0;
    }
    .inner-container{
        padding: 60px;
    }
}
span{
  cursor: pointer;
  font-size: 16px;
  text-align: center;
  padding: 10px;
  width: 500px;
}
span:hover{
background-image: linear-gradient(to right top, #f85370, #f35470, #ee5570, #e8556f, #e3566f);
color: #fff;
border-radius: 20px;
transition: 0.5s;
 
}
.active{
  background-image: linear-gradient(to right top, #f85370, #f35470, #ee5570, #e8556f, #e3566f);
  color: #fff;
  border-radius: 20px;
 
 
}



 body {
  background-image: url('Rohini Sliver Screen.jpg');
  background-repeat: no-repeat;
  background-size:cover;
}

.class{
margin-left:80px;
margin-top:15px;

}


</style>
</head>
<body>


<body>

    <div class="class">
   
   <button type="submit" ><a href="Show.jsp" class="btn btn-primary">Back</a></button>  
   
    </div>
  


    <div class="about-section">
        <div class="inner-container">
            <h1>About Us</h1>
            <p class="text">
               Cinema is equipped with comfortable push backed enabled Seating and fully air conditioned. The theatre has ample car and two-wheeler Parking and the canteen caters fresh and quality food items. A cinema hall provides redefining movie going experience. Be spoilt for choice! We, offers a wide selection of short eats and beverages that are not only scrumptious but also stored and served under safe and hygienic conditions. The menu selection offers a range of irresistible combos too. The menu undergoes regular revisions to surprise your taste buds. We have also revamped our canteen facilities to deliver quick service and our courteous staff will ensure that you enjoy the services all times.
            </p>
            <div class="skills">
                <span class="active">Manage Shows</span>
                <span>Managae Customer</span>
                <span>Manage Bookings</span>
            </div>
        </div>
    </div>
</body>
</html>