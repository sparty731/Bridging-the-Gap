// First 1000 lines of code 

object BridgingTheGap {
  
  // Function to Print Hello World
  def printHelloWorld(): Unit = {
    println("Hello World!")
  }
  
  // Function to Multiply Two Integers
  def multiplyTwoIntegers(int1: Int, int2: Int): Int = {
    int1 * int2
  }
  
  // Function to Reverse a String 
  def reverseString(inputString: String): String = {
    inputString.reverse
  }
  
  // Function to Find the Factorial of a Number
  def factorial(inputNumber: Int): Int = {
    if (inputNumber == 0)
      return 1
    else
      return inputNumber * factorial(inputNumber - 1)
  }
  
  // Function to Check Whether a Number is Prime 
  def isPrime(inputNumber: Int): Boolean = {
    for (i <- 2 to inputNumber / 2) {
      if (inputNumber % i == 0)
        return false
    }
    return true
  }
  
  // Function to Find the Fibonacci Number at a Position
  def fibonacciNumberAtPosition(inputPosition: Int): Int = {
    if (inputPosition == 0 || inputPosition == 1) 
      return 1
    else 
      return fibonacciNumberAtPosition(inputPosition - 1) + fibonacciNumberAtPosition(inputPosition - 2)
  }
  
  // Function to Print the First n Fibonacci Numbers
  def printNFibonacciNumbers(inputNumber: Int): Unit = {
    var firstNumber = 0
    var secondNumber = 1
    print(firstNumber)
    print(" ")
    for (i <- 1 until inputNumber) {
      print(secondNumber)
      print(" ")
      val sum = firstNumber + secondNumber
      firstNumber = secondNumber
      secondNumber = sum
    }
    println()
  }
  
  // Function to Find the Length of a String
  def lengthOfString(inputString: String): Int = {
    inputString.length
  }
  
  // Function to Check Whether a String is Palindrome or Not
  def isPalindrome(inputString: String): Boolean = {
    if (inputString.reverse == inputString) 
      return true 
    else 
      return false  
  }
  
  // Function to Check Whether a Number is Armstrong or Not
  def isArmstrong(inputNumber: Int): Boolean = {
    var actualNumber = inputNumber 
    var sum = 0 
    var countOfDigits = 0 
    while (actualNumber > 0) {
      countOfDigits += 1 
      actualNumber /= 10 
    }
    actualNumber = inputNumber 
    while (actualNumber > 0) {
      var remainder = actualNumber % 10 
      sum += Math.pow(remainder, countOfDigits).toInt 
      actualNumber /= 10 
    }
   if (sum == inputNumber) 
    return true
   else 
    return false
  }
  
  // Function to Check Whether a Number is Perfect or Not
  def isPerfect(inputNumber: Int): Boolean = {
    var sum = 0
    for (i <- 1 until inputNumber) {
      if (inputNumber % i == 0) 
        sum += i 
    }
    if (sum == inputNumber)
      return true
    else 
      return false
  }
  
  // Function to Find the GCD of Two Numbers
  def gcdOfTwoNumbers(int1: Int, int2: Int): Int = {
    var a = int1
    var b = int2
    while (b != 0) {
      val temp = b
      b = a % b
      a = temp
    }
    a 
  }
  
  // Function to Find the LCM of Two Numbers
  def lcmOfTwoNumbers(int1: Int, int2: Int): Int = {
    (int1 * int2) / gcdOfTwoNumbers(int1, int2)
  }
  
  // Function to Print the First n Prime Numbers
  def printNPrimeNumbers(inputNumber: Int): Unit = {
    var number = 2 
    var count = 0 
    while (count < inputNumber) {
      if (isPrime(number)) {
        print(number) 
        print(" ") 
        count += 1
      }
      number += 1
    } 
    println() 
  }
  
  // Function to Check Whether a Number is Perfect Square or Not
  def isPerfectSquare(inputNumber: Int): Boolean = {
    var i = 1 
    while (i * i < inputNumber) 
      i += 1
    if (i * i == inputNumber) 
      return true
    else 
      return false
  }
  
  // Function to Find the Sum of First n Natural Numbers
  def sumOfNNaturalNumbers(inputNumber: Int): Int = {
    inputNumber * (inputNumber + 1) / 2
  }
  
  // Function to Print Pattern 
  def printPattern(rows: Int): Unit = {
    for (i <- 0 until rows) {
      for (j <- 0 until i + 1) 
        print("* ")
        println()
    }
  }
  
  // Function to Print Pascal Triangle 
  def printPascalTriangle(rows: Int): Unit = {
    for (i <- 0 until rows) {
      for (j <- 0 until i + 1)
        print(pascalTriangleNumber(i, j) + " ") 
      println()
    }
  }
  
  // Function to Find the Number in Pascal Triangle
  def pascalTriangleNumber(i: Int, j: Int): Int = {
    if (j == 0 || i == j) 
      1
    else
      pascalTriangleNumber(i - 1, j - 1) + pascalTriangleNumber(i - 1, j)
  }
  
  // Function to Find the Sum of Digits of a Number
  def sumOfDigits(inputNumber: Int): Int = {
    var sum = 0
    var actualNumber = inputNumber
    while (actualNumber > 0) {
      sum += actualNumber % 10
      actualNumber /= 10
    }
    sum 
  }
  
  // Function to Check Whether a Character is Alphabet or Not
  def isAlphabet(inputChar: Char): Boolean = {
    inputChar >= 'a' && inputChar <= 'z' || inputChar >= 'A' && inputChar <= 'Z'
  }
  
  // Function to Check Whether a Character is Vowel or Not
  def isVowel(inputChar: Char): Boolean = {
    inputChar == 'a' || inputChar == 'e' || inputChar == 'i' || inputChar == 'o' || inputChar == 'u' || inputChar == 'A' || inputChar == 'E' || inputChar == 'I' || inputChar == 'O' || inputChar == 'U' 
  }
  
  // Function to Check Whether a Character is Uppercase or Not
  def isUppercase(inputChar: Char): Boolean = {
    inputChar >= 'A' && inputChar <= 'Z'
  }
  
  // Function to Check Whether a Character is Lowercase or Not
  def isLowercase(inputChar: Char): Boolean = {
    inputChar >= 'a' && inputChar <= 'z'
  }
  
  // Function to Swap Two Numbers without a Temporary Variable
  def swapWithoutTempVariable(int1: Int, int2: Int): Unit = {
    int1 = int1 + int2
    int2 = int1 - int2
    int1 = int1 - int2
    println("After swapping, int1 = " + int1 + " and int2 = " + int2)
  }
  
  // Function to Check Whether a Year is Leap Year or Not
  def isLeapYear(inputYear: Int): Boolean = {
    (inputYear % 4 == 0 && inputYear % 100 != 0) || inputYear % 400 == 0
  }
  
  // Function to Find the Next Prime Number
  def nextPrimeNumber(inputNumber: Int): Int = {
    var number = inputNumber + 1
    while (!isPrime(number)) {
      number += 1
    }
    number
  }
  
  // Function to Find the Number of Days in a Month
  def numberOfDaysInMonth(inputMonth: Int, inputYear: Int): Int = {
    var daysInMonth = 0
    inputMonth match {
      case 1 | 3 | 5 | 7 | 8 | 10 | 12 => 
        return 31
      case 4 | 6 | 9 | 11 =>
        return 30
      case 2 => 
        if (isLeapYear(inputYear)) 
          daysInMonth = 29
        else 
          daysInMonth = 28
    }
    daysInMonth
  }
  
  // Function to Calculate the Number of Days Between Two Dates
  def numberOfDaysBetweenTwoDates(date1: String, date2: String): Long = {
    val df = new SimpleDateFormat("dd/MM/yyyy")
    val startDate = df.parse(date1)
    val endDate = df.parse(date2)
    val diffInMillis = Math.abs(startDate.getTime - endDate.getTime)
    TimeUnit.DAYS.convert(diffInMillis, TimeUnit.MILLISECONDS)
  }
  
  // Function to Convert Decimal to Binary
  def decimalToBinary(inputNumber: Int): String = {
    var binaryNumber = ""
    var actualNumber = inputNumber
    while (actualNumber > 0) {
      binaryNumber += (actualNumber % 2).toString
      actualNumber /= 2
    }
    binaryNumber.reverse
  }
  
  // Function to Find the ASCII Value of a Character
  def asciiValue(inputChar: Char): Int = {
    inputChar.toInt
  }
  
  // Function to Check Whether a String is Anagram of Another String
  def isAnagram(string1: String, string2: String): Boolean = {
    if (string1.length != string2.length) 
      return false
    val chars1 = string1.toLowerCase.toCharArray
    val chars2 = string2.toLowerCase.toCharArray
    Arrays.sort(chars1)
    Arrays.sort(chars2)
    return Arrays.equals(chars1, chars2)
  }
  
  // Function to Sort an Array of Integers
  def sortArray(inputArray: Array[Int]): Unit = {
    val length = inputArray.length
    for (i <- 0 until length - 1) {
      for (j <- 0 until length - i - 1) {
        if (inputArray(j) > inputArray(j + 1)) {
          val temp = inputArray(j)
          inputArray(j) = inputArray(j + 1)
          inputArray(j + 1) = temp
        }
      }
    }
    println(Arrays.toString(inputArray))
  }
  
  // Function to Remove Duplicates from an Array 
  def removeDuplicates(inputArray: Array[Int]): Array[Int] = {
    val length = inputArray.length
    var outputArray = ArrayBuffer[Int]()
    for (i <- 0 until length) {
      var isDuplicate = false
      for (j <- 0 until i) {
        if (inputArray(i) == inputArray(j))
          isDuplicate = true
      }
      if (!isDuplicate)
        outputArray += inputArray(i)
    }
    outputArray.toArray
  }
  
  // Function to Reverse an Array
  def reverseArray(inputArray: Array[Int]): Unit = {
    val length = inputArray.length
    for (i <- 0 until length / 2) {
      val temp = inputArray(i)
      inputArray(i) = inputArray(length - i - 1)
      inputArray(length - i - 1) = temp
    }
    println(Arrays.toString(inputArray))
  }
  
  // Function to Insert an Element in an Array
  def insertElement(inputArray: Array[Int], element: Int): Unit = {
    val length = inputArray.length 
    inputArray(length - 1) = element 
    println(Arrays.toString(inputArray))
  }

  // Function to Find the Missing Number in a Given Integer Array
  def missingNumber(inputArray: Array[Int]): Int = {
    val length = inputArray.length 
    val totalSum = (length + 1) * (length + 2) / 2 
    var arraySum = 0
    for (i <- 0 until length) 
      arraySum += inputArray(i) 
    totalSum - arraySum
  }
  
  // Function to Find the Sum of Elements in an Array
  def sumOfElements(inputArray: Array[Int]): Int = {
    var sum = 0 
    for (i <- inputArray) 
      sum += i
    sum 
  }
  
  // Function to Find the Average of Elements in an Array
  def averageOfElements(inputArray: Array[Int]): Double = {
    sumOfElements(inputArray).toDouble / inputArray.length.toDouble
  }
  
  // Function to Find the Largest Element in an Array
  def largestElement(inputArray: Array[Int]): Int = {
    var max = inputArray(0)
    for (i <- 0 until inputArray.length) {
      if (inputArray(i) > max)
        max = inputArray(i)
    }
    max 
  }
  
  // Function to Find the Smallest Element in an Array
  def smallestElement(inputArray: Array[Int]): Int = {
    var min = inputArray(0)
    for (i <- 0 until inputArray.length) {
      if (inputArray(i) < min)
        min = inputArray(i)
    }
    min 
  }
  
  // Function to Find the Second Largest Element in an Array
  def secondLargestElement(inputArray: Array[Int]): Int = {
    var firstMax = inputArray(0)
    var secondMax = inputArray(0)
    for (i <- 0 until inputArray.length) {
      if (inputArray(i) > firstMax) {
        secondMax = firstMax
        firstMax = inputArray(i)
      }
      else if (inputArray