(ns euler.level1.problem006)

(defn pow [number power]
  (apply * (take power (repeat number))))

(defn square-of [n]
  (pow n 2))

(defn get-sum-of-squares [n]
  (reduce + (map square-of (range 1 (inc n)))))

(defn get-square-of-sum [n]
  (square-of (reduce + (range 1 (inc n)))))

(defn get-sum-square-difference [n]
  (- (get-square-of-sum n) (get-sum-of-squares n)))