var currentPokemon;

function searchForPokemon() {
    let searchText = document.getElementById("pokemon_search").value;
    let url = `https://pokeapi.co/api/v2/pokemon/${searchText}`;

    let request = new XMLHttpRequest();
    request.onreadystatechange = function() {
        if (this.readyState == 4) {
            currentPokemon = JSON.parse(this.response);
            document.querySelector("#pokemon_image").src = currentPokemon.sprites.front_shiny;
        }
    }

    request.open("GET", url);
    request.send();
} 

function searchForPokemonAlternate() {
    let searchText = document.getElementById("pokemon_search").value;
    let url = `https://pokeapi.co/api/v2/pokemon/${searchText}`;

    fetch({
        url: url,
        method: "GET"
    }).then( (response) => {
        currentPokemon = JSON.parse(response.body);
        document.querySelector("#pokemon_image").src = currentPokemon.sprites.front_shiny;
    });
}