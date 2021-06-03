/* 
    AJAX - Asynchronous Javascript and XML 
        - don't have to wait for a request to come back

    In order to make an AJAX request:
        1. Make an XMLHttpRequest object
        2. Make the readystatechange callback function reference
        3. .open the request, providing HTTP method and url
        4. .send the request

*/

var ajaxRequest = new XMLHttpRequest();
ajaxRequest.status;

document.create

// Set a callback for ready state changing
ajaxRequest.onreadystatechange = function(){
    /*
    Four ready states
        1. Still creating
        2. Sent
        3. Server recieved request
        4. Response ready to be processed
    */

    if (this.readyState == 4) {
        // Do something in response
    }
    
}

var url = "";
ajaxRequest.open("GET", url);
ajaxRequest.send;


