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


)
