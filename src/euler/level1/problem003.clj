(ns euler.level1.problem003)

(defn factor? [checked-number checking-number]
  (= 0 (mod checked-number checking-number)))

(defn prime? [n]
  (if (even? n)
    false
    (loop [num 2
         result true]
    (if (> num (Math/sqrt n))
      result
      (recur (inc num)
             (if (factor? n num)
               false
               result))))))

(defn odd-factors-up-to-sqrt [n]
  (loop [num 2 result '()]
    (if (> num (Math/sqrt n))
      (lazy-seq result)
      (recur (inc num)
             (if (and (odd? num) (factor? n num))
               (conj result num)
               result)))))

(defn prime-factors-of [n]
  (filter prime? (odd-factors-up-to-sqrt n)))

(defn highest-prime-factor-of [n]
  (first (prime-factors-of n)))