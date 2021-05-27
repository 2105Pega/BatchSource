var request = new XMLHttpRequest();

request.onreadystatechange = function(){
    
    if (this.readyState == 4) {
        var pokemon = JSON.parse(this.response);
        console.log(pokemon);
    }
}
var url = "https://pokeapi.co/api/v2/pokemon/ditto";
request.open("GET", url);
request.send();