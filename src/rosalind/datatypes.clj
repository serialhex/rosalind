(ns rosalind.datatypes
  (:use [clojure.string :only (split join)]))

(defrecord Fasta
  [id
   dna])

; maybe shouldn't have this here,
; or maybe i should bring all the import/export stuff here,
; i can always refactor...
(defn from-str
  "Takes a string & turns it into a Rosalind FASTA record"
  [string]
  (remove nil? ;; wasteful, i know!
    (map (fn [s]
          (if (empty? s)
            nil
            (let [d (split s #"\n")]
              (Fasta.
                (first d) ;id
                (join (rest d)) ;dna
              ))))
    (split string #">"))))


;; (spit) to write
;; (slurp) to read
;;  God I love Lispers!!!

