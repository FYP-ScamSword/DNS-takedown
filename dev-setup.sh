#!/usr/bin/env bash
pip install pre-commit
pre-commit install

# Test pre-commit hooks once
pre-commit run --all-files
