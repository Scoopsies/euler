(ns euler.level1.problem005)

(defn evenly-divisible? [n divider]
  (zero? (mod n divider)))

(defn every-evenly-divisible? [n coll]
  (every? #(evenly-divisible? n %) coll))

(defn get-smallest-common-product [coll]
  (loop [result (* (first (reverse coll)) (second (reverse coll)))]
    (if (every-evenly-divisible? result coll)
      result
      (recur (+ (first (reverse coll)) result)))))

