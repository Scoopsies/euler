(ns euler.level1.problem005-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem005 :refer :all]))

; https://projecteuler.net/problem=5

; 2520 is the smallest number that can be divided by each of the numbers from
;1 to 10 without any remainder.
;What is the smallest positive number that is evenly divisible by all the numbers from
;1 to 20?

(describe "Euler Problem #5"
  (context "evenly-divisible?"
    (it "should check if 4 is evenly divisible by 2"
      (should= true (evenly-divisible? 4 2)))
    (it "should check if 9 is evenly divisible by 3"
      (should= true (evenly-divisible? 9 3)))
    (it "should check if 9 is evenly divisible by 4"
      (should= false (evenly-divisible? 9 4))))

  (context "get-smallest-common-product"
    (it "returns for 3"
      (should= 2 (get-smallest-common-product (range 1 3))))
    (it "returns for 4"
      (should= 12 (get-smallest-common-product (range 1 5))))
    (it "returns for 5"
      (should= 60 (get-smallest-common-product (range 1 6))))
    (it "returns for 10"
      (should= 2520 (get-smallest-common-product (range 1 11))))
    (it "returns for 20"
      (should= 232792560 (get-smallest-common-product (range 1 21))))
    )
  )

(run-specs)
