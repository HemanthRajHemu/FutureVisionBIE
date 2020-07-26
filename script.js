var myVar;

function myFunction1() {
 myVar = setTimeout(showPage, 300);
}

function showPage() {
  document.getElementById("loader").style.display = "none";
  document.getElementById("myDiv").style.display = "block";
  document.getElementById("NOTEID3").innerHTML = "WAS THE CONTENT USEFUL, FOLLOW US ON INSTAGRAM @FUTUREVISIONBIE , DM & Let us Know your Experience";
  
  //Get the button
var mybuttonVARTOP = document.getElementById("myBtnTOP");

// When the user scrolls down 20px from the top of the document, show the button
window.onscroll = function() {scrollFunction()};

function scrollFunction() {
  if (document.body.scrollTop > 25 || document.documentElement.scrollTop > 25) {
    mybuttonVARTOP.style.display = "block";
  } else {
    mybuttonVARTOP.style.display = "none";
  }
}

}
function showPage1() {
  document.getElementById("main").style.display = "block";
  document.getElementById("NOTEID3").innerHTML = "WAS THE CONTENT USEFUL, FOLLOW US ON INSTAGRAM @FUTUREVISIONBIE , DM & Let us Know your Experience";
  
  //Get the button
var mybuttonVARTOP = document.getElementById("myBtnTOP");

// When the user scrolls down 20px from the top of the document, show the button
window.onscroll = function() {scrollFunction()};

function scrollFunction() {
  if (document.body.scrollTop > 25 || document.documentElement.scrollTop > 25) {
    mybuttonVARTOP.style.display = "block";
  } else {
    mybuttonVARTOP.style.display = "none";
  }
}

}
// When the user clicks on the button, scroll to the top of the document
function topFunction() {
  document.body.scrollTop = 0;
  document.documentElement.scrollTop = 0;
}

function openNav() {
  document.getElementById("mySidebar").style.width = "260px";
  document.getElementById("main").style.marginLeft = "260px";
}

function closeNav() {
  document.getElementById("mySidebar").style.width = "0";
  document.getElementById("main").style.marginLeft= "0";
}

function show(id)
{
	var show = document.getElementById(id);
	var x1 = document.getElementById("ANScript1");
	var x2 = document.getElementById("ANScript2");
	var x3 = document.getElementById("ANScript3");
	var x4 = document.getElementById("ANScript4");
	var x5 = document.getElementById("ANScript5");
	
	x1.style.display = "none";
	x2.style.display = "none";
	x3.style.display = "none";
	x4.style.display = "none";
	x5.style.display = "none";
	if (show.style.display === "none") {
    show.style.display = "block";	
	} 
}

document.oncontextmenu = new Function("return false;");
//DONE TILL HERE
function WhatsappShare() {
    var url = window.location.href;
    var api = "https://api.whatsapp.com/send?text=Hi,%20Buddy%20I%20found%20this%20Usefull%20Website%20named%20Future%20Vision%20BIE,%20One%20Stop%20Study%20Repository%20for%20VTU%20Students%0D%0ALink:"
    var both = api + url;
    //console.log(both);
    window.open(both, "_blank", "toolbar=yes,scrollbars=yes,resizable=yes,top=500,left=500,width=400,height=400");
}


