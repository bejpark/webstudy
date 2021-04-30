/* //event 객체
var el = document.querySelector(".outside"); 
el.addEventListener("click", function(evt) {
    var target = evt.target;
    console.log(target.className, target.nodeName);
    console.log(target.innerText);
    debugger;
});
*/
//Ajex 통신 (비동기 통신, 새로고침 없이 데이터를 받는 것)
var oReq = new XMLHttpRequest();
oReq.addEventListener("load", function() {
    console.log(this.responseText);
});

oReq.open("GET", "./json.txt");
oReq.send();