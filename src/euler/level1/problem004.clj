(ns euler.level1.problem004)

(defn reverse-num [n]
  (Integer/parseInt (apply str (reverse (str n)))))

(defn palindrome? [n]
  (= n (reverse-num n)))

(defn get-largest-n-digit-int [n]
  (int (dec (Math/pow 10 n))))

(defn get-smallest-n-digit-int [n]
  (int (Math/pow 10 (dec n))))

(defn sort-descending-distinct [result first-number second-number]
  (reverse (sort (distinct (conj result (* first-number second-number))))))

(defn- update-first-factor [n first-factor second-factor]
  (if (= second-factor (get-smallest-n-digit-int n))
    (dec first-factor)
    first-factor))

(defn- change-second-number [n first-factor second-factor]
  (if (= second-factor (get-smallest-n-digit-int n))
    (dec first-factor)
    (dec second-factor)))

(defn change-result [result first-factor second-factor]
  (if (palindrome? (* first-factor second-factor))
    (conj result (* first-factor second-factor))
    result))

(defn list-of-products [n]
  (loop [first-factor (get-largest-n-digit-int n)
         second-factor (get-largest-n-digit-int n)
         result []]
    (if (= first-factor second-factor (get-smallest-n-digit-int n))
      (sort-descending-distinct result first-factor second-factor)
      (recur (update-first-factor n first-factor second-factor)
             (change-second-number n first-factor second-factor)
             (change-result result first-factor second-factor)))))

(defn get-largest-palindrome-product [n]
  (first (list-of-products n)))