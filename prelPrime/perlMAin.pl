use warnings;
use strict;

my $filenameIn = 'test.txt';
my $filenameOut = 'output.txt';


open(FI, '<', $filenameIn) or die $!;
open(FO, '>', $filenameOut) or die $!;

while(<FI>){
    print $_;
    if(index($_,"not")==-1){
        my $index=index($_,' ');
        my $number =substr($_,0,$index);
        print FO "$number \n" ; 
    }

}

close(FI);
close(FO);