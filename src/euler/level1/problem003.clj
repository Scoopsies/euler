(ns euler.level1.problem003
  (:require
    [euler.math :as math]))

(defn odd-factors-up-to-sqrt [n]
  (loop [num 2 result '()]
    (if (> num (Math/sqrt n))
      (lazy-seq result)
      (recur (inc num)
             (if (and (odd? num) (math/factor? n num))
               (conj result num)
               result)))))

(defn prime-factors-of [n]
  (filter math/prime? (odd-factors-up-to-sqrt n)))

(defn highest-prime-factor-of [n]
  (first (prime-factors-of n)))