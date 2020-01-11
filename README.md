1. Import this project into IDEA
2. Run `Service.main()` or run `./gradlew bootRun` at the command line
3. Run `Client.main()`

On (3), you'll see results like the following:

    n requests: 100
    total ms:   223
    ms per req: 2.23

Exact results will vary according to hardware but in any case run `Client.main()` multiple times to get the full benefit of a warmed-up `Service` JVM.
