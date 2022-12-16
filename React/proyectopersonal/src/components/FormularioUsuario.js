import React, { useState, useEffect } from 'react';
import Boton from './Boton';

const initialUser = {
    name: "",
    lastName: "",
    correo: "",
    id: "",
}

const FormularioUsuario = ({ userAdd, stateEditado, setStateEditado, userEdit }) => {
    const [state, setState] = useState(initialUser);
    const { name, lastName, correo, id } = state

    //el hook use effect siempre esta pendiente de si la variable que tiene dentro de sus corchetes cambia 
    //el debera hacer todo lo que tiene en su funcion dentro
    //CONSIDERACION useEffect siempre corre al menos 1 vez cuando la pagina correoga por primera vez
    useEffect(() => {
        if (stateEditado !== null) {
            setState(stateEditado)
        } else {
            setState({
                name: "",
                lastName: "",
                correo: "",
                id: "",
            })
        }
    }, [stateEditado])

    const handleInputChange = (e) => {
        const changedFormValue = {
            ...state,
            [e.target.name]: e.target.value
        }
        setState(changedFormValue);
    }

    return (
        <div style={{ display: "grid", gridGap: "10px", justifyContent: "center" }}>
            {stateEditado !== null ? <h2 class="text-center"> Editar Usuario </h2> : <h2 class="text-center"> Formulario Usuario </h2>}
            {/* <form class="row g-3 needs-validation" novalidate> */}
            <div style={{ minWidth: "300px" }} class="col-md-4">
                <label
                    for="rut"
                    class="form-label"
                >
                    ID</label>
                <input
                    type="text"
                    class="form-control"
                    id="id"
                    name='id'
                    value={id}
                    onChange={handleInputChange}
                    disabled
                />
                <div class="valid-feedback">
                    Looks good!
                </div>
            </div>
            <div style={{ minWidth: "300px" }} class="col-md-4">
                <label
                    for="nombre"
                    class="form-label"
                >
                    Nombre</label>
                <input
                    type="text"
                    placeholder="Aquiles"
                    class="form-control"
                    id="nombre"
                    name='name'
                    value={name}
                    onChange={handleInputChange}
                />
                <div class="valid-feedback">
                    Looks good!
                </div>
            </div>
            <div style={{ minWidth: "300px" }} class="col-md-4">
                <label
                    for="apellido"
                    class="form-label"
                >
                    Apellido</label>
                <input
                    type="text"
                    placeholder="Baeza"
                    class="form-control"
                    id="apellido"
                    name='lastName'
                    value={lastName}
                    onChange={handleInputChange}
                />
                <div class="valid-feedback">
                    Looks good!
                </div>
            </div>
            <div style={{ minWidth: "300px" }} class="col-md-4">
                <label
                    for="correo"
                    class="form-label"
                >
                    Correo</label>
                <input
                    type="text"
                    placeholder="ejemplo@correo.com"
                    class="form-control"
                    id="correo"
                    name='correo'
                    value={correo}
                    onChange={handleInputChange}
                />
                <div class="valid-feedback">
                    Looks good!
                </div>
            </div>
            {/* </form> */}
            <div>
                <Boton infoBoton={"Ir a autos"}></Boton>
                <br></br>
                {stateEditado !== null ? (
                    <button
                        type="button"
                        class="btn btn-success"
                        onClick={() => userEdit(state)}
                    >
                        Editar usuario
                    </button>


                ) : (
                    <button
                        type="button"
                        class="btn btn-success"
                        onClick={() => userAdd(state)}
                    >
                        Ingresar usuario
                    </button>
                )}
                {stateEditado !== null ? (
                    <button
                        type="button"
                        class="btn btn-danger"
                        onClick={() => setStateEditado(null)}
                    >
                        Cancelar
                    </button>
                ) : (
                    <></>
                )}
            </div>
        </div>
    )
}
export default FormularioUsuario;