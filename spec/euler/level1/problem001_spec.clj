(ns euler.level1.problem001-spec
  (:use
    [speclj.core]
    [euler.level1.problem001 :as sut]))

; http://projecteuler.net/index.php?section=problems&id=1

(describe "Euler Problem #1"

  (it "Solves #1"
    (should= 23 (sut/euler-1 10))
    (should= 45 (sut/euler-1 13))
    (should= 60 (sut/euler-1 16))
    (should= 233168 (sut/euler-1 1000))
    )
  )

(run-specs)
