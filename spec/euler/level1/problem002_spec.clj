(ns euler.level1.problem002-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem002 :refer :all]))

; https://projecteuler.net/problem=2

(describe "Euler Problem #2"

  ;(it "finds first even fibonacci number")

  ;(it "finds first two even fibonacci numbers")

  ;(it "finds sum of first two even fibonacci numbers")

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

  (context "generate fibonacci"

    (it "2 numbers"
      (should= [1 1] (fib 2)))

    (it "3 numbers"
      (should= [1 1 2] (fib 3)))

    (it "4 numbers"
      (should= [1 1 2 3] (fib 4)))

    (it "5 numbers"
      (should= [1 1 2 3 5] (fib 5))))

  (context "lazy fib sequence"

    (it "take 1"
      (should= [1] (take 1 (lazy-fib))))

    (it "take 2"
      (should= [1 1] (take 2 (lazy-fib))))

    (it "take 3"
      (should= [1 1 2] (take 3 (lazy-fib))))

    (it "even fibs"
      (should= [2 8 34 144 610 2584 10946 46368 196418 832040] (take 10 (filter even? (lazy-fib))))))
  )

(run-specs)
