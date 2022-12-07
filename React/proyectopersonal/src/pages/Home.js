import React from 'react';
import { FormularioAuto, FormularioUsuario, Tabla } from "../components";

const HomePage = () => {
    return (
        <div class="container" width="80%">
            <FormularioUsuario />
            <FormularioAuto />
            <Tabla />
        </div>
    )
}
export default HomePage