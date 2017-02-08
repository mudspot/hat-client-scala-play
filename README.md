# Scala API wrappers for the HAT

Current Version: 2.2.0

This repository provides convenience wrappers around HAT HTTP APIs and contains 
the most up-to-date set of typesafe HAT Data Models and Play-JSON based
serializers and deserializers for them.

It relies on Play-WS for an asynchronous HTTP client.

To use the client, it is sufficient to create a new one with minimal configuration:

    new HatClient(wsClient, hatAddress, schema)

Where:

- wsClient is an instance of the WS Client, ideally dependency-injected in most cases - check Play documentation for details
- hatAddress is the fully-qualified domain name of the HAT (e.g. example.hubofallthings.net)
- schema is the schema of the address, can either be "http://" (only for development environments) or "https://" (the default if you omit the parameter)

The client is non-blocking and is built around standard Scala Futures. For example, to authenticate with a HAT and request data from it you would then run:

    val hat = new HatClient(wsClient, hatAddress, schema)
    for {
      accessToken <- hat.authenticateForToken(dataShopperUsername, dataShopperPassword)
      values <- hat.dataDebitValues(dataDebitId)
    } yield values

## Publishing locally

Use SBT to publish the project as a local package for including in other projects:

    sbt publishLocal

Using it then becomes as simple as:

    libraryDependencies ++= "org.hatdex" %% "hat" % version