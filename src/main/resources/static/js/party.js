function getSerial(var result){
	document.getElementById('bot-box-input').innerHTML="";
	var object=JSON.parse(result);
	document.getElementById('bot-box-input').innerHTML=object.serial;
}