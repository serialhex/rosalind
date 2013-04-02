(ns rosalind.basics-test
  (:use clojure.test
        rosalind.basics))

(deftest a-test
  (testing "DNA counting stuff"
    (is (=
      [20 12 17 21]
      (dna-count "AGCTTTTCATTCTGACTGCAACGGGCAATATGTCTCTGTGTGGATTAAAAAAAGAGTGTCTGATAGCAGC")))))
