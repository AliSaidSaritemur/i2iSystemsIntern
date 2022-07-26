package main

import (
	"bufio"
	"fmt"
	"log"
	"os"
	"strconv"
)

func main() {

	content, err := os.Open("a.txt")
	if err != nil {
		log.Fatal(err)
	}

	scanner := bufio.NewScanner(content)
	for scanner.Scan() {

		lineStr := scanner.Text()
		num, _ := strconv.Atoi(lineStr)

		if num < 2 {
			fmt.Println(num, "is not Prime")
			continue
		}

		var result bool = false

		for i := 2; i < num; i++ {

			if num%i == 0 {
				result = true
				break
			}

		}

		if result == true {

			fmt.Println(num, " is not Prime")

		} else {

			fmt.Println(num, " is Prime")
		}
	}

}
