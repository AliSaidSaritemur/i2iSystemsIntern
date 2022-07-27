package main

import (
	"bufio"
	"fmt"
	"log"
	"os"
	"strconv"
)

func main() {

	CheckNumbers("a.txt")

}

func isPrime(num int) {

	var result bool = false
	if num < 2 {
		fmt.Println(num, "is not Prime")
		return
	}

	for i := 2; i < num; i++ {

		if num%i == 0 {
			result = true
		}
	}

	if result == true {
		fmt.Println(num, "is not Prime")

	} else {
		fmt.Println(num, "Prime")
	}
}

func CheckNumbers(location string) {

	content, err := os.Open(location)
	if err != nil {
		log.Fatal(err)
	}

	scanner := bufio.NewScanner(content)
	for scanner.Scan() {

		lineStr := scanner.Text()
		num, _ := strconv.Atoi(lineStr)
		isPrime(num)
	}
}
