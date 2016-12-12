## Randomized Media Player for Kettou's Cards

For those of you who recently bought the card game,
[Kettou](http://www.tableforged.com/kettou "Kettou by Table Forged"), you'll
notice that there aren't any online tools to play the different media files
provided by [Table Forged](http://www.tableforged.com "Table Forged") randomly
and on command. Therefore, you would likely need a third person on standby
reading out a random card every round. Instead, why not have a program automate
that and have it call out a random card every round with the press of a button?
I have quickly written up a simple program runnable on the terminal. All the
necessary files to compile and run the program are included in this repo.
Simply compile and run the program per the commands below:

##### Compiling:
```bash
javac -cp ":./JLayer1.0.1/jl1.0.1.jar" Kettou.java
```

##### Running;
```bash
java -cp ":./JLayer1.0.1/jl1.0.1.jar" Kettou
```

The original media files are found here: [Media Files](https://www.dropbox.com/sh/lzjmfzfdv9tov9t/AADWEc0AcsLsXJ509-VLzAkJa?dl=0 "Media Files")

The program was made with the help of [JLayer](http://www.javazoom.net/javalayer/javalayer.html "JLayer") as well.
