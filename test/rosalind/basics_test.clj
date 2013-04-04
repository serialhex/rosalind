(ns rosalind.basics-test
  (:use clojure.test
        rosalind.basics))

; (defun ~=
;   "bleh"
;   [a b e])

(deftest basics
  (testing "Counting DNA Nucleotides"
    (is (=
      {:A 20 :C 12 :G 17 :T 21}
      (count-dna "AGCTTTTCATTCTGACTGCAACGGGCAATATGTCTCTGTGTGGATTAAAAAAAGAGTGTCTGATAGCAGC"))))

  (testing "Transcribing DNA into RNA"
    (is (= "GAUGGAACUUGACUACGUAAAUU"
      (transcribe-dna "GATGGAACTTGACTACGTAAATT"))))

  (testing "Complementing a Strand of DNA"
    (is (= "ACCGGGTTTT"
      (complement-dna "AAAACCCGGT"))))

  (testing "Getting the CG-content"
    (is (= 37.5
      (cg-content "AGCTATAG")))))
