/*
    AJAX = Asynchronous JavaScript And XML
    In order to make an AJAX request: 
      1. Make an XMLHttpRequest object 
      2. Set the onreadystatechange callback function reference
      3. .open() the request, providing HTTP method and URL
      4. .send() the request
*/

var ajaxRequest = new XMLHttpRequest();

// We set a callback, or function that runs in response, for the ready state changing
ajaxRequest.onreadystatechange = function() {
    /*
        1 = Still creating
        2 = Sent
        3 = Server Received Request
        4 = Response ready to be processed (by us)
    */

    if (this.readyState == 4) {
        // Do something in response
    }
}

var url = "";
ajaxRequest.open("GET", url);
ajaxRequest.send();