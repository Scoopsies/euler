(ns euler.level1.problem009-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem009 :refer :all]))

(describe "euler 9"

  (context "pythagorean-triplet?"
    (it "checks 2 4 and 5"
      (should= false (pythagorean-triplet? 2 4 5)))

    (it "checks 3 4 5"
      (should= true (pythagorean-triplet? 3 4 5)))
    )

  (context "find-special-triplet"
    (it "finds triplet for sum of 12"
      (should= [3 4 5] (find-special-triplet 12)))
    (it "finds triplet for sum of 100"
      (should= [200 375 425] (find-special-triplet 1000)))
    )

  (context "get-product-special-triplet"
    (it "finds product of 12's special triplets"
      (should= 60 (get-product-special-triplet 12)))

    (it "finds product of 1000's special triplet"
      (should= 31875000 (get-product-special-triplet 1000))))
  )

(run-specs)
