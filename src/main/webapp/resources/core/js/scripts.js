$(document).ready(function () {

    $(".btn-edit").click(function(e) {
        e.preventDefault();
        var id = $(this).data("ed-id");
        
        $(".win").css({"display" : "block"});
        $(".win a").attr("href","/remove/"+id);
    })
})