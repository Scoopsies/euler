(ns euler.math-spec
  (:require
    [speclj.core :refer :all]
    [euler.math :as sut]))

(describe "euler.math"

  (context "factor?"
    (it "checks if 2 is a factor of 4"
      (should= true (sut/factor? 4 2)))
    (it "checks if 3 is factor of 4."
      (should= false (sut/factor? 4 3)))
    (it "checks if 2 is a factor of 2."
      (should= true (sut/factor? 2 2))))

  (context "prime?"
    (it "checks if 2 is prime?"
      (should= true (sut/prime? 2)))
    (it "checks if 5 is prime."
      (should= true (sut/prime? 5)))
    (it "checks if 4 is prime."
      (should= false (sut/prime? 4)))
    (it "checks if 97 is prime."
      (should= true (sut/prime? 97))))

  (context "factors-of"
    (it "lists the odd factors of a number."
      (should= [] (sut/odd-factors-up-to-sqrt 1))
      (should= [] (sut/odd-factors-up-to-sqrt 2))
      (should= [3] (sut/odd-factors-up-to-sqrt 9))
      (should= [5 7 13 29 35 65 91] (sut/odd-factors-up-to-sqrt 13195))))

  (context "prime-factors-of"
    (it "find the prime factors of a number"
      (should= [2 5 7 13 29] (sut/prime-factors-of 13195)))))