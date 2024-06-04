(ns euler.level1.problem002)

(defn fibonacci [n]
  (loop [first-value 1
         second-value 2
         result []]
    (if (> first-value n)
      result
      (recur second-value
             (+ first-value second-value)
             (conj result first-value)))))

(defn even-sequence-filter [coll]
  (filter even? (fibonacci coll)))

(defn euler-2 [n]
  (reduce + (even-sequence-filter n)))

(defn lazy-fib
  ([] (lazy-fib 1 1))
  ([n m]
   (lazy-seq (cons n (lazy-fib m (+ n m))))))

(defn fib [n]
  (take n (lazy-fib)))