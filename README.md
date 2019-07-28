# ReoProducersConsumer

This is a concurrent program that repeatedly prints the outputs of two processes in alternating order, using Reo. For that, we split this program into three different processes: two producers which produce outputs and a consumer which alternately prints those outputs. These processes are connected via a network of channels and nodes, which constitutes the protocol of the program. The definition of the protocol is expressed using primitive Reo channels, which are imported from the standard library.

Processes were written as java methods inside a separate java file. And inside the same folder, we created a Reo file which defines the main component, which is a set containing an instance of the two producers and consumer processes, and an instance of the protocol. To get the definitions of processes, Reo file just refers to the Java file.

### More details

![Alternator](https://github.com/harmonyreo/ReoProducersConsumer/blob/master/reo%20connector.png)

Processes are connected via a network of channels, and nodes as in this diagram. 

And a,b,c are nodes. Source nodes are the ones who receive outputs from software components and the sink node merges channels that are coming from the source nodes.

We have used synchronous, fifo1 and synchronous drain channels in this example. These primitive Reo channels are imported from the standard reo library. 

Synchronous channels connects source and sink nodes while fifo has buffering capabilities. It means when the producer appears before the  consumer, the data item is stored inside the buffer, which can be later retrieved by the consumer.

Sync drain has two source ends and the data that input from both source ends will going to be lost in the channel.

Inside the same folder, we created a Reo file which defines the main component, It contains instances of producers, consumer, and the protocol.

Here the connector type in the protocol is the alternator and it is a predefined connector type in reo. And inside that the connection between 
components are defined by using the channels we discussed above.

Finally, To get the definitions of processes, Reo file just refers to the Java file using term or tag  #JAVA.

### How to run

1.First we compile the reo main file into java source code using reo main.treo command . Then it creates a main.java file. 
2.Then we compile Java source code to executable Java classes using javac main.javac , and
3.After that we execute the complete program by running the java command - java main.

Output of the process 02 is always prints after the the output of the process 01 since the channel between b and c has a buffer.
