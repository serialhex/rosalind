(ns rosalind.basics)

(defn dna-counter-fn
  "This actually does the counting"
  [dna cnt]
  (loop [d dna
         c cnt]
    (let [l (first d)
          r (rest d)]
      (case l
          \A (def h (assoc c :A (+ 1 (:A c))))
          \G (def h (assoc c :G (+ 1 (:G c))))
          \C (def h (assoc c :C (+ 1 (:C c))))
          \T (def h (assoc c :T (+ 1 (:T c))))
          nil)
      (if (empty? r)
        h
        (recur r h)))))

(defn dna-count
  "Counts DNA Neucleotides"
  [dna]
  (let [h (dna-counter-fn dna {:A 0 :C 0 :T 0 :G 0})]
    [(:A h) (:C h) (:G h) (:T h)]))
