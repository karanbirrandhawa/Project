package main

import (
	"fmt"
	"math/rand"
)

func main() {
	fmt.Println("Enter how many times to roll the dice");

	var z int;
	_, err := fmt.Scanf("%d", &z);
	if (err != nil) {
		fmt.Println(err);
	}

	r := rand.New(rand.NewSource(5));
	
	one, two, three, four, five, six := 0, 0, 0, 0, 0, 0;
	
	x := 0;
	for x < z {
		switch(r.Intn(5)) {
			case 0:
				one++;
			case 1:
				two++;
			case 2:
				three++;
			case 3:
				four++;
			case 4:
				five++;
			case 5:
				six++;
			default:
				break;
		}
		x++;
	}
	
	fmt.Println("One played: ", one, " times");
	fmt.Println("Two played: ", two, " times");
	fmt.Println("Three played: ", three, " times");
	fmt.Println("Four played: ", four, " times");
	fmt.Println("Five played: ", five, " times");
	fmt.Println("SIx played: ", six, " times");
}