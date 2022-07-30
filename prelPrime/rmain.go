package main

import (
	"bufio"
	"fmt"
	"log"
	"os"
	"strconv"
)

var strNums string

func main() {

	CheckNumbers("a.txt")
	writesNumberstoFile("results.txt")
}

func isPrime(num int, numStr string) {

	var result bool = false
	if num < 2 {
		strNums = strNums + numStr + " is not Prime \n"
		return
	}

	for i := 2; i < num/2; i++ {

		if num%i == 0 {
			result = true
		}
	}

	if result == true {

		strNums = strNums + numStr + " is not Prime \n"
	} else {

		strNums = strNums + numStr + " is  Prime \n"
	}
}

func CheckNumbers(location string) {

	content, err := os.Open(location)
	if err != nil {
		log.Fatal(err)
	}

	defer content.Close()

	scanner := bufio.NewScanner(content)
	for scanner.Scan() {

		lineStr := scanner.Text()
		num, _ := strconv.Atoi(lineStr)
		isPrime(num, lineStr)
	}

}

func writesNumberstoFile(location string) {

	f, err := os.Create(location)
	if err != nil {
		fmt.Println(err)
		return
	}

	sa, err := f.WriteString(strNums)
	if err != nil {
		fmt.Println(err)
		fmt.Println(sa)
		f.Close()
	}
	f.Close()
}
