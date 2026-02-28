# CLAUDE.md

This file provides guidance for AI assistants (Claude and others) working in this repository.

## Repository Overview

**hello-world** is a beginner's learning repository owned by a graduating CS student
exploring multiple programming languages, with a primary focus on Java.

- **Purpose**: Personal learning and experimentation
- **Primary language interest**: Java (other languages welcome)
- **Status**: Early-stage / bootstrapping

## Repository Structure

```
hello-world/
├── .github/
│   └── workflows/
│       └── blank.yml    # GitHub Actions CI workflow (runs on every push)
├── README.md            # Project description
└── CLAUDE.md            # This file
```

## CI / GitHub Actions

The repository uses a single GitHub Actions workflow defined in `.github/workflows/blank.yml`:

- **Trigger**: Every `push` to any branch
- **Runner**: `ubuntu-latest`
- **Current steps**: Echoes placeholder messages only — no real build, test, or deploy steps yet
- **Actions version**: Uses `actions/checkout@v1` (older pin)

When adding real code, update the workflow to include appropriate build, lint, and test steps.

## Development Conventions

### Branching
- Feature/task branches follow the pattern: `claude/<description>-<session-id>`
- The main branch is `master`

### Commits
- Use clear, descriptive commit messages that explain *why* a change was made
- Keep commits focused and atomic

### Code Style
No language-specific style guide has been established yet. When adding code:
- Follow idiomatic conventions for the language being used
- Java: use standard Oracle/Google Java style (4-space indentation, CamelCase classes, camelCase methods)
- Prefer readability over cleverness, especially since this is a learning repo

## Guidance for AI Assistants

- This is a **learning repository** — prefer approaches that are educational and well-commented
- When adding new code examples, favor clarity over optimization
- Do not over-engineer solutions; keep things simple and easy to understand
- When introducing a new language or concept, briefly explain what the code does
- Update the CI workflow (`blank.yml`) when real build/test commands become available
- Always develop on the designated `claude/` branch and push there — never push directly to `master`
