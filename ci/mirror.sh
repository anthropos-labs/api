#!/bin/bash

set -eux

ssh-keyscan -t rsa github.com >> ~/.ssh/known_hosts

git remote add mirror git@github.com:anthropos-labs/api.git
git push --mirror mirror
