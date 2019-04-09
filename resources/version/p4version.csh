#!/usr/bin/env perl

use strict;
use warnings;

my $ver = "UNKNOWNA";
my $client = "";
my $cmd = "p4 info 2>&1";
my @lines = `$cmd`;
if ($?) {
    $ver = "UNKNOWNB";
} else {
    foreach my $l (@lines) {
        if ($l =~ /^Client name: (.+)$/) {
            $client = $1;
        }
    }
    my @v = `p4 changes -m1 \@$client 2>&1`;
    if ($?) {
        $ver = "UNKNOWNC";
    } else {
        chomp($v[0]);
        if ($v[0] !~ /^Change (\d+) on /) {
            $ver = "UNKNOWND";
        } else {
            my $vn = $1;
            my @m = `p4 opened -C $client 2>&1`;
            if ($?) {
                $ver = "UNKNOWND";
            } else {
                chomp($m[0]);
                if ($m[0] =~ /^File\(s\) not opened anywhere\.$/) {
                    $ver = "$vn";
                } else {
                    $ver = "${vn}M";
                }
            }
        }
    }
}
print $ver;
