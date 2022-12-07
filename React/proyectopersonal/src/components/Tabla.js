import React from 'react';
import Boton from './Boton';

const Table = ({ users }) => {

    return (
        <div>
            <table class="table">
                <thead>
                    <tr>
                        <th scope="col">ID</th>
                        <th scope="col">RUT</th>
                        <th scope="col">Nombre </th>
                        <th scope="col">Apellido</th>
                        <th scope="col">Auto</th>
                        <th scope="col">Boton</th>
                    </tr>
                </thead>
                <tbody>
                    {users.map(user =>
                    (<tr>
                        <th scope="row">{user.id}</th>
                        <td>{user.rut}</td>
                        <td>{user.name}</td>
                        <td>{user.lastName}</td>
                        <td>{user.car}</td>
                        <td><Boton /></td>
                    </tr>))}

                    {/*                     <tr>
                        <th scope="row">Mark</th>
                        <td>Mark</td>
                        <td>Otto</td>
                        <td><Boton /></td>
                    </tr>
                    <tr>
                        <th scope="row">2</th>
                        <td>Jacob</td>
                        <td>Thornton</td>
                        <td><Boton /></td>
                    </tr>
                    <tr>
                        <th scope="row">3</th>
                        <td colspan="2">Larry the Bird</td>
                        <td><Boton /></td>
                    </tr> */}
                </tbody>
            </table>
        </div>
    )
}
export default Table;