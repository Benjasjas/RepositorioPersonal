import React from 'react';

const FormularioUsuario = () => {
    return (
        <div>
            <h2 class="text-center"> Formulario Usuario </h2>
            <form class="row g-3 needs-validation" novalidate>
                <div class="col-md-4">
                    <label for="validationCustom01" class="form-label">Nombre</label>
                    <input type="text" class="form-control" id="validationCustom01" />
                    <div class="valid-feedback">
                        Looks good!
                    </div>
                </div>
                <div class="col-md-4">
                    <label for="validationCustom02" class="form-label">Apellido</label>
                    <input type="text" class="form-control" id="validationCustom02" />
                    <div class="valid-feedback">
                        Looks good!
                    </div>
                </div>
                <div class="col-md-4">
                    <label for="validationCustom01" class="form-label">RUT</label>
                    <input type="text" class="form-control" id="validationCustom01" />
                    <div class="valid-feedback">
                        Looks good!
                    </div>
                </div>
                <div class="col-md-4">
                    <label for="validationCustom02" class="form-label">Correo</label>
                    <input type="text" class="form-control" id="validationCustom02" />
                    <div class="valid-feedback">
                        Looks good!
                    </div>
                </div>
            </form>
        </div>
    )
}
export default FormularioUsuario;