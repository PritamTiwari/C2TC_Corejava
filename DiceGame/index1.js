var randomNum1 =Math.floor(Math.random() * 6) + 1;

var randomImage1 ="images/dice" + randomNum1 + ".png";

var image1 =document.querySelectorAll("img") [0];
image1.setAttribute("src",randomImage1);



//Player 2

var randomNum2 =Math.floor(Math.random() * 6) + 1;
var randomImage2="images/dice" + randomNum2 + ".png";

var image2 =document.querySelectorAll("img") [1];
image2.setAttribute("src",randomImage2);





//CONDITIONS TO DECIDE THE WINNER

if (randomNum1 > randomNum2) 
{
   document.querySelector("h1").innerHTML ="Player 1 Wins !"
}
else if (randomNum2 > randomNum1) {
   document.querySelector("h1").innerHTML ="Player 2 Wins !"
}
else{
   document.querySelector("h1").innerHTML ="DRAWS !"
}
