# Exercise 6 - Maven Site Documentation

## How to generate Maven Site
- Add `maven-site-plugin` and `maven-project-info-reports-plugin` to `pom.xml`
- Run `mvn site` in terminal
- Output is in `target/site/index.html`

## site.xml and pom.xml
In Maven, site.xml (or site.yml) and pom.xml are used for different purposes, although both are used for project configuration. 
- `pom.xml` (Project Object Model)
The pom.xml is the central configuration file of a Maven project and defines:

> 1. Project metadata
> 2. dependencies
> 3. build configuration (plugins, compiler settings>)
> 4. profiles (environment-dependent configurations)
> 5. repository configuration (where artifacts are published) 
> 6. reporting (reports, e.g. for tests & code coverage)

- `site.xml`(Maven Site Descriptor)
The site.xml file is used for the project's documentation website (generated with maven-site-plugin). It controls:
> 1. Structure of the project website
> 2. Pages and content (HTML, Markdown, Doxia format)
> 3. Skin customization (website design)
> 4. Internationalization (multilingual websites)


## Important configs
- Developer information configured in pom.xml
````
<name>calculator</name>
<url>https://github.com/LiyuWu1976/msd24_wu_liyu.git</url>
<description>A simple calculator project for MSD course</description>
<developers>
    <developer>
      ...
    </developer>
</developers>
<scm>...</scm>
````




## Internal Link
Go back to the [README](./README.md).
