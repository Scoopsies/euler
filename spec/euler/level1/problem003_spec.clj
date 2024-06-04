(ns euler.level1.problem003-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem003 :as sut]))

; https://projecteuler.net/problem=3

(describe "Euler Problem #3"
  (context "factors-of"
    (it "lists the factors of a number"
      (should= [] (sut/odd-factors-up-to-sqrt 1))
      (should= [] (sut/odd-factors-up-to-sqrt 2))
      (should= [3] (sut/odd-factors-up-to-sqrt 9))
      (should= [91 65 35 29 13 7 5] (sut/odd-factors-up-to-sqrt 13195)))
    )

  (context "prime-factors-of"
    (it "find the prime factors of a number"
      (should= [29 13 7 5] (sut/prime-factors-of 13195))))

  (context "highest-prime-factor-of"
    (it "should find highest prime factor"
      (should= 29 (sut/highest-prime-factor-of 13195))
      (should= 6857 (sut/highest-prime-factor-of 600851475143))))
  )

(run-specs)
