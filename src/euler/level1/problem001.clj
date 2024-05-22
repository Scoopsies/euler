(ns euler.level1.problem001)

(defn euler-1 [n]
  (loop [num (dec n)
         vec []]
    (if (= num 0)
      (reduce + vec)
      (recur (dec num) (if (or (= (mod num 3) 0)
                             (= (mod num 5) 0))
                       (conj vec num)
                       vec))))
  )
