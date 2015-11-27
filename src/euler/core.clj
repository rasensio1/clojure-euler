(ns euler.core)


(defn -main [& args]

(defn want [x] 
  (or 
    (= 0 (mod x 3)) 
    (= 0 (mod x 5))))

(println (apply + (filter want (range 1 1000)))))
