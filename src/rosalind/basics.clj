(ns rosalind.basics)

(defn count-dna
  "Counts DNA Nucleotides"
  [dna-str]
  (reduce (fn [c base]
      (case base
          \A (assoc c :A (+ 1 (:A c)))
          \G (assoc c :G (+ 1 (:G c)))
          \C (assoc c :C (+ 1 (:C c)))
          \T (assoc c :T (+ 1 (:T c)))
          nil))
    {:A 0 :C 0 :T 0 :G 0}
    dna-str))

(defn transcribe-dna
  "Transcribes DNA to the equivalent RNA"
  [dna-str]
  (clojure.string/replace dna-str #"T" "U"))

(defn complement-dna
  "Gets the complement of a strand of DNA"
  [dna-str]
  (reduce (fn [cmp base]
            (case base
              \A (str "T" cmp)
              \T (str "A" cmp)
              \C (str "G" cmp)
              \G (str "C" cmp)))
      ""
      dna-str))

(defn cg-content
  "Computes the CG content of a strand of DNA"
  [dna-str]
  (let [s (count-dna dna-str)]
    (/ (+ (:G s) (:C s)) (+ (:G s) (:C s) (:A s) (:T s)))))
