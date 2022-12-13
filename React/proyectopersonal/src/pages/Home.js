import React, { useCallback } from 'react';
import { useNavigate } from 'react-router-dom';
import { Boton, FormularioUsuario, Tabla } from "../components";

const HomePage = () => {
    const navigate = useNavigate();
    const handleOnClick = useCallback(() => navigate("/Auto", {}, [navigate]));

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

    return (
        <div class="container" >
            <form>
                <div style={{ display: "grid", marginTop: "50px", width: "80%", gridGap: "50px" }}>
                    <FormularioUsuario></FormularioUsuario>
                </div>
            </form>
            <br></br>
            <Boton
                infoBoton={"Enviar"}
                handleOnClick={handleOnClick}
            ></Boton>
            <br></br>
            <Tabla users={users} />
        </div>
    )
}
export default HomePage