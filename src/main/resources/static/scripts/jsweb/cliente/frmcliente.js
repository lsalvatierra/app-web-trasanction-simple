$(document).on("click", "#btnagregar", function(){
    $("#txtnomempleado").val("");
    $("#txtapeempleado").val("");
    $("#modalNuevo").modal("show");
});


$(document).on("click", "#btnguardar", function(){
    $.ajax({
        type: "POST",
        url: "/Cliente/registrarcliente",
        contentType: "application/json",
        data: JSON.stringify({
            nomcliente: $("#txtnomempleado").val(),
            descdireccion: $("#txtapeempleado").val()
        }),
        success: function(resultado){
            alert(resultado.mensaje);
        }
    });
    $("#modalNuevo").modal("hide");
});
