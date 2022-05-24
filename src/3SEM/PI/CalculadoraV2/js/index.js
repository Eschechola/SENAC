document.addEventListener("DOMContentLoaded", function (e) {
    /* Variables */

    var expression = "";
    var hasOperator = false;
    const _buttons = document.getElementsByClassName("calculator-buttons-item");
    const _screen = document.getElementById("screen");
    const _numberButtons = [ "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "comma" ];
    const _memoryButtons = [ "mminus", "mplus", "mcr" ]

    var enableMPlus = false;
    var enableMMinus = false;

    var mplusValue = 0;
    var mminusValue = 0;

    /* */


    /* Start */

    const calculatorButtonClick = (button) => {
        const buttonId = button.target.id;
        var buttonEvent = getCalculateEvent(buttonId);
        buttonEvent(buttonId);
    }

    const memoryButtonClick = (button) => {
        const buttonId = button.target.id;

        switch(buttonId)
        {
            case "mminus":
                addMemoryMinus();
                break;
            
            case "mplus":
                addMemoryPlus();
                break;

            case "mcr":
                clearMemory();
                break;
        }
    }

    for (var i = 0; i < _buttons.length; i++) {
        const button = _buttons[i];

        if(_memoryButtons.includes(button.id))
            _buttons[i].addEventListener('click', memoryButtonClick.bind(button), false);
        else
            _buttons[i].addEventListener('click', calculatorButtonClick.bind(button), false);
    }
    
    /* */

    /* Methods */

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

    const clearScreenAndMemory = () => {
        clearMemory();
        clearScreen();
    }

    const clearMemory = () => {
        mminusValue = 0;
        mplusValue = 0;
        enableMMinus = false;
        enableMPlus = false;
    }

    const addMemoryPlus = () => {
        if(!enableMPlus)
        {
            mplusValue = expression;
            enableMPlus = true;
        }
        else
        {
            expression += mplusValue;
        }

        changeScreenValue(expression);
    }

    const addMemoryMinus = () => {
        if(!enableMMinus)
        {
            mminusValue = expression;
            enableMMinus = true;
        }
        else
        {
            expression += mminusValue;
        }

        changeScreenValue(expression);
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

            case "pot":
                return "**";

            case "raiz":
                return "√";

            case "arre":
                return "≈";

            case "mminus":
                return "mminus";

            case "mplus":
                return "mplus";

            case "percentage":
                return "%";
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
        if(expression.includes("√"))
            expression = Math.sqrt(expression.replace("√", ""));
        
        else if(expression.includes("≈"))
            expression = Math.round(expression.replace("≈", ""));

        else if(expression.includes("M-"))
            expression = expression.replace("M-", mminusValue);

        else if(expression.includes("M+"))
            expression = expression.replace("M+", mplusValue);

        else if(expression.includes("%"))
            expression = expression.split("%")[1] * (expression.split("%")[0] / 100);

        else
            expression = eval(expression);

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

        switch(buttonId)
        {
            case "equals":
                return calculateEquals;

            case "c":
                return clearScreen;

            case "ce":
                return clearScreenAndMemory;

            case "backspace":
                return erase;

            default:
                return addOperatorToCalculation;
        }
    }

    /* */
});