(ns euler.math-spec
  (:require
    [speclj.core :refer :all]
    [euler.math :as sut]))

(describe "factor?"
          (it "checks if arg2 is factor of arg1"
              (should= true (sut/factor? 4 2))
              (should= false (sut/factor? 4 3))
              (should= true (sut/factor? 2 2))
              ))

(describe "prime?"
          (it "checks if a number is prime?"
              (should= true (sut/prime? 2))
              (should= true (sut/prime? 5))
              (should= false (sut/prime? 4))
              (should= true (sut/prime? 97))
              ))