(ns euler.level1.problem007
  (:require
    [euler.level1.problem003 :refer :all]
    [euler.math :as math]))

(defn get-nth-prime [n]
  (->> (iterate inc 2)
       (filter math/prime?)
       (take n)
       last))
