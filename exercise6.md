# Exercise 6 - Maven Site Documentation

## How to generate Maven Site
- Add `maven-site-plugin` and `maven-project-info-reports-plugin` to `pom.xml`
- Run `mvn site` in terminal
- Output is in `target/site/index.html`

## site.xml and pom.xml
- `site.xml` configures the navigation menu and custom pages
- `pom.xml` holds project metadata (name, URL, developers), plugins, dependencies

## Important configs
- Markdown support via `doxia-module-markdown`
- Link to README and exercise6.md in site

## Internal Link
Go back to the [README](./README.md).
