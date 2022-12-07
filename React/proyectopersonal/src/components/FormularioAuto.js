import React from 'react';

const FormularioAuto = () => {
    return (
        <div style={{ display: "grid", gridGap: "10px", justifyContent: "center" }}>
            <h2 class="text-center">Formulario Auto</h2>
            {/* <form class="row g-3 needs-validation" novalidate> */}
            {/* <div class="col-md-4">
                <label for="idAuto" class="form-label">ID</label>
                <input type="text" class="form-control" id="idAuto" />
                <div class="valid-feedback">
                    Looks good!
                </div>
            </div> */}
            <div style={{ minWidth: "300px" }} class="col-md-4">
                <label for="modelo" class="form-label">Modelo</label>
                <input type="text" class="form-control" id="modelo" />
                <div class="valid-feedback">
                    Looks good!
                </div>
            </div>
            <div style={{ minWidth: "300px" }} class="col-md-4">
                <label for="marca" class="form-label">Marca</label>
                <input type="text" class="form-control" id="marca" />
                <div class="valid-feedback">
                    Looks good!
                </div>
            </div>
            <div style={{ minWidth: "300px" }} class="col-md-4">
                <label for="precio" class="form-label">Precio</label>
                <input type="text" class="form-control" id="precio" />
                <div class="valid-feedback">
                    Looks good!
                </div>
            </div>
            <div style={{ maxWidth: "300px" }} class="col-12">
                <div class="form-check">
                    <input class="form-check-input" type="checkbox" value="" id="invalidCheck" required />
                    <p class="form-check-label" for="invalidCheck">
                        Estoy de acuerdo con los terminos y condiciones
                        de esta compra
                    </p>
                    <div class="invalid-feedback">
                        You must agree before submitting.
                    </div>
                </div>
            </div>
            {/* </form> */}
        </div>
    )
}
export default FormularioAuto;