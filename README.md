# cerbtk - simple device registry
[![CircleCI](https://circleci.com/gh/infinimesh/cerbtk.svg?style=svg)](https://circleci.com/gh/infinimesh/cerbtk)
Just to see how a blockchain approach could solve some fundamental issues. Supposed as PoC, most work was done by Adrian (see credits).

## API

The registration instance is available at http://localhost:23230

As for now, it offers the following endpoints:
* `GET /device/all` for listing all existing devices in the chain
* `POST /device/write` for adding new device

Device send registration to the chain, gets a block back which is the device ID for all further communication. 
Using a private chain is not tamper proof as an public one, the registration process is just simplified and the 
owner of the chain has the full control.

ToDo:
- include LetsEncrypt certificates
- implement as an k8s service (mesh?)
- add contracting for IoT data sharing and handling

## Credit

This project uses some open source libraries:
* [Apache Commons Codec](https://github.com/apache/commons-codec)
* [JavaLin](https://javalin.io/)
* [Jackson Module Kotlin](https://github.com/FasterXML/jackson-module-kotlin)
* based on code of [Adrian Marszałek](https://github.com/adikm/kotcoin)
 
