(ns euler.level1.problem004-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem004 :as sut]))

; https://projecteuler.net/problem=4

(describe "Euler Problem #4"

  (context "reverse-num"
    (it "reverses 98"
      (should= 89 (sut/reverse-num 98)))
    (it "reverses 102"
      (should= 201 (sut/reverse-num 102))))

  (context "palindrome?"
    (it "checks if 99 is a palindrome"
      (should= true (sut/palindrome? 99)))
    (it "checks if 98 is a palindrome"
      (should= false (sut/palindrome? 98)))
    (it "checks if 1001 is a palindrome"
      (should= true (sut/palindrome? 1001)))
    (it "checks if 1002 is a palindrome"
      (should= false (sut/palindrome? 1002))))

  (context "get-largest-n-digit-num"
    (it "gets largest 1 digit number"
      (should= 9 (sut/get-largest-n-digit-int 1)))
    (it "gets largest 2 digit number"
      (should= 99 (sut/get-largest-n-digit-int 2)))
    (it "gets largest 3 digit number"
      (should= 999 (sut/get-largest-n-digit-int 3))))

  (context "list-of-palindrome-products"
    (it "returns a sequence of palindrome numbers with single digit factors"
      (should= [9 8 7 6 5 4 3 2 1] (sut/list-of-products 1)))
    (it "returns a sequence of palindrome numbers with double digit factors"
      (should=  [9009 8448 8118 8008 7227 7007 6776
                 6336 6006 5775 5445 5335 5225 5115
                 5005 4884 4774 4664 4554 4224 4004
                 3773 3663 3003 2992 2772 2552 2442
                 2332 2112 2002 1881 1771 1551 1221
                 1001 999 989 979 969 949 888 868 858
                 848 828 777 767 737 696 686 676 666
                 656 646 636 616 595 585 575 555 525
                 494 484 464 444 434 414 363 323 272
                 252 242 121 100] (sut/list-of-products 2)))
    )

  (context "get-smallest-n-digit-int"
    (it "should return smallest n digit of 1's"
      (should= 1 (sut/get-smallest-n-digit-int 1)))
    (it "should return smallest digit of 10's"
      (should= 10 (sut/get-smallest-n-digit-int 2))))

  (context "get-largest-palindrome-product"
    (it "gets largest palindrome product of 1 digit numbers"
      (should= 9 (sut/get-largest-palindrome-product 1)))
    (it "gets largest palindrome product of 2 digit numbers"
      (should= 9009 (sut/get-largest-palindrome-product 2)))
    (it "gets largest palindrome product of 3 digit numbers"
      (should= 906609 (sut/get-largest-palindrome-product 3)))))

(run-specs)
