(ns euler.core)


(defn -main [& args]

(defn want [x]
  (or
    (= 0 (mod x 3))
    (= 0 (mod x 5))))
(println (str "Solves #1: " (apply +
                                (filter want (range 1 1000)))))


(defn fib [a b] (cons a
                  (lazy-seq
                     (fib b (+ a b)))))
(defn want2 [n] (= 0.0 (mod n 2)))
(defn lessThan [x] (< x 4000000))
(println (str "Solves #2: " (apply +
                              (filter want2
                                      (take-while lessThan (fib 1.0 1.0))))))

(defn modzero? [modu, num] (= 0 (mod num modu)))

(defn primes-to [limit] (loop [num 2 coll (range 1 limit)]
  (if (= (/ limit 2) num)
    coll
    (recur (inc num) (filter (fn [x] (or
                                       (= num x)
                                       (not= 0 (mod x num))))
                                      coll))
  )
))

(defn pfactors [num] (filter (fn [x] (= 0 (mod num x))) (primes-to (/ num 2))))

;;From SO
(defn sieve [s]
  (cons (first s)
        (lazy-seq (sieve (filter
                            #(not= 0 (mod % (first s)))
                            (rest s))))))
;;end SO

(println (str "Solves # 3: Guess not. My prime generator is too slow." ))

(defn palin [x] (= (str x) (clojure.string/join (reverse (str x)))))
(println (str "Solves # 4: " (apply max
                              (filter palin
                                      (for [x (range 100 1000) y (range 100 1000)]
                                            (* x y))))))

(defn allgood [x] (every? #(zero? (mod x %1)) (range 1 21)))

(allgood 232792560)
(take 5 (range))

(defn find-first
         [f coll]
         (first (filter f coll)))

(println (str "Solves # 5: ") (find-first allgood (range 1 10000000000)))


(.pow (BigInteger. "2") 10)

(defn squareSums [x] (.pow (BigInteger. (str (apply + (range 1 (inc x))))) 2 ))
(defn sumSquares [x] (reduce + (map #(* %1 %1)
                                  (range 1 (inc x)))))

(println (str "Solves # 5: ") (- (squareSums 100) (sumSquares 100)))

)
