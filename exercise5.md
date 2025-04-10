# Exercise 5 

## Overview

Logging in Java mit Log4j

## Why are logging libraries used?

Logging libraries such as Log4j are used to record important runtime information during the execution of an application. They provide several key benefits:

- **Debugging** – Help developers identify and fix issues in the code
- **Monitoring** – Track application behavior in production environments
- **Auditing** – Keep records of important actions and events
- **Controlled output** – Replace unstructured `System.out.println()` calls with configurable, structured logs
- **Filtering** – Allow selective logging based on severity levels

## What log levels are there in Log4j and what do they mean?

Log4j provides several log levels, each indicating the severity or importance of a log message:

- **FATAL** – Very severe error that will likely cause the application to terminate
- **ERROR** – Error that prevents a function from running correctly, but the application may continue
- **WARN** – Warning about potential issues or deprecated usage
- **INFO** – General information about the application’s progress or state
- **DEBUG** – Detailed information for debugging purposes
- **TRACE** – Extremely fine-grained information for diagnosing hard-to-track problems

By configuring the log level, you can control which messages get logged. For example, in production, you may only log WARN and above to reduce log volume.

## What configuration options does Log4j provide?

Log4j offers a wide range of configuration options:

- **Configuration formats** – Supports XML, JSON, YAML, and properties files (e.g., `log4j2.xml`, `log4j.properties`)
- **Output destinations (appenders)** – Log to console, files, rolling files, remote servers, databases, etc.
- **Layouts** – Customize the format of log messages (e.g., timestamps, thread names, log levels)
- **Filters** – Apply filters to include or exclude certain logs based on patterns, levels, or loggers
- **Async logging** – Improve performance by logging asynchronously
- **Rolling policies** – Automatically rotate log files based on size, time, or other criteria

These features make Log4j highly flexible and suitable for applications of all sizes.


## Internal Link
Go back to the [README](./README.md).

