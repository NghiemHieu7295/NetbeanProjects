jQuery(document).ready(function($){
    
    $.get("/getAuthorization", function(result, status){
        if(result.length > 0){
            window.location.href = result;
        }
    });
    
    $("#start-btn").click(function(){
        var url = $("#driveUrl").val();
        var driveUrl = {url: url};
        $.post("/processUrl", driveUrl, function(res){
            var rootFolder = {id: res};
            $.post("/getInfo", rootFolder, function(list){
                $("#permission-list").DataTable({
                    data: list
                });
            });
        });
    });
});