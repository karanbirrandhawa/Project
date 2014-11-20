/* 
 * Module for credit card validation and checking using the luhn algorithm:
 * http://en.wikipedia.org/wiki/Luhn_algorithm
 * 
 * TODO: Add getCompany check to check which company CC belongs to
 */

var CC = (function() {
	// Public method to check if the credit card is valid
	// PARAM: card [string] is the card code to decode
	var validate = function(card) {
		var cardArr = card.split('');
		// STEP 1: Drop the last digit
		var lestElem = cardArr.pop();
		// STEP 2: Reverse the digits
		cardArr.reverse();
		// STEP 3: Multiply every other digit by 2 (starting w/ first)
		for (var i = 0; i < cardArr.length; i++) {
			if (i % 2 === 0) 
				cardArr[i] = parseInt(cardArr[i])*2;
		}
		// STEP 4: Subtract the first nine digits by 9
		for (var i = 0; i < cardArr.length; i++) {
			if (parseInt(cardArr[i]) > 9)
				cardArr[i] = parseInt(cardArr[i]) - 9;
		}
		// STEP 5: Add all digits
		var sum = 0;
		for (var i = 0; i < cardArr.length; i++) {
			sum += parseInt(cardArr[i]);
		}
		// STEP 6: Validity check - does dividing by 10 give num removed at STEP 1?
		if (sum % 10 === parseInt(lestElem))
			return true;
		else 
			return false;
	};

	// Finally return an object of necessary public functions
	return {
		validate: validate
	}
}())

module.exports = CC;