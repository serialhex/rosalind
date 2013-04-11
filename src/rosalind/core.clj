(ns rosalind.core
  (:use rosalind.basics
        rosalind.datatypes))

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(defn -main
  "Main entry point"
  []
  (foo "oh bother..."))

(defn rosalind-compute-gc
  "Computing GC Content Problem"
  []
  (map (fn [x]
    (vector (:id x) (cg-content (:dna x))))
    (from-str (slurp "data/rosalind_gc.txt"))))


