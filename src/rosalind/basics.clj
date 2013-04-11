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
    (* (/ (+ (:G s) (:C s)) (+ (:G s) (:C s) (:A s) (:T s))) 100.0)))

(defn generic-fib
  "A generic Fibonacci number-spitter-outer"
  [n k]
  (loop [n-1 1
         n-2 1
         gen 2]
    (if (>= gen n)
      n-1
      (recur (+ n-1 (* n-2 k)) n-1 (inc gen)))))

(defn hamming-distance
  "Gives the Hamming distance between 2 strings"
  [str1 str2]
  (loop [s1  str1
         s2  str2
         acc 0]
    (if (empty? s1)
      acc
      (recur (rest s1) (rest s2)
        (if (= (first s1) (first s2))
          acc
          (inc acc))))))

(defn fact
  "Gets the factorial of a number"
  [n]
  (loop [i   n
         acc 1]
    (if (zero? i)
      acc
      (recur (dec i) (* acc i)))))

(fact 5)

(defn permutations
  "The total number of permutations of length n, followed by a list of all such permutations"
  [n]
  (loop [v (fact n)
         k [1]
         l 1]
    (if (= v l)
      k
      (recur v (conj k l) (inc l)))))

(defn mendel
  "Mendel's First Law"
  [dom hetero rec]
  nil)

(def codon
    { "UUU" "F"    "CUU" "L"    "AUU" "I"    "GUU" "V"
      "UUC" "F"    "CUC" "L"    "AUC" "I"    "GUC" "V"
      "UUA" "L"    "CUA" "L"    "AUA" "I"    "GUA" "V"
      "UUG" "L"    "CUG" "L"    "AUG" "M"    "GUG" "V"
      "UCU" "S"    "CCU" "P"    "ACU" "T"    "GCU" "A"
      "UCC" "S"    "CCC" "P"    "ACC" "T"    "GCC" "A"
      "UCA" "S"    "CCA" "P"    "ACA" "T"    "GCA" "A"
      "UCG" "S"    "CCG" "P"    "ACG" "T"    "GCG" "A"
      "UAU" "Y"    "CAU" "H"    "AAU" "N"    "GAU" "D"
      "UAC" "Y"    "CAC" "H"    "AAC" "N"    "GAC" "D"
      "UAA" nil    "CAA" "Q"    "AAA" "K"    "GAA" "E"
      "UAG" nil    "CAG" "Q"    "AAG" "K"    "GAG" "E"
      "UGU" "C"    "CGU" "R"    "AGU" "S"    "GGU" "G"
      "UGC" "C"    "CGC" "R"    "AGC" "S"    "GGC" "G"
      "UGA" nil    "CGA" "R"    "AGA" "R"    "GGA" "G"
      "UGG" "W"    "CGG" "R"    "AGG" "R"    "GGG" "G"})

(defn rna->prot
  "does rna stuff"
  [rna]
  nil)


