package main

import (
	"bufio"
	"fmt"
	"log"
	"os"
	"strconv"
)

func main() {

	CheckNumbersFromA()

}

func isPrime(num int) {

	var result bool = false
	if num < 1 {
		fmt.Println("is not Prime")
		return
	}
	for i := 2; i < num; i++ {

		if num%i == 0 {
			result = true
		}
	}

	if result == true {
		fmt.Println("is not Prime")

	} else {
		fmt.Println("Prime")
	}
}

func CheckNumbersFromA() {

	var count int = 0
	content, err := os.Open("a.txt")
	if err != nil {
		log.Fatal(err)
	}
	fmt.Println("is not Prime")
	scanner := bufio.NewScanner(content)
	for scanner.Scan() {
		count = count + 1
		lineStr := scanner.Text()
		num, _ := strconv.Atoi(lineStr)
		isPrime(num)
	}

}
