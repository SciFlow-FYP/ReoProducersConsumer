ReoProducersConsumer

This is a concurrent program that repeatedly prints the outputs of two processes in alternating order, using Reo. For that, we split this program into three different processes: two producers which produce outputs and a consumer which alternately prints those outputs. These processes are connected via a network of channels and nodes, which constitutes the protocol of the program. The definition of the protocol is expressed using primitive Reo channels, which are imported from the standard library.

Processes were written as java methods inside a separate java file. And inside the same folder, we created a Reo file which defines the main component, which is a set containing an instance of the two producers and consumer processes, and an instance of the protocol. To get the definitions of processes, Reo file just refers to the Java file.
