import React, { useCallback, useEffect, useState } from 'react';
import { useNavigate } from 'react-router-dom';
import { Boton, FormularioUsuario, Tabla } from "../components";
import { getAllUsers, addUser, editUser, deleteUser } from '../services/User';

const users = [
    {
        id: "1",
        rut: "12.345.678-10",
        name: "mark",
        lastName: "otto",
        correo: "hyundai",
    },
    {
        id: "2",
        rut: "12.345.678-20",
        name: "Jacob",
        lastName: "Thornton",
        correo: "Chevrolet",
    },
    {
        id: "3",
        rut: "12.345.678-30",
        name: "Lang",
        lastName: "Chang",
        correo: "Toyota",
    }
]

const HomePage = () => {
    const navigate = useNavigate();
    const handleOnClick = useCallback(() => navigate("/Auto", {}, [navigate]));
    const [state, setState] = useState(users);
    const [stateEditado, setStateEditado] = useState(null);

    useEffect(() => {
        getUsers();
    }, [])

    const getUsers = async () => {
        const usuariosBD = await getAllUsers();
        setState(usuariosBD);
    }

    const userAdd = async (usuarioAgregado) => {
        //en esta linea agregamos un usuario a la bbdd
        const usuarioBD = await addUser(usuarioAgregado);
        //aqui haremos que la tabla se actualice
        getUsers();
    }

    const userEdit = async (usuarioEditado) => {
        const usuarioBD = await editUser(usuarioEditado);
        getUsers();
    }

    const userDelete = async (idUsuario) => {
        const usuarioDB = await deleteUser(idUsuario);
        getUsers();
    }

    /* const userDelete = (rutUsuario) => {
        const changeUser = state.filter((usuario) => usuario.rut !== rutUsuario);
        setState(changeUser)

    } */

    //se comenta esta funcion ya que ahora ocuparemos una que apunte a nuestras apis
    /* const userAdd = (user) => {
        const addUsuario = [
            ...state, user
        ]
        setState(addUsuario);
    } */

    /* const userEdit = (stateEditado) => {
        const editUser = state.map(state => (state.rut === stateEditado.rut ? stateEditado : state))
        setState(editUser)
    } */

    return (
        <div class="container" >
            <form>
                <div style={{ display: "grid", marginTop: "50px", width: "80%", gridGap: "50px" }}>
                    <FormularioUsuario
                        userAdd={userAdd}
                        stateEditado={stateEditado}
                        setStateEditado={setStateEditado}
                        userEdit={userEdit}
                    >
                    </FormularioUsuario>
                </div>
            </form>
            <br></br>
            <Boton
                infoBoton={"Enviar"}
                handleOnClick={handleOnClick}
            ></Boton>
            <br></br>
            <Tabla
                users={state}
                deleteUser={userDelete}
                setStateEditado={setStateEditado}
            />
        </div>
    )
}
export default HomePage