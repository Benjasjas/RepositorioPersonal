import React from "react";
import {Table} from "react-bootstrap"

const App = () => {
  return (
    <div>
      <h1>Hola mundo sureño</h1>
      <p>Esto es un parrafo, que loco no</p>
      <div>
        <h2>este es otro div</h2>
      </div>
      <div>
        <h3>y este es otro más</h3>
      </div>

      <div>
        <Table>

          <thead>
            <th>ID</th>
            <th>NOMBRE</th>
            <th>APELLIDO</th>
            <th>MAIL</th>
            <th>CONTRASEÑA</th>
          </thead>

          <body>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
          </body>

        </Table>
      </div>
    </div>
  );
};
export default App;
