// Call the dataTables jQuery plugin
$(document).ready(function () {
  cargarUsuarios();
  $('#usuarios').DataTable();
});

async function cargarUsuarios() {

  const request = await fetch('usuarios', {
    method: 'GET',
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    },
  });
  const usuarios = await request.json();
  document.querySelector('#usuarios tbody').outerHTML = ""

  console.log(usuarios);

}
