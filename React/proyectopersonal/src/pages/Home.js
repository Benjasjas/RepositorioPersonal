import React from 'react';
import { FormularioAuto, FormularioUsuario, Tabla } from "../components";

const HomePage = () => {
    const users = [
        {
            id: "1",
            rut: "12.345.678-9",
            name: "mark",
            lastName: "otto",
            car: "hyundai",
        },
        {
            id: "2",
            rut: "12.345.678-9",
            name: "Jacob",
            lastName: "Thornton",
            car: "Chevrolet",
        },
        {
            id: "3",
            rut: "12.345.678-9",
            name: "Lang",
            lastName: "Chang",
            car: "Toyota",
        }
    ]

    const onSubmit = (e) => {
        e.preventDefault();
        console.log("cualquier cosa", e.target.value)
    }

    return (
        <div class="container" >
            <form>
                <div style={{ display: "grid", marginTop: "50px", width: "80%", gridGap: "50px" }}>
                    <FormularioUsuario />
                    <FormularioAuto />
                    <div style={{ display: "grid", justifyContent: "center" }}>
                        <button onClick={onSubmit} class="btn btn-primary" >Comprar</button>
                    </div>
                </div>
            </form>
            <Tabla users={users} />
        </div>
    )
}
export default HomePage