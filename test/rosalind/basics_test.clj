(ns rosalind.basics-test
  (:use clojure.test
        rosalind.basics))

(deftest basics
  (testing "Counting DNA Nucleotides"
    (is (=
      [20 12 17 21]
      (dna-count "AGCTTTTCATTCTGACTGCAACGGGCAATATGTCTCTGTGTGGATTAAAAAAAGAGTGTCTGATAGCAGC"))))

  (testing "Transcribing DNA into RNA"
    (is (= "GAUGGAACUUGACUACGUAAAUU"
      (transcribe-dna "GATGGAACTTGACTACGTAAATT"))))

  (testing "Complementing a Strand of DNA"
    (is (= "ACCGGGTTTT"
      (complement-dna "AAAACCCGGT")))))
