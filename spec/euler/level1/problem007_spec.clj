(ns euler.level1.problem007-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem007 :as sut]))

; https://projecteuler.net/problem=7

(describe "Euler Problem #7"
  (context "get-nth-prime"
    (it "gets the first prime number"
      (should= 2 (sut/get-nth-prime 1)))

    (it "gets the 2nd prime number"
      (should= 3 (sut/get-nth-prime 2)))

    (it "gets the 3rd prime number"
      (should= 5 (sut/get-nth-prime 3)))

    (it "gets the 6th prime number"
      (should= 13 (sut/get-nth-prime 6)))

    (it "gets the 10001st prime number"
      (should= 104743 (sut/get-nth-prime 10001)))
  ))

(run-specs)
