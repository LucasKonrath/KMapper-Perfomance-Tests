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

| Benchmark                                                                             | Mode   | Cnt     | Score                 | Error   | Units  |
|---------------------------------------------------------------------------------------|--------|---------|-----------------------|---------|--------|
| KMapperBenchmarkCached.mappingComplexClass                                            | thrpt  | 200     | 6453.719 ±            | 25.599  | ops/ms |
| KMapperBenchmarkCached.mappingSimpleClass                                             | thrpt  | 200     | 7340.158 ±            | 226.702 | ops/ms |
| KMapperBenchmarkCached.mappingWithAnnotatedValues                                     | thrpt  | 200     | 7735.657 ±            | 116.223 | ops/ms |
| KMapperBenchmarkNoCache.mappingComplexClass                                           | thrpt  | 200     | 0.010 ±               | 0.001   | ops/ms |
| KMapperBenchmarkNoCache.mappingSimpleClass                                            | thrpt  | 200     | 0.011 ±               | 0.001   | ops/ms |
| KMapperBenchmarkNoCache.mappingWithAnnotatedValues                                    | thrpt  | 200     | 0.010 ±               | 0.001   | ops/ms |
| NativeMappingBenchmark.mappingComplexClass                                            | thrpt  | 200     | 33062.450 ±           | 84.122  | ops/ms |
| NativeMappingBenchmark.mappingSimpleClass                                             | thrpt  | 200     | 208985.004 ± 9276.895 |         | ops/ms |
| KMapperBenchmarkCached.mappingComplexClass                                            | avgt   | 200     | ≈ 10⁻⁴                |         | ms/op  |
| KMapperBenchmarkCached.mappingSimpleClass                                             | avgt   | 200     | ≈ 10⁻⁴                |         | ms/op  |
| KMapperBenchmarkCached.mappingWithAnnotatedValues                                     | avgt   | 200     | ≈ 10⁻⁴                |         | ms/op  |
| KMapperBenchmarkNoCache.mappingComplexClass                                           | avgt   | 200     | 98.703 ±              | 6.253   | ms/op  |
| KMapperBenchmarkNoCache.mappingSimpleClass                                            | avgt   | 200     | 91.426 ±              | 5.964   | ms/op  |
| KMapperBenchmarkNoCache.mappingWithAnnotatedValues                                    | avgt   | 200     | 93.663 ±              | 6.958   | ms/op  |
| NativeMappingBenchmark.mappingComplexClass                                            | avgt   | 200     | ≈ 10⁻⁵                |         | ms/op  |
| NativeMappingBenchmark.mappingSimpleClass                                             | avgt   | 200     | ≈ 10⁻⁵                |         | ms/op  |
| KMapperBenchmarkCached.mappingComplexClass                                            | sample | 4796789 | ≈ 10⁻⁴                |         | ms/op  |
| KMapperBenchmarkCached.mappingComplexClass:mappingComplexClass·p0.00                  | sample | ≈ 10⁻⁴  |                       |         | ms/op  |
| KMapperBenchmarkCached.mappingComplexClass:mappingComplexClass·p0.50                  | sample | ≈ 10⁻⁴  |                       |         | ms/op  |
| KMapperBenchmarkCached.mappingComplexClass:mappingComplexClass·p0.90                  | sample | ≈ 10⁻⁴  |                       |         | ms/op  |
| KMapperBenchmarkCached.mappingComplexClass:mappingComplexClass·p0.95                  | sample | ≈ 10⁻⁴  |                       |         | ms/op  |
| KMapperBenchmarkCached.mappingComplexClass:mappingComplexClass·p0.99                  | sample | ≈ 10⁻⁴  |                       |         | ms/op  |
| KMapperBenchmarkCached.mappingComplexClass:mappingComplexClass·p0.999                 | sample | 0.007   |                       |         | ms/op  |
| KMapperBenchmarkCached.mappingComplexClass:mappingComplexClass·p0.9999                | sample | 0.146   |                       |         | ms/op  |
| KMapperBenchmarkCached.mappingComplexClass:mappingComplexClass·p1.00                  | sample | 25.428  |                       |         | ms/op  |
| KMapperBenchmarkCached.mappingSimpleClass                                             | sample | 6156774 | ≈ 10⁻⁴                | ms/op   | ms/op  |
| KMapperBenchmarkCached.mappingSimpleClass:mappingSimpleClass·p0.00                    | sample | ≈ 0     |                       |         | ms/op  |
| KMapperBenchmarkCached.mappingSimpleClass:mappingSimpleClass·p0.50                    | sample | ≈ 10⁻⁴  |                       |         | ms/op  |
| KMapperBenchmarkCached.mappingSimpleClass:mappingSimpleClass·p0.90                    | sample | ≈ 10⁻⁴  |                       |         | ms/op  |
| KMapperBenchmarkCached.mappingSimpleClass:mappingSimpleClass·p0.95                    | sample | ≈ 10⁻⁴  |                       |         | ms/op  |
| KMapperBenchmarkCached.mappingSimpleClass:mappingSimpleClass·p0.99                    | sample | ≈ 10⁻⁴  |                       |         | ms/op  |
| KMapperBenchmarkCached.mappingSimpleClass:mappingSimpleClass·p0.999                   | sample | 0.003   |                       |         | ms/op  |
| KMapperBenchmarkCached.mappingSimpleClass:mappingSimpleClass·p0.9999                  | sample | 0.028   |                       |         | ms/op  |
| KMapperBenchmarkCached.mappingSimpleClass:mappingSimpleClass·p1.00                    | sample | 22.577  |                       |         | ms/op  |
| KMapperBenchmarkCached.mappingWithAnnotatedValues                                     | sample | 5814446 | ≈ 10⁻⁴                | ms/op   | ms/op  |
| KMapperBenchmarkCached.mappingWithAnnotatedValues:mappingWithAnnotatedValues·p0.00    | sample | ≈ 0     |                       |         | ms/op  |
| KMapperBenchmarkCached.mappingWithAnnotatedValues:mappingWithAnnotatedValues·p0.50    | sample | ≈ 10⁻⁴  |                       |         | ms/op  |
| KMapperBenchmarkCached.mappingWithAnnotatedValues:mappingWithAnnotatedValues·p0.90    | sample | ≈ 10⁻⁴  |                       |         | ms/op  |
| KMapperBenchmarkCached.mappingWithAnnotatedValues:mappingWithAnnotatedValues·p0.95    | sample | ≈ 10⁻⁴  |                       |         | ms/op  |
| KMapperBenchmarkCached.mappingWithAnnotatedValues:mappingWithAnnotatedValues·p0.99    | sample | ≈ 10⁻⁴  |                       |         | ms/op  |
| KMapperBenchmarkCached.mappingWithAnnotatedValues:mappingWithAnnotatedValues·p0.999   | sample | 0.003   |                       |         | ms/op  |
| KMapperBenchmarkCached.mappingWithAnnotatedValues:mappingWithAnnotatedValues·p0.9999  | sample | 0.028   |                       |         | ms/op  |
| KMapperBenchmarkCached.mappingWithAnnotatedValues:mappingWithAnnotatedValues·p1.00    | sample | 169.607 |                       |         | ms/op  |
| KMapperBenchmarkNoCache.mappingComplexClass                                           | sample | 2242    | 96.002 ±              | 3.826   | ms/op  |
| KMapperBenchmarkNoCache.mappingComplexClass:mappingComplexClass·p0.00                 | sample | 79.823  |                       |         | ms/op  |
| KMapperBenchmarkNoCache.mappingComplexClass:mappingComplexClass·p0.50                 | sample | 84.541  |                       |         | ms/op  |
| KMapperBenchmarkNoCache.mappingComplexClass:mappingComplexClass·p0.90                 | sample | 127.795 |                       |         | ms/op  |
| KMapperBenchmarkNoCache.mappingComplexClass:mappingComplexClass·p0.95                 | sample | 134.742 |                       |         | ms/op  |
| KMapperBenchmarkNoCache.mappingComplexClass:mappingComplexClass·p0.99                 | sample | 199.452 |                       |         | ms/op  |
| KMapperBenchmarkNoCache.mappingComplexClass:mappingComplexClass·p0.999                | sample | 811.882 |                       |         | ms/op  |
| KMapperBenchmarkNoCache.mappingComplexClass:mappingComplexClass·p0.9999               | sample | 851.444 |                       |         | ms/op  |
| KMapperBenchmarkNoCache.mappingComplexClass:mappingComplexClass·p1.00                 | sample | 851.444 |                       |         | ms/op  |
| KMapperBenchmarkNoCache.mappingSimpleClass                                            | sample | 2456    | 86.946 ±              | 3.603   | ms/op  |
| KMapperBenchmarkNoCache.mappingSimpleClass:mappingSimpleClass·p0.00                   | sample | 71.696  |                       |         | ms/op  |
| KMapperBenchmarkNoCache.mappingSimpleClass:mappingSimpleClass·p0.50                   | sample | 75.760  |                       |         | ms/op  |
| KMapperBenchmarkNoCache.mappingSimpleClass:mappingSimpleClass·p0.90                   | sample | 116.130 |                       |         | ms/op  |
| KMapperBenchmarkNoCache.mappingSimpleClass:mappingSimpleClass·p0.95                   | sample | 124.649 |                       |         | ms/op  |
| KMapperBenchmarkNoCache.mappingSimpleClass:mappingSimpleClass·p0.99                   | sample | 190.167 |                       |         | ms/op  |
| KMapperBenchmarkNoCache.mappingSimpleClass:mappingSimpleClass·p0.999                  | sample | 797.132 |                       |         | ms/op  |
| KMapperBenchmarkNoCache.mappingSimpleClass:mappingSimpleClass·p0.9999                 | sample | 969.933 |                       |         | ms/op  |
| KMapperBenchmarkNoCache.mappingSimpleClass:mappingSimpleClass·p1.00                   | sample | 969.933 |                       |         | ms/op  |
| KMapperBenchmarkNoCache.mappingWithAnnotatedValues                                    | sample | 2431    | 88.152 ±              | 3.617   | ms/op  |
| KMapperBenchmarkNoCache.mappingWithAnnotatedValues:mappingWithAnnotatedValues·p0.00   | sample | 72.483  |                       |         | ms/op  |
| KMapperBenchmarkNoCache.mappingWithAnnotatedValues:mappingWithAnnotatedValues·p0.50   | sample | 76.808  |                       |         | ms/op  |
| KMapperBenchmarkNoCache.mappingWithAnnotatedValues:mappingWithAnnotatedValues·p0.90   | sample | 119.774 |                       |         | ms/op  |
| KMapperBenchmarkNoCache.mappingWithAnnotatedValues:mappingWithAnnotatedValues·p0.95   | sample | 127.769 |                       |         | ms/op  |
| KMapperBenchmarkNoCache.mappingWithAnnotatedValues:mappingWithAnnotatedValues·p0.99   | sample | 195.434 |                       |         | ms/op  |
| KMapperBenchmarkNoCache.mappingWithAnnotatedValues:mappingWithAnnotatedValues·p0.999  | sample | 823.719 |                       |         | ms/op  |
| KMapperBenchmarkNoCache.mappingWithAnnotatedValues:mappingWithAnnotatedValues·p0.9999 | sample | 920.650 |                       |         | ms/op  |
| KMapperBenchmarkNoCache.mappingWithAnnotatedValues:mappingWithAnnotatedValues·p1.00   | sample | 920.650 |                       |         | ms/op  |
| NativeMappingBenchmark.mappingComplexClass                                            | sample | 6106789 | ≈ 10⁻⁴                | ms/op   | ms/op  |
| NativeMappingBenchmark.mappingComplexClass:mappingComplexClass·p0.00                  | sample | ≈ 0     |                       |         | ms/op  |
| NativeMappingBenchmark.mappingComplexClass:mappingComplexClass·p0.50                  | sample | ≈ 10⁻⁴  |                       |         | ms/op  |
| NativeMappingBenchmark.mappingComplexClass:mappingComplexClass·p0.90                  | sample | ≈ 10⁻⁴  |                       |         | ms/op  |
| NativeMappingBenchmark.mappingComplexClass:mappingComplexClass·p0.95                  | sample | ≈ 10⁻⁴  |                       |         | ms/op  |
| NativeMappingBenchmark.mappingComplexClass:mappingComplexClass·p0.99                  | sample | ≈ 10⁻⁴  |                       |         | ms/op  |
| NativeMappingBenchmark.mappingComplexClass:mappingComplexClass·p0.999                 | sample | ≈ 10⁻⁴  |                       |         | ms/op  |
| NativeMappingBenchmark.mappingComplexClass:mappingComplexClass·p0.9999                | sample | 0.005   |                       |         | ms/op  |
| NativeMappingBenchmark.mappingComplexClass:mappingComplexClass·p1.00                  | sample | 1.559   |                       |         | ms/op  |
| NativeMappingBenchmark.mappingSimpleClass                                             | sample | 7105601 | ≈ 10⁻⁵                | ms/op   | ms/op  |
| NativeMappingBenchmark.mappingSimpleClass:mappingSimpleClass·p0.00                    | sample | ≈ 0     |                       |         | ms/op  |
| NativeMappingBenchmark.mappingSimpleClass:mappingSimpleClass·p0.50                    | sample | ≈ 10⁻⁴  |                       |         | ms/op  |
| NativeMappingBenchmark.mappingSimpleClass:mappingSimpleClass·p0.90                    | sample | ≈ 10⁻⁴  |                       |         | ms/op  |
| NativeMappingBenchmark.mappingSimpleClass:mappingSimpleClass·p0.95                    | sample | ≈ 10⁻⁴  |                       |         | ms/op  |
| NativeMappingBenchmark.mappingSimpleClass:mappingSimpleClass·p0.99                    | sample | ≈ 10⁻⁴  |                       |         | ms/op  |
| NativeMappingBenchmark.mappingSimpleClass:mappingSimpleClass·p0.999                   | sample | ≈ 10⁻⁴  |                       |         | ms/op  |
| NativeMappingBenchmark.mappingSimpleClass:mappingSimpleClass·p0.9999                  | sample | 0.003   |                       |         | ms/op  |
| NativeMappingBenchmark.mappingSimpleClass:mappingSimpleClass·p1.00                    | sample | 0.628   |                       |         | ms/op  |
| KMapperBenchmarkCached.mappingComplexClass                                            | ss     | 200     | 0.012 ±               | 0.002   | ms/op  |
| KMapperBenchmarkCached.mappingSimpleClass                                             | ss     | 200     | 0.015 ±               | 0.005   | ms/op  |
| KMapperBenchmarkCached.mappingWithAnnotatedValues                                     | ss     | 200     | 0.012 ±               | 0.004   | ms/op  |
| KMapperBenchmarkNoCache.mappingComplexClass                                           | ss     | 200     | 141.169 ±             | 48.032  | ms/op  |
| KMapperBenchmarkNoCache.mappingSimpleClass                                            | ss     | 200     | 128.466 ±             | 43.904  | ms/op  |
| KMapperBenchmarkNoCache.mappingWithAnnotatedValues                                    | ss     | 200     | 129.995 ±             | 43.892  | ms/op  |
| NativeMappingBenchmark.mappingComplexClass                                            | ss     | 200     | 0.012 ±               | 0.013   | ms/op  |
| NativeMappingBenchmark.mappingSimpleClass                                             | ss     | 200     | 0.002 ±               | 0.003   | ms/op  |