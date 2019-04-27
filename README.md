# Magic-Ride-Backend
Database management to Magic Ride application


In the backend we used the SpringBoot framework, which like Spring is used to do dependency injection through annotations (ex: @RestController, @Service, ...), to avoid even more boilerplate code we use the Lombok library that gave us access to other annotations (eg @Getter, @Setter, @EqualsAndHashCode, ...).

We used the Hibernate framework (which implements the Java Persistence API) to annotate our entities that would be persisted (users, guides, tags and locations).

The persistence was performed in a mySQL database, configured by the team during the 24 hours of programming.

All this served as a separate service that responded to REST requests with JSONS and was our back end.
