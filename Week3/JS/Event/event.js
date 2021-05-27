function pow(event) {
    element = event.currentTarget;
    element.style.backgroundColor = "green";
    alert(element.id);
}

// anonymous function - no way to call again or in another function
window.onload = function() {
    this.document.getElementById("A").addEventListener("click", pow, true);
    this.document.getElementById("B").addEventListener("click", pow, true);
    this.document.getElementById("C").addEventListener("click", pow, true);
    this.document.getElementById("D").addEventListener("click", pow, true);
}