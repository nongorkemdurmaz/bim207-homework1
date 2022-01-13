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

`java -jar target\WordCounter.jar sample1.txt sample2.txt sample3.txt -task NumOfTokens`

Number of Tokens: 761 

`java -jar target\WordCounter.jar sample1.txt sample2.txt sample3.txt -task NumOfTokens -u`

Number of Tokens: 309 


FrequentTerms

`java -jar target\WordCounter.jar sample1.txt sample2.txt sample3.txt -task FrequentTerms`


the 39 <br>
a 28 <br>
and 26 <br>
to 24 <br>
is 14 <br>


`java -jar target\WordCounter.jar sample1.txt sample2.txt sample3.txt -task FrequentTerms -topN 10`


the 39 <br>
a 28 <br>
and 26 <br>
to 24 <br>
is 14 <br>
of 13 <br>
this 12 <br>
an 11 <br>
by 11 <br>
are 9 <br>

`java -jar target\WordCounter.jar sample1.txt sample2.txt sample3.txt -task FrequentTerms -topN 10
-r `

ad 1 <br>
adapter 1 <br>
administration 1 <br>
advantage 1 <br>
advent 1 <br>
allows 1 <br>
animation 1 <br>
another 1 <br>
application 1 <br>
away 1 <br>

TermLengthStats

`java -jar target\WordCounter.jar sample1.txt sample2.txt sample3.txt -task TermLengthStats`

Max Token Length in Character: 16, Min Token Length: 1, Average Token Length: 5.2772 

`java -jar target\WordCounter.jar sample1.txt sample2.txt sample3.txt -task TermLengthStats -u`

Max Token Length in Character: 16, Min Token Length: 1, Average Token Length: 6.4757 

TermsStartWith

`java -jar target\WordCounter.jar sample1.txt sample2.txt sample3.txt -task TermsStartWith -start de` 

declarations <br>
defines <br>
defining <br>
derive <br>
design <br>

`java -jar target\WordCounter.jar sample1.txt sample2.txt sample3.txt -task TermsStartWith -start de 
-r`

devoted <br>
devote <br>
designing <br>
designers <br>
design <br>

`java -jar target\WordCounter.jar sample1.txt sample2.txt sample3.txt -task TermsStartWith -start de 
-r -topN 10` 

devoted <br>
devote <br>
designing <br>
designers <br>
design <br>
derive <br>
defining <br>
defines <br>
declarations <br>
