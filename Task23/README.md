# Task 23: Vibe Coding & Prompt Engineering

## Description
This task demonstrates the use of prompt engineering techniques with a Generative AI tool to generate code, cloud configurations, and application logic. It also evaluates the quality and usefulness of generated outputs.

---

## What is Prompt Engineering?

Prompt engineering is the process of designing clear and effective inputs (prompts) to get accurate and useful outputs from AI tools.

---

## What is Vibe Coding?

Vibe coding refers to interacting with AI tools in a natural and iterative way to generate and refine code quickly.

---

## Tools Used
- ChatGPT (Generative AI)

---

## Example 1: Code Generation

### Prompt
"Write a Java program to check if a number is prime."

### Generated Output
```java
public class PrimeCheck {
    public static void main(String[] args) {
        int num = 7;
        boolean isPrime = true;

        for(int i = 2; i <= num / 2; i++) {
            if(num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if(isPrime)
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
    }
}