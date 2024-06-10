(ns euler.level1.problem009)

(defn pythagorean-triplet? [a b c]
  (and (< a b c) (= (+ (* a a) (* b b)) (* c c))))

(defn check-for-match [a sum]
  (loop [b (inc a)]
    (let [c (- sum a b)]
      (cond
        (>= b c) nil
        (pythagorean-triplet? a b c) [a b c]
        :else (recur (inc b))))))


(defn find-special-triplet
  ([sum]
   (find-special-triplet sum 1))

  ([sum a]
   (if (> a sum)
     nil
     (let [result (check-for-match a sum)]
       (if result
         result
         (recur sum (inc a)))))))


(defn get-product-special-triplet [sum]
  (reduce * (find-special-triplet sum)))