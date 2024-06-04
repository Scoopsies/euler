(ns euler.math)

(defn- even-or-2? [n]
  (and (not= n 2) (even? n)))

(defn factor? [checked-number checking-number]
  (= 0 (mod checked-number checking-number)))

(defn- update-result [n num result]
  (if (factor? n num) false result))

(defn prime? [n]
  (if (even-or-2? n)
    false
    (loop [num 2 result true]
      (if (or (false? result) (> num (Math/sqrt n)))
        result
        (recur (inc num) (update-result n num result))))))