import React from 'react';
import Boton from './Boton';

const FormularioUsuario = () => {
    return (
        <div style={{ display: "grid", gridGap: "10px", justifyContent: "center" }}>
            <h2 class="text-center"> Formulario Usuario </h2>
            {/* <form class="row g-3 needs-validation" novalidate> */}
            <div style={{ minWidth: "300px" }} class="col-md-4">
                <label for="nombre" class="form-label">Nombre</label>
                <input type="text" placeholder="Juan" class="form-control" id="nombre" />
                <div class="valid-feedback">
                    Looks good!
                </div>
            </div>
            <div style={{ minWidth: "300px" }} class="col-md-4">
                <label for="apellido" class="form-label">Apellido</label>
                <input type="text" placeholder="Perez" class="form-control" id="apellido" />
                <div class="valid-feedback">
                    Looks good!
                </div>
            </div>
            <div style={{ minWidth: "300px" }} class="col-md-4">
                <label for="rut" class="form-label">RUT</label>
                <input type="text" placeholder="12.345.678-9" class="form-control" id="rut" />
                <div class="valid-feedback">
                    Looks good!
                </div>
            </div>
            <div style={{ minWidth: "300px" }} class="col-md-4">
                <label for="correo" class="form-label">Correo</label>
                <input type="text" placeholder="correo@ejemplo.com" class="form-control" id="correo" />
                <div class="valid-feedback">
                    Looks good!
                </div>
            </div>
            {/* </form> */}
            <Boton infoBoton={"Agregar Usuario"}></Boton>
        </div>
    )
}
export default FormularioUsuario;