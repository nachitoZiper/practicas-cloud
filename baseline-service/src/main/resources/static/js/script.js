$(function () {
    $("#btnCalcular").click(function () {
        var dataJson = {
            "inversionInicial": $("#inversioninicialId").val(),
            "aportacionAnual": $("#aportacionAnualId").val(),
            "incrementoAnual": $("#incremewntoAnualId").val(),
            "anioInversion": $("#aniosInversionId").val(),
            "rendimiento": $("#rendimientoId").val()
        };
        $.ajax({
            url: "/inversion",
            contentType: 'application/json',
            data: JSON.stringify(dataJson),
            dataType: 'json',
            type: 'POST',
            success: function (response) {

                $("#divContent").css({'display': 'flex'});
                $("#ganaciaInversion").text(response.gananciaInversionF);
                $("#montoFinal").text(response.montoFinalF);
                var cont = "";
                response.resultados.forEach(function (resultado, index) {
                    cont = cont + "<tr>"
                            + "<th>" + resultado.anioF + "</th>"
                            + "<th>" + resultado.saldoInicialF + "</th>"
                            + "<th>" + resultado.aportacionF + "</th>"
                            + "<th>" + resultado.rendimientoF + "</th>"
                            + "<th>" + resultado.saldoFinalF + "</th>"
                            + "</tr>"
                });
                $("#tbodyId").html(cont);

            }
        });
    });
});