(ns rosalind.core
  (:use rosalind.basics))

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(defn -main
  "Main entry point"
  []
  (foo "oh bother..."))
