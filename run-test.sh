#! /usr/bin/env bash
set -e

DURATION=120 # seconds
CONCURRENT=1
TEMPLATE=""

if [ $# -eq 2 ]
then
	TEMPLATE=$1
	CONCURRENT=$2
elif [ $# -eq 1 ]
then
	TEMPLATE=$1
fi

beast run -t $DURATION -c $CONCURRENT -config beast-config.json -data test-data.csv $TEMPLATE
