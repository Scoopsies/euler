(ns euler.level1.problem003-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem003 :as sut]))

; https://projecteuler.net/problem=3

(describe "Euler Problem #3"

  (context "highest-prime-factor-of"
    (it "should find highest prime factor"
      (should= 29 (sut/highest-prime-factor-of 13195))
      (should= 6857 (sut/highest-prime-factor-of 600851475143))))
  )

(run-specs)
