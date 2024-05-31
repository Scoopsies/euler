(ns euler.level1.problem006-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem006 :refer :all]))

; https://projecteuler.net/problem=6

(describe "Euler Problem #6"

  (context "exponents"
    (it "returns 3^2"
      (should= 9 (pow 3 2)))
    (it "returns 3^3"
      (should= 27 (pow 3 3)))
    (it "returns 5^3"
      (should= 125 (pow 5 3))))

  (context "get-sum-of-squares"
    (it "sums the square of digits to 1"
      (should= 1 (get-sum-of-squares 1)))
    (it "sums the square of 1 and 2"
      (should= 5 (get-sum-of-squares 2)))
    (it "sums the squares of 1 - 10"
      (should= 385 (get-sum-of-squares 10)))
    (it "sums the squares of 1 - 100"
      (should= 338350 (get-sum-of-squares 100))))

  (context "get-square-of-sum"
    (it "squares 1"
      (should= 1 (get-square-of-sum 1)))
    (it "squares the sum of 1 - 2"
      (should= 9 (get-square-of-sum 2)))
    (it "squares the sum of 1 - 10"
      (should= 3025 (get-square-of-sum 10)))
    (it "squares the sum of 1 - 100"
      (should= 25502500 (get-square-of-sum 100)))
    )

  (context "get-sum-square-difference"
    (it "returns to sum square difference of 1"
      (should= 0 (get-sum-square-difference 1)))
    (it "returns the sum square difference of 1-2"
      (should= 4 (get-sum-square-difference 2)))
    (it "returns the sum square difference of 1-10"
      (should= 2640 (get-sum-square-difference 10)))
    (it "returns the sum square difference of 1-100"
      (should= 25164150 (get-sum-square-difference 100)))
    )
  )

(run-specs)
