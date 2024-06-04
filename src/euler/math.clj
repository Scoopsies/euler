(ns euler.math)

(defn- even-or-2? [n]
  (and (not= n 2) (even? n)))

(defn factor? [checked-number checking-number]
  (= 0 (mod checked-number checking-number)))

(defn odd-factors-up-to-sqrt [n]
  (loop [num 2 result []]
    (if (> num (Math/sqrt n))
      result
      (recur (inc num)
             (if (and (odd? num) (factor? n num))
               (conj result num)
               result)))))

(defn- update-result [n num result]
  (if (factor? n num) false result))

(defn prime? [n]
  (if (even-or-2? n)
    false
    (loop [num 2 result true]
      (if (or (false? result) (> num (Math/sqrt n)))
        result
        (recur (inc num) (update-result n num result))))))

(defn prime-factors-of [n]
  (conj (filter prime? (odd-factors-up-to-sqrt n)) 2))



