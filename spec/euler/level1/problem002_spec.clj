(ns euler.level1.problem002-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem002 :refer :all]))

; https://projecteuler.net/problem=2

(describe "Euler Problem #2"

  (it "Solves #2"
    (describe "Create a vector")
    (should= [] (fibonacci -1))
    (describe "generate fibonacci sequence to 89")
    (should= [1 2 3 5 8 13 21 34 55 89] (fibonacci  89))
    (should= [1 2 3 5 8 13 21 34 55 89] (fibonacci 95))
    (describe "Should filter out odd")
    (should= [2 8 34] (even-sequence-filter 35))
    (should= 10 (euler-2 8))
    (should= 4613732 (euler-2 4000000))
    )
  )

(run-specs)
