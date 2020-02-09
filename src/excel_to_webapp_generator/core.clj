(ns excel-to-webapp-generator.core
  (:gen-class))


(defn convert-to-map
  [req]
  (print req)
  )
(defn getHeaders
  [req]
  (first req)
  )

(defn getValues
  [req]
  (next req)
  )


(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
