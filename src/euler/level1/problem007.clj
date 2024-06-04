(ns euler.level1.problem007
  (:require
    [euler.level1.problem003 :refer :all]
    [euler.math :as math]))

(defn get-nth-prime [n]
  (last (take n (filter math/prime? (iterate inc 2)))))
