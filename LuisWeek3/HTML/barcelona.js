function pop(event){
    const element= event.currentTarget;
    element.style.backgroundColor="#A50044";
    
}
function unPop(event){
    const element = event.currentTarget;
    element.style.backgroundColor = "#004D98";
}
function grow(event){
    const parent= event.currentTarget;
    const element= parent.firstElementChild;

    const newElement = document.createElement('h1');

 
    newElement.innerHTML = element.innerHTML;

    parent.replaceChild(newElement, element);
}
function shrink(event){
    const parent= event.currentTarget;
    const element= parent.firstElementChild;
    const newElement = document.createElement('h2');

 
    newElement.innerHTML = element.innerHTML;

    parent.replaceChild(newElement, element);
}

window.onload=function(){
    
    const divs = this.document.getElementsByTagName("div");
    for (let i = 0; i< divs.length; i++) {
        divs[i].addEventListener("mouseover", pop , false);
        divs[i].addEventListener("mouseover", grow , false);
       
        divs[i].addEventListener("mouseleave", shrink , false);
        divs[i].addEventListener("mouseleave", unPop , false);
    }
}