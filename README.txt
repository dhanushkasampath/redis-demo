Caching is very important when you deal with huge amount of Data.

Types of Caching:
1. in memory -> cache is created in the memory of the application.(Heap area)
In memory cache is fine when you have a single node. but when you have multiple, it gives out dated results

2. Distributed

Annotation used in caching
@EnableCaching -> Enable us to make use of caching
@Cacheable
@CachePut
@CacheEvict
@Caching