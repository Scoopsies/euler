(ns euler.level1.problem010-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem010 :as sut]))

; https://projecteuler.net/problem=10

(describe "Euler Problem #10"
  (context "sum-of-primes"
    (it "returns sum of all prime numbers below 3."
      (should= 2 (sut/sum-of-primes 3)))

    (it "returns sum of all prime numbers below 4"
      (should= 5 (sut/sum-of-primes 4)))

    (it "returns sum of all prime numbers below 10"
      (should= 17 (sut/sum-of-primes 10)))

    (it "returns sum of all prime numbers below 2,000,000"
      (should= 142913828922 (sut/sum-of-primes 2000000)))
    )
  )

(run-specs)
