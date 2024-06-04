(ns euler.level1.problem003
  (:require
    [euler.math :as math]))

(defn highest-prime-factor-of [n]
  (last (math/prime-factors-of n)))