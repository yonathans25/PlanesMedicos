



$(document).ready(function(){
$("#confirmar").click(function() {
  var numerodesocio = document.getElementById("numerodesocio").value;
  var plan = document.getElementById("plan").value;
  var nombreyapellido = document.getElementById("nombreyapellido").value;
  var sexo = document.getElementById("sexo").value;
  var estadocivil = document.getElementById("estadocivil").value;
  var nombreapellidoesposa = document.getElementById("nombreapellidoesposa").value;
  var hijos = document.getElementById("hijos").value;
  var dni = document.getElementById("dni").value;
  var telefono = document.getElementById("telefono").value;
  var direccion = document.getElementById("direccion").value;
 
  var i = 1; //contador para asignar id al boton que borrara la fila
  var fila = '<tr id="row' + i + '"><td>' + numerodesocio + '</td><td>' + plan + '</td><td>' + nombreyapellido + '</td><td>' + sexo + '</td><td>' + estadocivil + '</td><td>' + nombreapellidoesposa + '</td><td>' + hijos + '</td><td>' + dni + '</td><td>' + telefono + '</td><td>' + direccion + '</td><td><button type="button" name="remove" id="' + i + '" class="btn btn-danger btn_remove">Quitar</button></td></tr>'; //esto seria lo que contendria la fila

  i++;

    $("#mytable tr:first").after(fila);
    $("#adicionados").text(""); //esta instruccion limpia el div adicioandos para que no se vayan acumulando
    var nFilas = $("#mytable tr").length;
    $("#adicionados").append(nFilas - 1);
    //le resto 1 para no contar la fila del header
    document.getElementById("numerodesocio").value ="";
    document.getElementById("plan").value = "";
    document.getElementById("nombreyapellido").value = "";
    document.getElementById("sexo").value ="";
    document.getElementById("estadocivil").value = "";
    document.getElementById("nombreapellidoesposa").value = "";
    document.getElementById("hijos").value ="";
    document.getElementById("dni").value = "";
    document.getElementById("telefono").value = "";
    document.getElementById("direccion").value ="";

    document.getElementById("numerodesocio").focus();
  });
  
  $(document).on("click", ".btn_remove", function() {
  var button_id = $(this).attr("id");
    //cuando da click obtenemos el id del boton
    $("#row" + button_id + '').remove(); //borra la fila
    //limpia el para que vuelva a contar las filas de la tabla
    $("#adicionados").text("");
    var nFilas = $("#mytable tr").length;
    $("#adicionados").append(nFilas - 1);
  });
});


