#!/bin/bash
set -ux

buf lint

# kvstore
cd databaseapi || exit
buf breaking --against buf.build/anthropos-labs/kvstore --error-format junit > kvstore.xml
cd .. || exit

# errors
cd errorapi || exit
buf breaking --against buf.build/anthropos-labs/errors --error-format junit > errors.xml
cd .. || exit

# raft
cd raftapi || exit
buf breaking --against buf.build/anthropos-labs/raft --error-format junit > raft.xml
cd .. || exit

echo "##teamcity[importData type='junit' path='databaseapi/kvstore.xml']"
echo "##teamcity[importData type='junit' path='errorapi/errors.xml']"
echo "##teamcity[importData type='junit' path='raftapi/raft.xml']"
