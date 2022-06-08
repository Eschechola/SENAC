const MAX_RANGE = 5;
const MIN_RANGE = 0;

const number = Math.floor(Math.random() * (MAX_RANGE - MIN_RANGE)) + MIN_RANGE;
console.log(number);
var attempts = 0;

function tentarAdvinhar(){
    const numberAttempt = document.getElementById("number").value;
    attempts++;

    if(numberAttempt != number)
    {
        alert("Errou! Tente outro número.");
        return;
    }
    
    alert("Voce acertou! O número era: " + number + "\n" + "Foram necessárias " + attempts + " tentativa(s)");
    alert("Pressione OK para jogar novamente!");
    location.reload();
    
}


const button = document.getElementById("button");
button.addEventListener("click", tentarAdvinhar);