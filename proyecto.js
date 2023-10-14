// Obtén el enlace y el contenido que quieres mostrar
const enlace = document.getElementById('mostrarContenido');
const contenido = document.getElementById('contenido');

// Agrega un evento de clic al enlace
enlace.addEventListener('click', function() {
    // Muestra u oculta el contenido al hacer clic
    if (contenido.style.display === 'none') {
        contenido.style.display = 'block';
    } else {
        contenido.style.display = 'none';
    }
});
