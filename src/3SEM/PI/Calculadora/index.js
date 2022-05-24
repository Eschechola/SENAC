

           

        function insert(num) {
            var numero = document.getElementById('rezutado').innerHTML;
            document.getElementById('rezutado').innerHTML = numero + num;
        }
        // Apagar tudo (C , CE)
        function clean() {
            document.getElementById('rezutado').innerHTML = "";
        }

        //Apagar apenas um digito ( < )
        function back() {
            var rezutado = document.getElementById('rezutado').innerHTML;
            document.getElementById('rezutado').innerHTML = rezutado.substring(0, rezutado.length - 1);
        }

        // Resultado ( = )
        function calcular(){

            var rezutado = document.getElementById('rezutado').innerHTML;
            if (rezutado) {
                document.getElementById('rezutado').innerHTML = calculateExpression(rezutado);
            } else {
                document.getElementById('rezutado').innerHTML = "0";
            }
        }

        function calculateExpression(expression){
            var result = 0;
            
            if(expression.includes("%")){
                var indexNumber = expression.length -2;

                var percentToCalculate = Number(expression.charAt(indexNumber)) * 0.1;

                expression = expression.substring(0, expression.length - 2);

                result = eval(expression);
                result *= percentToCalculate;

                return result;
            }

            return eval(expression);            
        }

        // Porcentagem

        function porcent() {
            debugger;
            num = document.getElementById('rezutado').innerHTML;
            
            var conta = (num) / 100;
            console.log(num)
            //var porcent = document.getElementById('rezutado').innerHTML;
            document.getElementById('rezutado').innerHTML = conta;
        }

        // Potencia 

        function Potencia(){

            var rezutado = document.getElementById('rezutado').innerHTML;

            console.log(Math.pow(7, 3));

        var base = 4;
        var expoente = 5;
        var potencia = Math.pow(4, 5);
        }

        // Arredondar

       


     
