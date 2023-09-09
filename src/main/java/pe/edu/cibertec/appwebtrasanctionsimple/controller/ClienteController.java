package pe.edu.cibertec.appwebtrasanctionsimple.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.appwebtrasanctionsimple.model.request.ClienteRequest;
import pe.edu.cibertec.appwebtrasanctionsimple.model.response.ResultadoResponse;
import pe.edu.cibertec.appwebtrasanctionsimple.service.ClienteService;

@Controller
@RequestMapping("/Cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/frmcliente")
    public String frmListarEmpleados(Model model){
        return "Cliente/frmcliente";
    }


    @PostMapping("/registrarcliente")
    @ResponseBody
    public ResultadoResponse registrarEmpleado(
            @RequestBody ClienteRequest objEmpleado
    ){
        String mensaje = "";
        Boolean respuesta;
            respuesta = clienteService.guardarCliente(objEmpleado);
            mensaje = respuesta ? "Cliente registrado correctamente" : "Cliente no registrado";
        return ResultadoResponse.builder().mensaje(mensaje)
                .respuesta(respuesta).build();
    }
}
