import React from 'react';

const FormularioAuto = () => {
    return (
        <div>
            <h2 class="text-center">Formulario Auto</h2>

            <form class="row g-3 needs-validation" novalidate>
                <div class="col-md-4">
                    <label for="validationCustom01" class="form-label">ID</label>
                    <input type="text" class="form-control" id="validationCustom01" />
                    <div class="valid-feedback">
                        Looks good!
                    </div>
                </div>
                <div class="col-md-4">
                    <label for="validationCustom01" class="form-label">Modelo</label>
                    <input type="text" class="form-control" id="validationCustom01" />
                    <div class="valid-feedback">
                        Looks good!
                    </div>
                </div>
                <div class="col-md-4">
                    <label for="validationCustom02" class="form-label">Marca</label>
                    <input type="text" class="form-control" id="validationCustom02" />
                    <div class="valid-feedback">
                        Looks good!
                    </div>
                </div>
                <div class="col-md-4">
                    <label for="validationCustom02" class="form-label">Precio</label>
                    <input type="text" class="form-control" id="validationCustom02" />
                    <div class="valid-feedback">
                        Looks good!
                    </div>
                </div>
                <div class="col-12">
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="" id="invalidCheck" required />
                        <label class="form-check-label" for="invalidCheck">
                            Estoy de acuerdo con los terminos y condiciones de esta compra
                        </label>
                        <div class="invalid-feedback">
                            You must agree before submitting.
                        </div>
                    </div>
                </div>
                <div class="col-12">
                    <button class="btn btn-primary" type="submit">Comprar</button>
                </div>
            </form>
        </div>
    )
}
export default FormularioAuto;