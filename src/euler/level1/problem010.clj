(ns euler.level1.problem010
  (:require [euler.math :as math]))

(defn sum-of-primes [n]
  (->> (iterate inc 1)
       (take (dec n))
       (filter math/prime?)
       (reduce +)))
