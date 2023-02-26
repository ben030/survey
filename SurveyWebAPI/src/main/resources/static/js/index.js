function submitVoting(){
    $("#vote").submit(function (event) {
        // Stop form from submitting normally
        event.preventDefault();

        // Get some values from elements on the page:
        var $form = $(this),
            vote = $("input[name='customRadio']:checked").val();
        const paramsObject = {
            id: vote
        };
            const target = new URL('/vote', window.location.href);
            target.search = new URLSearchParams(paramsObject).toString();

        // Send the data using post
        var posting = $.post(target, {id: vote});
        // Put the results in a div
    });
}


setInterval(function(){
    const target = new URL('/interimresult/', window.location.href);
    $.get(target, function(data, status){
        let output = '';

        for(let i = 0; i < data.length; i++) {
            let obj = data[i];
            output += '<tr>' +
                '<th scope="row">' + obj.id + '</th>' +
                '<td>' + obj.language + '</td>' +
                '<td>' + obj.counter + '</td>' +
                '</tr>';

            console.log(obj.id);
        }
        $('#results').html(output);
    });
}, 2000);

$(document).ready(function() {
    submitVoting();
});