# mill_compile_bug_demo
A minimal demo project to illustrate wrong return code of mill compilation on java code.

## Error:
`mill foo.compile` has compile error but the return code is `0`.

## Env under test:
### java -version:
```
openjdk version "1.8.0_171"
OpenJDK Runtime Environment (build 1.8.0_171-8u171-b11-0ubuntu0.16.04.1-b11)
OpenJDK 64-Bit Server VM (build 25.171-b11, mixed mode)
```
### mill version:
`0.2.6`

## Steps to reproduce the error:
1. `git clone https://github.com/seieewkx/mill_compile_bug_demo.git && cd mill_compile_bug_demo`
1. `mill foo.compile`
```
[14/14] foo.compile
/home/kaixiang/leetcode/mill_compile_bug_demo/foo/src/AnotherClass.java:9: error: cannot find symbol
    return world.length;
                ^
  symbol:   variable length
  location: variable world of type String
1 error
```
3. `echo $?` 

The return code: expect `1`, but we get `0` here.
