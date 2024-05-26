(ns euler.level1.problem003-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem003 :refer :all]))

; https://projecteuler.net/problem=3

(describe "Euler Problem #3"
  (describe "factors-of"
    (it "lists the factors of a number"
      (should= [] (odd-factors-up-to-sqrt 1))
      (should= [] (odd-factors-up-to-sqrt 2))
      (should= [3] (odd-factors-up-to-sqrt 9))
      (should= [91 65 35 29 13 7 5] (odd-factors-up-to-sqrt 13195)))
    )

  (describe "factor?"
    (it "checks if arg2 is factor of arg1"
      (should= true (factor? 4 2))
      (should= false (factor? 4 3))
      (should= true (factor? 2 2))
      ))

  (describe "prime?"
    (it "checks if a number is prime?"
      (should= true (prime? 5))
      (should= false (prime? 4))
      (should= true (prime? 97))
      ))

  (describe "prime-factors-of"
    (it "find the prime factors of a number"
      (should= [29 13 7 5] (prime-factors-of 13195))))

  (describe "highest-prime-factor-of"
    (it "should find highest prime factor"
      (should= 29 (highest-prime-factor-of 13195))
      (should= 6857 (highest-prime-factor-of 600851475143))))

  )

(run-specs)
