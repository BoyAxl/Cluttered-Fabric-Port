# Release Publishing

This repo publishes CurseForge files from GitHub Releases.

## One-time setup

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

## Version names

Older manual CurseForge uploads used `r1`, `r2`, and `r3` style names. New automated releases should use a small port version instead.

Use this format:

```text
cluttered-<upstream-version>-<minecraft-version>-<port-version>-fabric-unofficial.jar
```

Use `26.1.x` for a jar that is built against the 26.1 baseline and declares support for the whole 26.1 patch line.

For this port, the current compatibility release is:

```properties
mod_version=3.0.3-26.1.x-0.2.1-fabric-unofficial
```

That produces:

```text
cluttered-3.0.3-26.1.x-0.2.1-fabric-unofficial.jar
```

Future small fixes should become `0.2.2`, `0.2.3`, and so on. Use `0.3.0` when the port gets another larger feature or compatibility update.

## Publishing a new version

1. Update `mod_version` in `gradle.properties`.
2. Commit and push the change.
3. Open GitHub -> Releases -> Draft a new release.
4. Create a new tag that matches the version, prefixed with `v`.

For example:

```text
v3.0.3-26.1.x-0.2.1-fabric-unofficial
```

5. Set the release title.

For example:

```text
Cluttered 3.0.3 - 26.1.x Fabric 0.2.1 (Unofficial Port)
```

6. Write the changelog in the release body.
7. Click Publish release.

GitHub Actions will build the mod, attach the jar to the GitHub Release, and upload the same jar to CurseForge project `1545340`. The GitHub Release body becomes the CurseForge changelog.

## If it fails

1. Open GitHub -> Actions.
2. Click Publish CurseForge Release.
3. Open the failed run.
4. Read the red step.
5. Fix the problem and use Re-run jobs.

Most failures are caused by a missing `CURSEFORGE_TOKEN`, an expired token, a wrong CurseForge project ID, or a release version that already exists on CurseForge.
