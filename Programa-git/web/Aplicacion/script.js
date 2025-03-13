const palanca = document.querySelector(".switch");

palanca.addEventListener("click", () => {
    let body =document.body;
    body.classList.toggle(".modo-oscuro");
    if(body.classList.contains(".modo-oscuro")){
        localStorage.setItem("modo-oscuro", "true");
}});

function addResult(text) {
    const resultsDiv = document.getElementById("results");
    const newResult = document.createElement("p");
    newResult.textContent = text;
    resultsDiv.appendChild(newResult);
}

// Ejemplo de uso (prueba esto en la consola del navegador)
addResult("Nuevo resultado agregado...");

