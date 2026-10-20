import java.util.*;

public class JavaProgramsPractice {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
       
            System.out.println("\n========== JAVA PROGRAMS MENU ==========");
            System.out.println(" 1. Display odd numbers from 1 to 100");
            System.out.println(" 2. Sum of odd numbers from 1 to 100");
            System.out.println(" 3. Count odd numbers from 1 to 100");
            System.out.println(" 4. Sum of first N numbers");
            System.out.println(" 5. Sum of digits of a number");
            System.out.println(" 6. Calculate electricity bill");
            System.out.println(" 7. Check Armstrong number");
            System.out.println(" 8. Armstrong numbers from 1 to 1000");
            System.out.println(" 9. Convert number to words (0-999)");
            System.out.println("10. Check number palindrome");
            System.out.println("11. Palindrome numbers from 1 to N");
            System.out.println("12. Print prime numbers from 1 to N");
            System.out.println("13. Star triangle");
            System.out.println("14. Centered star pyramid");
            System.out.println("15. Hollow diamond pattern");
            System.out.println("16. Floyd's triangle");
            System.out.println("17. Number sequence pattern");
            System.out.println("18. Number palindrome triangle");
            System.out.println("19. Number triangle");
            System.out.println("20. Number pyramid (up and down)");
            System.out.println("21. Reverse-number pyramid");
            System.out.println("22. Inverted star triangle");
            System.out.println("23. Diamond star pattern");
            System.out.println("24. Largest number in array");
            System.out.println("25. Second largest number in array");
            System.out.println("26. Largest and smallest in array");
            System.out.println("27. Index of largest array value");
            System.out.println("28. Index of smallest array value");
            System.out.println("29. Remove duplicate array values (sorted array)");
            System.out.println("30. Sort array and display odd/even numbers");
            System.out.println("31. Add two matrices");
            System.out.println("32. Check null matrix");
            System.out.println("33. Check diagonal matrix");
            System.out.println("34. Linear search");
            System.out.println("35. Binary search (enter sorted values)");
            System.out.println("36. Calculate HCF and LCM");
            System.out.println("37. Volume of a cube");
            System.out.println("38. Reverse a number");
            System.out.println("39. Convert integer to Roman numerals");
            System.out.println("40. Count words in a string");
            System.out.println("41. Count repeated words");
            System.out.println("42. Remove duplicate words");
            System.out.println("43. Count each word and total words");
            System.out.println("44. Check string palindrome");
            System.out.println("45. Remove vowels");
            System.out.println("46. Capitalize first letter of each word");
            System.out.println("47. Split comma-separated text");
            System.out.println("48. Display ASCII codes A-Z");
            System.out.println("49. Replace vowels with stars");
            System.out.println("50. Print character positions");
            System.out.println("51. Reverse word order");
            System.out.println("52. Reverse word order (second example)");
            System.out.println("53. Difference between maximum and minimum array values");
            System.out.println("54. Count occurrences of each character");
            System.out.println(" 0. Exit");
            System.out.print("Choose a program: ");
            choice = readInt();

            switch (choice) {
                case 1: oddNumbers(); break;
                case 2: sumOddNumbers(); break;
                case 3: countOddNumbers(); break;
                case 4: sumFirstN(); break;
                case 5: digitSum(); break;
                case 6: electricityBill(); break;
                case 7: armstrongCheck(); break;
                case 8: armstrongRange(); break;
                case 9: numberToWords(); break;
                case 10: numberPalindrome(); break;
                case 11: palindromeRange(); break;
                case 12: primeRange(); break;
                case 13: starTriangle(); break;
                case 14: starPyramid(); break;
                case 15: hollowDiamond(); break;
                case 16: floydTriangle(); break;
                case 17: numberSequence(); break;
                case 18: numberPalindromeTriangle(); break;
                case 19: numberTriangle(); break;
                case 20: numberPyramidUpDown(); break;
                case 21: reverseNumberPyramid(); break;
                case 22: invertedStarTriangle(); break;
                case 23: diamondPattern(); break;
                case 24: largestArray(); break;
                case 25: secondLargestArray(); break;
                case 26: largestSmallestArray(); break;
                case 27: largestIndex(); break;
                case 28: smallestIndex(); break;
                case 29: removeDuplicateArray(); break;
                case 30: oddEvenArray(); break;
                case 31: matrixAddition(); break;
                case 32: nullMatrix(); break;
                case 33: diagonalMatrix(); break;
                case 34: linearSearch(); break;
                case 35: binarySearch(); break;
                case 36: hcfLcm(); break;
                case 37: cubeVolume(); break;
                case 38: reverseNumber(); break;
                case 39: romanNumerals(); break;
                case 40: wordCount(); break;
                case 41: duplicateWordCount(); break;
                case 42: removeDuplicateWords(); break;
                case 43: countEachWord(); break;
                case 44: stringPalindrome(); break;
                case 45: removeVowels(); break;
                case 46: capitalizeWords(); break;
                case 47: splitCommaText(); break;
                case 48: asciiCodes(); break;
                case 49: vowelsToStars(); break;
                case 50: characterPositions(); break;
                case 51: reverseWords(); break;
                case 52: reverseWordsSecond(); break;
                case 53: arrayDifference(); break;
                case 54: characterOccurrences(); break;
                case 0: System.out.println("Program ended."); break;
                default: System.out.println("Invalid choice. Please choose from the menu.");
            }
        
    }

    static int readInt() {
        while (!sc.hasNextInt()) {
            System.out.print("Please enter a whole number: ");
            sc.next();
        }
        return sc.nextInt();
    }

    static int[] readArray() {
        System.out.print("Enter number of elements: ");
        int n = readInt();
        while (n <= 0) {
            System.out.print("Enter a number greater than 0: ");
            n = readInt();
        }
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            a[i] = readInt();
        }
        return a;
    }

    static void oddNumbers() {
        for (int i = 1; i <= 100; i++) if (i % 2 != 0) System.out.print(i + " ");
        System.out.println();
    }

    static void sumOddNumbers() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) if (i % 2 != 0) sum += i;
        System.out.println("Sum of odd numbers from 1 to 100: " + sum);
    }

    static void countOddNumbers() {
        int count = 0;
        for (int i = 1; i <= 100; i++) if (i % 2 != 0) count++;
        System.out.println("Count of odd numbers from 1 to 100: " + count);
    }

    static void sumFirstN() {
        System.out.print("Enter N: ");
        int n = readInt(), sum = 0;
        for (int i = 1; i <= n; i++) sum += i;
        System.out.println("Sum: " + sum);
    }

    static void digitSum() {
        System.out.print("Enter a number: ");
        int n = Math.abs(readInt()), original, sum = 0;
        original = n;
        while (n > 0) { sum += n % 10; n /= 10; }
        System.out.println("Sum of digits of " + original + " is " + sum);
    }

    static void electricityBill() {
        System.out.print("Enter units consumed: ");
        int units = readInt(), bill = 0;
        if (units > 100 && units < 200) bill = units * 5;
        else if (units >= 200 && units <= 300) bill = units * 6;
        else if (units > 300) bill = units * 8;
        System.out.println("CHENNAI ELECTRICITY LTD, CHENNAI");
        System.out.println("Units consumed: " + units);
        System.out.println("Total bill: " + bill);
        System.out.println("Note: Uses the rate conditions shown in the PDF example.");
    }

    static boolean isArmstrong(int n) {
        if (n < 0) return false;
        int original = n, digits = String.valueOf(n).length(), sum = 0;
        do {
            int digit = n % 10;
            sum += (int) Math.pow(digit, digits);
            n /= 10;
        } while (n > 0);
        return sum == original;
    }

    static void armstrongCheck() {
        System.out.print("Enter a number: ");
        int n = readInt();
        System.out.println(n + (isArmstrong(n) ? " is an Armstrong number." : " is not an Armstrong number."));
    }

    static void armstrongRange() {
        System.out.print("Armstrong numbers from 1 to 1000: ");
        for (int i = 1; i <= 1000; i++) if (isArmstrong(i)) System.out.print(i + " ");
        System.out.println();
    }

    static String underTwenty(int n) {
        String[] words = {"zero","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
        return words[n];
    }

    static String wordsBelowThousand(int n) {
        String[] tens = {"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
        if (n < 20) return underTwenty(n);
        if (n < 100) return tens[n / 10] + (n % 10 == 0 ? "" : " " + underTwenty(n % 10));
        return underTwenty(n / 100) + " hundred" + (n % 100 == 0 ? "" : " " + wordsBelowThousand(n % 100));
    }

    static void numberToWords() {
        System.out.print("Enter a number from 0 to 999: ");
        int n = readInt();
        if (n < 0 || n > 999) System.out.println("Please enter a number from 0 to 999.");
        else System.out.println(wordsBelowThousand(n));
    }

    static int reverseInt(int n) {
        int rev = 0;
        while (n > 0) { rev = rev * 10 + n % 10; n /= 10; }
        return rev;
    }

    static void numberPalindrome() {
        System.out.print("Enter a number: ");
        int n = readInt();
        System.out.println(n == reverseInt(n) ? "The given number is a palindrome." : "The given number is not a palindrome.");
    }

    static void palindromeRange() {
        System.out.print("Enter limit N: ");
        int limit = readInt();
        for (int i = 1; i <= limit; i++) if (i == reverseInt(i)) System.out.print(i + " ");
        System.out.println();
    }

    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) if (n % i == 0) return false;
        return true;
    }

    static void primeRange() {
        System.out.print("Print primes from 1 to N. Enter N: ");
        int n = readInt(), count = 0, sum = 0;
        for (int i = 2; i <= n; i++) if (isPrime(i)) { System.out.print(i + " "); count++; sum += i; }
        System.out.println("\nCount: " + count + ", Sum: " + sum);
        System.out.println("Average: " + (count == 0 ? 0 : (double) sum / count));
    }

    static void starTriangle() {
        System.out.print("Enter rows: ");
        int n = readInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) System.out.print("* ");
            System.out.println();
        }
    }

    static void starPyramid() {
        System.out.print("Enter rows: ");
        int n = readInt();
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) System.out.print(" ");
            for (int j = 1; j <= i; j++) System.out.print("* ");
            System.out.println();
        }
    }

    static void hollowDiamond() {
        System.out.print("Enter half-height: ");
        int n = readInt();
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) System.out.print("*");
            for (int j = 0; j < 2 * (n - i); j++) System.out.print(" ");
            for (int j = 1; j <= i; j++) System.out.print("*");
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) System.out.print("*");
            for (int j = 0; j < 2 * (n - i); j++) System.out.print(" ");
            for (int j = 1; j <= i; j++) System.out.print("*");
            System.out.println();
        }
    }

    static void floydTriangle() {
        System.out.print("Enter rows: ");
        int rows = readInt(), count = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) System.out.print(count++ + " ");
            System.out.println();
        }
    }

    static void numberSequence() {
        int a = 3, b = 4;
        for (int i = 1; i <= 8; i++) {
            int c = a + b;
            System.out.println(a + " " + b + " " + c);
            a = c;
            b++;
        }
    }

    static void numberPalindromeTriangle() {
        System.out.print("Enter rows: ");
        int n = readInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) System.out.print(j);
            for (int j = i - 1; j >= 1; j--) System.out.print(j);
            System.out.println();
        }
    }

    static void numberTriangle() {
        System.out.print("Enter rows: ");
        int n = readInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) System.out.print(j + " ");
            System.out.println();
        }
    }

    static void numberPyramidUpDown() {
        System.out.print("Enter rows: ");
        int n = readInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) System.out.print(j);
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) System.out.print(j);
            System.out.println();
        }
    }

    static void reverseNumberPyramid() {
        System.out.print("Enter rows: ");
        int n = readInt();
        for (int i = 1; i <= n; i++) {
            for (int s = i; s < n; s++) System.out.print(" ");
            for (int j = i; j >= 1; j--) System.out.print(j);
            for (int j = 2; j <= i; j++) System.out.print(j);
            System.out.println();
        }
    }

    static void invertedStarTriangle() {
        System.out.print("Enter rows: ");
        int n = readInt();
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) System.out.print("*");
            System.out.println();
        }
    }

    static void diamondPattern() {
        System.out.print("Enter half-height: ");
        int n = readInt();
        for (int i = 1; i <= n; i++) {
            for (int s = i; s < n; s++) System.out.print(" ");
            for (int j = 1; j <= 2 * i - 1; j++) System.out.print("*");
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int s = i; s < n; s++) System.out.print(" ");
            for (int j = 1; j <= 2 * i - 1; j++) System.out.print("*");
            System.out.println();
        }
    }

    static void largestArray() {
        int[] a = readArray();
        int max = a[0];
        for (int x : a) if (x > max) max = x;
        System.out.println("Largest value: " + max);
    }

    static void secondLargestArray() {
        int[] a = readArray();
        Integer largest = null, second = null;
        for (int x : a) {
            if (largest == null || x > largest) { if (largest != null && x != largest) second = largest; largest = x; }
            else if (x != largest && (second == null || x > second)) second = x;
        }
        if (second == null) System.out.println("No distinct second largest value.");
        else System.out.println("Second largest value: " + second);
    }

    static void largestSmallestArray() {
        int[] a = readArray();
        int max = a[0], min = a[0];
        for (int x : a) { if (x > max) max = x; if (x < min) min = x; }
        System.out.println("Largest: " + max + "\nSmallest: " + min);
    }

    static void largestIndex() {
        int[] a = readArray();
        int index = 0;
        for (int i = 1; i < a.length; i++) if (a[i] > a[index]) index = i;
        System.out.println("Index of largest value (starting at 0): " + index);
    }

    static void smallestIndex() {
        int[] a = readArray();
        int index = 0;
        for (int i = 1; i < a.length; i++) if (a[i] < a[index]) index = i;
        System.out.println("Index of smallest value (starting at 0): " + index);
    }

    static void removeDuplicateArray() {
        int[] a = readArray();
        Arrays.sort(a);
        int[] unique = Arrays.stream(a).distinct().toArray();
        System.out.println("Sorted input: " + Arrays.toString(a));
        System.out.println("Values without duplicates: " + Arrays.toString(unique));
    }

    static void oddEvenArray() {
        int[] a = readArray();
        Arrays.sort(a);
        System.out.println("Sorted input: " + Arrays.toString(a));
        System.out.print("Odd numbers: ");
        for (int x : a) if (x % 2 != 0) System.out.print(x + " ");
        System.out.print("\nEven numbers: ");
        for (int x : a) if (x % 2 == 0) System.out.print(x + " ");
        System.out.println();
    }

    static int[][] readMatrix(int rows, int cols) {
        int[][] a = new int[rows][cols];
        for (int i = 0; i < rows; i++) for (int j = 0; j < cols; j++) {
            System.out.print("Enter value for row " + (i + 1) + ", column " + (j + 1) + ": ");
            a[i][j] = readInt();
        }
        return a;
    }

    static void printMatrix(int[][] a) {
        for (int[] row : a) {
            for (int x : row) System.out.print(x + " ");
            System.out.println();
        }
    }

    static void matrixAddition() {
        System.out.print("Enter rows: "); int r = readInt();
        System.out.print("Enter columns: "); int c = readInt();
        System.out.println("Enter first matrix:");
        int[][] a = readMatrix(r, c);
        System.out.println("Enter second matrix:");
        int[][] b = readMatrix(r, c);
        int[][] sum = new int[r][c];
        for (int i = 0; i < r; i++) for (int j = 0; j < c; j++) sum[i][j] = a[i][j] + b[i][j];
        System.out.println("Sum matrix:");
        printMatrix(sum);
    }

    static void nullMatrix() {
        System.out.print("Enter rows: "); int r = readInt();
        System.out.print("Enter columns: "); int c = readInt();
        int[][] a = readMatrix(r, c);
        boolean allZero = true;
        for (int[] row : a) for (int x : row) if (x != 0) allZero = false;
        printMatrix(a);
        System.out.println(allZero ? "The matrix is a null matrix." : "The matrix is not a null matrix.");
    }

    static void diagonalMatrix() {
        System.out.print("Enter square matrix size: "); int n = readInt();
        int[][] a = readMatrix(n, n);
        boolean diagonal = true;
        for (int i = 0; i < n; i++) for (int j = 0; j < n; j++) {
            if (i == j && a[i][j] == 0) diagonal = false;
            if (i != j && a[i][j] != 0) diagonal = false;
        }
        printMatrix(a);
        System.out.println(diagonal ? "The matrix is a diagonal matrix." : "The matrix is not a diagonal matrix.");
    }

    static void linearSearch() {
        int[] a = readArray();
        System.out.print("Enter value to search: "); int target = readInt();
        boolean found = false;
        for (int i = 0; i < a.length; i++) if (a[i] == target) {
            System.out.println(target + " found at index " + i + " (position " + (i + 1) + ").");
            found = true;
        }
        if (!found) System.out.println("Value not found.");
    }

    static void binarySearch() {
        int[] a = readArray();
        Arrays.sort(a);
        System.out.println("Sorted array: " + Arrays.toString(a));
        System.out.print("Enter value to search: "); int target = readInt();
        int index = Arrays.binarySearch(a, target);
        if (index >= 0) System.out.println(target + " found at index " + index + " (position " + (index + 1) + ").");
        else System.out.println("Value not found.");
    }

    static void hcfLcm() {
        System.out.print("Enter first number: "); int x = readInt();
        System.out.print("Enter second number: "); int y = readInt();
        int a = Math.abs(x), b = Math.abs(y);
        while (b != 0) { int t = b; b = a % b; a = t; }
        int hcf = a;
        long lcm = hcf == 0 ? 0 : Math.abs((long) x * y) / hcf;
        System.out.println("HCF = " + hcf);
        System.out.println("LCM = " + lcm);
    }

    static void cubeVolume() {
        System.out.print("Enter side length: ");
        double side = readInt();
        System.out.println("Volume of cube: " + (side * side * side));
    }

    static void reverseNumber() {
        System.out.print("Enter a non-negative number: ");
        int n = Math.abs(readInt());
        System.out.println("Number = " + n);
        System.out.println("Reverse = " + reverseInt(n));
    }

    static void romanNumerals() {
        System.out.print("Enter an integer from 1 to 3999: ");
        int n = readInt();
        if (n < 1 || n > 3999) { System.out.println("Number must be from 1 to 3999."); return; }
        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] symbols = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < values.length; i++) while (n >= values[i]) { result.append(symbols[i]); n -= values[i]; }
        System.out.println("Roman numeral: " + result);
    }

    static String readLine(String prompt) {
        System.out.print(prompt);
        return sc.nextLine();
    }

    static void wordCount() {
        sc.nextLine();
        String s = readLine("Enter a sentence: ").trim();
        System.out.println("Number of words: " + (s.isEmpty() ? 0 : s.split("\\s+").length));
    }

    static String readText() {
        sc.nextLine();
        return readLine("Enter text: ");
    }

    static void duplicateWordCount() {
        String s = readText();
        Map<String, Integer> counts = new LinkedHashMap<>();
        for (String w : s.trim().split("\\s+")) if (!w.isEmpty()) counts.put(w, counts.getOrDefault(w, 0) + 1);
        for (Map.Entry<String, Integer> e : counts.entrySet()) System.out.println(e.getKey() + " -- " + e.getValue());
    }

    static void removeDuplicateWords() {
        String s = readText();
        Set<String> seen = new LinkedHashSet<>();
        for (String w : s.trim().split("\\s+")) if (!w.isEmpty()) seen.add(w);
        System.out.println(String.join(" ", seen));
    }

    static void countEachWord() {
        String s = readText();
        Map<String, Integer> counts = new LinkedHashMap<>();
        for (String w : s.trim().split("\\s+")) if (!w.isEmpty()) counts.put(w, counts.getOrDefault(w, 0) + 1);
        int total = 0;
        System.out.println("Words and counts:");
        for (Map.Entry<String, Integer> e : counts.entrySet()) {
            System.out.println(e.getKey() + " = " + e.getValue());
            total += e.getValue();
        }
        System.out.println("Total words counted: " + total);
    }

    static void stringPalindrome() {
        String s = readText();
        String clean = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        String rev = new StringBuilder(clean).reverse().toString();
        System.out.println(clean.equals(rev) ? "The string is a palindrome." : "The string is not a palindrome.");
    }

    static void removeVowels() {
        String s = readText();
        System.out.println(s.replaceAll("(?i)[aeiou]", ""));
    }

    static void capitalizeWords() {
        String s = readText();
        StringBuilder out = new StringBuilder();
        for (String w : s.split("\\s+")) {
            if (!w.isEmpty()) {
                if (out.length() > 0) out.append(" ");
                out.append(Character.toUpperCase(w.charAt(0))).append(w.substring(1));
            }
        }
        System.out.println(out);
    }

    static void splitCommaText() {
        String s = readText();
        for (String part : s.split(",")) System.out.println(part.trim());
    }

    static void asciiCodes() {
        for (int i = 65; i <= 90; i++) System.out.println(i + " = " + (char) i);
    }

    static void vowelsToStars() {
        String s = readText();
        System.out.println(s.replaceAll("(?i)[aeiou]", "*"));
    }

    static void characterPositions() {
        String s = readText();
        for (int i = 0; i < s.length(); i++) System.out.println(s.charAt(i) + " - position " + (i + 1));
    }

    static void reverseWords() {
        String s = readText().trim();
        if (s.isEmpty()) { System.out.println(); return; }
        String[] words = s.split("\\s+");
        for (int i = words.length - 1; i >= 0; i--) System.out.print(words[i] + (i == 0 ? "\n" : " "));
    }

    static void reverseWordsSecond() {
        String s = readText().trim();
        if (s.isEmpty()) { System.out.println(); return; }
        String[] words = s.split("\\s+");
        System.out.println("Original: " + s);
        System.out.print("Reversed word order: ");
        for (int i = words.length - 1; i >= 0; i--) System.out.print(words[i] + (i == 0 ? "\n" : " "));
    }

    static void arrayDifference() {
        int[] a = readArray();
        int max = a[0], min = a[0];
        for (int x : a) { if (x > max) max = x; if (x < min) min = x; }
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
        System.out.println("Difference: " + (max - min));
    }

    static void characterOccurrences() {
        String s = readText();
        Map<Character, Integer> counts = new LinkedHashMap<>();
        for (char c : s.toCharArray()) counts.put(c, counts.getOrDefault(c, 0) + 1);
        for (Map.Entry<Character, Integer> e : counts.entrySet()) {
            String label = e.getKey() == ' ' ? "[space]" : String.valueOf(e.getKey());
            System.out.println("Occurrence of " + label + ": " + e.getValue());
        }
    }
}
