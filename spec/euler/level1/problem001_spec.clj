(ns euler.level1.problem001-spec
  (:use
    [speclj.core]
    [euler.level1.problem001]))

; http://projecteuler.net/index.php?section=problems&id=1

(describe "Euler Problem #1"

  (it "Solves #1"
    (should= 23 (euler-1 10))
    (should= 45 (euler-1 13))
    (should= 60 (euler-1 16))
    (should= -1 (euler-1 1000))
    )
  )

(run-specs)
