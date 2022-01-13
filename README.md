# bim207-homework1
I am a 2nd year student at Eskişehir Technical University.
These are the Java codes I wrote for homework 1 given in the Bim 207 class.

About Usage

Files as argument i.e. java -jar target\WordCounter.jar sample1.txt sample2.txt 
-task : task name to run and should be one of following “NumOfTokens” “FrequentTerms” 
“TermLengthStats” “TermsStartWith” 
-r : refers to reverse order 
-u: refers to unique values 
-topN: Number of items to be printed 
-start: Terms starts with given String.

NumOfTokens

java -jar target\WordCounter.jar sample1.txt sample2.txt sample3.txt -task NumOfTokens 
Number of Tokens: 761 

java -jar target\WordCounter.jar sample1.txt sample2.txt sample3.txt -task NumOfTokens -u 
Number of Tokens: 309 


FrequentTerms

java -jar target\WordCounter.jar sample1.txt sample2.txt sample3.txt -task FrequentTerms 

the 39 
a 28 
and 26 
to 24 
is 14 

java -jar target\WordCounter.jar sample1.txt sample2.txt sample3.txt -task FrequentTerms -topN 10 


the 39 
a 28 
and 26 
to 24 
is 14 
of 13 
this 12 
an 11 
by 11 
are 9 

java -jar target\WordCounter.jar sample1.txt sample2.txt sample3.txt -task FrequentTerms -topN 10 
-r 
ad 1 
adapter 1 
administration 1 

advantage 1 
advent 1 
allows 1 
animation 1 
another 1 
application 1 
away 1 

TermLengthStats

java -jar target\WordCounter.jar sample1.txt sample2.txt sample3.txt -task TermLengthStats 
Max Token Length in Character: 16, Min Token Length: 1, Average Token Length: 5.2772 

java -jar target\WordCounter.jar sample1.txt sample2.txt sample3.txt -task TermLengthStats -u 
Max Token Length in Character: 16, Min Token Length: 1, Average Token Length: 6.4757 

TermsStartWith

java -jar target\WordCounter.jar sample1.txt sample2.txt sample3.txt -task TermsStartWith -start de 
declarations 
defines 
defining 
derive 
design 

java -jar target\WordCounter.jar sample1.txt sample2.txt sample3.txt -task TermsStartWith -start de 
-r 
devoted 
devote 
designing 
designers 
design 

java -jar target\WordCounter.jar sample1.txt sample2.txt sample3.txt -task TermsStartWith -start de 
-r -topN 10 
devoted 
devote 
designing 
designers 
design 
derive 
defining 
defines 
declarations 
