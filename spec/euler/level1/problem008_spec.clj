(ns euler.level1.problem008-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem008 :refer :all]))

; https://projecteuler.net/problem=8

(describe "Euler Problem #8"
  (context "split-string"
    (it "converts 102"
      (should= [1 0 2] (split-string "102")))

    (it "converts 103"
      (should= [1 0 3] (split-string "103")))
    )

  (context "multiply-n-digits [n]"
    (it "multiplies first 2 digits"
      (should= 1 (multiply-n-digits 2 [1 1 2 9])))

    (it "multiplies first 3 digits"
      (should= 2 (multiply-n-digits 3 [1 1 2 9])))

    (it "multiplies first 4 digits"
      (should= 18 (multiply-n-digits 4 [1 1 2 9])))
    )

  (context "highest-product"
    (it "finds highest 3 number products of 1129"
      (should= 18 (largest-product 3 "1129")))
    (it "finds highest 4 digit of giant-number"
      (should= 5832 (largest-product 4 giant-number)))
    (it "finds highest 13 digit of giant-number"
      (should= 23514624000 (largest-product 13 giant-number)))
    )
  )

(run-specs)