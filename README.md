Based on kotlin-benchmarks [kotlin-benchmarks](https://github.com/JetBrains/kotlin-benchmarks)

A set of JMH benchmarks for the [KMapper project](https://github.com/LucasKonrath/KMapper)

Build:
```
mvn clean package
```

Note: need clean package every time, otherwise removed benchmarks will be hanging around.

Run:
```
java -jar target/benchmarks.jar -rf json
```

The results are stored in a file called [jmh-result.json](https://github.com/LucasKonrath/KMapper-Perfomance-Tests/blob/main/jmh-result.json). You can visualize them online on https://jmh.morethan.io/.

Also see commands.txt for more pre-configured commands.


# Last results:

| Benchmark                                                                                        | Mode   | Cnt     | Score    | Error            | Units  |
|--------------------------------------------------------------------------------------------------|--------|---------|----------|------------------|--------|
| KMapperBenchmark.mappingColdStartComplexClass                                                    | thrpt  | 200     | 0.048    | ±  0.004         | ops/ms |
| KMapperBenchmark.mappingColdStartSimpleClass                                                     | thrpt  | 200     | 2.124    | ±  0.143         | ops/ms |
| KMapperBenchmark.mappingWithAnnotatedValuesCached                                                | thrpt  | 200     | 142.943  | ±  5.677         | ops/ms |
| KMapperBenchmark.mappingWithAnnotatedValuesNotCached                                             | thrpt  | 200     | 2.087    | ±  0.061         | ops/ms |
| KMapperBenchmark.mappingWithCacheComplexClass                                                    | thrpt  | 200     | 3.117    | ±  0.034         | ops/ms |
| KMapperBenchmark.mappingWithCacheSimpleClass                                                     | thrpt  | 200     | 52.588   | ±  1.785         | ops/ms |
| KMapperBenchmark.straightMappingComplexClass                                                     | thrpt  | 200     | 3.125    | ±  0.054         | ops/ms |
| KMapperBenchmark.straightMappingSimpleClass                                                      | thrpt  | 200     | 54.691   | ±  0.562         | ops/ms |
| KMapperBenchmark.mappingColdStartComplexClass                                                    | avgt   | 200     | 20.176   | ±  1.472         | ms/op  |
| KMapperBenchmark.mappingColdStartSimpleClass                                                     | avgt   | 200     | 1.305    | ±  0.370         | ms/op  |
| KMapperBenchmark.mappingWithAnnotatedValuesCached                                                | avgt   | 200     | 0.006    | ±  0.001         | ms/op  |
| KMapperBenchmark.mappingWithAnnotatedValuesNotCached                                             | avgt   | 200     | 1.259    | ±  0.383         | ms/op  |
| KMapperBenchmark.mappingWithCacheComplexClass                                                    | avgt   | 200     | 0.466    | ±  0.118         | ms/op  |
| KMapperBenchmark.mappingWithCacheSimpleClass                                                     | avgt   | 200     | 0.020    | ±  0.001         | ms/op  |
| KMapperBenchmark.straightMappingComplexClass                                                     | avgt   | 200     | 0.376    | ±  0.007         | ms/op  |
| KMapperBenchmark.straightMappingSimpleClass                                                      | avgt   | 200     | 0.022    | ±  0.006         | ms/op  |
| KMapperBenchmark.mappingColdStartComplexClass                                                    | sample | 11315   | 23.401   | ±  3.372         | ms/op  |
| KMapperBenchmark.mappingColdStartComplexClass:mappingColdStartComplexClass·p0.00                 | sample |         | 0.229    |                  | ms/op  |
| KMapperBenchmark.mappingColdStartComplexClass:mappingColdStartComplexClass·p0.50                 | sample |         | 0.257    |                  | ms/op  |
| KMapperBenchmark.mappingColdStartComplexClass:mappingColdStartComplexClass·p0.90                 | sample |         | 0.379    |                  | ms/op  |
| KMapperBenchmark.mappingColdStartComplexClass:mappingColdStartComplexClass·p0.95                 | sample |         | 1.119    |                  | ms/op  |
| KMapperBenchmark.mappingColdStartComplexClass:mappingColdStartComplexClass·p0.99                 | sample |         | 500.695  |                  | ms/op  |
| KMapperBenchmark.mappingColdStartComplexClass:mappingColdStartComplexClass·p0.999                | sample |         | 1102.439 |                  | ms/op  |
| KMapperBenchmark.mappingColdStartComplexClass:mappingColdStartComplexClass·p0.9999               | sample |         | 1138.919 |                  | ms/op  |
| KMapperBenchmark.mappingColdStartComplexClass:mappingColdStartComplexClass·p1.00                 | sample |         | 1140.851 |                  | ms/op  |
| KMapperBenchmark.mappingColdStartSimpleClass                                                     | sample | 408291  | 0.526    | ±  0.040         | ms/op  |
| KMapperBenchmark.mappingColdStartSimpleClass:mappingColdStartSimpleClass·p0.00                   | sample |         | 0.048    |                  | ms/op  |
| KMapperBenchmark.mappingColdStartSimpleClass:mappingColdStartSimpleClass·p0.50                   | sample |         | 0.055    |                  | ms/op  |
| KMapperBenchmark.mappingColdStartSimpleClass:mappingColdStartSimpleClass·p0.90                   | sample |         | 0.064    |                  | ms/op  |
| KMapperBenchmark.mappingColdStartSimpleClass:mappingColdStartSimpleClass·p0.95                   | sample |         | 0.071    |                  | ms/op  |
| KMapperBenchmark.mappingColdStartSimpleClass:mappingColdStartSimpleClass·p0.99                   | sample |         | 0.146    |                  | ms/op  |
| KMapperBenchmark.mappingColdStartSimpleClass:mappingColdStartSimpleClass·p0.999                  | sample |         | 159.121  |                  | ms/op  |
| KMapperBenchmark.mappingColdStartSimpleClass:mappingColdStartSimpleClass·p0.9999                 | sample |         | 190.930  |                  | ms/op  |
| KMapperBenchmark.mappingColdStartSimpleClass:mappingColdStartSimpleClass·p1.00                   | sample |         | 292.553  |                  | ms/op  |
| KMapperBenchmark.mappingWithAnnotatedValuesCached                                                | sample | 3969669 | 0.007    | ±  0.001         | ms/op  |
| KMapperBenchmark.mappingWithAnnotatedValuesCached:mappingWithAnnotatedValuesCached·p0.00         | sample |         | 0.006    |                  | ms/op  |
| KMapperBenchmark.mappingWithAnnotatedValuesCached:mappingWithAnnotatedValuesCached·p0.50         | sample |         | 0.006    |                  | ms/op  |
| KMapperBenchmark.mappingWithAnnotatedValuesCached:mappingWithAnnotatedValuesCached·p0.90         | sample |         | 0.006    |                  | ms/op  |
| KMapperBenchmark.mappingWithAnnotatedValuesCached:mappingWithAnnotatedValuesCached·p0.95         | sample |         | 0.007    |                  | ms/op  |
| KMapperBenchmark.mappingWithAnnotatedValuesCached:mappingWithAnnotatedValuesCached·p0.99         | sample |         | 0.013    |                  | ms/op  |
| KMapperBenchmark.mappingWithAnnotatedValuesCached:mappingWithAnnotatedValuesCached·p0.999        | sample |         | 0.049    |                  | ms/op  |
| KMapperBenchmark.mappingWithAnnotatedValuesCached:mappingWithAnnotatedValuesCached·p0.9999       | sample |         | 0.738    |                  | ms/op  |
| KMapperBenchmark.mappingWithAnnotatedValuesCached:mappingWithAnnotatedValuesCached·p1.00         | sample |         | 13.271   |                  | ms/op  |
| KMapperBenchmark.mappingWithAnnotatedValuesNotCached                                             | sample | 393162  | 0.543    | ±  0.038         | ms/op  |
| KMapperBenchmark.mappingWithAnnotatedValuesNotCached:mappingWithAnnotatedValuesNotCached·p0.00   | sample |         | 0.047    |                  | ms/op  |
| KMapperBenchmark.mappingWithAnnotatedValuesNotCached:mappingWithAnnotatedValuesNotCached·p0.50   | sample |         | 0.055    |                  | ms/op  |
| KMapperBenchmark.mappingWithAnnotatedValuesNotCached:mappingWithAnnotatedValuesNotCached·p0.90   | sample |         | 0.063    |                  | ms/op  |
| KMapperBenchmark.mappingWithAnnotatedValuesNotCached:mappingWithAnnotatedValuesNotCached·p0.95   | sample |         | 0.071    |                  | ms/op  |
| KMapperBenchmark.mappingWithAnnotatedValuesNotCached:mappingWithAnnotatedValuesNotCached·p0.99   | sample |         | 0.161    |                  | ms/op  |
| KMapperBenchmark.mappingWithAnnotatedValuesNotCached:mappingWithAnnotatedValuesNotCached·p0.999  | sample |         | 136.171  |                  | ms/op  |
| KMapperBenchmark.mappingWithAnnotatedValuesNotCached:mappingWithAnnotatedValuesNotCached·p0.9999 | sample |         | 184.218  |                  | ms/op  |
| KMapperBenchmark.mappingWithAnnotatedValuesNotCached:mappingWithAnnotatedValuesNotCached·p1.00   | sample |         | 228.590  |                  | ms/op  |
| KMapperBenchmark.mappingWithCacheComplexClass                                                    | sample | 569119  | 0.375    | ±  0.028         | ms/op  |
| KMapperBenchmark.mappingWithCacheComplexClass:mappingWithCacheComplexClass·p0.00                 | sample |         | 0.078    |                  | ms/op  |
| KMapperBenchmark.mappingWithCacheComplexClass:mappingWithCacheComplexClass·p0.50                 | sample |         | 0.084    |                  | ms/op  |
| KMapperBenchmark.mappingWithCacheComplexClass:mappingWithCacheComplexClass·p0.90                 | sample |         | 0.090    |                  | ms/op  |
| KMapperBenchmark.mappingWithCacheComplexClass:mappingWithCacheComplexClass·p0.95                 | sample |         | 0.097    |                  | ms/op  |
| KMapperBenchmark.mappingWithCacheComplexClass:mappingWithCacheComplexClass·p0.99                 | sample |         | 0.156    | ms/op            |
| KMapperBenchmark.mappingWithCacheComplexClass:mappingWithCacheComplexClass·p0.999                | sample |         | 117.131  | ms/op            |
| KMapperBenchmark.mappingWithCacheComplexClass:mappingWithCacheComplexClass·p0.9999               | sample |         | 208.667  | ms/op            |
| KMapperBenchmark.mappingWithCacheComplexClass:mappingWithCacheComplexClass·p1.00                 | sample |         | 277.873  | ms/op            |
| KMapperBenchmark.mappingWithCacheSimpleClass                                                     | sample | 4552033 | 0.031    | ±  0.004   ms/op |
| KMapperBenchmark.mappingWithCacheSimpleClass:mappingWithCacheSimpleClass·p0.00                   | sample |         | 0.009    | ms/op            |
| KMapperBenchmark.mappingWithCacheSimpleClass:mappingWithCacheSimpleClass·p0.50                   | sample |         | 0.011    | ms/op            |
| KMapperBenchmark.mappingWithCacheSimpleClass:mappingWithCacheSimpleClass·p0.90                   | sample |         | 0.013    | ms/op            |
| KMapperBenchmark.mappingWithCacheSimpleClass:mappingWithCacheSimpleClass·p0.95                   | sample |         | 0.017    | ms/op            |
| KMapperBenchmark.mappingWithCacheSimpleClass:mappingWithCacheSimpleClass·p0.99                   | sample |         | 0.033    | ms/op            |
| KMapperBenchmark.mappingWithCacheSimpleClass:mappingWithCacheSimpleClass·p0.999                  | sample |         | 0.122    | ms/op            |
| KMapperBenchmark.mappingWithCacheSimpleClass:mappingWithCacheSimpleClass·p0.9999                 | sample |         | 42.336   | ms/op            |
| KMapperBenchmark.mappingWithCacheSimpleClass:mappingWithCacheSimpleClass·p1.00                   | sample |         | 1166.017 | ms/op            |
| KMapperBenchmark.straightMappingComplexClass                                                     | sample | 572848  | 0.401    | ±  0.048   ms/op |
| KMapperBenchmark.straightMappingComplexClass:straightMappingComplexClass·p0.00                   | sample |         | 0.004    | ms/op            |
| KMapperBenchmark.straightMappingComplexClass:straightMappingComplexClass·p0.50                   | sample |         | 0.005    | ms/op            |
| KMapperBenchmark.straightMappingComplexClass:straightMappingComplexClass·p0.90                   | sample |         | 0.007    | ms/op            |
| KMapperBenchmark.straightMappingComplexClass:straightMappingComplexClass·p0.95                   | sample |         | 0.011    | ms/op            |
| KMapperBenchmark.straightMappingComplexClass:straightMappingComplexClass·p0.99                   | sample |         | 0.020    | ms/op            |
| KMapperBenchmark.straightMappingComplexClass:straightMappingComplexClass·p0.999                  | sample |         | 170.695  | ms/op            |
| KMapperBenchmark.straightMappingComplexClass:straightMappingComplexClass·p0.9999                 | sample |         | 257.613  | ms/op            |
| KMapperBenchmark.straightMappingComplexClass:straightMappingComplexClass·p1.00                   | sample |         | 2256.536 | ms/op            |
| KMapperBenchmark.straightMappingSimpleClass                                                      | sample | 4284952 | 0.038    | ±  0.005         | ms/op  |
| KMapperBenchmark.straightMappingSimpleClass:straightMappingSimpleClass·p0.00                     | sample |         | 0.003    |                  | ms/op  |
| KMapperBenchmark.straightMappingSimpleClass:straightMappingSimpleClass·p0.50                     | sample |         | 0.003    |                  | ms/op  |
| KMapperBenchmark.straightMappingSimpleClass:straightMappingSimpleClass·p0.90                     | sample |         | 0.008    |                  | ms/op  |
| KMapperBenchmark.straightMappingSimpleClass:straightMappingSimpleClass·p0.95                     | sample |         | 0.010    |                  | ms/op  |
| KMapperBenchmark.straightMappingSimpleClass:straightMappingSimpleClass·p0.99                     | sample |         | 0.013    |                  | ms/op  |
| KMapperBenchmark.straightMappingSimpleClass:straightMappingSimpleClass·p0.999                    | sample |         | 0.055    |                  | ms/op  |
| KMapperBenchmark.straightMappingSimpleClass:straightMappingSimpleClass·p0.9999                   | sample |         | 77.136   |                  | ms/op  |
| KMapperBenchmark.straightMappingSimpleClass:straightMappingSimpleClass·p1.00                     | sample |         | 1415.578 |                  | ms/op  |
| KMapperBenchmark.mappingColdStartComplexClass                                                    | ss     | 10      | 270.743  | ± 13.082         | ms/op  |
| KMapperBenchmark.mappingColdStartSimpleClass                                                     | ss     | 10      | 226.423  | ±  9.110         | ms/op  |
| KMapperBenchmark.mappingWithAnnotatedValuesCached                                                | ss     | 10      | 230.720  | ±  5.846         | ms/op  |
| KMapperBenchmark.mappingWithAnnotatedValuesNotCached                                             | ss     | 10      | 232.039  | ± 12.163         | ms/op  |
| KMapperBenchmark.mappingWithCacheComplexClass                                                    | ss     | 10      | 262.566  | ±  4.194         | ms/op  |
| KMapperBenchmark.mappingWithCacheSimpleClass                                                     | ss     | 10      | 221.819  | ±  2.099         | ms/op  |
| KMapperBenchmark.straightMappingComplexClass                                                     | ss     | 10      | 0.781    | ±  0.066         | ms/op  |
| KMapperBenchmark.straightMappingSimpleClass                                                      | ss     | 10      | 0.824    | ±  0.036         | ms/op  |


