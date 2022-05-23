document.addEventListener("DOMContentLoaded", function (e) {
    var expression = "";
    var hasOperator = false;
    const _buttons = document.getElementsByClassName("calculator-buttons-item");
    const _screen = document.getElementById("screen");
    const _numberButtons = [ "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "comma" ];

    const calculatorButtonClick = (button) => {
        const buttonId = button.target.id;
        var buttonEvent = getCalculateEvent(buttonId);
        buttonEvent(buttonId);
    }

    for (var i = 0; i < _buttons.length; i++) {
        const button = _buttons[i];
        _buttons[i].addEventListener('click', calculatorButtonClick.bind(button), false);
    }

    const changeScreenValue = (value) => _screen.innerHTML = value;
    
    const appendScreenValue = (value) => _screen.innerHTML += value;
    
    const resetScreenValue = () => changeScreenValue("0");

    const addNumberToCalculation = (number) => {
        if(number == "comma")
            number = ".";

        if(expression == "0" || expression == "")
            changeScreenValue(number);
        else
            appendScreenValue(number);

        expression += number;
    }

    const clearScreen = () => {
        expression = "";
        resetScreenValue();
    }

    const getOperatorByid = (operatorId) => {
        switch(operatorId){
            case "sum":
                return "+";

            case "subtract":
                return "-";

            case "multiply":
                return "*";

            case "divide":
                return "/";
        }
    }

    const addOperatorToCalculation = (operatorId) => {
        const operator = getOperatorByid(operatorId);

        if(hasOperator)
            calculateExpression();
        
        hasOperator = true;
        expression += operator;
        changeScreenValue(expression);
    }

    const calculateExpression = () => {
        const expressionResult = eval(expression);
        expression = expressionResult;
        hasOperator = false;

        changeScreenValue(expression);
    }

    const erase = () =>{
        if(expression == 0)
            return;

        const expressionLen = expression.length;
        const charToRemove = expression[expressionLen - 2];
        
        if(!_numberButtons.includes(charToRemove))
            hasOperator = false;
        
        expression = expression.substring(0, expressionLen - 1);

        changeScreenValue(expression);
    }

    const calculateEquals = () => {
        calculateExpression();
        expression = "";
    }

    const getCalculateEvent = (buttonId) => {
        if(_numberButtons.includes(buttonId))
            return addNumberToCalculation;

        if(buttonId == "equals")
            return calculateEquals;

        if(buttonId == "c" || buttonId == "ce")
            return clearScreen;

        if(buttonId == "backspace")
            return erase;

        return addOperatorToCalculation;
    }
});