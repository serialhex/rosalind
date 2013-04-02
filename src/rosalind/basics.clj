(ns rosalind.basics)

(defn dna-counter-fn
  "This actually does the counting"
  [dna cnt]
  (let [l (first dna)
        r (rest dna)]
    (case l
        \A (def h (assoc cnt :A (+ 1 (:A cnt))))
        \G (def h (assoc cnt :G (+ 1 (:G cnt))))
        \C (def h (assoc cnt :C (+ 1 (:C cnt))))
        \T (def h (assoc cnt :T (+ 1 (:T cnt))))
        nil)
    (if (empty? r)
      h
      (recur r h))))

(defn dna-count
  "Counts DNA Neucleotides"
  [dna]
  (let [h (dna-counter-fn dna {:A 0 :C 0 :T 0 :G 0})]
    [(:A h) (:C h) (:G h) (:T h)]))
