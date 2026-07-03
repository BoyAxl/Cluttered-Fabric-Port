# Release Publishing

This repo publishes release files from GitHub Releases.

## One-time setup

### CurseForge

1. Open the CurseForge API token page:

```text
https://www.curseforge.com/account/api-tokens
```

2. Log in if CurseForge asks you to.
3. Create or copy a CurseForge API token.
4. Open this GitHub repository.
5. Go to Settings -> Secrets and variables -> Actions.
6. Click New repository secret.
7. Use this name:

```text
CURSEFORGE_TOKEN
```

8. Paste the CurseForge token as the value.
9. Save it.

Do not put the token in a commit, release body, Discord message, or issue.

### Modrinth

1. Create a Modrinth project for this port, or get added to an existing project's team.
2. Generate a Modrinth personal access token from the account settings.
3. Give the token the `VERSION_CREATE` scope.
4. Open this GitHub repository.
5. Go to Settings -> Secrets and variables -> Actions.
6. Click New repository secret.
7. Use this name:

```text
MODRINTH_TOKEN
```

8. Paste the Modrinth token as the value.
9. Save it.

The Modrinth project ID is stored in `.github/workflows/publish-curseforge.yml`. This port currently uses:

```text
lkSv4ZVS
```

The Modrinth publish step is skipped until `MODRINTH_TOKEN` exists, so CurseForge publishing can keep working while Modrinth is not set up yet.

## Version names

Older manual CurseForge uploads used `r1`, `r2`, and `r3` style names. New automated releases should use a small port version instead.

Use this format:

```text
cluttered-<upstream-version>-<minecraft-version>-<port-version>-fabric-unofficial.jar
```

Use `26.1.x` for a jar that is built against the 26.1 baseline and declares support for the whole 26.1 patch line.

For this port, the current compatibility release is:

```properties
mod_version=3.0.3-26.1.x-0.2.3-fabric-unofficial
```

That produces:

```text
cluttered-3.0.3-26.1.x-0.2.3-fabric-unofficial.jar
```

Future small fixes should become `0.2.4`, `0.2.5`, and so on. Use `0.3.0` when the port gets another larger feature or compatibility update.

## Publishing a new version

1. Update `mod_version` in `gradle.properties`.
2. Commit and push the change.
3. Open GitHub -> Releases -> Draft a new release.
4. Create a new tag that matches the version, prefixed with `v`.

For example:

```text
v3.0.3-26.1.x-0.2.3-fabric-unofficial
```

5. Set the release title.

For example:

```text
Cluttered 3.0.3 - 26.1.x Fabric 0.2.3 (Unofficial Port)
```

6. Write the changelog in the release body.
7. Click Publish release.

GitHub Actions will build the mod, attach the jar to the GitHub Release, and upload the same jar to CurseForge project `1545340`. If Modrinth credentials are configured, it will also upload the same jar to Modrinth. The GitHub Release body becomes the platform changelog.

Modrinth version numbers have a stricter length limit than GitHub tags. The workflow keeps the full tag for GitHub and CurseForge, but publishes Modrinth using the same version without the leading `v` and trailing `-unofficial`.

## Publishing an existing release to Modrinth

Use this when a GitHub Release already exists and only Modrinth needs to be backfilled.

1. Open GitHub -> Actions.
2. Click Publish Release.
3. Click Run workflow.
4. Set `tag` to the existing release tag, for example:

```text
v3.0.3-26.1.x-0.2.3-fabric-unofficial
```

5. Set `publish_curseforge` to `false`.
6. Set `publish_modrinth` to `true`.
7. Fill `name` and `changelog`, or leave them empty if the tag is enough for the manual upload.
8. Click Run workflow.

## If it fails

1. Open GitHub -> Actions.
2. Click Publish Release.
3. Open the failed run.
4. Read the red step.
5. Fix the problem and use Re-run jobs.

Most CurseForge failures are caused by a missing `CURSEFORGE_TOKEN`, an expired token, a wrong CurseForge project ID, or a release version that already exists on CurseForge.

Most Modrinth failures are caused by a missing `MODRINTH_TOKEN`, a wrong Modrinth project ID, a token without `VERSION_CREATE`, no team access to the project, a project still waiting for approval, or a release version that already exists on Modrinth.
