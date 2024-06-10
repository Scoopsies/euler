(ns euler.level1.problem005)

(defn evenly-divisible? [n divider]
  (zero? (mod n divider)))

(defn every-evenly-divisible? [n coll]
  (every? #(evenly-divisible? n %) coll))

(defn sum-until-SCP [result highest-factor coll]
  (if (every-evenly-divisible? result coll)
    result
    (recur (+ highest-factor result) highest-factor coll)))

(defn get-smallest-common-product [coll]
  (let [[highest-factor second-highest-factor] (reverse coll)]
    (sum-until-SCP (* highest-factor second-highest-factor) highest-factor coll)))



