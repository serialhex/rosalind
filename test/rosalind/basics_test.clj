(ns rosalind.basics-test
  (:use lazytest.deftest
        rosalind.basics))

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
      (cg-content "AGCTATAG"))))

  (testing "Generic Fibonacci"
    (is (= 19
      (generic-fib 5 3))))

  (testing "Counting Point Mutations - using Hamming distance"
    (is (= 7
      (hamming-distance "GAGCCTACTAACGGGAT" "CATCGTAATGACGGCCT"))))

  (testing "Mendel Probabilites - dominant def. parent"
    (is (= 1
       (mendel 1 0 1))))
  (testing "Mendel Probabilites - all recessive"
    (is (= 0
       (mendel 0 0 2))))

  (testing "Enumerating Gene Orders - using permutations"
    (is (= [6
            [1 2 3]
            [1 3 2]
            [2 1 3]
            [2 3 1]
            [3 1 2]
            [3 2 1]]
      (permutations 3))))

  (testing "Factorial"
    (is (= 120
      (fact 5))))

  (testing "Translating RNA into Protein"
    (is (= "MAMAPRTEINSTRING"
          (rna->prot "AUGGCCAUGGCGCCCAGAACUGAGAUCAAUAGUACCCGUAUUAACGGGUGA")))))
