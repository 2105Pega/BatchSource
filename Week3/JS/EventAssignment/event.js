function titanClick(event){
    element = event.currentTarget;
    element.style.backgroundColor = "purple";
    window.open("https://www.bungie.net/en/Gear/1/4611686018430321280/2305843009262223379", "_blank")
}

function warlock(event){
    element = event.currentTarget;
    element.style.color = "cyan";
    window.open("https://www.bungie.net/en/Gear/1/4611686018430321280/2305843009262223381", "_blank")
}

function hunter(event){
    element = event.currentTarget;
    element.style.color = "orange";
    window.open("https://www.bungie.net/en/Gear/1/4611686018430321280/2305843009349524009", "_blank");
}

function purpify(event){
    element = event.currentTarget;
    element.style.backgroundColor = "purple";
    element.style.color = "plum";
}

function surprise(event) {
    element = event.currentTarget;
    element.src = "file:///C:/Users/Kyle/Pictures/Saved Pictures/graphic_desing.png"
}

function rolled(event) {
    window.open("https://www.youtube.com/watch?v=dQw4w9WgXcQ", "_blank");
}



this.document.getElementById("warlock").addEventListener("click",warlock,false);

this.document.getElementById("hunter").addEventListener("click",hunter,false);

this.document.getElementById("titan").addEventListener("click",titanClick,false);

this.document.getElementById("bio").addEventListener("mouseover",purpify,false);

this.document.getElementById("pic").addEventListener("mouseover",surprise,false);

this.document.getElementById("submit").addEventListener("click",rolled,false);







