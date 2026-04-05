I am learning a bit about the scanner class. Apparently nextInt has to be followed by nextLine as nextInt does not
consume the remaining \n left in the buffer.

It will be interesting to learn how it all works internally. When we pass System.in in the Scanner class, we are 
probably telling it to read the inputs from the terminal.

Where are these stored? In a buffer? How much input can we actally store in a buffer ? Is there a limit?

When we enter 2 integers in this way : 
10
10

and then, if we do nextInt() twice, it does read both of them. I didn't get why.

The answer to this problem is that \n is a delimeter and not a token. NextInt skips delimeters and only read tokens. However, NextLine will consume \n.
